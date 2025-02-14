import java.util.HashMap;

import services.FileSrvc;

public class Main
{
	public static void main(String[] args)
	{
		FileSrvc currFileSrvc = new FileSrvc();
		
		HashMap<String, String> currFilterMap = new HashMap<String, String>();
		String currFilePath = "C:\\Users\\Administrator\\Desktop\\TestTxtDoc.txt";
		
		currFilterMap.put("Hell0", "Hello");
		currFilterMap.put("H*llo", "Hello");
		currFilterMap.put("W0rld", "World");
		
		try
		{
			currFileSrvc.read(currFilePath);	
			System.out.print(currFileSrvc.filter(currFilterMap).toString());
			currFileSrvc.write(currFilePath);
		}
		catch (Exception exc)
		{
			System.out.println("ERR: " + exc.getMessage());
		}
		
	}
}
