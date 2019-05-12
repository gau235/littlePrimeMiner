package lGpl20.b32.eqDiv;

import java.math.BigDecimal;
import java.math.BigInteger;

import lGpl20.o.O;

/**
 * @version 2015/04/04_21:57:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaForFraction_Z" >CompaForFraction_Z.
 *          java</a>
 * 
 * @see CompaForFraction
 */
public abstract class CompaForFraction_Z extends CompaForFraction_A {

	private static final Class<CompaForFraction_Z> CLASS_THIS = CompaForFraction_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigInteger num1, long num2) {

		return num1.compareTo(BigInteger.valueOf(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigInteger num1, double num2) {

		return new BigDecimal(num1).compareTo(BigDecimal.valueOf(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigInteger num1, BigDecimal num2) {

		return new BigDecimal(num1).compareTo(num2);

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigInteger num1, Fr64 num2) {

		return new BigFraction(num1).compareTo(num2.toBigFraction());

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigInteger num1, BigFraction num2) {

		return new BigFraction(num1).compareTo(num2);

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigDecimal num1, long num2) {

		return num1.compareTo(BigDecimal.valueOf(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigDecimal num1, double num2) {

		return num1.compareTo(BigDecimal.valueOf(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigDecimal num1, BigInteger num2) {

		return num1.compareTo(new BigDecimal(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigDecimal num1, Fr64 num2) {

		return new BigFraction(num1).compareTo(num2.toBigFraction());

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigDecimal num1, BigFraction num2) {

		return new BigFraction(num1).compareTo(num2);

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(Fr64 num1, long num2) {

		return num1.compareTo(new Fr64(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(Fr64 num1, double num2) {

		return num1.toBigFraction().compareTo(new BigFraction(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(Fr64 num1, BigInteger num2) {

		return num1.toBigFraction().compareTo(new BigFraction(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(Fr64 num1, BigDecimal num2) {

		return num1.toBigFraction().compareTo(new BigFraction(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(Fr64 num1, BigFraction num2) {

		return num1.toBigFraction().compareTo(num2);

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigFraction num1, long num2) {

		return num1.compareTo(new BigFraction(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigFraction num1, double num2) {

		return num1.compareTo(new BigFraction(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigFraction num1, BigInteger num2) {

		return num1.compareTo(new BigFraction(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigFraction num1, BigDecimal num2) {

		return num1.compareTo(new BigFraction(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 */
	public static final int c(BigFraction num1, Fr64 num2) {

		return num1.compareTo(num2.toBigFraction());

	}

}
