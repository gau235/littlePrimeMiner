package lGpl20.comb.sample;

import lGpl20.comb.Cva;
import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.o.str.Strva;

/**
 * 組合.<br/>
 * <br/>
 * Combination.
 * 
 * @version 2019/05/04_15:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C04_CollectToNByToGo" >
 *          C04_CollectToNByToGo.java</a>
 * 
 */
public class C04_CollectToNByToGo {

	public static void main(String[] sAry) {

		int n = 5;

		int[] ary32ForAll = Cva.collectToNByToGo(n);
		String ansAll = SByN.f(ary32ForAll.length).toString();
		StringBuilder str = Cva.toStrToCByB32As2PowBySAry(ary32ForAll, Strva.S_ARY_A_J, O.L);

		O.l("str=" + O.L + str);
		O.l();
		O.l("ans=" + ansAll);

	}

}
