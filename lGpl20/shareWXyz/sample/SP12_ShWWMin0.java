package lGpl20.shareWXyz.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWAns;
import lGpl20.shareWXyz.ShWGo;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 0 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2018/11/19_20:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP12_ShWWMin0" >SP12_ShWWMin0.java</a>
 *          
 * @see SP02_ShW
 */
public class SP12_ShWWMin0 {

	public static void main(String[] sAry) throws Throwable {

		ShWGo.passTest();
		
		O.l("a1=" + Adder32.a1);
		Adder32.a1 = 0;

		int n = 6;
		int k = 3;

		int min = 0;
		int max = n;

		long[] ary = ShWGo.go(n, k, min, max);

		StringBuilder str = B64IntoB6.toStrForToDiI(ary, min, O.L);
		O.l(str);
		str = B64IntoB6.toStrOfCharForToDiI(ary, min, O.L);
		O.l(str);

		O.l("lenA=" + ary.length);
		O.l("a1=" + Adder32.a1);
		Adder32.a1 = 0;
		O.l("lenB=" + ShWAns.int64(n, k, min));

	}

}
