package lab6RationalNumbers;

import java.math.BigInteger;

public class RationalNumbers {

	/**
	 * The numerator is the number before the / sign
	 */
	private int numerator;
	
	/**
	 * The denominator is the number after the / sign
	 */
	private int denominator;
	
	/**
	 * Default constructor, sets the rational number to 0/1
	 */
	public RationalNumbers(){
		numerator =0;
		denominator = 0;
	}
	
	/**
	 * Calculates the greatest common divisor of the inputs.
	 * Note that the inputs should be non zero integers
	 * @param numerator Used in the calculations as a numerator
	 * @param denominator Used in the calculations as a denominator
	 * @return an int that is the greatest common divisor
	 */
	public int getGCD(int numerator, int denominator){
		BigInteger tempNumerator =BigInteger.valueOf(numerator);
		BigInteger tempDenominator =BigInteger.valueOf(denominator);
		BigInteger tempGCD = tempNumerator.gcd(tempDenominator);
		return tempGCD.intValue();
	}
}
