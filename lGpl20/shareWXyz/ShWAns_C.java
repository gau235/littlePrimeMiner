package lGpl20.shareWXyz;

import lGpl20.comb.Cva;
import lGpl20.divIntoHeap.DiIAns;
import lGpl20.o.O;

/**
 * @version 2018/11/16_19:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWAns_C" >ShWAns_C.java</a>
 *
 * @see ShWAns_H
 */
public abstract class ShWAns_C extends ShWAns_A {

	private static final Class<ShWAns_C> CLASS_THIS = ShWAns_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 min 個.<br/>
	 * To return the number of ways to share several identical items with every person.
	 */
	public static long int64(int n, int k, int min) {// min allowed 0

		// regularize
		// check arg
		// special case

		int[] tempAry32 = regu(n, k, min, n);
		int newN = tempAry32[0];
		int newMax = tempAry32[1];

		DiIAns.checkArg(newN, k, 1, newMax);// after regularized min always 1

		if (k == 1) {

			return 1L;

		}

		// return Cva.int64(n - (min * k) + (k - 1), k - 1);
		return Cva.int64(newN - 1, k - 1);

	}

}
