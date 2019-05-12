package lGpl20.shareWXyz;

import lGpl20.comb.Cva;
import lGpl20.divIntoHeap.DiIAns;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2018/11/14_21:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWAns_H" >ShWAns_H.java</a>
 *
 * @see ShWAns_R
 */
public abstract class ShWAns_H extends ShWAns_C {

	private static final Class<ShWAns_H> CLASS_THIS = ShWAns_H.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person. int restK as termination condition.
	 * 
	 * @see DiIGo#reGo(int, int, int, int, long, Seq)
	 */
	public static long reAns(int n, int k, int max) {// after regularized min always 1

		if (k == 1) {

			return 1L;

		}

		// int newN;
		// int newK;
		// int newMin; // after regularized min always 1
		// int newMax;

		final int newK = k - 1;
		final int newKMulMax = newK * max;// predict

		int value32 = 1;
		int newN;

		long ans = 0L;

		int[] tempAry32;

		for (; value32 <= max; value32++) {

			newN = n - value32;

			if (newN <= newKMulMax && newN >= newK /* newK*newMin, newMin always 1 */) {

				if (max >= (newN - newK + 1)) {

					ans = ans + Cva.int64(newN - 1, newK - 1);

				} else {

					// O.l("newN=" + newN + ", newK=" + newK + ", max=" + max + O.S32 + CLASS_THIS);

					tempAry32 = regu(newN, newK, 1, max);// newMin always 1, so just to reduce max
					// O.l("tempAry32=");

					ans = ans + reAns(newN, newK, tempAry32[1]);

				}

			}

		}

		return ans;

	}

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person.
	 * 
	 * @see DiIAns#int64(int, int, int, int)
	 * 
	 * @see DiIGo#go(int, int, int, int)
	 */
	public static long int64(int n, int k, int min, int max) {

		// regularize
		// check arg
		// special case

		if (min < 0) {

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

		int[] tempAry32 = regu(n, k, min, max);

		int newN = tempAry32[0];
		int newMax = tempAry32[1];

		DiIAns.checkArg(newN, k, 1, newMax);

		return reAns(newN, k, newMax);

	}

}
