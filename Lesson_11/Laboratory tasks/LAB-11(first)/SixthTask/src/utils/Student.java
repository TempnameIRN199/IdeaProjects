package utils;

public final class Student
{
	private String surname, name, patronymic;
	private double[] grades;
	
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
	
	public double[] getGrades()
	{ return grades; }
	
	public void setGrades(double[] grades)
	{ this.grades = grades; }
	
	public Student(String surname, String name, String patronymic, double[] grades)
	{
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.grades = grades;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		builder.append("Student [surname=");
		builder.append(surname);
		builder.append(", name=");
		builder.append(name);
		builder.append(", patronymic=");
		builder.append(patronymic);
		builder.append(", grades=");
		builder.append(grades);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		
		return builder.toString();
	}
}
