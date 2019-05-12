package lGpl20.comb.sample;

import lGpl20.comb.PWBlank;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * 有留空的排列.<br/>
 * <br/>
 * To permutate with blank.
 * 
 * @version 2019/04/16_17:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=P65_PWBlank" >P65_PWBlank.java</a>
 * 
 */
public class P65_PWBlank {

	public static void main(String[] sAry) throws Throwable {

		int n = 2;
		int k = 4;

		long[] ary = PWBlank.go(n, k);

		StringBuilder str1 = PWBlank.toStrToPWBlankByAryOfB64IntoB6(ary, n, Strva.S_ARY_A_J, O.L);
		O.l("str1=" + O.L + str1 + O.L);

		O.l();

		StringBuilder str2 = B64IntoB6.toStrByAryOfB64IntoB6(ary, Strva.S_ARY_A_J, O.L);
		O.l("str2=" + O.L + str2 + O.L);

		O.l("len=" + ary.length);
		O.l("ans=" + PWBlank.int64(n, k));

	}

}
