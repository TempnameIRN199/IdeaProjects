package utils;

public final class Circle extends GeometryFigure
{
    private double radius;
    
    public double getRadius()
    { return radius; }

    public void setRadius(double radius)
    { this.radius = radius; }
    
    public Circle(double radius)
    {
    	this.radius = radius;
    }

    @Override
    public double calcArea()
    { return Math.PI * Math.pow(radius, 2); }

	@Override
	public String toString()
	{ return "Circle [radius=" + radius + ", calcArea()=" + calcArea() + "]"; }
}