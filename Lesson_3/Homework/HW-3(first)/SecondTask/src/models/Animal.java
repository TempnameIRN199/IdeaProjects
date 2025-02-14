package models;

public abstract class Animal
{
	protected String name, breed;
	protected float weight;
	
	public String getName()
	{ return name; }

	public void setName(String name)
	{ this.name = name; }

	public String getBreed()
	{ return breed; }

	public void setBreed(String breed)
	{ this.breed = breed; }

	public float getWeight()
	{ return weight; }

	public void setWeight(float weight)
	{ this.weight = weight; }

	public Animal(String name, String breed, float weight)
	{
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	@Override
	public String toString()
	{ return "Animal [name=" + name + ", breed=" + breed + ", weight=" + weight + "]"; }
}
