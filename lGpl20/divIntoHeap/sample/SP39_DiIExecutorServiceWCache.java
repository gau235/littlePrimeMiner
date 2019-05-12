package lGpl20.divIntoHeap.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lGpl20.divIntoHeap.DiIAns;
import lGpl20.divIntoHeap.DiIThrToGrowCache;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;
import lGpl20.o.str.SByN;
import lGpl20.o.time.T64;
import lGpl20.shareWXyz.sample.SP12_ShWWMin0;

/**
 * n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
 * To return the number of ways to divide several identical items into several identical heaps.
 * 
 * @version 2018/06/05_15:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP39_DiIExecutorServiceWCache" >
 *          SP39_DiIExecutorServiceWCache.java</a>
 * 
 * @see SP05_DiIStr
 * 
 * @see SP12_ShWWMin0
 */
public class SP39_DiIExecutorServiceWCache {

	public static void main(String[] sAry) throws Throwable {

		final int nForCache = DiIThrToGrowCache.MAX_N32 / 3;
		// final int nForCache = DiIThrToGrowCache.MAX_N32;
		DiIThrToGrowCache diIThrToGrowCache = new DiIThrToGrowCache(nForCache);// grow cache
		diIThrToGrowCache.start();

		try {

			diIThrToGrowCache.join();

		} catch (InterruptedException interruptedEx) {

			interruptedEx.printStackTrace();

		}

		O.l();

		final int numOfThr = O.ARY32_OF_QTY_OF_CPU[0] * 4;
		O.l("numOfThr=" + numOfThr);

		for (int i = 330; i <= 360; i = i + 10) {

			int n = i;
			int k = n / numOfThr;
			int min = 3;
			int max = n - (k - 1) * min - 10;

			O.l("n,k,min,max=[" + n + "," + k + "," + min + "," + max + "]");

			long t64_0 = T64.t64();

			long ans1 = DiIThrToGrowCache.regularizeNAnsWCache(n, k, min, max);
			// long ans1 = DiIAns.int64(n, k, min, max);
			float costT = T64.difInF32Sec(t64_0);

			O.l("ans=" + O.L + SByN.f(ans1) + O.S32 + O.S32 + costT);

			t64_0 = T64.t64();

			ExecutorService executorService = Executors.newFixedThreadPool(numOfThr);
			Seq seq = DiIAns.ansWExecutorService(n, k, min, max, executorService);

			executorService.shutdown();

			while (!executorService.isTerminated()) {

				Thread.sleep(30L);

			}

			costT = T64.difInF32Sec(t64_0);

			long ans2 = seq.sum();// fuck
			O.l("ansWExecutorService=" + O.L + SByN.f(ans2) + O.S32 + O.S32 + costT);

			if (ans2 != ans1) {

				O.x();

			}

			O.l();

		}

	}

}
