package utils;

public final class Transaction
{
	private int id;
	private double amount;
	private String type;
	
	public int getId()
	{ return id; }

	public void setId(int id)
	{ this.id = id; }

	public double getAmount()
	{ return amount; }

	public void setAmount(double amount)
	{ this.amount = amount; }

	public String getType()
	{ return type; }

	public void setType(String type)
	{ this.type = type; }

	public Transaction(int id, double amount, String type)
	{
		this.id = id;
		this.amount = amount;
		this.type = type;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Transaction [id=");
		builder.append(id);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
}
