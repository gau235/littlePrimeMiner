package lGpl20.comb.sample;

import lGpl20.comb.PWBlank;
import lGpl20.comb.PWBlankAsCirc;
import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * 環狀排列.<br/>
 * <br/>
 * Circular permutation.
 * 
 * @version 2019/04/16_17:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=P68_PWBlankAsCirc" >P68_PWBlankAsCirc.
 *          java</a>
 * 
 */
public class P68_PWBlankAsCirc {

	public static void main(String[] sAry) throws Throwable {

		int n = 2;
		int k = 5;

		long[] ary = PWBlankAsCirc.go(n, k);

		StringBuilder tempStr = PWBlank.toStrToPWBlankByAryOfB64IntoB6(ary, n, Strva.S_ARY_A_J, O.L);
		O.l(tempStr);
		O.l();

		O.l("len=" + ary.length);
		O.l("ans=" + PWBlankAsCirc.int64(n, k));

	}

}
