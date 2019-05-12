package lGpl20.b32.eqDiv;

import java.math.BigDecimal;
import java.math.BigInteger;

import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * @version 2018/07/13_11:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=BigFraction_Z" >BigFraction_Z.java</a>
 * 
 * @see BigFraction
 */
public abstract class BigFraction_Z extends BigFraction_D {

	private static final Class<BigFraction_Z> CLASS_THIS = BigFraction_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 分數類別的建構方法, 新生分數分子是 plusOr0Nu, 分母是 plusDe.<br/>
	 * Constructor; to create an fraction with plusOr0Nu and plusDe.
	 */
	public BigFraction_Z(int int32Sign, BigInteger plusOr0Nu, BigInteger plusDe) {

		super(int32Sign, plusOr0Nu, plusDe);

	}

	/**
	 * 此分數的分子.<br/>
	 * To return NU.
	 */
	public BigInteger getNu() {

		return NU;

	}

	/**
	 * 此分數的分母.<br/>
	 * To return DE.
	 */
	public BigInteger getDe() {

		return DE;

	}

	/**
	 * 回傳 BigInteger 其值為此分數分子除以分母的結果.<br/>
	 * To return a BigInteger its value equals the NU divided by the DE.
	 */
	public BigInteger toBigInteger() {

		if (INT32_SIGN == INT32_SIGN_PLUS) {

			return NU.divide(DE);

		}

		if (INT32_SIGN == INT32_SIGN_MINUS) {

			return NU.divide(DE).negate();

		}

		return BigInteger.ZERO;

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

	@Override
	public int intValue() {

		return bigDecimal(defScale).intValue();

	}

	@Override
	public long longValue() {

		return bigDecimal(defScale).longValue();

	}

	@Override
	public float floatValue() {

		return bigDecimal(defScale).floatValue();

	}

	@Override
	public double doubleValue() {

		return bigDecimal(defScale).doubleValue();

	}

	/**
	 * 此分數是整數嗎 ?<br/>
	 * Is this fraction an integer?
	 */
	public boolean isInteger() {

		return DE.compareTo(BigInteger.ONE) == 0;

	}

	/**
	 * 回傳一個新分數其值為此分數取負性質.<br/>
	 * To return a new fraction whose value is -this.<br/>
	 */
	public BigFraction neg() {

		return new BigFraction(-1 * INT32_SIGN, NU, DE);

	}

	/**
	 * 回傳一個新分數其值為此分數的絕對值.<br/>
	 * To return a new fraction whose value is the absolute value of this fraction.
	 */
	public BigFraction abs() {

		return new BigFraction(INT32_SIGN_PLUS, NU, DE);

	}

	/**
	 * 回傳一個新分數其值為此分數的倒數.<br/>
	 * To return a new fraction which is denominator/numerator.<br/>
	 */
	public BigFraction inv() {

		return new BigFraction(INT32_SIGN, DE, NU);

	}

	/**
	 * 回傳此分數的分子除以分母的正餘數 .<br/>
	 * To return the plus remainder of dividing NU by DE.
	 */
	public BigInteger rem() {

		return NU.mod(DE);

	}

	/**
	 * 回傳一個字串 : 分子 / 分母.<br/>
	 * To return a string: NU/DE.
	 */
	public StringBuilder toStr() {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		if (INT32_SIGN == INT32_SIGN_MINUS) {

			retStr.append(O.C45);

		}

		return retStr.append(NU.toString(Ranger.$10_INT32)).append(O.C47).append(DE.toString(Ranger.$10_INT32));

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
