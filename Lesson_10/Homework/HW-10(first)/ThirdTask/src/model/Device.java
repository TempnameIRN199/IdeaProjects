package model;

public final class Device
{
	public String name;
	public String type;
	
	public String color;
	
	public short issueYear;
	public double price;
	
	public String getName()
	{ return name; }
	
	public void setName(String name)
	{ this.name = name; }
	
	public String getType()
	{ return type; }
	
	public void setType(String type)
	{ this.type = type; }
	
	public String getColor()
	{ return color; }
	
	public void setColor(String color)
	{ this.color = color; }
	
	public short getIssueYear()
	{ return issueYear; }
	
	public void setIssueYear(short issueYear)
	{ this.issueYear = issueYear; }
	
	public double getPrice()
	{ return price; }
	
	public void setPrice(double price)
	{ this.price = price; }

	public Device(String name, String type, String color, short issueYear, double price)
	{
		this.name = name;
		this.type = type;
		this.color = color;
		this.issueYear = issueYear;
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Device [name=" + name + ", type=" + type + ", color=" + color + ", issueYear=" + issueYear + ", price="
				+ price + "]";
	}
}
