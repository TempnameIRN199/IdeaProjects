package utils;

public final class Order
{
	private int id;
	private Item[] items;
	
	public int getId()
	{ return id; }
	
	public void setId(int id)
	{ this.id = id; }
	
	public Item[] getItems()
	{ return items; }

	public void setItems(Item[] items)
	{ this.items = items; }
	
	public Order(int id, Item[] items)
	{
		this.id = id;
		this.items = items;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Order [id=");
		builder.append(id);
		builder.append(", items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}
}
