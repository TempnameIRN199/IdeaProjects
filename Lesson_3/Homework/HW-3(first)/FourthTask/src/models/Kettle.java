package models;

public final class Kettle extends Device
{
	private short power;

	public short getPower()
	{ return power; }

	public void setPower(short power)
	{ this.power = power; }

	public Kettle(String name, String description, short power)
	{
		super(name, description);
		
		this.power = power;
	}

	// powered by GPT-4o mini
	@Override
	public String gnrtStrAudioPres()
	{ return "sssssssssssss… WHEEEEEE!"; }

	@Override
	public String toString()
	{
		return "Kettle [power=" + power + ", toString()=" + super.toString() + "]";
	}

}
