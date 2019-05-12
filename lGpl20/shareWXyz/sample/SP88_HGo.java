package lGpl20.shareWXyz.sample;

import lGpl20.comb.wDup.sample.SP85_PWDup;
import lGpl20.o.O;
import lGpl20.shareWXyz.Hva;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2018/11/27_21:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP88_HGo" >SP88_HGo.java</a>
 *
 * @see SP85_PWDup
 */
public class SP88_HGo {

	public static void main(String[] sAry) throws Throwable {

		sAry = new String[] { "黑", "白", "紅", "金", "藍" };

		int max32 = 5;
		int numOfCell = 3;

		int min = 0;

		long ans = Hva.int64(max32, numOfCell, min, numOfCell);

		// long[] ary = Hva.goWB64IntoB6OfQtyPlus1(max32, numOfCell);
		//
		// StringBuilder tempStr = Hva.toStrBySAry(ary, min, sAry, O.L);
		//
		// O.l("tempStr=");
		// O.l(tempStr);
		//
		// tempStr = B64IntoB6.toStrForToDiI(ary, min, O.L);
		// O.l();
		// O.l(tempStr);
		//
		// O.l("len=" + ary.length);

		O.l("ans=" + ans);

	}

}
