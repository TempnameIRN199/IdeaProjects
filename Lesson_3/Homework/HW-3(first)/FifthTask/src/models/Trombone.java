package models;

public final class Trombone extends MusicalInstrument
{
	private short maxLength;

	public short getMaxLength()
	{ return maxLength; }

	public void setMaxLength(short maxLength)
	{ this.maxLength = maxLength; }

	public Trombone(String owner, String description, String history, short maxLength)
	{
		super(owner, description, history);
		
		this.maxLength = maxLength;
	}

	@Override
	public String gnrtStrAudioPres()
	{ return "BWAAAAAH… woooooah… bwaaap bwaaap!"; }

	@Override
	public String toString()
	{ return "Trombone [maxLength=" + maxLength + ", toString()=" + super.toString() + "]"; }
}
