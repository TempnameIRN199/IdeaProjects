import java.util.Random;
import java.util.stream.IntStream;;

public class Main
{
	public static void main(String[] args)
	{
		int[] currArr = new int[20];
		
		int currIntVar = 8;
		
		initRandArr(currArr, 0, 10 + 1);
		
		System.out.println("FirstTask: " + IntStream.of(currArr).filter(elem -> elem % 2 == 0).count());
		System.out.println("SecondTask: " + IntStream.of(currArr).filter(elem -> elem % 2 != 0).count());
		System.out.println("ThirdTask: " + IntStream.of(currArr).filter(elem -> elem == 0).count());
		System.out.println("FourthTask: " + IntStream.of(currArr).filter(elem -> elem == currIntVar).count());
	}
	
	public static void initRandArr(int[] arr, int min, int max)
	{
		Random currRandom = new Random();
		
		for (int tmpCounter = 0; tmpCounter < arr.length; tmpCounter++)
		{
			arr[tmpCounter] = currRandom.nextInt(min, max);
		}
	}
}
