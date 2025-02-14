package models;

public final class Steamship extends Device
{
	private int horsepower;

	public int getHorsepower()
	{ return horsepower; }

	public void setHorsepower(int horsepower)
	{ this.horsepower = horsepower; }

	public Steamship(String name, String description, int horsepower)
	{
		super(name, description);
		
		this.horsepower = horsepower;
	}

	// powered by GPT-4o mini
	@Override
	public String gnrtStrAudioPres()
	{ return "chug-chug-chug… puff puff puff… hooooonk!"; }

	@Override
	public String toString()
	{
		return "Steamship [horsepower=" + horsepower + ", toString()=" + super.toString() + "]";
	}
}
