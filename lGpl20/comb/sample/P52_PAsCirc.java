package lGpl20.comb.sample;

import lGpl20.comb.PAsCirc;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * 環狀排列.<br/>
 * <br/>
 * Circular permutation.
 * 
 * @version 2018/04/08_17:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=P52_PAsCirc" >P52_PAsCirc.java </a>
 * 
 */
public class P52_PAsCirc {

	public static void main(String[] sAry) throws Throwable {

		int n = 4;
		int k = 1;

		for (int i = 1; i != 21; i++) {

			if (PAsCirc.int64(i) != PAsCirc.bigInt(i).longValue()) {

				O.x("i=" + i);

			}

		}

		long[] ary = PAsCirc.go(n);
		StringBuilder tempStr = B64IntoB6.toStrByAryOfB64IntoB6(ary, Strva.S_ARY_A_J, O.L);
		O.l(tempStr);

		O.l("len1=" + ary.length);
		O.l("ans1=" + PAsCirc.int64(n));
		O.l();

		ary = PAsCirc.goOnNEqKAftCByB32As2Pow(n, k);
		tempStr = B64IntoB6.toStrByAryOfB64IntoB6(ary, Strva.S_ARY_A_J, O.L);
		O.l(tempStr);

		O.l("len2=" + ary.length);
		O.l("ans2=" + PAsCirc.int64(n, k));

	}

}
