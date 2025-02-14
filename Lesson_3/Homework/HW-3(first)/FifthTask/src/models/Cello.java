package models;

public final class Cello extends MusicalInstrument
{
	private short stringsNum;

	public short getStringsNum()
	{ return stringsNum; }

	public void setStringsNum(short stringsNum)
	{ this.stringsNum = stringsNum; }

	public Cello(String owner, String description, String history, short stringsNum)
	{
		super(owner, description, history);
		
		this.stringsNum = stringsNum;
	}

	@Override
	public String gnrtStrAudioPres()
	{ return "wom… woooom… daaaaah… hummmmm…"; }

	@Override
	public String toString()
	{ return "Cello [stringsNum=" + stringsNum + ", toString()=" + super.toString() + "]"; }
}
