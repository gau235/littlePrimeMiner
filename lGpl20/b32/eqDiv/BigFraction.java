package lGpl20.b32.eqDiv;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.SByN;

/**
 * 均等分數類別.<br/>
 * 由符號, 分子, 分母(正數或 0)構成.<br/>
 * <br/>
 * A class for fraction.
 * 
 * @version 2017/08/28_12:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=BigFraction" >BigFraction.java</a>
 * 
 * @see Fr64
 */
public class BigFraction extends BigFraction_Z implements Comparable<BigFraction> {

	private static final Class<BigFraction> CLASS_THIS = BigFraction.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 1 分之 0.<br/>
	 * 0/1.
	 */
	public static final BigFraction $0 = new BigFraction(BigInteger.ZERO, BigInteger.ONE);

	/**
	 * 1 分之 1.<br/>
	 * 1/1.
	 */
	public static final BigFraction $1 = new BigFraction(BigInteger.ONE, BigInteger.ONE);

	/**
	 * 2 分之 1; 一半.<br/>
	 * 1/2.
	 */
	public static final BigFraction $1_2 = new BigFraction(1, 2);

	/**
	 * 3 分之 1.<br/>
	 * 1/3.
	 */
	public static final BigFraction $1_3 = new BigFraction(1, 3);

	/**
	 * -1 分之 1.<br/>
	 * -1/1.
	 */
	public static final BigFraction $_1 = new BigFraction(-1, 1);

	/**
	 * Temp char sequence.<br/>
	 * Temp char sequence.
	 */
	public CharSequence tempCharSequence;

	/**
	 * 用符號和 BigInteger 純量新生成分數, 分子是正數或 0, 分母是正數.<br/>
	 * To construct a new fraction with the sign and magnitude(plusOr0Nu and plusDe).
	 */
	public BigFraction(int int32Sign, BigInteger plusOr0Nu, BigInteger plusDe) {

		super(int32Sign, plusOr0Nu, plusDe);

	}

	/**
	 * 分數類別的建構方法, 新生分數分子是 nu, 分母是 plusDe.<br/>
	 * Constructor; to create a fraction with nu and plusDe.
	 */
	public BigFraction(BigInteger nu, BigInteger plusDe) {

		this(nu.signum(), nu.abs(), plusDe);

	}

	/**
	 * 分數類別的建構方法, 新生分數分子是 nu, 分母是 plusDe.<br/>
	 * Constructor; to create a fraction with nu and plusDe.
	 */
	public BigFraction(long nu, long plusDe) {

		this(BigInteger.valueOf(nu), BigInteger.valueOf(plusDe));

	}

	/**
	 * 分數類別的建構方法, 新生分數分子是 num, 分母是 1.<br/>
	 * Constructor; to create a fraction with num and 1.
	 */
	public BigFraction(long num) {

		this(BigInteger.valueOf(num), BigInteger.ONE);

	}

	/**
	 * 分數類別的建構方法, 新生分數分子是 num, 分母是 1.<br/>
	 * Constructor; to create a fraction with num and 1.
	 */
	public BigFraction(BigInteger num) {

		this(num, BigInteger.ONE);

	}

	/**
	 * 分數類別的建構方法.<br/>
	 * Constructor.
	 */
	private BigFraction(BigInteger[] nuDe) {

		this(nuDe[0], nuDe[1]);

	}

	/**
	 * 分數類別的建構方法.<br/>
	 * 若輸入 num 是 new BigDecimal("5.99"), 此分數分子是 599, 分母是 100.<br/>
	 * Constructor.
	 */
	public BigFraction(BigDecimal num) {// minus is all right.

		this(toNuDe(num));

	}

	/**
	 * 分數類別的建構方法.<br/>
	 * Constructor.
	 */
	public BigFraction(double f64) {

		this(BigDecimal.valueOf(f64));

	}

	/**
	 * 分數類別的建構方法. 請輸入一含有斜線字串的字串.<br/>
	 * 若輸入 num 是 "3/4", 此分數分子是 3 分母是 4.<br/>
	 * Constructor. Please input a string containing "/".
	 */
	public BigFraction(String nuSlashDe) {// only plus

		this(toNuDe(nuSlashDe));

	}

	/**
	 * 比較此分數和 f 的大小.<br/>
	 * 此分數大於 f 回傳 1, 等於 f 回傳 0, 小於 f 回傳 -1.<br/>
	 * To compare this to f.<br/>
	 * To return 1 if great than; to return 0 if equal to; to return -1 if less than.
	 */
	@Override
	public int compareTo(BigFraction f) {

		if (INT32_SIGN == INT32_SIGN_PLUS && f.INT32_SIGN == INT32_SIGN_PLUS) {

			return compareInMagnitude(NU, DE, f.NU, f.DE);

		}

		if (INT32_SIGN == INT32_SIGN_PLUS && f.INT32_SIGN == INT32_SIGN_0) {

			return 1;

		}

		if (INT32_SIGN == INT32_SIGN_PLUS && f.INT32_SIGN == INT32_SIGN_MINUS) {

			return 1;

		}

		if (INT32_SIGN == INT32_SIGN_0 && f.INT32_SIGN == INT32_SIGN_PLUS) {

			return -1;

		}

		if (INT32_SIGN == INT32_SIGN_0 && f.INT32_SIGN == INT32_SIGN_0) {

			return 0;

		}

		if (INT32_SIGN == INT32_SIGN_0 && f.INT32_SIGN == INT32_SIGN_MINUS) {

			return 1;

		}

		if (INT32_SIGN == INT32_SIGN_MINUS && f.INT32_SIGN == INT32_SIGN_PLUS) {

			return -1;

		}

		if (INT32_SIGN == INT32_SIGN_MINUS && f.INT32_SIGN == INT32_SIGN_0) {

			return -1;

		} else {

			// sign == INT32_SIGN_MINUS && sign2 == INT32_SIGN_MINUS
			return -1 * compareInMagnitude(NU, DE, f.NU, f.DE);

		}

	}

	/**
	 * 分數的加法.<br/>
	 * 回傳一個新分數其值為此分數加 f.<br/>
	 * To return a new fraction which is this adds f.
	 */
	public BigFraction add(BigFraction f) {

		if (INT32_SIGN == INT32_SIGN_PLUS && f.INT32_SIGN == INT32_SIGN_PLUS) {

			BigInteger[] aryOfBigInteger = addInMagnitude(NU, DE, f.NU, f.DE);

			return new BigFraction(aryOfBigInteger[0], aryOfBigInteger[1]);

		}

		if (INT32_SIGN == INT32_SIGN_PLUS && f.INT32_SIGN == INT32_SIGN_0) {

			return this;

		}

		if (INT32_SIGN == INT32_SIGN_PLUS && f.INT32_SIGN == INT32_SIGN_MINUS) {

			if (compareInMagnitude(NU, DE, f.NU, f.DE) == 1) {

				BigInteger[] aryOfBigInteger = subInMagnitude(NU, DE, f.NU, f.DE);

				return new BigFraction(aryOfBigInteger[0], aryOfBigInteger[1]);

			}

			if (compareInMagnitude(NU, DE, f.NU, f.DE) == 0) {

				return $0;

			}

			if (compareInMagnitude(NU, DE, f.NU, f.DE) == -1) {

				BigInteger[] aryOfBigInteger = subInMagnitude(f.NU, f.DE, NU, DE);

				return new BigFraction(aryOfBigInteger[0].negate(), aryOfBigInteger[1]);

			}

		}

		if (INT32_SIGN == INT32_SIGN_0 && f.INT32_SIGN == INT32_SIGN_PLUS) {

			return f;

		}

		if (INT32_SIGN == INT32_SIGN_0 && f.INT32_SIGN == INT32_SIGN_0) {

			return $0;

		}

		if (INT32_SIGN == INT32_SIGN_0 && f.INT32_SIGN == INT32_SIGN_MINUS) {

			return f;

		}

		if (INT32_SIGN == INT32_SIGN_MINUS && f.INT32_SIGN == INT32_SIGN_PLUS) {

			if (compareInMagnitude(NU, DE, f.NU, f.DE) == 1) {

				BigInteger[] aryOfBigInteger = subInMagnitude(NU, DE, f.NU, f.DE);

				return new BigFraction(aryOfBigInteger[0].negate(), aryOfBigInteger[1]);

			}

			if (compareInMagnitude(NU, DE, f.NU, f.DE) == 0) {

				return $0;

			}

			if (compareInMagnitude(NU, DE, f.NU, f.DE) == -1) {

				BigInteger[] aryOfBigInteger = subInMagnitude(f.NU, f.DE, NU, DE);

				return new BigFraction(aryOfBigInteger[0], aryOfBigInteger[1]);

			}

		}

		if (INT32_SIGN == INT32_SIGN_MINUS && f.INT32_SIGN == INT32_SIGN_0) {

			return this;

		} else {

			// sign == INT32_SIGN_MINUS && sign2 == INT32_SIGN_MINUS
			BigInteger[] aryOfBigInteger = addInMagnitude(NU, DE, f.NU, f.DE);

			return new BigFraction(aryOfBigInteger[0].negate(), aryOfBigInteger[1]);

		}

	}

	/**
	 * 分數的減法.<br/>
	 * 回傳一個新分數其值為此分數減掉 f.<br/>
	 * To return a new fraction which is this subtracts f.
	 */
	public BigFraction sub(BigFraction f) {

		return add(f.neg());

	}

	/**
	 * 分數的乘法.<br/>
	 * 回傳一個新分數其值為此分數乘以 f.<br/>
	 * To return a new fraction which is this multiplies f.
	 */
	public BigFraction mul(BigFraction f) {

		if (INT32_SIGN == INT32_SIGN_0 || f.INT32_SIGN == INT32_SIGN_0) {
			return $0;

		}

		BigInteger[] aryOfBigInteger = mulInMagnitude(NU, DE, f.NU, f.DE);

		BigInteger newNu = aryOfBigInteger[0];

		if (INT32_SIGN * f.INT32_SIGN < 0) {

			newNu = newNu.negate();

		}

		return new BigFraction(newNu, aryOfBigInteger[1]);

	}

	/**
	 * 分數的除法.<br/>
	 * 回傳一個新分數其值為此分數除以 f.<br/>
	 * To return a new fraction which is this subtracts f.
	 */
	public BigFraction div(BigFraction f) {

		if (INT32_SIGN == INT32_SIGN_0) {

			return $0;

		}

		if (f.INT32_SIGN == INT32_SIGN_0) {

			throw new ArithmeticException();

		}

		return mul(f.inv());

	}

	/**
	 * 分數的次方.<br/>
	 * 回傳一個新分數其值為此分數 n 次方.<br/>
	 * To return a new fraction which is this powers n.
	 */
	public BigFraction pow(int n) {

		int absN = StrictMath.abs(n);

		if (n == 0) {

			if (INT32_SIGN == INT32_SIGN_0) {

				throw new ArithmeticException();

			}

			return $1;

		}

		if (INT32_SIGN == INT32_SIGN_0) {

			return $0;

		}

		// int newSign = (int) StrictMath.pow(INT32_SIGN, absN % 2);
		int newSign = (int) StrictMath.pow(INT32_SIGN, absN & 0b1);

		BigFraction preAnswer = new BigFraction(newSign, NU.pow(absN), DE.pow(absN));

		if (n > 0) {

			return preAnswer;

		}

		// n < 0
		return preAnswer.inv();

	}

	/**
	 * 取得擴分後的分子.<br/>
	 * To get a new fraction by the fixed denominator.
	 */
	public BigFraction getNuByFixedDn(BigInteger fixedDn) {

		return mul(new BigFraction(fixedDn));

	}

	/**
	 * 取得擴分後的分子.<br/>
	 * To get a new fraction by the fixed denominator.
	 */
	public BigFraction getNuByFixedDn(long fixedDn) {

		return mul(new BigFraction(fixedDn));

	}

	/**
	 * 此分數等於 object ?<br/>
	 * 若 object 是分數或 Number 物件, 則此分數和 object 比較是否相等.<br/>
	 * Is this equal to object?<br/>
	 * If object were a BigFraction or Number, this will compare to object.
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {

			return false;

		}

		if (obj instanceof Fr64) {

			Fr64 fr64 = (Fr64) obj;

			return compareTo(new BigFraction(fr64.INT32_SIGN * fr64.NU, fr64.DE)) == 0;

		}

		if (obj instanceof BigFraction) {

			return compareTo((BigFraction) obj) == 0;

		}

		return super.equals(obj);

	}

	/**
	 * To sum.<br/>
	 * To sum.
	 */
	public static BigFraction sum(BigFraction... aryOfBigFraction) {

		BigFraction ans = $0;

		for (int i = 0; i < aryOfBigFraction.length; i++) {

			BigFraction f = aryOfBigFraction[i];

			if (f == null) {

				continue;

			}

			ans = ans.add(f);

		}

		return ans;

	}

	/**
	 * To sum.<br/>
	 * To sum.
	 */
	public static BigFraction sumViaStringAry(String... aryOfStringBigFraction) {

		BigFraction ans = $0;

		for (int i = 0; i < aryOfStringBigFraction.length; i++) {

			String stringBigFraction = aryOfStringBigFraction[i];

			if (stringBigFraction == null) {

				continue;

			}

			if (O.Z.equals(stringBigFraction = stringBigFraction.trim())) {

				continue;

			}

			ans = ans.add(new BigFraction(stringBigFraction));

		}

		return ans;

	}

	/**
	 * 比較一群分數的大小.<br/>
	 * To sort the array of BigFraction.
	 */
	public static BigFraction[] sortViaStringAry(String... aryOfStringBigFraction) {

		Ery<BigFraction> eryOfBigFraction = new Ery<BigFraction>();

		for (int i = 0; i < aryOfStringBigFraction.length; i++) {

			String stringBigFraction = aryOfStringBigFraction[i];

			if (stringBigFraction == null) {

				continue;

			}

			if (O.Z.equals(stringBigFraction = stringBigFraction.trim())) {

				continue;

			}

			BigFraction f = new BigFraction(stringBigFraction);
			f.tempCharSequence = stringBigFraction;
			eryOfBigFraction.a(f);

		}

		BigFraction[] aryOfBigFraction = new BigFraction[0];
		aryOfBigFraction = eryOfBigFraction.toGenericAry(aryOfBigFraction);
		Arrays.sort(aryOfBigFraction);

		return aryOfBigFraction;

	}

	/**
	 * 比較一群分數的大小.<br/>
	 * To sort the array of BigFraction.
	 */
	public static BigFraction[] sortDescViaStringAry(String... aryOfStringBigFraction) {

		Ery<BigFraction> eryOfBigFraction = new Ery<BigFraction>();

		for (int i = 0; i < aryOfStringBigFraction.length; i++) {

			String stringBigFraction = aryOfStringBigFraction[i];

			stringBigFraction = stringBigFraction.trim();

			if (SByN.isNullOrEmpty(stringBigFraction)) {

				continue;

			}

			BigFraction f = new BigFraction(stringBigFraction);
			f.tempCharSequence = stringBigFraction;
			eryOfBigFraction.a(f);

		}

		BigFraction[] aryOfBigFraction = new BigFraction[0];
		aryOfBigFraction = eryOfBigFraction.toGenericAry(aryOfBigFraction);
		Arrays.sort(aryOfBigFraction, Collections.reverseOrder());

		return aryOfBigFraction;

	}

}
