import java.io.*;

import java.nio.file.*;

import java.util.*;
import java.util.concurrent.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        System.out.println("Enter the search word:");
        String searchWord = scanner.nextLine();

        System.out.println("Enter the path to the file with banned words:");
        String bannedWordsFilePath = scanner.nextLine();

        String mergedFilePath = "merged_file.txt";
        String cleanedFilePath = "cleaned_file.txt";

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // First thread: Search files and merge
        Callable<Void> searchAndMergeTask = () -> {
            try {
                mergeFilesContainingWord(directoryPath, searchWord, mergedFilePath);
            } catch (IOException e) {
                System.err.println("Error during file merging: " + e.getMessage());
            }
            return null;
        };

        // Second thread: Remove banned words
        Runnable cleanFileTask = () -> {
            try {
                executorService.submit(searchAndMergeTask).get(); // Wait for the first thread
                cleanFileFromBannedWords(mergedFilePath, bannedWordsFilePath, cleanedFilePath);
            } catch (Exception e) {
                System.err.println("Error during file cleaning: " + e.getMessage());
            }
        };

        executorService.submit(cleanFileTask);

        executorService.shutdown();
        try {
            if (executorService.awaitTermination(1, TimeUnit.HOURS)) {
                System.out.println("Operations completed successfully.");
                System.out.println("Merged file: " + mergedFilePath);
                System.out.println("Cleaned file: " + cleanedFilePath);
            } else {
                System.out.println("Operation timeout exceeded.");
            }
        } catch (InterruptedException e) {
            System.err.println("Operation interrupted: " + e.getMessage());
        }
    }

    // Merging files containing a specific word
    public static void mergeFilesContainingWord(String directoryPath, String word, String outputFilePath) throws IOException {
        File dir = new File(directoryPath);
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("The specified path is not a directory.");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            File[] files = dir.listFiles((d, name) -> name.endsWith(".txt"));

            if (files != null) {
                for (File file : files) {
                    List<String> lines = Files.readAllLines(file.toPath());
                    for (String line : lines) {
                        if (line.contains(word)) {
                            writer.write(line);
                            writer.newLine();
                        }
                    }
                }
            }
        }
    }

    // Cleaning a file by removing banned words
    public static void cleanFileFromBannedWords(String inputFilePath, String bannedWordsFilePath, String outputFilePath) throws IOException {
        List<String> bannedWords = Files.readAllLines(Paths.get(bannedWordsFilePath));
        Set<String> bannedWordsSet = new HashSet<>(bannedWords);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                for (String bannedWord : bannedWordsSet) {
                    line = line.replaceAll("\\b" + bannedWord + "\\b", ""); // Remove banned word
                }
                writer.write(line.trim());
                writer.newLine();
            }
        }
    }
}