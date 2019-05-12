package lGpl20.comb.wDup;

import lGpl20.o.O;
import lGpl20.o.ery.Aryva;
import lGpl20.shareWXyz.ShWAns;
import lGpl20.shareWXyz.ShWGo;

/**
 * @version 2019/03/08_12:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PWDup" >PWDup.java</a>
 *
 * @see ShWGo
 */
public abstract class PWDup extends PWDup_B {

	private static final Class<PWDup> CLASS_THIS = PWDup.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * If passes test.<br/>
	 * If passes test.
	 */
	@SuppressWarnings("unused")
	public static void passTest() {

		test1: {

			String s = "A,B,B,C,C,C";
			int k = 3;

			DatToShW myDat = new DatToShW();

			myDat.sWDup = s;
			myDat.k = k;

			myDat.regu();

			/////////////////////////////////////////////////////
			DatToPWDup datToPWDup = new DatToPWDup();

			datToPWDup.sWDup = s;
			datToPWDup.k = k;

			datToPWDup.regu();
			/////////////////////////////////////////////////////

			long ans = int64ByToShW(k, myDat.distinctSortedByValSAry.length, myDat.sortedDescB64IntoB6OfQtyPlus1);

			ThrToPWDup thrToPWDup = new ThrToPWDup(datToPWDup);
			thrToPWDup.run();

			// if (Aryva.checkDup(ary) >= 0) {

			if (ans != 19) {

				O.x();

			}

			if (thrToPWDup.box.retDistinctSetFromMap.iSize != ans) {

				O.x();

			}

		}

		test2: {

			String s = "A,A,A,A,A,A,B,B,B,B,B,B,C,C,C,C,C,C,D,D,D,D,D,D,E,E,E,E,E,E,F,F,F,F,F,F";

			int k = 3;

			DatToShW datToShW = new DatToShW();

			datToShW.sWDup = s;
			datToShW.k = k;

			datToShW.regu();

			long ans = ShWAns.int64WLim0ToMax(k, datToShW.distinctSortedByValSAry.length,
					datToShW.sortedDescB64IntoB6OfQtyPlus1);

			long[] ary = ShWGo.goWLim0ToMax(k, datToShW.distinctSortedByValSAry.length, datToShW.sortedDescB64IntoB6OfQtyPlus1);

			if (Aryva.checkDup(ary) >= 0) {

				O.x();

			}

			if (ary.length != 56) {

				O.x();

			}

			if (ans != ary.length) {

				O.x("ans=" + ans + ", len=" + ary.length);

			}

		}

	}

}
