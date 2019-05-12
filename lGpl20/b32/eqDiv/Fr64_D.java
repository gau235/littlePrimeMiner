package lGpl20.b32.eqDiv;

import java.math.BigDecimal;

import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * @version 2013/01/22_20:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Fr64_D" >Fr64_D.java</a>
 * 
 * @see Fr64_Z
 */
public abstract class Fr64_D extends Fr64_A {

	private static final Class<Fr64_D> CLASS_THIS = Fr64_D.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 把小數轉 long[].<br/>
	 * To converse the BigDecimal to long[].
	 */
	public static long[] toNuDe(BigDecimal num) {

		int scale = num.scale();

		if (scale <= 0) {

			return new long[] { num.toBigInteger().longValue(), 1 };

		}

		return new long[] { num.movePointRight(scale).toBigInteger().longValue(), (long) StrictMath.pow(Ranger.$10, scale) };

	}

	/**
	 * 把字串建立者轉 long[].<br/>
	 * To converse the String to long[].
	 */
	public static long[] toNuDe(int indexOfDecimalPoint, StringBuilder str) {

		int scale = str.length() - indexOfDecimalPoint - 1;

		return new long[] { Long.parseLong(str.deleteCharAt(indexOfDecimalPoint).toString()),
				(long) StrictMath.pow(Ranger.$10, scale) };

	}

	/**
	 * 把字串轉 long[].<br/>
	 * To converse the String to long[].
	 */
	public static long[] toNuDe(String string) {

		StringBuilder str = new StringBuilder(string);

		int index = str.indexOf(STR_SLASH);

		if (index > 0) {

			return new long[] { Long.parseLong(str.substring(0, index)), Long.parseLong(str.substring(index + 1)) };

		} else if ((index = str.indexOf(O.S46)) > 0) {

			return toNuDe(index, str);

		} else {

			return new long[] { Long.parseLong(str.toString()), 1 };

		}

	}

	/**
	 * 將輸入兩數同除以兩數最大公因數.<br/>
	 * Both two long to be divided by their G.C.D.
	 */
	public static long[] reduceByGcd(long plusNum1, long plusNum2) {

		long gcd = Ranger.gcd(plusNum1, plusNum2);

		return new long[] { plusNum1 / gcd, plusNum2 / gcd };

	}

	/**
	 * 純量比較.<br/>
	 * To compare in magnitude.<br/>
	 * nu1*nu2*de1*de2 must &gt;=0
	 * 
	 * @throws IndexOutOfBoundsException
	 */
	public static int compareInMagnitude(long nu1, long de1, long nu2, long de2) {

		long gcdOfDe = Ranger.gcd(de1, de2);
		long factor1 = de1 / gcdOfDe;
		long factor2 = de2 / gcdOfDe;

		long nu1MulFactor2 = Ranger.calculateNCheckOutOfBound(nu1, factor2, Ranger.TYPE_MUL);

		long nu2MulFactor1 = Ranger.calculateNCheckOutOfBound(nu2, factor1, Ranger.TYPE_MUL);

		long newNu = nu1MulFactor2 - nu2MulFactor1;

		return getSign(newNu);

	}

	/**
	 * 純量加法.<br/>
	 * To add in magnitude.
	 * 
	 * @throws IndexOutOfBoundsException
	 */
	public static long[] addInMagnitude(long nu1, long de1, long nu2, long de2) {

		long gcdOfDe = Ranger.gcd(de1, de2);
		long factor1 = de1 / gcdOfDe;
		long factor2 = de2 / gcdOfDe;

		long nu1MulFactor2 = Ranger.calculateNCheckOutOfBound(nu1, factor2, Ranger.TYPE_MUL);

		long nu2MulFactor1 = Ranger.calculateNCheckOutOfBound(nu2, factor1, Ranger.TYPE_MUL);

		long newNu = Ranger.calculateNCheckOutOfBound(nu1MulFactor2, nu2MulFactor1, Ranger.TYPE_ADD);

		long factor1MulFactor2 = Ranger.calculateNCheckOutOfBound(factor1, factor2, Ranger.TYPE_MUL);

		long newDe = Ranger.calculateNCheckOutOfBound(factor1MulFactor2, gcdOfDe, Ranger.TYPE_MUL);

		return reduceByGcd(newNu, newDe);

	}

	/**
	 * 純量減法.<br/>
	 * To subtract in magnitude.
	 * 
	 * @throws IndexOutOfBoundsException
	 */
	public static long[] subInMagnitude(long nu1, long de1, long nu2, long de2) {// nu1/de1 is more

		long gcdOfDe = Ranger.gcd(de1, de2);
		long factor1 = de1 / gcdOfDe;
		long factor2 = de2 / gcdOfDe;

		long factor1MulFactor2 = Ranger.calculateNCheckOutOfBound(factor1, factor2, Ranger.TYPE_MUL);

		long newDe = Ranger.calculateNCheckOutOfBound(factor1MulFactor2, gcdOfDe, Ranger.TYPE_MUL);

		long nu1MulFactor2 = Ranger.calculateNCheckOutOfBound(nu1, factor2, Ranger.TYPE_MUL);

		long nu2MulFactor1 = Ranger.calculateNCheckOutOfBound(nu2, factor1, Ranger.TYPE_MUL);

		long newNu = nu1MulFactor2 - nu2MulFactor1;

		// if (newNu < 0) {
		//
		// if (newNu == Long.MIN_VALUE) {
		//
		// throw new ArithmeticException("-(2^63) out of bound");
		//
		// }
		//
		// long[] ary32 = reduceByGcd(-newNu, newDe);
		//
		// ary32[0] = -ary32[0];
		//
		// return ary32;
		//
		// }
		//
		// if (newNu == 0) {
		//
		// return new long[] { 0, 1 };
		// }

		return reduceByGcd(newNu, newDe);

	}

	/**
	 * 純量乘法.<br/>
	 * To multiply in magnitude.
	 * 
	 * @throws IndexOutOfBoundsException
	 */
	public static long[] mulInMagnitude(long nu1, long de1, long nu2, long de2) {// all plus

		long nu1MulNu2 = Ranger.calculateNCheckOutOfBound(nu1, nu2, Ranger.TYPE_MUL);
		long de1MulDe2 = Ranger.calculateNCheckOutOfBound(de1, de2, Ranger.TYPE_MUL);

		return reduceByGcd(nu1MulNu2, de1MulDe2);

	}

	/**
	 * 用符號和 64位元整數純量新生成分數, 分子是正數或 0, 分母是正數.<br/>
	 * To construct a new Fr64 with the sign and magnitude(plusOr0Nu and plusDe).
	 */
	public Fr64_D(int int32Sign, long plusOr0Nu, long plusDe) {

		super(int32Sign, plusOr0Nu, plusDe);

	}

}
