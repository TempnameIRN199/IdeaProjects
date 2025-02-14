package models;

public final class President extends Worker
{
	private String targetName;

	public String getTargetName()
	{ return targetName; }

	public void setTargetName(String targetName)
	{ this.targetName = targetName; }

	public President(String surname, String name, String patronymic, String targetName)
	{
		super(surname, name, patronymic);
		
		this.targetName = targetName;
	}

	@Override
	public String toString()
	{ return "President [targetName=" + targetName + ", toString()=" + super.toString() + "]"; }
}
