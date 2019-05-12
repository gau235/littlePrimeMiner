package lGpl20.comb.wDup.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.wDup.DatToPWDup;
import lGpl20.comb.wDup.DatToShW;
import lGpl20.comb.wDup.PWDup;
import lGpl20.comb.wDup.ThrToPWDup;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWAns;
import lGpl20.shareWXyz.sample.SP66_GoWDupS;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2019/04/06_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP85_PWDup" >SP85_PWDup.java</a>
 *
 * @see SP66_GoWDupS
 */
public class SP85_PWDup {

	public static void main(String[] sAry) throws Throwable {

		// PWDup.passTest();

		String sWDup = "B,C,C,D";// note:there is a regToEx

		int k = 3;
		// int min = 0;

		DatToShW datToShW = new DatToShW();

		datToShW.sWDup = sWDup;
		datToShW.k = k;

		datToShW.regu();

		/////////////////////////////////////////////////////
		DatToPWDup datToPWDup = new DatToPWDup();

		datToPWDup.sWDup = sWDup;
		datToPWDup.k = k;
		// datToPWDup.regToIn = "(深,深|_,)";
		datToPWDup.regToEx = "(A,A|_,)";

		datToPWDup.regu();
		/////////////////////////////////////////////////////

		ThrToPWDup thrToPWDup = new ThrToPWDup(datToPWDup);
		thrToPWDup.run();

		long ans = PWDup.int64ByToShW(k, datToShW.distinctSortedByValSAry.length, datToShW.sortedDescB64IntoB6OfQtyPlus1);

		O.l("ans=" + ans);

		// if (Aryva.checkDup(datToPWDup.retMapOfB64NInt32WCompa) >= 0) {
		//
		// O.x();
		//
		// }

		long ans2 = ShWAns.int64WLim0ToMax(datToShW.k, datToShW.distinctSortedByValSAry.length,
				datToShW.sortedDescB64IntoB6OfQtyPlus1);

		O.l("ans2=" + ans2);

		O.l("retDistinctSetFromMap=");
		O.l(datToPWDup.toStrAftP("\t", O.L));
		O.l("iSize=" + datToPWDup.retDistinctSetFromMap.iSize);

		O.l();

		//////////////////////////////////////////////////////////////

		O.l("datToPWDup.b64As2PowOfQRPlus1=" + B64IntoB6.str24(datToPWDup.b64As2PowOfQRPlus1));

	}

}
