package models;

import java.util.Date;

public final class Person
{
	private static int instancesNum;
	
	private String surname;
	private String name;
	private String patronymic;
	
	private Date birthdate;
	private String telephone;
	
	private String city;
	private String country;
	private String address;
		
	public static int getInstancesNum()
	{ return instancesNum; }

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

	public Date getBirthdate()
	{ return birthdate; }

	public void setBirthdate(Date birthdate)
	{ this.birthdate = birthdate; }

	public String getTelephone()
	{ return telephone; }

	public void setTelephone(String telephone)
	{ this.telephone = telephone; }

	public String getCity()
	{ return city; }

	public void setCity(String city)
	{ this.city = city; }

	public String getCountry()
	{ return country; }

	public void setCountry(String country)
	{ this.country = country; }

	public String getAddress()
	{ return address; }

	public void setAddress(String address)
	{ this.address = address; }
	
	static
	{
		instancesNum = 0;
	}

	public Person()
	{ this("", "", "", new Date(), "", "", "", ""); }
	
	public Person(String surname, String name, String patronymic,
			Date birthdate, String telephone, String city, String country, String address)
	{
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.birthdate = birthdate;
		this.telephone = telephone;
		this.city = city;
		this.country = country;
		this.address = address;
		
		++instancesNum;
	}
	
	@Override
	protected void finalize() throws Throwable
	{
		--instancesNum;
	}
	
	@Override
	public String toString()
	{
		return surname + ' ' + name + ' ' + patronymic + ' ' +
				birthdate + ' ' + telephone + ' ' + city + ' ' + country + ' ' + address;
	}
}
