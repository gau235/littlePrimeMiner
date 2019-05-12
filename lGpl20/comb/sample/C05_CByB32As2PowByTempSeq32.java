package lGpl20.comb.sample;

import lGpl20.b32.B32va;
import lGpl20.comb.Cva;
import lGpl20.o.O;

/**
 * 組合.<br/>
 * <br/>
 * Combination.
 * 
 * @version 2018/06/27_14:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C05_CByB32As2PowByTempSeq32" >
 *          C05_CByB32As2PowByTempSeq32.java</a>
 */
public class C05_CByB32As2PowByTempSeq32 {

	public static void main(String[] sAry) {

		int n = 10;
		int k = 3;

		String[] baseSAry = new String[n + 1];
		for (int i = 0; i != baseSAry.length; i++) {

			baseSAry[i] = String.valueOf(i + 1);

		}

		int[] ary32 = Cva.cByB32As2PowByToBearByTempSeq32(n, k);

		for (int i = 0; i < ary32.length; i++) {

			O.l(B32va.str16(ary32[i]));

		}

		StringBuilder str = Cva.toStrToCByB32As2PowBySAry(ary32, baseSAry, O.L);
		O.l("str=" + O.L + str);
		O.l();
		O.l("lenA=" + ary32.length);
		O.l("lenB=" + Cva.int64(n, k));

	}

}
