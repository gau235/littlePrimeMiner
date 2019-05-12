package lGpl20.b32.eqDiv;

import java.io.Serializable;
import java.math.BigInteger;

import lGpl20.o.O;

/**
 * 本類別抽象分數.<br/>
 * <br/>
 * A class for abstract fraction.
 * 
 * @version 2018/07/13_11:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=BigFraction_A" >BigFraction_A.java</a>
 * 
 * @see BigFraction_D
 */
public abstract class BigFraction_A extends Number implements Serializable {

	private static final Class<BigFraction_A> CLASS_THIS = BigFraction_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 正號, 代碼為 1.<br/>
	 * The plus sign.
	 */
	public static final int INT32_SIGN_PLUS = 1;

	/**
	 * 負號, 代碼為 -1.<br/>
	 * The minus sign.
	 */
	public static final int INT32_SIGN_MINUS = -1;

	/**
	 * 0, 代碼為 0.<br/>
	 * The sign of 0.
	 */
	public static final int INT32_SIGN_0 = 0;

	/**
	 * 此分數的分子.<br/>
	 * Numerator.
	 */
	protected BigInteger NU;// positive or 0

	/**
	 * 此分數的分母.<br/>
	 * Denominator.
	 */
	protected BigInteger DE;// positive

	/**
	 * 此分數的符號, 表示正負.<br/>
	 * Sign.
	 */
	public final int INT32_SIGN;

	/**
	 * default scale.<br/>
	 * default scale.
	 */
	public int defScale = 3;

	/**
	 * rounding mode to apply.<br/>
	 * rounding mode to apply.
	 */
	public int roundingMode;

	/**
	 * 用符號和 BigInteger 純量新生成分數, 分子是正數或 0, 分母是正數.<br/>
	 * To construct a new BigFraction with sign and magnitude(plusOr0Nu and plusDe).
	 */
	public BigFraction_A(int int32Sign, BigInteger plusOr0Nu, BigInteger plusDe) {

		long signOfPlusOr0Nu = plusOr0Nu.signum();

		if (signOfPlusOr0Nu < 0 || plusDe.signum() <= 0) {

			throw new ArithmeticException();

		}

		if (int32Sign == INT32_SIGN_0) {

			NU = BigInteger.ZERO;
			DE = BigInteger.ONE;

		} else {// INT32_SIGN == INT32_SIGN_PLUS or INT32_SIGN_MINUS

			if (signOfPlusOr0Nu == 0) {

				throw new ArithmeticException();

			}

			BigInteger gcd = plusOr0Nu.gcd(plusDe);

			NU = plusOr0Nu.divide(gcd);
			DE = plusDe.divide(gcd);

		}

		INT32_SIGN = int32Sign;

	}

}
