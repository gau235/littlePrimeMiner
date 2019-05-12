package lGpl20.comb.sample;

import lGpl20.b32.B32va;
import lGpl20.comb.Cva;
import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * 組合.<br/>
 * <br/>
 * Combination.
 * 
 * @version 2019/05/04_15:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C02_CByB32As2Pow" >C02_CByB32As2Pow.java
 *          </a>
 * 
 */
public class C02_CByB32As2Pow {

	public static void main(String[] sAry) {

		int n = 5;
		int k = 3;

		int[] ary32 = Cva.goByB32As2Pow(n, k);
		O.l("Cva.goByB32As2Pow(" + n + "," + k + ")=" + O.L + ary32.length);

		O.l();
		for (int i = 0; i != ary32.length; i++) {

			O.l(B32va.str16((int) ary32[i]));

		}

		StringBuilder str = Cva.toStrToCByB32As2PowBySAry(ary32, Strva.S_ARY_A_J, O.L);
		// StringBuilder str = Strva.toHtmlStrToCByB32As2PowBySAry(ary32, sAry, "tabToC");
		O.l("str=" + O.L + str);
		O.l("ans=" + Cva.int64(n, k));

	}

}
