/**
 * Creates a fraction from two integers
 * @author Abigail
 */
package constructors;

public class Fraction {
	private int numerator;
	private int denominator;
	
	/**
	 * Default constructor, creates 0/1
	 */
	public Fraction() {
		this(0,1);
	}
	
	/**
	 * one parameter constructor, creates number/1
	 * @param num the numerator
	 */
	public Fraction(int num) {
		this(num, 1);
	}
	
	/**
	 * copy constructor, creates a copy of existing fraction
	 * @param frac an object of type Fraction
	 */
	public Fraction(Fraction frac) {		//copy constructor, 
		this(frac.getNumerator(), frac.getDenominator());
	}
	
	/**
	 * Two parameter constructor, creates num/denom
	 * @param num the numerator
	 * @param denom the denominator
	 */
	public Fraction(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}
	
	/**
	 * returns numerator value
	 * @return numerator an int
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * assigns the numerator value
	 * @param numerator the numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * returns denominator value
	 * @return denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * assigns the denominator value 
	 * @param denominator the denominator
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	/**
	 * computes the fraction's value
	 * @return the result of division as a double
	 */
	public double compute() {
		return ((double)numerator / denominator);
	}
	
}
