package lGpl20.comb.stirlingNum2.sample;

import lGpl20.comb.Cva;
import lGpl20.o.O;

/**
 * The identical equation (identity) of C.<br/>
 * <br/>
 * The identical equation (identity) of C.
 * 
 * @version 2019/03/27_18:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP04_TheEqOfC" >SP04_TheEqOfC.java</a>
 *
 * @see Cva
 */
public abstract class SP04_TheEqOfC {

	public static void main(String[] sAry) throws Throwable {

		int n = 14;

		int k1 = 4;
		int k2 = 3;
		int k3 = 5;

		long ans1 = Cva.int64(n, k1);
		long ans2 = Cva.int64(n - k1, k2);
		long ans3 = Cva.int64(n - k1 - k2, k3);

		O.l("ans=" + (ans1 * ans2 * ans3));

		// C(9,4)*C(5,3) == C(9,3)*C(6,4)

	}

}
