package lGpl20.divIntoHeap.sample;

import lGpl20.divIntoHeap.DiIAns;
import lGpl20.divIntoHeap.DiIThrToGrowCache;
import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.o.time.T64;

/**
 * 相同物分堆.<br/>
 * 即 n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
 * To return the number of ways to divide several identical items into several identical heaps.
 * 
 * @version 2018/06/05_01:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP22_DiIWCache" >SP22_DiIWCache.java</a>
 * 
 */
public class SP22_DiIWCache {

	public static void main(String[] sAry) throws Throwable {

		final int nForCache = 250;
		DiIThrToGrowCache diIThrToGrowCache = new DiIThrToGrowCache(nForCache);// grow cache
		diIThrToGrowCache.start();

		try {

			diIThrToGrowCache.join();

		} catch (InterruptedException interruptedEx) {

			interruptedEx.printStackTrace();

		}

		O.l();

		for (int i = 330; i <= 360; i = i + 10) {

			int n = i;
			int k = n / 3;
			int min = 2;
			int max = n - (k - 1) * min - 10;

			long t64_0 = T64.t64();

			long ans = DiIThrToGrowCache.regularizeNAnsWCache(n, k, min, max);

			O.l("n,k,min,max=[" + n + "," + k + "," + min + "," + max + "]");
			O.l("=" + SByN.f(ans));

			if (min != 1) {

				final int diff = min - 1;

				n = n - k * diff;
				min = 1;// always 1
				max = max - diff;

			}

			int tempRealMax = n - k + 1;// n-(k-1)*min
			if (max > tempRealMax) {

				max = tempRealMax;

			}

			O.l("cached n,k,min,max=[" + n + "," + k + "," + min + "," + max + "]");
			O.l("=" + DiIThrToGrowCache.cacheAry[DiIThrToGrowCache.getIndex(n, k, max)]);
			O.l("costT1=" + T64.difInF32Sec(t64_0));

			O.l();
			t64_0 = T64.t64();

			O.l("n,k,min,max=[" + n + "," + k + "," + min + "," + max + "]");
			O.l("=" + DiIAns.int64(n, k, min, max));
			O.l("costT2=" + T64.difInF32Sec(t64_0));

			O.l();

		}

	}

}
