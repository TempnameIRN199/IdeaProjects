import java.util.Scanner;

import java.io.FileInputStream;

public class Main
{
	public static void main(String[] args)
	{
		Scanner currScanner = new Scanner(System.in);
		
		int alphaNum = 0, digitNum = 0, otherNum = 0;
		
		{
			int tmpIntVar = 0;
			
			// C:\Users\Administrator\Desktop\TestTxtDoc.txt
			System.out.print("FilePath: ");
			try (FileInputStream tmpFileInputStrm = new FileInputStream(currScanner.nextLine()))
			{
				while ((tmpIntVar = tmpFileInputStrm.read()) != -1)
				{
					if (tmpIntVar >= 65 && tmpIntVar <= 90 || tmpIntVar >= 97 && tmpIntVar <= 122)
					{ ++alphaNum; }
					else if (tmpIntVar >= 48 && tmpIntVar <= 57)
					{ ++digitNum; }
					else
					{ ++otherNum; }
				}
			}
			catch (Exception exc)
			{
				System.out.println("ERR: " + exc.getMessage());
			}
		}
		
		System.out.println("AlphaNum: " + alphaNum);
		System.out.println("DigitNum: " + digitNum);
		System.out.println("OtherNum : " + otherNum);
		
		currScanner.close();
	}
}
