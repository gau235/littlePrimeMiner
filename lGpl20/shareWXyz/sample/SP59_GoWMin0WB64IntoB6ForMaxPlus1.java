package lGpl20.shareWXyz.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWGo;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 0 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2019/04/06_18:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP59_GoWMin0WB64IntoB6ForMaxPlus1" >
 *          SP59_GoWMin0WB64IntoB6ForMaxPlus1.java</a>
 * 
 * @see SP58_GoWMin0WB64IntoB6ForMaxPlus1
 */
public class SP59_GoWMin0WB64IntoB6ForMaxPlus1 {

	public static void main(String[] sAry) throws Throwable {

		int n = 9;
		int k = 3;

		long b64IntoB6ForMaxPlus1 = B64IntoB6.genB64IntoB6ByAry32(5, 5, 4);// min==0; 5, 5, 3 is good
		O.l("b64IntoB6ForMaxPlus1=" + B64IntoB6.str24(b64IntoB6ForMaxPlus1));
		O.l("b64IntoB6ForMaxPlus1=" + B64IntoB6.toStrForToDiI(b64IntoB6ForMaxPlus1, 1));

		Adder32.a1 = 0;

		long[] ary = ShWGo.goWLim0ToMax(n, k, b64IntoB6ForMaxPlus1);
		// long[] ary = ShWGo.goWMin0WB64IntoB6OfQtyPlus1_old(n, k, b64IntoB6ForMaxPlus1);

		long ans = ary.length;

		if (ary.length != 0) {

			O.l("ary[0]=" + O.L + B64IntoB6.str24(ary[0]));

		}

		StringBuilder str = B64IntoB6.toStrForToDiI(ary, 0, O.L);
		O.l(str);

		O.l("ans=" + ans);

		O.l("a1=" + Adder32.a1);
		Adder32.a1 = 0;

	}

}
