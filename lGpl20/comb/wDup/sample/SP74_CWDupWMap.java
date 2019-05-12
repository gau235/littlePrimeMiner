package lGpl20.comb.wDup.sample;

import lGpl20.comb.Cva;
import lGpl20.comb.wDup.DatToPWDup;
import lGpl20.comb.wDup.DatToShW;
import lGpl20.comb.wDup.ThrToCWDup;
import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.shareWXyz.ShWAns;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2019/03/07_18:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP74_CWDupWMap" >SP74_CWDupWMap.java</a>
 *
 * @see SP70_CWDup
 */
public class SP74_CWDupWMap {

	public static void main(String[] sAry) throws Throwable {

		// String s = "1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9";// two pair, three king, full
		// house
		// String s = "柯,蔡,蔡,蔡,蔡,蔡,洪";
		String s = "A,Y,Y,C";

		int iWantPickN = 2;
		// int min = 0;

		DatToShW datToShW = new DatToShW();

		datToShW.sWDup = s;
		datToShW.k = iWantPickN;

		datToShW.regu();

		/////////////////////////////////////////////////////
		DatToPWDup datToPWDup = new DatToPWDup();

		datToPWDup.sWDup = s;
		datToPWDup.k = iWantPickN;
		datToPWDup.regToEx = "X,X";
		datToPWDup.regu();
		/////////////////////////////////////////////////////

		ThrToCWDup thrToCWDup = new ThrToCWDup(datToPWDup);
		thrToCWDup.run();

		// O.l("retMapOfStrNInt32WCompa=");
		// O.l(datToPWDup.retMapOfStrNInt32WCompa.toStr());

		O.l("retDistinctSetFromMap=");
		O.l(datToPWDup.toStrAftP("\t", O.L));

		long ans = ShWAns.int64WLim0ToMax(iWantPickN, datToShW.distinctSortedByValSAry.length,
				datToShW.sortedDescB64IntoB6OfQtyPlus1);

		long ans2 = Cva.int64(datToShW.catagSAry.length, iWantPickN);
		O.l("total=" + ans + "/" + SByN.f(ans2));

	}

}
