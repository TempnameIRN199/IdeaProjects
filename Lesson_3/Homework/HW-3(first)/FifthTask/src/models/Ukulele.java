package models;

public final class Ukulele extends MusicalInstrument
{
	private String stringsNum;
	
	public String getStringsNum()
	{ return stringsNum; }

	public void setStringsNum(String stringsNum)
	{ this.stringsNum = stringsNum; }

	public Ukulele(String owner, String description, String history, String stringsNum)
	{
		super(owner, description, history);
		this.stringsNum = stringsNum;
	}

	@Override
	public String gnrtStrAudioPres()
	{ return "plinka plinka… plunk-plunk… struuuum…"; }

	@Override
	public String toString()
	{ return "Ukulele [stringsNum=" + stringsNum + ", toString()=" + super.toString() + "]"; }
}
