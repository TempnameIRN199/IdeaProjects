import utils.DirectoryCloneLogic;

import java.lang.Thread;
import java.nio.file.Paths;

public class Main
{
	public static void main(String[] args)
	{
		Thread currDirectoryCloneThread = new Thread
		(
			new DirectoryCloneLogic
			(
				Paths.get("C:\\Users\\Administrator\\Desktop\\GIT"),
				Paths.get("C:\\Users\\Administrator\\Desktop\\TgtDir")
			)
		);
		
		currDirectoryCloneThread.start();
	}
}
