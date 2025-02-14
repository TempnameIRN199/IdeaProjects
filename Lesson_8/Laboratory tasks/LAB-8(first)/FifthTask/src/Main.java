import java.util.Scanner;

import java.io.FileReader;
import java.io.FileWriter;

import java.nio.CharBuffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
	public static void main(String[] args)
	{
		Scanner currScanner = new Scanner(System.in);
		
		String currStrBufVar = "", currFilePath = "";
		
		// C:\Users\Administrator\Desktop\TestTxtDoc.txt
		System.out.print("FilePath: ");
		currFilePath = currScanner.nextLine();
		
		{
			try (FileReader tmpFileRdr = new FileReader(currFilePath))
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
			
			StringBuffer tmpStrBuf = new StringBuffer();
			
			String tmpFirstStrVar = "", tmpSecondStrVar = "";
			
			int tmpIntVar = 0;
			
			System.out.print("FirstStrVar: ");
			tmpFirstStrVar = currScanner.next();
			
			System.out.print("SecondStrVar: ");
			tmpSecondStrVar = currScanner.next();
			
			tmpPattern = Pattern.compile(tmpFirstStrVar);
			tmpMatcher = tmpPattern.matcher(currStrBufVar);
			
			while (tmpMatcher.find())
			{
				tmpMatcher.appendReplacement(tmpStrBuf, tmpSecondStrVar);
				++tmpIntVar;
			}
			
			tmpMatcher.appendTail(tmpStrBuf);
			
			currStrBufVar = tmpStrBuf.toString();

			System.out.println("IntVar: " + tmpIntVar);
		}
		
		{
			try (FileWriter tmpFileWriter = new FileWriter(currFilePath, false))
			{
				tmpFileWriter.write(currStrBufVar);
				tmpFileWriter.flush();
			}
			catch (Exception exc)
			{
				System.out.println("ERR: " + exc.getMessage());
			}
		}
		
		currScanner.close();
	}
}
