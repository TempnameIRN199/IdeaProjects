package models;

public final class Product
{
	private String name;
	private String countryOrigin;
	private Money price;
	
	public String getName()
	{ return name; }
	
	public void setName(String name)
	{ this.name = name; }
	
	public String getCountryOrigin()
	{ return countryOrigin; }
	
	public void setCountryOrigin(String countryOrigin)
	{ this.countryOrigin = countryOrigin; }
	
	public Money getPrice()
	{ return price; }
	
	public void setPrice(Money price)
	{ this.price = price; }

	public Product(String name, String countryOrigin, Money price)
	{
		this.name = name;
		this.countryOrigin = countryOrigin;
		this.price = price;
	}

	@Override
	public String toString()
	{ return "Product [name=" + name + ", countryOrigin=" + countryOrigin + ", price=" + price + "]"; }
}
