package models;

public final class Projector
{
	private String name;
	
	private short issueYear;
	
	private double price;
	private String manufacturer;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public short getIssueYear()
	{
		return issueYear;
	}
	
	public void setIssueYear(short issueYear)
	{
		this.issueYear = issueYear;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public Projector(String name, short issueYear, double price, String manufacturer)
	{
		this.name = name;
		this.issueYear = issueYear;
		this.price = price;
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString()
	{
		return "Projector [name=" + name + ", issueYear=" + issueYear + ", price=" + price + ", manufacturer="
				+ manufacturer + "]";
	}
}
