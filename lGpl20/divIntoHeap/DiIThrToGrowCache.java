package lGpl20.divIntoHeap;

import lGpl20.o.O;
import lGpl20.o.ery.Aryva;
import lGpl20.o.str.SByN;
import lGpl20.o.time.T64;

/**
 * 相同物分堆.<br/>
 * 即 n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
 * To return the number of ways to divide several identical items into several identical heaps.
 * 
 * @version 2018/11/19_20:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DiIThrToGrowCache" >DiIThrToGrowCache.
 *          java</a>
 *
 * @see DiIAns
 */
public class DiIThrToGrowCache extends Thread {

	private static final Class<DiIThrToGrowCache> CLASS_THIS = DiIThrToGrowCache.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static final int INT32_TO_SHIFT_LEFT_TO_INDEX_CACHE = 9;

	public static final int MAX_N32 = 467;

	/**
	 * The cacheAry.<br/>
	 * The cacheAry.
	 */
	public static long[] cacheAry;

	protected static int N32_FOR_CACHE;// be upper case

	/**
	 * 0b_max_k_n<br/>
	 * 0b_max_k_n
	 */
	public static int getIndex(int n, int k, int max) {

		int index = max << INT32_TO_SHIFT_LEFT_TO_INDEX_CACHE;
		index = index | k;
		index = index << INT32_TO_SHIFT_LEFT_TO_INDEX_CACHE;
		index = index | n;

		return index;

	}

	/**
	 * 相同物分堆.<br/>
	 * 即 n 個相同物品分成 numOfHeap 堆, 每堆最少 minInHeap 個.<br/>
	 * To return the number of ways to divide several identical items into several identical heaps.
	 */
	public static long ansWCache(int n, int k, int max) {// after regularized min always 1

		if (k == 2) {// termination condition

			int ceilOfNDiv2 = (n + 1) >>> 1;

			return (long) (max - ceilOfNDiv2 + 1);

		}

		if (n <= N32_FOR_CACHE) {// hit

			long ans = cacheAry[getIndex(n, k, max)];
			if (ans != 0L) {

				return ans;

			}

		}

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

				tempAry32 = DiIAns.regu(newN, newK, value32, max);
				ans = ans + ansWCache(tempAry32[0], newK, tempAry32[1]);// oldNNewMin always 1

			}

		}

		return ans;

	}

	/**
	 * 相同物分堆.<br/>
	 * 即 n 個相同物品分成 numOfHeap 堆, 每堆最少 minInHeap 個.<br/>
	 * To return the number of ways to divide several identical items into several identical heaps.
	 */
	public static long regularizeNAnsWCache(int n, int k, int min, int max) {

		// O.l("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max + O.S32 + CLASS_THIS);

		// regularize
		// check arg
		// special case

		if (min < 0) {

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

		int[] tempAry32 = DiIAns.regu(n, k, min, max);

		int newN = tempAry32[0];
		int newMax = tempAry32[1];

		DiIAns.checkArg(newN, k, 1, newMax);

		if ((newN == (k + 1)) || (newN == k) || (k == 1)) {

			return 1L;

		}

		return ansWCache(newN, k, newMax);

	}

	/**
	 * Constructor.<br/>
	 * Constructor.
	 */
	public DiIThrToGrowCache(int n) {

		N32_FOR_CACHE = n;

	}

	/**
	 * To grow cache.<br/>
	 * To grow cache.
	 */
	@Override
	public void run() {// grow cache

		long t64_0 = T64.t64();

		// todo: to reduce the mem usage

		int len32 = (0b1 << INT32_TO_SHIFT_LEFT_TO_INDEX_CACHE);
		len32 = (len32 << INT32_TO_SHIFT_LEFT_TO_INDEX_CACHE);
		len32 = (len32 << INT32_TO_SHIFT_LEFT_TO_INDEX_CACHE);

		if (cacheAry == null) {

			cacheAry = new long[len32];

		} else {

			cacheAry = Aryva.extAryToLen32(cacheAry, len32);

		}

		O.l("cacheAry.len=" + SByN.f(cacheAry.length) + O.S32 + CLASS_THIS);

		for (int n = 1; n <= N32_FOR_CACHE; n++) {

			for (int k = 1; k <= n; k++) {

				int startMax = (int) StrictMath.ceil((float) n / (float) k);
				int endMax = n - (k - 1) * 1;
				for (int max = startMax; max <= endMax; max++) {

					long ans = regularizeNAnsWCache(n, k, 1, max);
					cacheAry[getIndex(n, k, max)] = ans;
					// O.l("n,k,max=[" + n + "," + k + "," + max + "]=" + SByN.f(ans) + O.S32 + CLASS_THIS);

					// if (ans > (9_000_000_000_000_000_000L) || ans < 0L) {
					//
					// O.l("n,k,min,max=" + n + ", " + k + ", " + 1 + ", " + max + O.S32 + CLASS_THIS);
					// O.l("ans=" + SByN.f(ans) + O.S32 + CLASS_THIS);
					//
					// }

				}

			}

		}

		O.l("grow cache done, cost=" + T64.difInF32Sec(t64_0) + O.S32 + CLASS_THIS);

	}

}
