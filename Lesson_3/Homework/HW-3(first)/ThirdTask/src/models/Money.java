package models;

public final class Money
{
	private String name;
	private long wholePart, decimalPart;
	
	public String getName()
	{ return name; }
	
	public void setName(String name)
	{ this.name = name; }
	
	public long getWholePart() 
	{ return wholePart; }
	
	public void setWholePart(long wholePart)
	{ this.wholePart = wholePart; }
	
	public long getDecimalPart()
	{ return decimalPart; }
	
	public void setDecimalPart(long decimalPart)
	{ this.decimalPart = decimalPart; }

	public Money()
	{ }

	public Money(String name, long wholePart, long decimalPart)
	{
		this.name = name;
		this.wholePart = wholePart;
		this.decimalPart = decimalPart;
	}
	
    public void addWholePart(long amount)
    {
        if (amount > 0)
            this.wholePart += amount;
    }

    public void subtractWholePart(long amount)
    {
        if (amount > 0)
            this.wholePart = Math.max(0, this.wholePart - amount);
    }

    public void addDecimalPart(long amount)
    {
        if (amount > 0)
        {
            this.decimalPart += amount;
            
            if (this.decimalPart >= 100)
            {
                this.wholePart += this.decimalPart / 100;
                this.decimalPart = this.decimalPart % 100;
            }
        }
    }

    public void subtractDecimalPart(long amount)
    {
        if (amount > 0)
        {
            this.decimalPart -= amount;
            
            if (this.decimalPart < 0)
            {
                long wholeToSubtract = (Math.abs(this.decimalPart) + 99) / 100;
                this.wholePart = Math.max(0, this.wholePart - wholeToSubtract);
                this.decimalPart = (this.decimalPart + 100 * wholeToSubtract) % 100;
            }
        }
    }
    
	@Override
	public String toString()
	{ return "Money [name=" + name + ", wholePart=" + wholePart + ", decimalPart=" + decimalPart + "]"; }
}
