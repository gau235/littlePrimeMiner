package lGpl20.comb.sample;

import java.util.Arrays;

import lGpl20.comb.Der;
import lGpl20.comb.PInEx;
import lGpl20.comb.Pva;
import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * 排容原理.<br/>
 * 例如 :<br/>
 * A, B, C, D 排成一列, 但 A 不排第 1 位, B 不排第 2 位的方法數 :<br/>
 * 為 4 人有 2 人是限定條件 inEx(4,2).<br/>
 * <br/>
 * To return the inclusion and exclusion function result, the number of<br/>
 * that n people line up but k guys not at their position.<br/>
 * PInEx(n,k)=C(k,0)*n! -C(k,1)*(n-1)! +C(k,2)*(n-2)! - ... +-C(k,k)*(n-k)!
 * 
 * @version 2019/04/05_19:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=P84_InEx" >P84_InEx.java</a>
 */
public class P84_InEx {

	public static final String[] S_ARY_HAED = { "1", "2", "3", "4", "5", "6", "7", "8", };

	public static void main(String[] sAry) throws Throwable {

		// Der.passTest();

		int n = 4;
		int k = 4;
		int topKToEx = 1;

		long[] ary = Der.goOnNEqKAftP(n);
		O.l("len1=" + ary.length);

		ary = PInEx.goOnNEqKAftPAftCByB32As2Pow(n, k, topKToEx);
		Arrays.sort(ary);

		StringBuilder str = Pva.toHtmlStrWHeadSToPByAryOfB64IntoB6(ary, Strva.S_ARY_A_J, S_ARY_HAED, "tabForPInEx");
		// Strva.toHtmlStrWOrderToDerByAryOfB64IntoB6(aryOfB64IntoB6, sAry, sHtmlClass);

		O.l(str);
		O.l("len2=" + ary.length);

		O.l("ans1=" + PInEx.int64(n, k, topKToEx));
		O.l("ans2=" + Der.int64(n, k));
		O.l("ans3=" + Der.bigInt(n, k));

	}

}
