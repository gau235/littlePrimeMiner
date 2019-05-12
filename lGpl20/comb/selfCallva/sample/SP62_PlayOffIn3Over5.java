package lGpl20.comb.selfCallva.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.selfCallva.ForwardSelfCallva;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * 5 戰 3 勝.<br/>
 * <br/>
 * 5 戰 3 勝.
 * 
 * @version 2019/04/19_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP62_PlayOffIn3Over5" >
 *          SP62_PlayOffIn3Over5.java</a>
 * 
 */
public class SP62_PlayOffIn3Over5 {

	public static void main(String[] sAry) throws Throwable {

		sAry = new String[] { "統", "L" };

		Seq retSeq = new Seq();
		ForwardSelfCallva.playOffIn3Over5(3, 0b0L, retSeq);

		long[] ary = retSeq.trim().ary(false);
		for (int i = 0, len32 = ary.length; i != len32; i++) {

			Object ooo = B64IntoB6.toStrByValMinus1InB6Cell(ary[i], sAry);

			O.l(ooo);

		}
		
		
		O.l("ans=" + ary.length);

	}

}
