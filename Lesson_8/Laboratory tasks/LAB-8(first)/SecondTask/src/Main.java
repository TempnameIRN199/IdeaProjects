import java.io.FileReader;

import java.nio.CharBuffer;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner currScanner = new Scanner(System.in);
		
		CharBuffer currCharBuffer = CharBuffer.allocate(32);
		
		// C:\Users\Administrator\Desktop\TestTxtDoc.txt
		System.out.print("FilePath: ");
		
		try (FileReader tmpFileRdr = new FileReader(currScanner.nextLine()))
		{
			while (tmpFileRdr.read(currCharBuffer) != -1)
			{
				currCharBuffer.flip();
				
				System.out.print(currCharBuffer.toString());
				currScanner.nextLine();				
				
				currCharBuffer.clear();
			}
		}
		catch (Exception exc)
		{
			System.out.println("Error: " + exc);
		}
	}
}
