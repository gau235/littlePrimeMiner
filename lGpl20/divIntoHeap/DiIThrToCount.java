package lGpl20.divIntoHeap;

import java.util.concurrent.ExecutorService;

import lGpl20.o.O;
import lGpl20.o.ery.Seq;
import lGpl20.o.thr.ThrWBox;

/**
 * n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
 * To return the number of ways to divide several identical items into several identical heaps.
 * 
 * @version 2018/11/19_19:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DiIThrToCount" >DiIThrToCount.java</a>
 *
 * @see DiIAns#ansWExecutorService(int, int, int, int, ExecutorService)
 */
public class DiIThrToCount extends ThrWBox<Seq> {

	private static final Class<DiIThrToCount> CLASS_THIS = DiIThrToCount.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected final int N;

	protected final int K;

	protected final int MIN;

	protected final int MAX;

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public DiIThrToCount(int n, int k, int min, int max, Seq seq) {// min must > 0

		N = n;
		K = k;
		MIN = min;
		MAX = max;

		box = seq;

	}

	@Override
	public void run() {

		box.a(DiIThrToGrowCache.regularizeNAnsWCache(N, K, MIN, MAX));

	}

}
