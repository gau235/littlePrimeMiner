package lGpl20.shareWXyz;

import java.io.Serializable;

import lGpl20.divIntoHeap.DiIAns;
import lGpl20.o.O;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2018/11/12_15:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWAns_A" >ShWAns_A.java</a>
 *
 * @see ShWAns_C
 */
public abstract class ShWAns_A implements Serializable {

	private static final Class<ShWAns_A> CLASS_THIS = ShWAns_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * to regularize.<br/>
	 * to regularize.
	 * 
	 * @see DiIAns#regu(int, int, int, int)
	 */
	public static int[] regu(int n, int k, int min, int max) {

		if (min != 1) {

			// O.l("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max + S32 + CLASS_THIS);
			final int diff32 = min - 1;

			n = n - diff32 * k;
			// min = 1;// always 1
			max = max - diff32;

		}

		final int tempRealMax = n - k + 1;// n-(k-1)*min
		if (max > tempRealMax) {

			max = tempRealMax;

		}

		return new int[] { n, max };

	}

}
