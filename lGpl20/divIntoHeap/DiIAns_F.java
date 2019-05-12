package lGpl20.divIntoHeap;

import java.util.concurrent.ExecutorService;

import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2018/11/19_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DiIAns_F" >DiIAns_F.java</a>
 *
 * @see DiIAns
 */
public abstract class DiIAns_F extends DiIAns_D {

	private static final Class<DiIAns_F> CLASS_THIS = DiIAns_F.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
	 * To return the number of ways to divide several identical items into several identical heaps.
	 */
	public static Seq ansWExecutorService(int n, int k, int min, int max, ExecutorService executorService) {

		Seq seq = new Seq();

		if (min < 0) {

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

		int[] tempAry32 = regu(n, k, min, max);

		int newN = tempAry32[0];
		int newMax = tempAry32[1];
		min = 1;

		checkArg(newN, k, 1, newMax);

		int nEqDivK = newN / k;
		for (--k; min <= nEqDivK; min++) {

			DiIThrToCount thr = new DiIThrToCount(newN - min, k, min, newMax, seq);
			executorService.submit(thr);

		}

		return seq;// long ans = seq.sum();// fuck

	}

}
