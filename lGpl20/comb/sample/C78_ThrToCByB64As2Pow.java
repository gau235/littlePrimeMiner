package lGpl20.comb.sample;

import lGpl20.comb.Cva;
import lGpl20.comb.thr.ThrToCByB64As2Pow;
import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * 組合 (取物).<br/>
 * <br/>
 * Combination.
 * 
 * @version 2019/02/21_12:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C78_ThrToCByB64As2Pow" >
 *          C78_ThrToCByB64As2Pow.java</a>
 */
public class C78_ThrToCByB64As2Pow {

	public static void main(String[] sAry) throws Throwable {

		int n = 5;
		int k = 3;

		String[] baseSAry = new String[n + 1];
		for (int i = 0; i < baseSAry.length; i++) {

			baseSAry[i] = String.valueOf(i + 1);

		}

		int[] ary32 = Cva.goByB32As2Pow(n, k);
		O.l("Cva.goByB32As2Pow(" + n + "," + k + ")=" + SByN.f(ary32.length));

		for (int i = 0; i != ary32.length; i++) {

			// O.l(B32va.str16(ary32[i]));

		}

		StringBuilder str = Cva.toStrToCByB32As2PowBySAry(ary32, baseSAry, O.L);
		O.l("str1=" + O.L + str);
		O.l();

		ThrToCByB64As2Pow thrToCByB64As2Pow = new ThrToCByB64As2Pow(n, k);
		thrToCByB64As2Pow.start();
		thrToCByB64As2Pow.join();

		long[] ary = thrToCByB64As2Pow.box;
		O.l("ThrToCByB32As2Pow(" + n + "," + k + ")=" + SByN.f(ary.length));

		O.l("ary[0]=" + ary[0]);

		StringBuilder str2 = Cva.toStrToCByB64As2PowBySAry(ary, baseSAry, O.L);
		O.l("str2=" + O.L + str2);

	}

}
