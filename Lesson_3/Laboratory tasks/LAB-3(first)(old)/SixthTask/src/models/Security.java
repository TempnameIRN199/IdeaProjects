package models;

public final class Security extends Worker
{
	protected String targetName;
	
	public String getTargetName()
	{ return targetName; }

	public void setTargetName(String targetName)
	{ this.targetName = targetName; }

	public Security(String surname, String name, String patronymic, String targetName)
	{
		super(surname, name, patronymic);
		
		this.targetName = targetName;
	}

	@Override
	public String toString()
	{ return "Security [targetName=" + targetName + ", toString()=" + super.toString() + "]"; }
}
