package models;

public final class Tiger extends Animal
{
	private float speed;

	public float getSpeed()
	{ return speed; }

	public void setSpeed(float speed)
	{ this.speed = speed; }

	public Tiger(String name, String breed, float weight, float speed)
	{
		super(name, breed, weight);
		
		this.speed = speed;
	}

	@Override
	public String toString()
	{ return "Tiger [speed=" + speed + ", toString()=" + super.toString() + "]"; }
}
