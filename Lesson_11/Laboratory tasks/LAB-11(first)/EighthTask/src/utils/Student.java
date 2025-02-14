package utils;

public final class Student
{
	private int id;
	private String fullName;
	private byte age;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getFullName()
	{
		return fullName;
	}
	
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	
	public byte getAge()
	{
		return age;
	}

	public void setAge(byte age)
	{
		this.age = age;
	}
	
	public Student(int id, String fullName, byte age)
	{
		this.id = id;
		this.fullName = fullName;
		this.age = age;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", fullName=");
		builder.append(fullName);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
}
