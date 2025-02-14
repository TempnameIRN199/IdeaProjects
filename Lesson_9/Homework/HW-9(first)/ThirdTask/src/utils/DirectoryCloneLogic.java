package utils;

import java.io.IOException;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public final class DirectoryCloneLogic implements Runnable
{
	private Path srcDir, tgtDir;

	public Path getSrcDir()
	{ return srcDir; }

	public void setSrcDir(Path srcDir)
	{ this.srcDir = srcDir; }

	public Path getTgtDir()
	{ return tgtDir; }

	public void setTgtDir(Path tgtDir)
	{ this.tgtDir = tgtDir; }

	public DirectoryCloneLogic(Path srcDir, Path tgtDir)
	{
		this.srcDir = srcDir;
		this.tgtDir = tgtDir;
	}

	@Override
	public void run()
	{
        try
        {
    		if (!Files.exists(tgtDir))
    		{
                Files.createDirectories(tgtDir);
            }

            System.out.println("Copying from: " + srcDir);
            System.out.println("Copying to: " + tgtDir);

            Files.walkFileTree(srcDir, new SimpleFileVisitor<>()
            {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException
                {
                    Path targetDir = tgtDir.resolve(srcDir.relativize(dir));
                    
                    if (!Files.exists(targetDir))
                    {
                        Files.createDirectories(targetDir);
                        System.out.println("Directory created: " + targetDir);
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
                {
                    Path targetFile = tgtDir.resolve(srcDir.relativize(file));
                    Files.copy(file, targetFile, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("File copied: " + file + " -> " + targetFile);
                    return FileVisitResult.CONTINUE;
                }
            });

        }
        catch (Exception exc)
        {
        	System.out.print("ERR: " + exc.getMessage());
        }
	}
}
