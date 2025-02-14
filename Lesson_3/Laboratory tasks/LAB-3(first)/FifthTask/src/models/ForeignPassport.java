package models;

public final class ForeignPassport extends Passport
{
	private String issuanceCountry;
	

	public String getIssuanceCountry()
	{ return issuanceCountry; }

	public void setIssuanceCountry(String issuanceCountry)
	{ this.issuanceCountry = issuanceCountry; }

	public ForeignPassport(String surname, String name, String patronymic,
			String series, String gender, String citizenship, String issuanceCountry) 
	{
		super(surname, name, patronymic, series, gender, citizenship);
		
		this.issuanceCountry = issuanceCountry;
	}

	@Override
	public String toString()
	{ return "ForeignPassport [issuanceCountry=" + issuanceCountry + ", toString()=" + super.toString() + "]"; }
}
