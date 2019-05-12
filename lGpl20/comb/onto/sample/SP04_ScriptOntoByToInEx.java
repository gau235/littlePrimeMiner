package lGpl20.comb.onto.sample;

import lGpl20.comb.PInEx;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.onto.Ontova;
import lGpl20.comb.sample.P84_InEx;
import lGpl20.comb.stirlingNum1.S1va;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.comb.stirlingNum3.S3va;
import lGpl20.o.O;

/**
 * The script for Onto function.<br/>
 * <br/>
 * The script for Onto function.
 * 
 * @version 2018/04/05_21:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP04_ScriptOntoByToInEx" >
 *          SP04_ScriptOntoByToInEx.java</a>
 * 
 * @see P84_InEx
 */
public class SP04_ScriptOntoByToInEx {

	public static void main(String[] sAry) throws Throwable {

		Condi condi = new Condi();
		condi.n = 7;
		condi.k = 3;
		condi.min = 1;
		condi.max = condi.n;

		Object str = Ontova.scriptByToInEx(condi, O.L);
		O.l("scriptOntoByToInEx=");
		O.l(str);
		O.l();

		str = Ontova.script(condi, O.L);
		O.l("scriptOnto=");
		O.l(str);
		O.l();

		str = PInEx.script(condi.n, condi.k, O.L);
		O.l("scripPInEx=");
		O.l(str);
		O.l();

		str = S2va.script(condi, O.L);
		O.l("scriptS2=");
		O.l(str);
		O.l();

		str = S1va.script(condi, O.L);
		O.l("scriptS1=");
		O.l(str);
		O.l();

		str = S3va.script(condi, O.L);
		O.l("scriptS3=");
		O.l(str);
		O.l();

	}

}
