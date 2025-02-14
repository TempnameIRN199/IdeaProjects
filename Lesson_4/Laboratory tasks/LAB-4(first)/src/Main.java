import java.util.Arrays;

import services.SpecSrvc;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("FirstMethod: " + SpecSrvc.firstMethod(4, 6, 1, 5));
		System.out.println("SecondMethod: " + SpecSrvc.secondMethod(4.6, 2.3, 7.1, 3.5));
		System.out.println("ThirdMethod: " + SpecSrvc.thirdMethod(new Integer[] { 4, 8, 1, 3, 6 }));
		System.out.println("FourthMethod: " + SpecSrvc.fourthMethod(new Double[] { 2.4, 1.2, 0.8, 9.4 }));
		System.out.println("FifthMethod: " + SpecSrvc.fifthMethod(new Float[] { 5.6F, 2.1F, 8.9F, 24.9F }));
		
		Integer[] sixthMethodArr = new Integer[] {4, 6, 8, 1, 1, 3, 9, 2, 0};
		SpecSrvc.sixthMethod(sixthMethodArr);
		System.out.println("SixthMethod: " + Arrays.toString(sixthMethodArr));
		
		System.out.println("SeventhMethod: " + SpecSrvc.seventhMethod(new Long[] { 3L, 5L, 1L, 8L }, 8L));
	}
}
