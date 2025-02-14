package utils;

public final class Item
{
	private String name;
	private double price;
	
	public String getName()
	{ return name; }
	
	public void setName(String name)
	{ this.name = name; }
	
	public double getPrice()
	{ return price; }
	
	public void setPrice(double price)
	{ this.price = price; }

	public Item(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		builder.append("Item [name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		
		return builder.toString();
	}
}
