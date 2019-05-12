package lGpl20.divIntoHeap;

import lGpl20.o.O;

/**
 * @version 2018/11/17_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DiIAns_D" >DiIAns_D.java</a>
 *
 * @see DiIAns_F
 */
public abstract class DiIAns_D extends DiIAns_A {

	private static final Class<DiIAns_D> CLASS_THIS = DiIAns_D.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 相同物分堆.<br/>
	 * 即 n 個相同物品分成 numOfHeap 堆, 每堆最少 minInHeap 個.<br/>
	 * To return the number of ways to divide several identical items into several identical heaps.
	 */
	public static long reAns(int n, int k, int max) {// after regularized min always 1

		if (k == 2) {// termination condition

			int ceilOfNEqDiv2 = (n + 1) >>> 1;

			return (long) (max - ceilOfNEqDiv2 + 1);

		}

		// gen newK
		// gen newMin
		// gen newN
		// gen newMax

		// then to regularize

		final int nEqDivK = n / k;

		int newK = k - 1;
		final int newKMulMax = newK * max;// predict

		int value32 = 1;/* newMin will increase */
		int newN;

		long ans = 0L;

		int[] tempAry32;

		for (; value32 <= nEqDivK; value32++) {

			newN = n - value32;

			if (newN <= newKMulMax && newN >= (newK * value32)/* newMin will increase */) {

				tempAry32 = regu(newN, newK, value32, max);
				ans = ans + reAns(tempAry32[0], newK, tempAry32[1]);// after regularized min always 1

			} // else {break;} //DiIAns.passTest() will fail

		}

		return ans;

	}

	/**
	 * 相同物分堆.<br/>
	 * 即 n 個相同物品分成 numOfHeap 堆, 每堆最少 minInHeap 個.<br/>
	 * To return the number of ways to divide several identical items into several identical heaps.
	 */
	public static long int64(int n, int k, int min, int max) {

		// O.l("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max + O.S32 + CLASS_THIS);

		// regularize
		// check arg
		// special case

		if (min < 0) {

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

		int[] tempAry32 = regu(n, k, min, max);

		int newN = tempAry32[0];
		int newMax = tempAry32[1];

		checkArg(newN, k, 1, newMax);

		if ((newN == (k + 1)) || (newN == k) || (k == 1)) {

			return 1L;

		}

		return reAns(newN, k, newMax);

	}

}
