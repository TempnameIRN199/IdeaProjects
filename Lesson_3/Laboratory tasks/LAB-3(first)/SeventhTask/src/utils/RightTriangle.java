package utils;

public final class RightTriangle extends GeometryFigure
{
	private double base, height;

	public double getBase()
	{ return base; }

	public void setBase(double base)
	{ this.base = base; }

	public double getHeight()
	{ return height; }

	public void setHeight(double height)
	{ this.height = height; }

	public RightTriangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	@Override
	public double calcArea()
	{ return 0.5 * base * height; }

	@Override
	public String toString()
	{ return "RightTriangle [base=" + base + ", height=" + height + ", calcArea()=" + calcArea() + "]"; }
}