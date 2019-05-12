package lGpl20.divIntoHeap;

import lGpl20.o.O;

/**
 * 相同物分堆.<br/>
 * 即 n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
 * To return the number of ways to divide several identical items into several identical heaps.
 * 
 * @version 2018/11/19_20:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DiIGo" >DiIGo.java</a>
 * 
 * @see DiIAns
 */
public abstract class DiIGo extends DiIGo_Z {

	private static final Class<DiIGo> CLASS_THIS = DiIGo.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * If passes test.<br/>
	 * If passes test.
	 */
	public static void passTest() {

		for (int n = 1; n <= 20; n++) {

			for (int k = 1; k <= 10; k++) {

				int endMin = n / k;
				for (int min = 0; min <= endMin; min++) {

					// int startMax = (int) StrictMath.ceil((float) n / (float) k);
					int qAsMax = n / k;
					if (k * qAsMax != n) {

						qAsMax++;

					}

					int endMax = n - (k - 1) * min;
					for (int max = qAsMax; max <= endMax; max++) {

						if (DiIAns.int64(n, k, min, max) != go(n, k, min, max).length) {

							O.x("n, k, min, max=" + n + ", " + k + ", " + min + ", " + max);

						}

						if (DiIAns.int64(n, k, min, max) != DiIThrToGrowCache.regularizeNAnsWCache(n, k, min, max)) {

							O.x("n, k, min, max=" + n + ", " + k + ", " + min + ", " + max);

						}

					}

				}

			}

		}

	}

}
