package models;

public final class Crocodile extends Animal
{
	private float length;

	public float getLength()
	{ return length; }

	public void setLength(float length)
	{ this.length = length; }

	public Crocodile(String name, String breed, float weight, float length)
	{
		super(name, breed, weight);
		
		this.length = length;
	}

	@Override
	public String toString()
	{ return "Crocodile [length=" + length + ", toString()=" + super.toString() + "]"; }
}
