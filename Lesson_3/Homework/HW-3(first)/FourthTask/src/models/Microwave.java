package models;

public final class Microwave extends Device
{
	private short power;
	
	public short getPower()
	{ return power; }

	public void setPower(short power)
	{ this.power = power; }

	public Microwave(String name, String description, short power)
	{
		super(name, description);
		
		this.power = power;
	}

	// powered by GPT-4o mini
	@Override
	public String gnrtStrAudioPres()
	{ return "beep beep… beep… ding!"; }

	@Override
	public String toString()
	{ return "Microwave [power=" + power + ", toString()=" + super.toString() + "]"; }
}
