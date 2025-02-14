import services.SpecSrvc;

public final class Main
{
	public static void main(String[] args)
	{
		System.out.println("Min: " + SpecSrvc.min(0, 4, 1, 9, -5));
		System.out.println("Max: " + SpecSrvc.max(0, 12, 23, 54, -32));
		System.out.println("Avg: " + SpecSrvc.avg(923, 14, 43, 54, 12));
		System.out.println("Factorial: "  + SpecSrvc.factorial(8));
	}
}
