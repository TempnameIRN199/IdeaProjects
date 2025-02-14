package services;

public final class GeometrySrvc
{
	private static int calculationNum;
	
	public static int getCalculationNum()
	{ return calculationNum; }

	static 
	{
		calculationNum = 0;
	}
	
    public static double areaOfTriangle(double base, double height)
    { 
    	++calculationNum;
    	
    	return (base * height) / 2;
    }

    public static double areaOfRectangle(double length, double width)
    {
    	++calculationNum;
    	
    	return length * width;
    }

    public static double areaOfSquare(double side)
    {
    	++calculationNum;
    	
    	return side * side;
    }

    public static double areaOfRhombus(double firstDiagonal, double secondDiagonal) 
    {
    	++calculationNum;
    	
    	return (firstDiagonal * firstDiagonal) / 2;
    }
}
