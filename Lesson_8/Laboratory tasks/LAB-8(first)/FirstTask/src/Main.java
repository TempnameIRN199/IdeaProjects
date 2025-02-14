import java.io.FileReader;
import java.nio.CharBuffer;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner currScanner = new Scanner(System.in);
		
		CharBuffer currCharBuffer = CharBuffer.allocate(1024);
		
		// C:\Users\Administrator\Desktop\TestTxtDoc.txt
		System.out.print("FilePath: ");
		
		try (FileReader tmpFileRdr = new FileReader(currScanner.nextLine()))
		{
			tmpFileRdr.read(currCharBuffer);
			
			currCharBuffer.flip();
			
			System.out.println(currCharBuffer.toString());
		}
		catch (Exception exc)
		{
			System.out.println("ERR: " + exc.getMessage());
		}
	}
}
