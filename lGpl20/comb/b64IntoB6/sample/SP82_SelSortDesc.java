package lGpl20.comb.b64IntoB6.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * Sorting test.<br/>
 * Sorting test.
 * 
 * @version 2019/04/13_19:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP82_SelSortDesc" >SP82_SelSortDesc
 *          .java </a>
 * 
 */
public class SP82_SelSortDesc {

	public static void main(String[] sAry) throws Throwable {

		long b64IntoB6 = 0b000010_001000L;

		//////////////////////
		b64IntoB6 = B64IntoB6.pasteAtFromR(b64IntoB6, 0, 5);
		b64IntoB6 = B64IntoB6.pasteAtFromR(b64IntoB6, 1, 4);
		b64IntoB6 = B64IntoB6.pasteAtFromR(b64IntoB6, 2, 6);
		O.l("bef=" + B64IntoB6.str24(b64IntoB6));
		// b64IntoB6 = B64IntoB6.bubbleSort(b64IntoB6);
		b64IntoB6 = B64IntoB6.revAgainstB6FromR(B64IntoB6.selSort(b64IntoB6));

		O.l("aft=" + B64IntoB6.str24(b64IntoB6));

		Object ooo = B64IntoB6.toStrByValInB6Cell(b64IntoB6);
		O.l(ooo);

		long bbb = B64IntoB6.revAgainstB6FromR(b64IntoB6);
		O.l(B64IntoB6.str24(bbb));

	}

}
