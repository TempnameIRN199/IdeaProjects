package models;

public final class Engineer extends Worker
{
	private String specialization;
	
	public String getSpecialization()
	{ return specialization; }

	public void setSpecialization(String specialization)
	{ this.specialization = specialization; }

	public Engineer(String surname, String name, String patronymic, String specialization)
	{
		super(surname, name, patronymic);
		
		this.specialization = specialization;
	}

	@Override
	public String toString()
	{ return "Engineer [specialization=" + specialization + ", toString()=" + super.toString() + "]"; }
}
