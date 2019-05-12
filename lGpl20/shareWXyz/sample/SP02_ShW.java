package lGpl20.shareWXyz.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.divIntoHeap.sample.SP05_DiIStr;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWAns;
import lGpl20.shareWXyz.ShWGo;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2018/11/12_15:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP02_ShW" >SP02_ShW.java </a>
 *
 * @see SP05_DiIStr
 */
public class SP02_ShW {

	public static void main(String[] sAry) throws Throwable {

		  ShWGo.passTest();

		O.l("a1=" + Adder32.a1);
		Adder32.a1 = 0;

		int n = 10;
		int k = 3;
		int min = 2;
		int max = 7;

		long[] ary = ShWGo.go(n, k, min, max);

		// for (int i = 0; i < ary.length; i++) {
		//
		// O.l(B64IntoB6.toStrForToDiI(ary[i]));
		//
		// }

		StringBuilder str = B64IntoB6.toStrForToDiI(ary, min, O.L);
		O.l(str);
		str = B64IntoB6.toStrOfCharForToDiI(ary, min, O.L);
		O.l(str);

		O.l("lenA=" + ary.length);
		// O.l("a1=" + Adder32.s1());
		Adder32.a1 = 0;

		O.l("lenB=" + ShWGo.go(n, k, min, max).length);
		O.l("a1=" + Adder32.a1);
		Adder32.a1 = 0;

		O.l("lenC=" + ShWAns.int64(n, k, min, max));
		// O.l("a1=" + Adder32.s1());

		O.l("lenD=" + ShWAns.int64(n, k, min));
		// O.l("a1=" + Adder32.s1());

	}

}
