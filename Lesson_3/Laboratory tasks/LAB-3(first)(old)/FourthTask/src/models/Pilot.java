package models;

public final class Pilot extends Human
{
	private String currAircraft;

	public String getCurrAircraft()
	{ return currAircraft; }

	public void setCurrAircraft(String currAircraft)
	{ this.currAircraft = currAircraft; }

	public Pilot(String surname, String name, String patronymic, String currAircraft)
	{
		super(surname, name, patronymic);
		this.currAircraft = currAircraft;
	}

	@Override
	public String toString()
	{ return "Pilot [currAircraft=" + currAircraft + ", toString()=" + super.toString() + "]"; }
}
