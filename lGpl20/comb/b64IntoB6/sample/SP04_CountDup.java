package lGpl20.comb.b64IntoB6.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * B64IntoB6.<br/>
 * <br/>
 * B64IntoB6.
 * 
 * @version 2019/04/12_10:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP04_CountDup" >SP04_CountDup.java</a>
 * 
 */
public class SP04_CountDup {

	private static final Class<SP04_CountDup> CLASS_THIS = SP04_CountDup.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		long b64IntoB6 = B64IntoB6.genB64IntoB6ByAry32(2, 2, 4, 1, 3, 3);
		O.l("bef=" + O.L + B64IntoB6.str24(b64IntoB6));

		long b64IntoB6ForDup = B64IntoB6.countDup(B64IntoB6.selSort(b64IntoB6));

		O.l("b64IntoB6ForDup=" + O.L + B64IntoB6.str24(b64IntoB6ForDup));

	}

}
