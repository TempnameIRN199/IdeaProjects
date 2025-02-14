package utilities;

public final class Fraction
{
    private float numerator, denominator;

    public float getNumerator()
    { return numerator; }

    public float getDenominator()
    { return denominator; }

    public void setNumerator(float numerator)
    { this.numerator = numerator; }

    public void setDenominator(float denominator)
    { this.denominator = denominator; }
    
    public Fraction()
    {
    	this(0F, 0F);
    }
    
    public Fraction(float numerator, float denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other)
    {
        float newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        float newDenominator = this.denominator * other.denominator;
        
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other)
    {
        float newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        float newDenominator = this.denominator * other.denominator;
        
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other)
    {
        float newNumerator = this.numerator * other.numerator;
        float newDenominator = this.denominator * other.denominator;
        
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other)
    {
        float newNumerator = this.numerator * other.denominator;
        float newDenominator = this.denominator * other.numerator;
        
        return new Fraction(newNumerator, newDenominator);
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Fraction [numerator=").append(numerator)
                .append(", denominator=").append(denominator).append("]");
        
        return builder.toString();
    }
}