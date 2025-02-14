package utils;

public final class Triangle extends GeometryFigure
{
	private double firstSide, secondSide, thirdSide;

	public double getFirstSide()
	{ return firstSide; }

	public void setFirstSide(double firstSide)
	{ this.firstSide = firstSide; }

	public double getSecondSide()
	{ return secondSide; }

	public void setSecondSide(double secondSide)
	{ this.secondSide = secondSide; }

	public double getThirdSide()
	{ return thirdSide; }

	public void setThirdSide(double thirdSide)
	{ this.thirdSide = thirdSide; }

	public Triangle(double firstSide, double secondSide, double thirdSide)
	{
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}

    @Override
    public double calcArea()
    {
        double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) *
        		(semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
    }
    
	@Override
	public String toString()
	{
		return "Triangle [firstSide=" + firstSide + ", secondSide=" + secondSide + ", thirdSide=" + thirdSide
				+ ", calcArea()=" + calcArea() + "]";
	}
}
