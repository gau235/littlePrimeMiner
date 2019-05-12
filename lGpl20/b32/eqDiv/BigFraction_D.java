package lGpl20.b32.eqDiv;

import java.math.BigDecimal;
import java.math.BigInteger;

import lGpl20.o.O;

/**
 * @version 2017/08/28_12:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=BigFraction_D" >BigFraction_D.java</a>
 * 
 * @see BigFraction_Z
 */
public abstract class BigFraction_D extends BigFraction_A {

	private static final Class<BigFraction_D> CLASS_THIS = BigFraction_D.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 把小數轉 BigInteger[].<br/>
	 * To converse BigDecimal to BigInteger[].
	 */
	public static BigInteger[] toNuDe(BigDecimal num) {

		int scale = num.scale();

		if (scale <= 0) {

			return new BigInteger[] { num.toBigInteger(), BigInteger.ONE };

		}

		return new BigInteger[] { num.movePointRight(scale).toBigInteger(), BigInteger.TEN.pow(scale) };

	}

	/**
	 * 把字串建立者轉 BigInteger[].<br/>
	 * To converse String to BigInteger[].
	 */
	public static BigInteger[] toNuDe(int indexOfDecimalPoint, StringBuilder str) {

		int scale = str.length() - indexOfDecimalPoint - 1;

		return new BigInteger[] { new BigInteger(str.deleteCharAt(indexOfDecimalPoint).toString()), BigInteger.TEN.pow(scale) };

	}

	/**
	 * 把字串轉 BigInteger[].<br/>
	 * To converse String to BigInteger[].
	 */
	public static BigInteger[] toNuDe(String string) {

		StringBuilder str = new StringBuilder(string);

		int index = str.indexOf(O.S47);

		if (index > 0) {

			return new BigInteger[] { new BigInteger(str.substring(0, index)), new BigInteger(str.substring(index + 1)) };

		} else if ((index = str.indexOf(O.S46)) > 0) {

			return toNuDe(index, str);

		} else {

			return new BigInteger[] { new BigInteger(str.toString()), BigInteger.ONE };

		}

	}

	/**
	 * 將輸入兩數同除以兩數最大公因數.<br/>
	 * Both two BigInteger to be divided by their G.C.D.
	 */
	public static BigInteger[] reduceByGcd(BigInteger plusNum1, BigInteger plusNum2) {

		if (plusNum1.signum() <= 0 || plusNum2.signum() <= 0) {

			O.x();

		}

		BigInteger gcd = plusNum1.gcd(plusNum2);

		final BigInteger[] aryOfBigInteger = new BigInteger[2];

		aryOfBigInteger[0] = plusNum1.divide(gcd);
		aryOfBigInteger[1] = plusNum2.divide(gcd);

		return aryOfBigInteger;

	}

	/**
	 * 純量比較.<br/>
	 * To compare in magnitude.<br/>
	 * nu1*nu2*de1*de2 must &gt;=0
	 */
	public static int compareInMagnitude(BigInteger nu1, BigInteger de1, BigInteger nu2, BigInteger de2) {// all plus

		BigInteger gcdOfDe = de1.gcd(de2);
		BigInteger factor1 = de1.divide(gcdOfDe);
		BigInteger factor2 = de2.divide(gcdOfDe);

		BigInteger newNu = (nu1.multiply(factor2)).subtract(nu2.multiply(factor1));

		return newNu.signum();

	}

	/**
	 * 純量加法.<br/>
	 * To add in magnitude.
	 */
	public static BigInteger[] addInMagnitude(BigInteger nu1, BigInteger de1, BigInteger nu2, BigInteger de2) {

		BigInteger gcdOfDe = de1.gcd(de2);
		BigInteger factor1 = de1.divide(gcdOfDe);
		BigInteger factor2 = de2.divide(gcdOfDe);

		BigInteger newNu = (nu1.multiply(factor2)).add(nu2.multiply(factor1));

		return reduceByGcd(newNu, factor1.multiply(factor2).multiply(gcdOfDe));

	}

	/**
	 * 純量減法.<br/>
	 * To subtract in magnitude.
	 */
	public static BigInteger[] subInMagnitude(BigInteger nu1, BigInteger de1, BigInteger nu2, BigInteger de2) {

		BigInteger gcdOfDe = de1.gcd(de2);
		BigInteger factor1 = de1.divide(gcdOfDe);
		BigInteger factor2 = de2.divide(gcdOfDe);

		BigInteger newNu = (nu1.multiply(factor2)).subtract(nu2.multiply(factor1));

		if (newNu.signum() == INT32_SIGN_0) {

			return new BigInteger[] { BigInteger.ZERO, BigInteger.ONE };

		}

		return reduceByGcd(newNu, factor1.multiply(factor2).multiply(gcdOfDe));

	}

	/**
	 * 純量乘法.<br/>
	 * To multiply in magnitude.
	 */
	public static BigInteger[] mulInMagnitude(BigInteger nu1, BigInteger de1, BigInteger nu2, BigInteger de2) {

		return reduceByGcd(nu1.multiply(nu2), de1.multiply(de2));

	}

	/**
	 * 用符號和 BigInteger 純量新生成分數, 分子是正數或 0, 分母是正數.<br/>
	 * To construct a new BigFraction with sign and magnitude (plusOr0Nu and plusDe).
	 */
	public BigFraction_D(int int32Sign, BigInteger plusOr0Nu, BigInteger plusDe) {

		super(int32Sign, plusOr0Nu, plusDe);

	}

}
