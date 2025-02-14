import services.NumericTwoDimArrSrvc;

public class Main {
    public static void main(String[] args) {
        // Create a NumericTwoDimArrSrvc instance with a predefined user matrix
        NumericTwoDimArrSrvc<Integer> numericService = new NumericTwoDimArrSrvc<>(new Integer[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

        System.out.println("User Matrix:");
        System.out.println(numericService);

        // Create a random matrix using the service
        NumericTwoDimArrSrvc<Integer> randomMatrix = new NumericTwoDimArrSrvc<>(3, 3); // Creates a 3x3 random matrix
        System.out.println("Random Matrix for Operations:");
        System.out.println(randomMatrix);

        // Perform arithmetic operations using service methods
        System.out.println("Addition Result:");
        System.out.println(numericService.add(randomMatrix));

        System.out.println("Subtraction Result:");
        System.out.println(numericService.subtract(randomMatrix));

        System.out.println("Multiplication Result:");
        System.out.println(numericService.multiply(randomMatrix));

        // Find min, max, and average directly from NumericTwoDimArrSrvc
        System.out.println("Minimum Element: " + numericService.min());
        System.out.println("Maximum Element: " + numericService.max());
        System.out.println("Average: " + numericService.avg());
    }
}