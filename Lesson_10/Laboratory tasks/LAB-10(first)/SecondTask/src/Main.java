import java.util.stream.Stream;

public class Main
{
	public static void main(String[] args)
	{
		String[] currArr = new String[]
		{
			"FirstStr", "SecondStr", "ThirdStr", 
			"FourthStr", "FifthStr", "SixthStr"
		};
		
		String currStr = "SecondStr";
		char currChar = 'F';
		
		Stream.of(currArr).forEach(str -> System.out.print(str + ' '));
		System.out.println();
		
		Stream.of(currArr).filter(str -> str.length() >= 9).forEach(str -> System.out.print(str + ' '));
		System.out.println();
		
		System.out.print(Stream.of(currArr).filter(str -> str == currStr).count());
		System.out.println();
		
		Stream.of(currArr).filter(str -> str.charAt(0) == currChar).forEach(str -> System.out.print(str + ' '));
	}
}
