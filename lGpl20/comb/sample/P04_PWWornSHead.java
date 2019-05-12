package lGpl20.comb.sample;

import lGpl20.comb.Pva;
import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * 排列.<br/>
 * <br/>
 * Permutation.
 * 
 * @version 2019/04/16_11:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=P04_PWWornSHead" >P04_PWWornSHead.java</a>
 */
public class P04_PWWornSHead {

	public static final String[] S_ARY_HAED = { "冠軍", "亞軍", "季軍", "殿軍" };

	public static void main(String[] sAry) throws Throwable {

		int n = 4;
		int k = 4;

		O.l("ans=" + Pva.int64(n, k));

		long[] ary = Pva.go(n, k);

		StringBuilder tempStr = Pva.toStrWWornSHeadByAryOfB64IntoB6(ary, Strva.S_ARY_A_J, S_ARY_HAED, O.L);

		O.l(tempStr);
		O.l("len=" + ary.length);

	}

}
