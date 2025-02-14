package utils;

public final class Person
{
	private String surname, name, patronymic;
	private short age;
	private String residencePlace;
	
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

	public short getAge()
	{ return age; }

	public void setAge(short age)
	{ this.age = age; }

	public String getResidencePlace()
	{ return residencePlace; }

	public void setResidencePlace(String residencePlace)
	{ this.residencePlace = residencePlace; }

	public Person(String surname, String name, String patronymic, short age, String residencePlace)
	{
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.age = age;
		this.residencePlace = residencePlace;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Person [surname=");
		builder.append(surname);
		builder.append(", name=");
		builder.append(name);
		builder.append(", patronymic=");
		builder.append(patronymic);
		builder.append(", age=");
		builder.append(age);
		builder.append(", residencePlace=");
		builder.append(residencePlace);
		builder.append("]");
		return builder.toString();
	}
}
