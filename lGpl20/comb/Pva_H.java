package lGpl20.comb;

import java.math.BigInteger;

import lGpl20.o.O;

/**
 * @version 2016/08/22_18:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Pva_H" >Pva_H.java</a>
 * 
 * @see Pva_J
 */
public abstract class Pva_H extends Pva_A {

	private static final Class<Pva_H> CLASS_THIS = Pva_H.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * P(n,n), 即為算自然數 n 階乘 n!.<br/>
	 * To return n's factorial.
	 * 
	 * @see #int64(int, int)
	 */
	public static long int64(int n) {// allow n==0

		if (n == 0) {

			return 1L;

		}

		if (n == 1) {

			return 1L;

		}

		if (n == 2) {

			return 2L;

		}

		if (n == 3) {

			return 6L;

		}

		if (n == 4) {

			return 24L;

		}

		if (n == 5) {

			return 120L;

		}

		if (n == 6) {

			return 720L;

		}

		if (n == 7) {

			return 5_040L;

		}

		if (n == 8) {

			return 40_320L;

		}

		if (n == 9) {

			return 362_880L;

		}

		if (n == 10) {

			return 3_628_800L;

		}

		if (n == 11) {

			return 39_916_800L;

		}

		if (n == 12) {

			return 479_001_600L;

		}

		if (n == 13) {

			return 6_227_020_800L;

		}

		if (n == 14) {

			return 87_178_291_200L;

		}

		if (n == 15) {

			return 1_307_674_368_000L;

		}

		if (n == 16) {

			return 20_922_789_888_000L;

		}

		if (n == 17) {

			return 355_687_428_096_000L;

		}

		if (n == 18) {

			return 6_402_373_705_728_000L;

		}

		if (n == 19) {

			return 121_645_100_408_832_000L;

		}

		if (n == 20) {

			return 2_432_902_008_176_640_000L;

		}

		throw new IllegalArgumentException();

	}

	/**
	 * P(n,n), 即為算自然數 n 階乘 n!.<br/>
	 * To return n's factorial.
	 */
	public static BigInteger bigInt(int n) {// allow n==0

		if (n < 0) {

			O.x();

		}

		if (n == 0 || n == 1) {

			return BigInteger.ONE;

		}

		BigInteger retBigInt = BigInteger.ONE;

		for (; n > 0; n--) {

			retBigInt = retBigInt.multiply(BigInteger.valueOf(n));

		}

		return retBigInt;

	}

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 * 
	 * @see #int64(int)
	 * @see Cva#int64(int, int)
	 */
	public static long int64(int n, int k) {

		if (n <= 0 || k < 0 || n < k) {

			O.x("n=" + n + ", k=" + k);

		}

		if (k == 0) {

			return 1L;

		}

		long ans = 1L;

		for (int to = n - k; n > to; n--) {

			ans = ans * (long) n;

		}

		return ans;

	}

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 * 
	 * @see Cva#bigInt(int, int)
	 */
	public static BigInteger bigInt(int n, int k) {

		if (n <= 0 || k < 0 || n < k) {

			O.x();

		}

		if (k == 0) {

			return BigInteger.ONE;

		}

		BigInteger retBigInt = BigInteger.ONE;

		for (int to = n - k; n > to; n--) {

			retBigInt = retBigInt.multiply(BigInteger.valueOf(n));

		}

		return retBigInt;

	}

}
