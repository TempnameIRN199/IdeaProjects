package models;

public abstract class MusicalInstrument
{
	private String owner, description, history;

	public String getOwner()
	{ return owner; }

	public void setOwner(String owner)
	{ this.owner = owner; }

	public String getDescription()
	{ return description; }

	public void setDescription(String description)
	{ this.description = description; }

	public String getHistory()
	{ return history; }

	public void setHistory(String history)
	{ this.history = history; }

	public MusicalInstrument(String owner, String description, String history)
	{
		this.owner = owner;
		this.description = description;
		this.history = history;
	}
	
	public abstract String gnrtStrAudioPres();

	@Override
	public String toString()
	{ return "MusicalInstrument [owner=" + owner + ", description=" + description + ", history=" + history + "]"; }
}
