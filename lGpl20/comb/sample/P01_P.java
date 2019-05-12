package lGpl20.comb.sample;

import lGpl20.comb.Pva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * 排列.<br/>
 * <br/>
 * Permutation.
 * 
 * @version 2019/04/16_19:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=P01_P" >P01_P.java</a>
 */
public class P01_P {

	public static void main(String[] sAry) throws Throwable {

		int n = 4;
		int k = 2;

		O.l("ans=" + Pva.int64(n, k));

		long[] ary = Pva.go(n, k);

		StringBuilder tempStr = B64IntoB6.toStrByAryOfB64IntoB6(ary, Strva.S_ARY_A_J, O.L);

		O.l(tempStr);
		O.l("len=" + ary.length);

	}

}
