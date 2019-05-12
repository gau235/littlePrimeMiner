package lGpl20.comb;

import java.math.BigInteger;

import lGpl20.o.O;

/**
 * 環狀排列.<br/>
 * <br/>
 * Circular permutation.
 * 
 * @version 2018/03/11_18:29:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PAsCirc" >PAsCirc.java</a>
 * 
 * @see PAsCirc_C
 */
public abstract class PAsCirc_A extends Pva_Z {

	private static final Class<PAsCirc_A> CLASS_THIS = PAsCirc_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Circular permutation.<br/>
	 * Circular permutation.
	 * 
	 * @see Pva#int64(int)
	 */
	public static long int64(int n) {

		if (n == 1) {

			return 1L;

		}

		if (n == 2) {

			return 1L;

		}

		if (n == 3) {

			return 2L;

		}

		if (n == 4) {

			return 6L;

		}

		if (n == 5) {

			return 24L;

		}

		if (n == 6) {

			return 120L;

		}

		if (n == 7) {

			return 720L;

		}

		if (n == 8) {

			return 5_040L;

		}

		if (n == 9) {

			return 40_320L;

		}

		if (n == 10) {

			return 362_880L;

		}

		if (n == 11) {

			return 3_628_800L;

		}

		if (n == 12) {

			return 39_916_800L;

		}

		if (n == 13) {

			return 479_001_600L;

		}

		if (n == 14) {

			return 6_227_020_800L;

		}

		if (n == 15) {

			return 87_178_291_200L;

		}

		if (n == 16) {

			return 1_307_674_368_000L;

		}

		if (n == 17) {

			return 20_922_789_888_000L;

		}

		if (n == 18) {

			return 355_687_428_096_000L;

		}

		if (n == 19) {

			return 6_402_373_705_728_000L;

		}

		if (n == 20) {

			return 121_645_100_408_832_000L;

		}

		if (n == 21) {

			return 2_432_902_008_176_640_000L;

		}

		throw new IllegalArgumentException();

	}

	/**
	 * Circular permutation.<br/>
	 * Circular permutation.
	 * 
	 * @see Pva#bigInt(int)
	 */
	public static BigInteger bigInt(int n) {

		if (n <= 0) {

			O.x("n=" + n);

		}

		if (n == 1 || n == 2) {

			return BigInteger.ONE;

		}

		BigInteger retBigInt = BigInteger.ONE;
		n--;// fuck

		for (; n > 1; n--) {

			retBigInt = retBigInt.multiply(BigInteger.valueOf(n));

		}

		return retBigInt;

	}

	/**
	 * Circular permutation.<br/>
	 * Circular permutation.<br/>
	 * P(n,k)/k
	 * 
	 * @see Pva#int64(int, int)
	 */
	public static long int64(int n, int k) {

		if (n <= 0 || k <= 0 || n < k) {

			O.x("n=" + n + ", k=" + k);

		}

		long ans = 1L;

		for (int to = n - k; n > to; n--) {

			ans = ans * (long) n;

		}

		return ans / k;

	}

	/**
	 * Circular permutation.<br/>
	 * Circular permutation.
	 * 
	 * @see Pva#bigInt(int, int)
	 */
	public static BigInteger bigInt(int n, int k) {

		if (n <= 0 || k <= 0 || n < k) {

			O.x("n=" + n + ", k=" + k);

		}

		BigInteger retBigInt = BigInteger.ONE;

		for (int to = n - k; n > to; n--) {

			retBigInt = retBigInt.multiply(BigInteger.valueOf(n));

		}

		return retBigInt.divide(BigInteger.valueOf(k));

	}

}
