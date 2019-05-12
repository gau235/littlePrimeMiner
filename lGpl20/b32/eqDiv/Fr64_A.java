package lGpl20.b32.eqDiv;

import java.io.Serializable;

import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * 本類別 64 位元分數.<br/>
 * <br/>
 * The 64 bit fraction.
 * 
 * @version 2018/07/13_11:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Fr64_A" >Fr64_A.java</a>
 * 
 * @see Fr64_D
 */
public abstract class Fr64_A extends Number implements Serializable {

	private static final Class<Fr64_A> CLASS_THIS = Fr64_A.class;

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
	 * 字串斜線 (/).<br/>
	 * The string slash(/).
	 */
	public static final String STR_SLASH = O.S47;

	/**
	 * 此分數的分子; 正數或 0.<br/>
	 * Numerator; positive or 0.
	 */
	public final long NU;// positive or 0

	/**
	 * 此分數的分母; 正數.<br/>
	 * Denominator; positive.
	 */
	public final long DE;// positive

	/**
	 * 此分數的符號, 決定正負或 0.<br/>
	 * Sign.
	 */
	public final int INT32_SIGN;

	/**
	 * rounding mode to apply.<br/>
	 * rounding mode to apply.
	 */
	public int roundingMode;

	/**
	 * 1 或 0 或 -1.<br/>
	 * To return the sign of the int64; 0 if the argument is 0, 1 if the int64 is greater than 0,<br/>
	 * -1 if the int64 is less than 0.
	 */
	public static int getSign(long int64) {

		if (int64 > 0) {

			return 1;
		}

		if (int64 < 0) {

			return -1;
		}

		return 0;

	}

	/**
	 * 用符號和 64位元整數純量新生成分數, 分子是正數或 0, 分母是正數.<br/>
	 * To construct a new Fr64 with the sign and magnitude(plusOr0Nu and plusDe).
	 */
	public Fr64_A(int int32Sign, long plusOr0Nu, long plusDe) {

		if (plusOr0Nu < 0 || plusDe <= 0) {

			throw new ArithmeticException("plusOr0Nu=" + plusOr0Nu + ", plusDe=" + plusDe);

		}

		if (int32Sign == INT32_SIGN_0) {

			NU = 0;
			DE = 1;

		} else {// INT32_SIGN == INT32_SIGN_PLUS or INT32_SIGN_MINUS

			if (plusOr0Nu == 0) {

				throw new ArithmeticException();

			}

			long gcd = Ranger.gcd(plusOr0Nu, plusDe);

			NU = plusOr0Nu / gcd;
			DE = plusDe / gcd;

		}

		INT32_SIGN = int32Sign;

	}

}
