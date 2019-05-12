package lGpl20.comb.b64IntoB6.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * Sorting test.<br/>
 * Sorting test.
 * 
 * @version 2019/03/21_12:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP06_PasteAtFromR" >SP06_PasteAtFromR.
 *          java </a>
 * 
 */
public class SP06_PasteAtFromR {

	public static void main(String[] sAry) throws Throwable {

		long b64IntoB6 = 0b000101_000111L;

		//////////////////////
		b64IntoB6 = B64IntoB6.pasteAtFromR(b64IntoB6, 0, 5);
		// O.l("bef=" + B64IntoB6.str24(b64IntoB6));

		b64IntoB6 = B64IntoB6.pasteAtFromR(b64IntoB6, 1, 4);
		b64IntoB6 = B64IntoB6.pasteAtFromR(b64IntoB6, 2, 6);
		O.l("bef=" + B64IntoB6.str24(b64IntoB6));

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(B64IntoB6.selSort(b64IntoB6));

		O.l("aft=" + B64IntoB6.str24(b64IntoB6));

		StringBuilder str = B64IntoB6.toStrByValInB6Cell(b64IntoB6);
		O.l(str);

		long b64IntoB6_2 = B64IntoB6.revAgainstB6FromR(b64IntoB6);
		O.l("revAgainstB6NShiftR=" + O.L + B64IntoB6.str24(b64IntoB6_2));

		O.l();
		O.l(B64IntoB6.isDerangement(b64IntoB6, b64IntoB6_2));

	}

}
