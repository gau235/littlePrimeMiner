package lGpl20.comb.wDup.sample;

import lGpl20.comb.wDup.DatToPWDup;
import lGpl20.comb.wDup.DatToShW;
import lGpl20.comb.wDup.ThrToCWDup;
import lGpl20.o.O;
import lGpl20.o.ery.Aryva;
import lGpl20.o.str.SByN;
import lGpl20.o.str.Strva;
import lGpl20.shareWXyz.ShWAns;
import lGpl20.shareWXyz.ShWGo;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2019/04/08_10:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP70_CWDup" >SP70_CWDup.java</a>
 *
 * @see SP74_CWDupWMap
 */
public class SP70_CWDup {

	public static void main(String[] sAry) throws Throwable {

		String s = "A,K,K,C,C,C";

		int iWantPickN = 3;
		// int min = 0;

		DatToShW datToShW = new DatToShW();

		datToShW.sWDup = s;
		datToShW.k = iWantPickN;

		datToShW.prefix = "\t";
		datToShW.lineWr = O.L;

		datToShW.regu();

		////////////////
		DatToPWDup datToPWDup = new DatToPWDup();

		datToPWDup.sWDup = s;
		datToPWDup.k = iWantPickN;

		datToPWDup.regu();

		ThrToCWDup thrToCWDup = new ThrToCWDup(datToPWDup);
		thrToCWDup.run();

		long ans = ShWAns.int64WLim0ToMax(iWantPickN, datToShW.distinctSortedByValSAry.length,
				datToShW.sortedDescB64IntoB6OfQtyPlus1);

		long[] ary = ShWGo.goWLim0ToMax(datToShW.k, datToShW.distinctSortedByValSAry.length,
				datToShW.sortedDescB64IntoB6OfQtyPlus1);

		if (Aryva.checkDup(ary) >= 0) {

			O.x();

		}

		if (ans != ary.length) {

			O.x("ans=" + ans + ",  len=" + ary.length);

		}

		O.l(Strva.mergeInStr(datToShW.catagSAry, ","));
		O.l("Max=" + SByN.f(datToShW.total32));

		O.l("retStr=");
		O.l(datToShW.retStr);

	}

}
