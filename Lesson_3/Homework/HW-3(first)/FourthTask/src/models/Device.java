package models;

public abstract class Device
{
	protected String name, description;

	public String getName()
	{ return name; }

	public void setName(String name)
	{ this.name = name; }

	public String getDescription()
	{ return description; }

	public void setDescription(String description)
	{ this.description = description; }

	public Device(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	public abstract String gnrtStrAudioPres();

	@Override
	public String toString()
	{ return "Device [name=" + name + ", description=" + description + "]"; }
}
