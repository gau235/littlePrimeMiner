package lGpl20.comb;

import java.math.BigInteger;

import lGpl20.o.O;

/**
 * @version 2018/07/10_18:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Cva_G" >Cva_G.java</a>
 * 
 * @see Cva_J
 */
public abstract class Cva_G extends Cva_C {

	private static final Class<Cva_G> CLASS_THIS = Cva_G.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 求有几种组合情况的方法数.<br/>
	 * C(n,k).<br/>
	 * C(0,0)=1, C(1,0)=1, C(0,1)=0.<br/>
	 * C(0,-2) will throw Exception.<br/>
	 * The number of ways of combination of the two input numbers (0 &lt;= k &lt;= n).
	 * 
	 * @see Pva#int64(int, int)
	 */
	public static long int64(int n, int k) {

		// if (n <= 0 || k < 0 || n < k) {
		if (n < 0 || k < 0 || n < k) {

			O.x("n=" + n + ", k=" + k);

		}

		if (k == 0) {

			return 1L;

		}

		if (k > (n >>> 1)) {

			k = n - k;

		}

		long ans = 1L;

		for (int to = n - k; n > to; n--) {

			ans = ans * (long) n;

		}

		return ans / Pva.int64(k);

	}

	/**
	 * 求有幾種組合情況的方法數.<br/>
	 * C(n,k).<br/>
	 * C(0,0)=1, C(1,0)=1, C(0,1)=0.<br/>
	 * C(0,-2) will throw Exception.<br/>
	 * The number of ways of combination of the two input numbers (0 &lt;= k &lt;= n).
	 * 
	 * @see Pva#bigInt(int, int)
	 */
	public static BigInteger bigInt(int n, int k) {

		if (k < 0) {

			O.x("k=" + k);

		}

		if (k == 0 || n == k) {// fuck

			return BigInteger.ONE;

		}

		if (n >= 0) {

			if (n < k) {

				return BigInteger.ZERO;

			}

			if (k > (n >> 1)) {

				k = n - k;

			}

			return Pva.bigInt(n, k).divide(Pva.bigInt(k));

		}

		// n < 0
		BigInteger ans = bigInt(-n + k - 1, k);

		if ((k & 0b1) == 1) {

			return ans.negate();

		}

		return ans; // C(-5,3) == -C(7,3)

	}

}
