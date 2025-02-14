import services.GeometrySrvc;

public final class Main
{
	public static void main(String[] args)
	{
		GeometrySrvc.areaOfRhombus(9, 3);
		GeometrySrvc.areaOfSquare(23);
		
		System.out.print("CalculationNum: " + GeometrySrvc.getCalculationNum());
	}
}
