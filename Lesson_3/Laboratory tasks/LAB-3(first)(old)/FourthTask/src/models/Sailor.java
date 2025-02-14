package models;

public final class Sailor extends Human
{
	private String currShip;

	public String getCurrShip()
	{ return currShip; }

	public void setCurrShip(String currShip)
	{ this.currShip = currShip; }

	public Sailor(String surname, String name, String patronymic, String currShip)
	{
		super(surname, name, patronymic);
		
		this.currShip = currShip;
	}

	@Override
	public String toString()
	{ return "Sailor [currShip=" + currShip + ", toString()=" + super.toString() + "]"; }
}
