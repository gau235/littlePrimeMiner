package lGpl20.comb.sample;

import lGpl20.comb.Pva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.wDup.PWDup;
import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * 排列.<br/>
 * Permutation.
 * 
 * @version 2019/05/08_16:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=P03_FactorialNDiv" >P03_FactorialNDiv.
 *          java</a>
 */
public class P03_FactorialNDiv {

	public static void main(String[] sAry) throws Throwable {

		long facAns = Pva.int64(9);
		long b64IntoB6OfQtyPlus1 = B64IntoB6.genB64IntoB6ByAry32(2, 3, 4, 4);// 1,2,3,3; all plus 1

		long ans = PWDup.factorialNDiv(facAns, b64IntoB6OfQtyPlus1);
		// ans = ans * 12;
		ans = ans / 2;

		O.l("ans=" + SByN.f(ans));

	}

}
