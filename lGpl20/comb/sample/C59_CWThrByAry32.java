package lGpl20.comb.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lGpl20.b32.Ary32va;
import lGpl20.comb.Cva;
import lGpl20.comb.filter.CompaForAry32;
import lGpl20.comb.selfCallva.ForwardSelfCallva;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.time.T64;

/**
 * 組合.<br/>
 * <br/>
 * Combination.
 * 
 * @version 2019/03/16_11:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C59_CWThrByAry32" >C59_CWThrByAry32.
 *          java</a>
 */
public class C59_CWThrByAry32 {

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toStrWLineWr(Ery<int[]> eryOfAry32, CharSequence lineWr) {

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int iEry = 0, len = eryOfAry32.len(), lenMinus1 = len - 1; iEry != len; iEry++) {

			int[] ary32 = eryOfAry32.at(iEry);

			for (int iAry32 = 0, lenOfAry32Minus1 = ary32.length - 1; iAry32 != ary32.length; iAry32++) {

				str.append(ary32[iAry32]);

				if (iAry32 != lenOfAry32Minus1) {

					str.append(O.STR_C44C32);

				}

			}

			if (iEry != lenMinus1) {

				str.append(lineWr);

			}

		}

		return str;

	}

	public static void main(String[] sAry) throws Throwable {

		int n = 7;
		int k = 3;

		int[] base = Ary32va.genAscAry32From1(n);

		ExecutorService executorService = Executors.newFixedThreadPool(O.ARY32_OF_QTY_OF_CPU[O.ARY32_OF_QTY_OF_CPU.length / 2]);

		long t64_0 = T64.t64();

		Ery<int[]> retEry = ForwardSelfCallva.cWThrByAry32(base, k, executorService);

		executorService.shutdown();

		while (!executorService.isTerminated()) {

			Thread.sleep(30);

		}

		retEry.setComparator(new CompaForAry32());
		// retEry.sort();
		float timeCost = T64.difInF32Sec(t64_0);

		StringBuilder str = toStrWLineWr(retEry, O.L);
		O.l(str);
		O.l();

		long ans1 = retEry.len();
		O.l(retEry.len());
		O.l("ans1===" + ans1 + O.S32 + O.S32 + O.S32 + timeCost);

		t64_0 = T64.t64();
		long ans2 = Cva.int64(base.length, k);
		timeCost = T64.difInF32Sec(t64_0);
		O.l("ans2===" + ans2 + O.S32 + O.S32 + O.S32 + timeCost);

		if (ans1 != ans2) {

			O.x();

		}

	}

}
