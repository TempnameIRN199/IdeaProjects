package models;

public class Passport
{
	protected String surname, name, patronymic;
	protected String series, gender, citizenship;
	
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

	public String getSeries()
	{ return series;}

	public void setSeries(String series)
	{ this.series = series; }

	public String getGender()
	{ return gender; }

	public void setGender(String gender)
	{ this.gender = gender; }

	public String getCitizenship()
	{ return citizenship; }

	public void setCitizenship(String citizenship)
	{ this.citizenship = citizenship; }

	public Passport(String surname, String name, String patronymic,
			String series, String gender, String citizenship)
	{
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.series = series;
		this.gender = gender;
		this.citizenship = citizenship;
	}

	@Override
	public String toString()
	{
		return "Passport [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic +
				", series=" + series + ", gender=" + gender + ", citizenship=" + citizenship + "]";
	}
}
