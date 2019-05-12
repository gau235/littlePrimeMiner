package lGpl20.comb.sample;

import lGpl20.comb.Cva;
import lGpl20.o.O;
import lGpl20.o.ery.Seq32;
import lGpl20.o.str.Strva;

/**
 * 組合.<br/>
 * <br/>
 * Combination.
 * 
 * @version 2018/09/17_20:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C01_C" >C01_C.java</a>
 * 
 */
public class C01_C {

	public static void main(String[] sAry) {

		int n = 4;
		int k = 2;

		// int[] ary32 = Cva.goByB32As2Pow(n, k);

		/////////////////////////////////////
		Seq32 seq32 = new Seq32();
		Cva.reGoByB32As2Pow(0b1000, k, 0b0, 0b1, seq32);
		int[] ary32 = seq32.trim().ary32(false);
		/////////////////////////////////////

		StringBuilder str = Cva.toStrToCByB32As2PowBySAry(ary32, Strva.S_ARY_A_J, O.L);

		O.l("str=" + O.L + str);
		O.l();
		O.l("len=" + ary32.length);
		O.l("ans=" + Cva.int64(n, k));

	}

}
