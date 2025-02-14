package utils;

public final class Enrollment
{
	private int id;
	private Course course;
	private Student student;
	private float grade;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public Course getCourse()
	{
		return course;
	}
	
	public void setCourse(Course course)
	{
		this.course = course;
	}
	
	public Student getStudent()
	{
		return student;
	}
	
	public void setStudent(Student student)
	{
		this.student = student;
	}
	
	public float getGrade()
	{
		return grade;
	}
	
	public void setGrade(float grade)
	{
		this.grade = grade;
	}

	public Enrollment(int id, Course course, Student student, float grade)
	{
		this.id = id;
		this.course = course;
		this.student = student;
		this.grade = grade;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Enrollment [id=");
		builder.append(id);
		builder.append(", course=");
		builder.append(course);
		builder.append(", student=");
		builder.append(student);
		builder.append(", grade=");
		builder.append(grade);
		builder.append("]");
		return builder.toString();
	}
}
