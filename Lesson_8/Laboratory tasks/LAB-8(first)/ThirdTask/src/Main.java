import java.util.Scanner;

import java.io.FileReader;

import java.nio.CharBuffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
	public static void main(String[] args)
	{
		Scanner currScanner = new Scanner(System.in);
		
		String currStrBufVar = "";
		
		{
			// C:\Users\Administrator\Desktop\TestTxtDoc.txt
			System.out.print("FilePath: ");
			
			try (FileReader tmpFileRdr = new FileReader(currScanner.nextLine()))
			{
				CharBuffer tmpCharBuffer = CharBuffer.allocate(8192);
				
				while (tmpFileRdr.read(tmpCharBuffer) != -1)
				{
					tmpCharBuffer.flip();
					
					currStrBufVar += tmpCharBuffer.toString();
					
					tmpCharBuffer.clear();
				}
			}
			catch (Exception exc)
			{
				System.out.println("ERR: " + exc.getMessage());
			}
		}
		
		{
			Pattern tmpPattern = null;
			Matcher tmpMatcher = null;
			
			int tmpIntVar = 0;
			
			System.out.print("TgtStr: ");
			
			tmpPattern = Pattern.compile(currScanner.next());
			tmpMatcher = tmpPattern.matcher(currStrBufVar);
			
			while (tmpMatcher.find())
			{ ++tmpIntVar; }

			System.out.println("Matches: " + tmpIntVar);
		}
		
		currScanner.close();
	}
}
