package lGpl20.comb.sample;

import lGpl20.comb.Cva;
import lGpl20.o.O;
import lGpl20.o.time.T64;
import lGpl20.prime64.Ranger;

/**
 * To compare all the combination method.<br/>
 * <br/>
 * To compare all the combination method.
 * 
 * @version 2017/10/14_08:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C77_CompaAgainstToC" >C77_CompaAgainstToC.
 *          java</a>
 *
 */
public class C77_CompaAgainstToC {

	public static void main(String[] sAry) {

		int n = 15;
		int k = 9;

		int numOfLoop = Ranger.$2POW10_INT32;

		long t640 = T64.t64();
		for (int i = 0; i < numOfLoop; i++) {

			Cva.cByB32As2PowByToBearByTempSeq32(n, k);

		}

		O.l("Cva.cByB32As2PowByToBearByTempSeq32 T=" + T64.difInF32Sec(t640));
		t640 = T64.t64();

		for (int i = 0; i < numOfLoop; i++) {

			Cva.goByB32As2Pow(n, k);

		}

		O.l("Cva.goByB32As2Pow T=" + T64.difInF32Sec(t640));

	}

}
