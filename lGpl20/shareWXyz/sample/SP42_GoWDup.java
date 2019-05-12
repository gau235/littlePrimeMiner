package lGpl20.shareWXyz.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.wDup.sample.SP85_PWDup;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWAns;
import lGpl20.shareWXyz.ShWGo;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2019/04/18_21:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP42_GoWDup" >SP42_GoWDup.java </a>
 *
 * @see SP85_PWDup
 */
public class SP42_GoWDup {

	public static void main(String[] sAry) throws Throwable {

		String s = "黑,白,紅";
		sAry = s.split(O.S44);

		int n = 4;
		int k = sAry.length;
		int min = 0;
		int max = n;

		long[] ary = ShWGo.go(n, k, min, max);
		long ans = ShWAns.int64(n, k, min, max);

		O.l(B64IntoB6.toStrByValInB6Cell(ary[0]));

		if (ans != ary.length) {

			O.x("ans=" + ans + ", len=" + ary.length);

		}

		StringBuilder str = ShWGo.toStrToHByAryOfB64IntoB6(ary, min, sAry, "\t", O.L);
		O.l(str);

	}

}
