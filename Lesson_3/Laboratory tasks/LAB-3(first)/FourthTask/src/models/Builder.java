package models;

public final class Builder extends Human
{
	private String currProject;

	public String getCurrProject()
	{ return currProject; }

	public void setCurrProject(String currProject)
	{ this.currProject = currProject; }

	public Builder(String surname, String name, String patronymic, String currProject)
	{
		super(surname, name, patronymic);
		this.currProject = currProject;
	}

	@Override
	public String toString()
	{ return "Builder [currProject=" + currProject + ", toString()=" + super.toString() + "]"; }
}
