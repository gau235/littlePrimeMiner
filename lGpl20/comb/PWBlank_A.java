package lGpl20.comb;

import java.math.BigInteger;

import lGpl20.o.O;

/**
 * 有留空的排列.<br/>
 * <br/>
 * Permutation with blank.
 * 
 * @version 2018/04/09_21:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PWBlank_A" >PWBlank_A.java</a>
 * 
 * @see PWBlank_W
 */
public abstract class PWBlank_A extends Pva_Z {

	private static final Class<PWBlank_A> CLASS_THIS = PWBlank_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Permutation with blank.<br/>
	 * Permutation with blank.<br/>
	 * k!/(k-n)!
	 */
	public static long int64(int n, int k) {

		if (n >= k) {

			O.x("n=" + n + ", k=" + k);

		}

		// n < k
		return int64(k) / int64(k - n);

	}

	/**
	 * Permutation with blank.<br/>
	 * Permutation with blank.
	 */
	public static BigInteger bigInt(int n, int k) {

		if (n >= k) {

			O.x("n=" + n + ", k=" + k);

		}

		// n < k
		return bigInt(k).divide(bigInt(k - n));

	}

}
