package lGpl20.b32.eqDiv;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.TreeMap;

import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * 64 位元均等分數類別.<br/>
 * 由符號, 分子, 分母 ( 正數或 0) 構成.<br/>
 * <br/>
 * The class for fraction.
 * 
 * @version 2017/08/17_13:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Fr64" >Fr64.java</a>
 * 
 * @see BigFraction
 */
public class Fr64 extends Fr64_Z implements Comparable<Fr64> {

	private static final Class<Fr64> CLASS_THIS = Fr64.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 1 除以0.<br/>
	 * 0/1.
	 */
	public static final Fr64 $0 = new Fr64(0, 1);

	/**
	 * 1 除以 1.<br/>
	 * 1/1.
	 */
	public static final Fr64 $1 = new Fr64(1, 1);

	/**
	 * 10 除以 1.<br/>
	 * 10/1.
	 */
	public static final Fr64 $10 = new Fr64(10, 1);

	/**
	 * 1 除以 2; 一半.<br/>
	 * 1/2.
	 */
	public static final Fr64 $1_2 = new Fr64(1, 2);

	/**
	 * 1 除以 3.<br/>
	 * 1/3.
	 */
	public static final Fr64 $1_3 = new Fr64(1, 3);

	/**
	 * -1 除以 1.<br/>
	 * -1/1.
	 */
	public static final Fr64 $_1 = new Fr64(-1, 1);

	/**
	 * (2^63-1) 除以 1.<br/>
	 * (2^63-1)/1.
	 */
	public static final Fr64 $2POW63_SUB1 = new Fr64(Long.MAX_VALUE, 1);// max

	/**
	 * -(2^63-1) 除以 1.<br/>
	 * -(2^63-1) divided by 1.<br/>
	 * StrictMath.abs(-(2^63)) is negative.
	 */
	public static final Fr64 $_2POW63_ADD1 = new Fr64(Long.MIN_VALUE + 1, 1);// min,

	/**
	 * 分數類別的建構方法, 新生分數分子是 nu, 分母是 plusDe.<br/>
	 * Constructor; to create a fraction with nu and plusDe.
	 */
	public Fr64(int int32Sign, long plusOr0Nu, long plusDe) {

		super(int32Sign, plusOr0Nu, plusDe);

	}

	/**
	 * 分數類別的建構方法, 新生分數分子是 nu, 分母是 plusDe.<br/>
	 * Constructor; to create a fraction with nu and plusDe.
	 */
	public Fr64(long nu, long plusDe) {

		this(getSign(nu), StrictMath.abs(nu), plusDe);

	}

	/**
	 * 分數類別的建構方法, 新生分數分子是 num, 分母是 1.<br/>
	 * Constructor; to create a fraction with num and 1.
	 */
	public Fr64(long num) {

		this(num, 1);

	}

	/**
	 * 分數類別的建構方法.<br/>
	 * Constructor.
	 */
	private Fr64(long[] nuDe) {

		this(nuDe[0], nuDe[1]);

	}

	/**
	 * 分數類別的建構方法.<br/>
	 * 若輸入 num 是 new BigDecimal("5.99"), 此分數分子是 599 分母是 100.<br/>
	 * Constructor.
	 */
	public Fr64(BigDecimal num) {// only plus?

		this(toNuDe(num));

	}

	/**
	 * 分數類別的建構方法. 請輸入一含有斜線字串的字串.<br/>
	 * 若輸入 num 是 "3/4", 此分數分子是 3 分母是 4.<br/>
	 * Constructor. Please input a string containing "/".
	 */
	public Fr64(String nuSlashDe) {// only plus

		this(toNuDe(nuSlashDe));

	}

	/**
	 * 比較此分數和 fr64 的大小.<br/>
	 * 此分數大於 fr64 回傳 1, 等於 fr64 回傳 0, 小於 fr64 回傳 -1.<br/>
	 * Compares this to fr64.<br/>
	 * To return 1 if great than; to return 0 if equal to; to return -1 if less than.
	 */
	@Override
	public int compareTo(Fr64 fr64) {

		if (INT32_SIGN == INT32_SIGN_PLUS && fr64.INT32_SIGN == INT32_SIGN_PLUS) {

			return compareInMagnitude(NU, DE, fr64.NU, fr64.DE);

		}

		if (INT32_SIGN == INT32_SIGN_PLUS && fr64.INT32_SIGN == INT32_SIGN_0) {

			return 1;

		}

		if (INT32_SIGN == INT32_SIGN_PLUS && fr64.INT32_SIGN == INT32_SIGN_MINUS) {

			return 1;

		}

		if (INT32_SIGN == INT32_SIGN_0 && fr64.INT32_SIGN == INT32_SIGN_PLUS) {

			return -1;

		}

		if (INT32_SIGN == INT32_SIGN_0 && fr64.INT32_SIGN == INT32_SIGN_0) {

			return 0;

		}

		if (INT32_SIGN == INT32_SIGN_0 && fr64.INT32_SIGN == INT32_SIGN_MINUS) {

			return 1;

		}

		if (INT32_SIGN == INT32_SIGN_MINUS && fr64.INT32_SIGN == INT32_SIGN_PLUS) {

			return -1;

		}

		if (INT32_SIGN == INT32_SIGN_MINUS && fr64.INT32_SIGN == INT32_SIGN_0) {

			return -1;

		} else /* (INT32_SIGN == INT32_SIGN_MINUS && fr64.SIGN == INT32_SIGN_MINUS) */ {

			return -1 * compareInMagnitude(NU, DE, fr64.NU, fr64.DE);

		}

	}

	/**
	 * 分數的加法.<br/>
	 * 回傳一個新分數其值為此分數加 fr64.<br/>
	 * To return a new fraction which is this adds fr64.
	 */
	public Fr64 add(Fr64 fr64) {

		if (INT32_SIGN == INT32_SIGN_PLUS && fr64.INT32_SIGN == INT32_SIGN_PLUS) {

			long[] ary = addInMagnitude(NU, DE, fr64.NU, fr64.DE);

			return new Fr64(ary[0], ary[1]);

		}

		if (INT32_SIGN == INT32_SIGN_PLUS && fr64.INT32_SIGN == INT32_SIGN_0) {

			return this;

		}

		if (INT32_SIGN == INT32_SIGN_PLUS && fr64.INT32_SIGN == INT32_SIGN_MINUS) {

			if (compareInMagnitude(NU, DE, fr64.NU, fr64.DE) == 1) { // this is more

				long[] ary = subInMagnitude(NU, DE, fr64.NU, fr64.DE);

				return new Fr64(ary[0], ary[1]);

			}

			if (compareInMagnitude(NU, DE, fr64.NU, fr64.DE) == 0) {

				return $0;

			}

			if (compareInMagnitude(NU, DE, fr64.NU, fr64.DE) == -1) {// fr64 is more

				long[] ary = subInMagnitude(fr64.NU, fr64.DE, NU, DE);

				return new Fr64(-ary[0], ary[1]);

			}

		}

		if (INT32_SIGN == INT32_SIGN_0) {// fr64.SIGN == INT32_SIGN_PLUS || fr64.SIGN == INT32_SIGN_0||fr64.SIGN ==
											// INT32_SIGN_MINUS

			return fr64;

		}

		if (INT32_SIGN == INT32_SIGN_MINUS && fr64.INT32_SIGN == INT32_SIGN_PLUS) {// this is more

			if (compareInMagnitude(NU, DE, fr64.NU, fr64.DE) == 1) {

				long[] ary = subInMagnitude(NU, DE, fr64.NU, fr64.DE);

				return new Fr64(-ary[0], ary[1]);

			}

			if (compareInMagnitude(NU, DE, fr64.NU, fr64.DE) == 0) {

				return $0;

			}

			if (compareInMagnitude(NU, DE, fr64.NU, fr64.DE) == -1) {// fr64 is more

				long[] ary = subInMagnitude(fr64.NU, fr64.DE, NU, DE);

				return new Fr64(ary[0], ary[1]);

			}

		}

		if (INT32_SIGN == INT32_SIGN_MINUS && fr64.INT32_SIGN == INT32_SIGN_0) {

			return this;

		} else {
			// INT32_SIGN == INT32_SIGN_MINUS && fr64.SIGN == INT32_SIGN_MINUS

			long[] ary = addInMagnitude(NU, DE, fr64.NU, fr64.DE);

			return new Fr64(-ary[0], ary[1]);

		}

	}

	/**
	 * 分數的減法.<br/>
	 * 回傳一個新分數其值為此分數減掉 fr64.<br/>
	 * To return a new fraction which is this subtracts fr64.
	 */
	public Fr64 sub(Fr64 fr64) {

		return add(fr64.neg());

	}

	/**
	 * 分數的乘法.<br/>
	 * 回傳一個新分數其值為此分數乘以 fr64.<br/>
	 * To return a new fraction which is this multiplies fr64.
	 */
	public Fr64 mul(Fr64 fr64) {

		if (INT32_SIGN == INT32_SIGN_0 || fr64.INT32_SIGN == INT32_SIGN_0) {

			return $0;

		}

		long[] ary = mulInMagnitude(NU, DE, fr64.NU, fr64.DE);

		return new Fr64(INT32_SIGN * fr64.INT32_SIGN * ary[0], ary[1]);

	}

	/**
	 * 分數的除法.<br/>
	 * 回傳一個新分數其值為此分數除以 f.<br/>
	 * To return a new fraction which is this subtracts f.
	 */
	public Fr64 div(Fr64 fr64) {

		if (INT32_SIGN == INT32_SIGN_0) {

			return $0;

		}

		if (fr64.INT32_SIGN == INT32_SIGN_0) {

			throw new ArithmeticException();
		}

		return mul(fr64.inv());

	}

	/**
	 * 分數的次方.<br/>
	 * 回傳一個新分數其值為此分數 n 次方.<br/>
	 * To return a new fraction which is this powers n.
	 */
	public Fr64 pow(int n) {

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

		Fr64 preAnswer = new Fr64((int) StrictMath.pow(INT32_SIGN, absN & 0b1), (long) StrictMath.pow(NU, absN),
				(long) StrictMath.pow(DE, absN));

		if (n > 0) {

			return preAnswer;

		}

		// n < 0
		return preAnswer.inv();

	}

	/**
	 * 此分數等於 obj ?<br/>
	 * 若 obj 是 Fr64, 則此分數和 Fr64 比較是否相等.<br/>
	 * Is this equal to the obj?<br/>
	 * If obj were a Fr64, this will compare to the Fr64.
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {

			return false;

		}

		if (obj instanceof Fr64) {

			return compareTo((Fr64) obj) == 0;
		}

		if (obj instanceof BigFraction) {

			return toBigFraction().compareTo((BigFraction) obj) == 0;

		}

		return super.equals(obj);

	}

	/**
	 * To sum.<br/>
	 * To sum.
	 */
	public static Fr64 sum(Fr64... aryOfFr64){

	Fr64 ans = $0;

	for (int i = 0; i != aryOfFr64.length; i++) {

			Fr64 f = aryOfFr64[i];

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
	public static Fr64 sumViaStringAry(String... aryOfStringFr64) {

		Fr64 ans = $0;

		for (int i = 0; i != aryOfStringFr64.length; i++) {

			String stringFr64 = aryOfStringFr64[i];

			if (stringFr64 == null) {

				continue;

			}

			if (O.Z.equals(stringFr64 = stringFr64.trim())) {

				continue;

			}

			ans = ans.add(new Fr64(stringFr64));

		}

		return ans;

	}

	/**
	 * 比較一群分數的大小.<br/>
	 * To sort the array of Fr64.
	 */
	public static TreeMap<Fr64, String> sortViaStringAry(String... aryOfStringFr64) {

		TreeMap<Fr64, String> returnMap = new TreeMap<Fr64, String>();

		for (int i = 0; i != aryOfStringFr64.length; i++) {

			String stringFr64 = aryOfStringFr64[i];

			if (stringFr64 == null) {

				continue;

			}

			if (O.Z.equals(stringFr64 = stringFr64.trim())) {

				continue;

			}

			Fr64 f = new Fr64(stringFr64);
			returnMap.put(f, stringFr64);

		}

		return returnMap;

	}

	/**
	 * 比較一群分數的大小.<br/>
	 * To sort the array of Fr64.
	 */
	public static TreeMap<Fr64, String> sortDescViaStringAry(String... aryOfStringFr64) {

		TreeMap<Fr64, String> returnMap = new TreeMap<Fr64, String>(Collections.reverseOrder());

		for (int i = 0; i != aryOfStringFr64.length; i++) {

			String stringFr64 = aryOfStringFr64[i];

			stringFr64 = stringFr64.trim();

			if (SByN.isNullOrEmpty(stringFr64)) {

				continue;

			}

			Fr64 f = new Fr64(stringFr64);
			returnMap.put(f, stringFr64);

		}

		return returnMap;

	}

}
