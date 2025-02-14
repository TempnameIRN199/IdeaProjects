import interfaces.*;

public class Main
{
	public static void main(String[] args)
	{
		TemplateMin<Integer> templateMin =
				(firstNum, secondNum, thirdNum) -> Math.min(thirdNum, Math.min(firstNum, secondNum));
				
		TemplateMax<Integer> templateMax =
				(firstNum, secondNum, thirdNum) -> Math.max(thirdNum, Math.max(firstNum, secondNum));
				
		System.out.println("TemplateMin: " + templateMin.apply(4, 9, 1));
		System.out.println("TemplateMax: " + templateMax.apply(8, 1, 9));
	}
}
