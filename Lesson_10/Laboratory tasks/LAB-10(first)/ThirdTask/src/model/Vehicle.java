package model;

public final class Vehicle
{
	private String name;
	
	private String color;
	
	private float fuelTank;
	
	private float price;
	private short issueYear;
	
	public String getName()
	{ return name; }

	public void setName(String name)
	{ this.name = name; }

	public String getColor()
	{ return color; }

	public void setColor(String color)
	{ this.color = color; }

	public float getFuelTank()
	{ return fuelTank; }

	public void setFuelTank(float fuelTank)
	{ this.fuelTank = fuelTank; }

	public float getPrice()
	{ return price; }

	public void setPrice(float price)
	{ this.price = price; }

	public short getIssueYear()
	{ return issueYear; }

	public void setIssueYear(short issueYear)
	{ this.issueYear = issueYear; }

	public Vehicle(String name, float fuelTank, String color, float price, short issueYear)
	{
		this.name = name;
		this.fuelTank = fuelTank;
		this.color = color;
		this.price = price;
		this.issueYear = issueYear;
	}

	@Override
	public String toString()
	{ 
		return "Vehicle [name=" + name + ", color=" + color + ", fuelTank=" + fuelTank + ", price=" + price
				+ ", issueYear=" + issueYear + "]";
	}
}
