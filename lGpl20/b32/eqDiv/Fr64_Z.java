package lGpl20.b32.eqDiv;

import java.math.BigDecimal;
import java.math.BigInteger;

import lGpl20.o.O;

/**
 * @version 2018/07/13_11:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Fr64_Z" >Fr64_Z.java</a>
 * 
 * @see Fr64
 */
public abstract class Fr64_Z extends Fr64_D {

	private static final Class<Fr64_Z> CLASS_THIS = Fr64_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 用符號和 64位元整數純量新生成分數, 分子是正數或 0, 分母是正數.<br/>
	 * To construct a new Fr64 with the sign and magnitude(plusOr0Nu and plusDe).
	 */
	public Fr64_Z(int int32Sign, long plusOr0Nu, long plusDe) {

		super(int32Sign, plusOr0Nu, plusDe);

	}

	/**
	 * 回傳 64 位元整數, 其值為此分數分子除以分母的結果.<br/>
	 * To return a long whose value equals the INT32_SIGN*NU divided by the DE.
	 */
	public long toInt64() {

		return INT32_SIGN * NU / DE;

	}

	/**
	 * 回傳分子除以分母的 64 位元浮點數.<br/>
	 * To return value of the INT32_SIGN*NU divided by the DE in double.<br/>
	 */
	public double toF64() {

		return INT32_SIGN * ((double) NU / (double) DE);

	}

	/**
	 * 回傳分子除以分母的 BigFraction 分數.<br/>
	 * To return value of the INT32_SIGN*NU divided by the DE with BigFraction.<br/>
	 */
	public BigFraction toBigFraction() {

		return new BigFraction(INT32_SIGN, BigInteger.valueOf(NU), BigInteger.valueOf(DE));

	}

	@Override
	public int intValue() {

		return (int) toInt64();

	}

	@Override
	public long longValue() {

		return toInt64();

	}

	@Override
	public float floatValue() {

		return (float) toF64();

	}

	@Override
	public double doubleValue() {

		return toF64();

	}

	/**
	 * 回傳一個新分數, 其值為此分數取負性質.<br/>
	 * To return a new Fr64 whose value is -this.<br/>
	 */
	public Fr64 neg() {

		return new Fr64(-1 * INT32_SIGN * NU, DE);

	}

	/**
	 * 回傳一個新分數, 其值為此分數的絕對值.<br/>
	 * To return a new Fr64 whose value is the absolute value of this.
	 */
	public Fr64 abs() {

		return new Fr64(NU, DE);

	}

	/**
	 * 回傳一個新分數其值為此分數的倒數.<br/>
	 * To return a new Fr64 which is INT32_SIGN*DE/NU.<br/>
	 */
	public Fr64 inv() {

		return new Fr64(INT32_SIGN * DE, NU);

	}

	/**
	 * 回傳此分數分子除以分母的正餘數 .<br/>
	 * To return the plus remainder of dividing NU by DE.
	 */
	public long rem() {

		return NU % DE;

	}

	/**
	 * 此分數是整數嗎 ?<br/>
	 * Is this F64 an integer?
	 */
	public boolean isInteger() {

		return DE == 1;

	}

	/**
	 * 回傳分子除以分母的 BigDecimal.<br/>
	 * 預設 scale 是 10, roundingMode 是 BigDecimal.ROUND_HALF_UP.<br/>
	 * To return value of the NU divided by the DE in BigDecimal.<br/>
	 * The default scale is 10, roundingMode is BigDecimal.ROUND_HALF_UP.
	 */
	public BigDecimal bigDecimal(int scale) {

		if (INT32_SIGN == INT32_SIGN_PLUS) {

			return new BigDecimal(NU).divide(new BigDecimal(DE), scale, roundingMode);

		}

		if (INT32_SIGN == INT32_SIGN_MINUS) {

			return new BigDecimal(NU).divide(new BigDecimal(DE), scale, roundingMode).negate();

		}

		return BigDecimal.ZERO;

	}

	/**
	 * 回傳一個字串建立者 : 分子 / 分母.<br/>
	 * To return a StringBuilder: NU/DE.
	 */
	public StringBuilder toStr() {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		if (INT32_SIGN == INT32_SIGN_MINUS) {

			retStr.append(O.C45);

		}

		return retStr.append(NU).append(O.C47).append(DE);

	}

	/**
	 * 回傳一個字串 : 分子 / 分母.<br/>
	 * To return a string: NU/DE.
	 */
	@Override
	public String toString() {

		return toStr().toString();

	}

}
