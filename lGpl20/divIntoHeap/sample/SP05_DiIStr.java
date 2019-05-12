package lGpl20.divIntoHeap.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.divIntoHeap.DiIAns;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;
import lGpl20.shareWXyz.sample.SP02_ShW;

/**
 * n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
 * To return the number of ways to divide several identical items into several identical heaps.
 * 
 * @version 2018/11/19_20:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP05_DiIStr" >SP05_DiIStr.java</a>
 *
 * @see SP02_ShW
 */
public class SP05_DiIStr {

	public static void main(String[] sAry) throws Throwable {

		// DiIGo.passTest();

		// n,k,min,mix as 18,3,1,8 <=> ans=7
		// n,k,min,mix as 20,3,2,8 <=> ans=4

		int n = 10;
		int k = 2;
		int min = 0;
		int max = 6;

		long[] ary = DiIGo.go(n, k, min, max);

		O.l("ary[0]=" + O.L + B64IntoB6.str24(ary[0]));

		if (ary.length >= 2) {

			O.l("ary[1]=" + O.L + B64IntoB6.str24(ary[1]));

		}

		StringBuilder str = B64IntoB6.toStrForToDiI(ary, min, O.L);
		O.l(str);

		str = B64IntoB6.toStrOfCharForToDiI(ary, min, O.L);
		O.l(str);

		O.l("ans=" + DiIAns.int64(n, k, min, max));
		O.l("len=" + ary.length);

	}

}
