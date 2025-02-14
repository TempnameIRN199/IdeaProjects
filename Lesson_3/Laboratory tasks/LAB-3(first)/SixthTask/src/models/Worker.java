package models;

public abstract class Worker
{
	protected String surname, name, patronymic;
	
	public String getSurname()
	{ return surname; }

	public void setSurname(String surname)
	{ this.surname = surname; }

	public String getName()
	{ return name; }

	public void setName(String name)
	{ this.name = name; }

	public String getPatronymic()
	{ return patronymic; }

	public void setPatronymic(String patronymic)
	{ this.patronymic = patronymic; }

	public Worker(String surname, String name, String patronymic)
	{
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
	}

	@Override
	public String toString()
	{ return "Worker [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + "]"; }
}
