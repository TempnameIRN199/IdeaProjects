package model;

public final class Monitor
{
	public String name;
	
	public float inches;
	
	public double price;
	public short issueYear;
	public String manufacture;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public float getInches()
	{
		return inches;
	}
	public void setInches(float inches)
	{
		this.inches = inches;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public short getIssueYear()
	{
		return issueYear;
	}
	public void setIssueYear(short issueYear)
	{
		this.issueYear = issueYear;
	}
	public String getManufacture()
	{
		return manufacture;
	}
	public void setManufacture(String manufacture)
	{
		this.manufacture = manufacture;
	}
	
	public Monitor(String name, float inches, double price, short issueYear, String manufacture)
	{
		this.name = name;
		this.inches = inches;
		this.price = price;
		this.issueYear = issueYear;
		this.manufacture = manufacture;
	}
	
	@Override
	public String toString()
	{
		return "Monitor [name=" + name + ", inches=" + inches + ", price=" + price + ", issueYear=" + issueYear
				+ ", manufacture=" + manufacture + "]";
	}
}
