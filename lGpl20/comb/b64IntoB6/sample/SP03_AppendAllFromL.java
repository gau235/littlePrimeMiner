package lGpl20.comb.b64IntoB6.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * appendAllFromL.<br/>
 * <br/>
 * appendAllFromL.
 * 
 * @version 2018/10/28_15:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP03_AppendAllFromL" >
 *          SP03_AppendAllFromL.java</a>
 * 
 */
public class SP03_AppendAllFromL {

	private static final Class<SP03_AppendAllFromL> CLASS_THIS = SP03_AppendAllFromL.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		long b64IntoB6 = B64IntoB6.genB64IntoB6ByAry32(1, 2);

		// long b64IntoB6_2 = 5L;
		// b64IntoB6_2 = b64IntoB6_2 << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32;
		// b64IntoB6_2 = b64IntoB6_2 | 8L;

		long b64IntoB6_2 = B64IntoB6.genB64IntoB6ByAry32(9, 16);

		O.l("bef1=" + O.L + B64IntoB6.str24(b64IntoB6));
		O.l("bef1=" + O.L + B64IntoB6.toStrByValInB6Cell(b64IntoB6));

		O.l("bef2=" + O.L + B64IntoB6.str24(b64IntoB6_2));
		O.l("bef2=" + O.L + B64IntoB6.toStrByValInB6Cell(b64IntoB6_2));

		b64IntoB6 = B64IntoB6.appendAllFromL(b64IntoB6, b64IntoB6_2);

		O.l("aft1=" + O.L + B64IntoB6.str24(b64IntoB6));
		StringBuilder str = B64IntoB6.toStrByValInB6Cell(b64IntoB6);
		// StringBuilder str = B64IntoB6.toStrForToDiI(b64IntoB6, 1) ;
		O.l("aft1=" + str);

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		O.l("aft2=" + O.L + B64IntoB6.str24(b64IntoB6));
		str = B64IntoB6.toStrByValInB6Cell(b64IntoB6);
		// str = B64IntoB6.toStrForToDiI(b64IntoB6, 1) ;
		O.l("aft2=" + str);

		O.l();

	}

}
