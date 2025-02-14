package utils;

public final class Employee
{
	private String surname, name, patronymic;
	private double salary;
	private String department;
	
	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPatronymic()
	{
		return patronymic;
	}

	public void setPatronymic(String patronymic)
	{
		this.patronymic = patronymic;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public Employee(String surname, String name, String patronymic, double salary, String department)
	{
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [surname=");
		builder.append(surname);
		builder.append(", name=");
		builder.append(name);
		builder.append(", patronymic=");
		builder.append(patronymic);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", department=");
		builder.append(department);
		builder.append("]");
		return builder.toString();
	}
}
