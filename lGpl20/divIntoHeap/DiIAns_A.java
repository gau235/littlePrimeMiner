package lGpl20.divIntoHeap;

import java.io.Serializable;

import lGpl20.o.O;
import lGpl20.shareWXyz.ShWAns;

/**
 * 相同物分堆.<br/>
 * 即 n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
 * To return the number of ways to divide several identical items into several identical heaps.
 * 
 * @version 2018/11/16_15:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DiIAns_A" >DiIAns_A.java</a>
 *
 * @see DiIAns_D
 */
public abstract class DiIAns_A implements Serializable {

	private static final Class<DiIAns_A> CLASS_THIS = DiIAns_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * to regularize.<br/>
	 * to regularize.
	 * 
	 * @see ShWAns#regu(int, int, int, int)
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

	/**
	 * 檢查參數合法性.<br/>
	 * Is the argument legal?
	 */
	public static void checkArg(int n, int k, int min, int max) {

		if (k > n || k < 1 || min < 1 || max > n) {

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

		int nEqDivK = n / k;
		if (nEqDivK < min || nEqDivK > max) {

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

	}

}
