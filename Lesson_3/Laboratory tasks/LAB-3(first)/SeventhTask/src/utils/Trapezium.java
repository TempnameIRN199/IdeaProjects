package utils;

public final class Trapezium extends GeometryFigure
{
    private double firstBase;
    private double secondBase;
    private double height;

    public double getFirstBase()
	{ return firstBase; }

	public void setFirstBase(double firstBase)
	{ this.firstBase = firstBase; }

	public double getSecondBase()
	{ return secondBase; }

	public void setSecondBase(double secondBase)
	{ this.secondBase = secondBase; }

	public double getHeight()
	{ return height; }

	public void setHeight(double height)
	{ this.height = height; }

	public Trapezium(double firstBase, double secondBase, double height)
	{
		this.firstBase = firstBase;
		this.secondBase = secondBase;
		this.height = height;
	}

	@Override
    public double calcArea()
    { return ((firstBase + secondBase) * height) / 2; }

	@Override
	public String toString()
	{
		return "Trapezium [firstBase=" + firstBase + ", secondBase=" + secondBase + ", height=" + height
				+ ", calcArea()=" + calcArea() + "]";
	}
}