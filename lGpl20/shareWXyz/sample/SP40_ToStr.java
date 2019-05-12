package lGpl20.shareWXyz.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWGo;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2019/04/18_21:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP40_ToStr" >SP40_ToStr.java </a>
 *
 * @see SP42_GoWDup
 */
public class SP40_ToStr {

	public static void main(String[] sAry) throws Throwable {

		String s = "黑,白,紅";
		sAry = s.split(O.S44);

		long b64IntoB6 = B64IntoB6.genB64IntoB6ByAry32(1, 4, 2);// min==0
		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		int min = 1;
		StringBuilder str = ShWGo.toRowStrAftToH(b64IntoB6, min, sAry);

		O.l(str);

	}

}
