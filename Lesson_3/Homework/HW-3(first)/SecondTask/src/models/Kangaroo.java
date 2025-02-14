package models;

public final class Kangaroo extends Animal
{
	private float jumpHeight;

	public float getJumpHeight()
	{ return jumpHeight; }

	public void setJumpHeight(float jumpHeight)
	{ this.jumpHeight = jumpHeight; }

	public Kangaroo(String name, String breed, float weight, float jumpHeight)
	{
		super(name, breed, weight);
		
		this.jumpHeight = jumpHeight;
	}

	@Override
	public String toString()
	{ return "Kangaroo [jumpHeight=" + jumpHeight + ", toString()=" + super.toString() + "]"; }
}
