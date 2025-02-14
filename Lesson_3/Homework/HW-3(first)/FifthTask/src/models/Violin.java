package models;

public final class Violin extends MusicalInstrument
{
	private String stringsNum;

	public String getStringsNum()
	{ return stringsNum; }

	public void setStringsNum(String stringsNum)
	{ this.stringsNum = stringsNum; }
	
	public Violin(String owner, String description, String history, String stringsNum)
	{
		super(owner, description, history);
		
		this.stringsNum = stringsNum;
	}

	@Override
	public String gnrtStrAudioPres()
	{ return "swee… swoo… triiiill… weeeee…"; }

	@Override
	public String toString()
	{ return "Violin [stringsNum=" + stringsNum + ", toString()=" + super.toString() + "]"; }
}
