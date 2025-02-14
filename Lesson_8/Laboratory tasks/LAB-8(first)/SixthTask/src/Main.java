import services.FileSrvc;

public class Main
{
	public static void main(String[] args)
	{
		FileSrvc fileSrvc = new FileSrvc();
		
		String firstFilePath = "C:\\Users\\Administrator\\Desktop\\TestTxtDoc.txt",
				secondFilePath = "C:\\Users\\Administrator\\Desktop\\TestTxtDoc.txt",
				thirdFilePath = "C:\\Users\\Administrator\\Desktop\\TestTxtDoc.txt",
				fourthFilePath = "C:\\Users\\Administrator\\Desktop\\TestTxtDoc.txt";
		
		try
		{
			fileSrvc.read(firstFilePath);
			fileSrvc.read(secondFilePath);
			fileSrvc.read(thirdFilePath);
			
			fileSrvc.write(fourthFilePath);
		}
		catch (Exception exc)
		{
			System.out.println("ERR: " + exc.getMessage());
		}
		
		System.out.println("WrittenBytes: " + fileSrvc.getWrittenBytes());
	}
}
