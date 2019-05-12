package lGpl20.b32.eqDiv;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import lGpl20.o.O;

/**
 * 本類別比較人, 用來互相比較 long, double, BigInteger, BigDecimal, Fr64, Fraction, BigFraction 之間大小.<br/>
 * <br/>
 * To compare among long, double, BigInteger, BigDecimal, Fr64, Fraction, BigFraction.
 * 
 * @version 2017/03/18_08:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaForFraction_A" >CompaForFraction_A.
 *          java</a>
 * 
 * @see CompaForFraction_Z
 */
public abstract class CompaForFraction_A implements Serializable {

	private static final Class<CompaForFraction_A> CLASS_THIS = CompaForFraction_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 * 
	 */
	public static final int c(long num1, BigInteger num2) {

		return BigInteger.valueOf(num1).compareTo(num2);

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 * 
	 */
	public static final int c(long num1, BigDecimal num2) {

		return BigDecimal.valueOf(num1).compareTo(num2);

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 * 
	 */
	public static final int c(long num1, Fr64 num2) {

		return new BigFraction(num1).compareTo(num2.toBigFraction());// fuck -(2^63)

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 * 
	 */
	public static final int c(long num1, BigFraction num2) {

		return new BigFraction(num1, 1).compareTo(num2);

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 * 
	 */
	public static final int c(double num1, BigInteger num2) {

		return BigDecimal.valueOf(num1).compareTo(new BigDecimal(num2));

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 * 
	 */
	public static final int c(double num1, BigDecimal num2) {

		return BigDecimal.valueOf(num1).compareTo(num2);

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 * 
	 */
	public static final int c(double num1, Fr64 num2) {

		return new BigFraction(num1).compareTo(num2.toBigFraction());

	}

	/**
	 * 比較 num1 與 num2.<br/>
	 * To compare num1 with the specified num2 for order.
	 * 
	 * @return -1, 0, 1 as this num1 is less than, equal to, or greater than the specified num2.
	 * 
	 */
	public static final int c(double num1, BigFraction num2) {

		return new BigFraction(num1).compareTo(num2);

	}

}
