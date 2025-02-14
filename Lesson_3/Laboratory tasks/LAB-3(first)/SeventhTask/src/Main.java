import utils.*;

public class Main
{
	public static void main(String[] args)
	{
		GeometryFigure[] geomFigures = new GeometryFigure[]
		{
			new Circle(2.5D),
			new RightTriangle(2.8D, 3.4D),
			new Triangle(1.4D, 2.7D, 3.7D),
			new Trapezium(4.4D, 3.5D, 5.5D)
		};
		
		for (GeometryFigure currFigure : geomFigures)
			System.out.println(currFigure);
	}
}
