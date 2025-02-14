package models;

public final class Car extends Device
{
	private short horsepower;

	public short getHorsepower()
	{ return horsepower; }

	public void setHorsepower(short horsepower)
	{ this.horsepower = horsepower; }

	public Car(String name, String description, short horsepower)
	{
		super(name, description);
		
		this.horsepower = horsepower;
	}

	// powered by GPT-4o mini
	@Override
	public String gnrtStrAudioPres()
	{ return "vrooooom… rrrrrr… screech… honk honk!"; }

	@Override
	public String toString()
	{ return "Car [horsepower=" + horsepower + ", toString()=" + super.toString() + "]"; }
}
