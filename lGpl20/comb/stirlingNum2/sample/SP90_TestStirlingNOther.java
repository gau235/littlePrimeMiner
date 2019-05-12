package lGpl20.comb.stirlingNum2.sample;

import lGpl20.comb.Der;
import lGpl20.comb.onto.OntoFreelyer;
import lGpl20.comb.onto.Ontova;
import lGpl20.comb.stirlingNum1.S1va;
import lGpl20.comb.stirlingNum1.sample.SP12_TestS1;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.comb.stirlingNum3.S3va;
import lGpl20.comb.stirlingNum3.sample.SP12_TestS3;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWGo;

/**
 * To test Stirling number.<br/>
 * <br/>
 * To test Stirling number.
 * 
 * @version 2018/03/26_15:57:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP90_TestStirlingNOther" >
 *          SP90_TestStirlingNOther.java</a>
 * 
 * @see SP12_TestS2
 * 
 * @see SP12_TestS1
 * 
 * @see SP12_TestS3
 */
public class SP90_TestStirlingNOther {

	private static final Class<SP90_TestStirlingNOther> CLASS_THIS = SP90_TestStirlingNOther.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		Der.passTest();

		Ontova.passTest();
		OntoFreelyer.passTest();

		S2va.passTest();
		S1va.passTest();
		S3va.passTest();

		ShWGo.passTest();
		DiIGo.passTest();

	}

}
