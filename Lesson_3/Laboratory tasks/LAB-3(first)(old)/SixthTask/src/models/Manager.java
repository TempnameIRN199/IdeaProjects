package models;

public final class Manager extends Worker
{
	private double budget;
	
	public double getBudget()
	{ return budget; }

	public void setBudget(double budget)
	{ this.budget = budget; }

	public Manager(String surname, String name, String patronymic, double budget)
	{
		super(surname, name, patronymic);
		
		this.budget = budget;
	}
}
