package utils;

public final class Course
{
	private int id;
	private String title;
	private byte credits;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public byte getCredits()
	{
		return credits;
	}
	
	public void setCredits(byte credits)
	{
		this.credits = credits;
	}

	public Course(int id, String title, byte credits)
	{
		this.id = id;
		this.title = title;
		this.credits = credits;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Course [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", credits=");
		builder.append(credits);
		builder.append("]");
		return builder.toString();
	}
}
