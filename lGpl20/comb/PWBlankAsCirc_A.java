package lGpl20.comb;

import java.math.BigInteger;

import lGpl20.o.O;

/**
 * 有留空的 circular 排列.<br/>
 * <br/>
 * Circular permutation with blank.
 * 
 * @version 2016/12/17_07:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PWBlankAsCirc_A" >PWBlankAsCirc_A.java
 *          </a>
 * 
 * @see PWBlankAsCirc_Z
 */
public abstract class PWBlankAsCirc_A extends PWBlank_Z {

	private static final Class<PWBlankAsCirc_A> CLASS_THIS = PWBlankAsCirc_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Circular permutation with blank.<br/>
	 * Circular permutation with blank.
	 */
	public static long int64(int n, int k) {

		if (n >= k) {

			O.x("n=" + n + ", k=" + k);

		}

		// n < k
		return PAsCirc.int64(k) / int64(k - n);

	}

	/**
	 * Circular permutation with blank.<br/>
	 * Circular permutation with blank.
	 */
	public static BigInteger bigInt(int n, int k) {

		if (n >= k) {

			O.x("n=" + n + ", k=" + k);

		}

		// n < k
		return PAsCirc.bigInt(k).divide(bigInt(k - n));

	}

}
