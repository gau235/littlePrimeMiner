package lGpl20.shareWXyz.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.wDup.DatToShW;
import lGpl20.comb.wDup.sample.SP85_PWDup;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWAns;
import lGpl20.shareWXyz.ShWGo;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2019/02/15_12:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP66_GoWDupS" >SP66_GoWDupS.java </a>
 *
 * @see SP85_PWDup
 */
public class SP66_GoWDupS {

	public static void main(String[] sAry) throws Throwable {

		String s = "AA,B,B,C,C,C";
		// String s = "黑AA白";

		int iWantPickN = 3;
		int min = 0;

		DatToShW datToShW = new DatToShW();

		datToShW.sWDup = s;
		datToShW.k = iWantPickN;

		datToShW.regu();

		O.l("datToShW.sortedByValSAry=");
		O.l(datToShW.distinctSortedByValSAry);

		O.l("myDat.b64IntoB6OfQtyPlus1=");
		O.l(B64IntoB6.str24(datToShW.sortedDescB64IntoB6OfQtyPlus1));

		long[] ary = ShWGo.goWLim0ToMax(iWantPickN, datToShW.distinctSortedByValSAry.length,
				datToShW.sortedDescB64IntoB6OfQtyPlus1);

		long ans = ShWAns.int64WLim0ToMax(iWantPickN, datToShW.distinctSortedByValSAry.length,
				datToShW.sortedDescB64IntoB6OfQtyPlus1);

		if (ans != ary.length) {

			O.x("ans=" + ans + ", len=" + ary.length);

		}

		StringBuilder str = ShWGo.toStrToHByAryOfB64IntoB6(ary, min, datToShW.distinctSortedByValSAry, "\t", O.L);
		O.l(str);

		O.l("ans=" + ans);

	}

}
