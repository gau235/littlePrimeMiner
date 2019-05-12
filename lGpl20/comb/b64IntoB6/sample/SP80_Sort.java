package lGpl20.comb.b64IntoB6.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * B64IntoB6.<br/>
 * <br/>
 * B64IntoB6.
 * 
 * @version 2019/04/13_19:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP80_Sort" >SP80_Sort.java</a>
 * 
 */
public class SP80_Sort {

	private static final Class<SP80_Sort> CLASS_THIS = SP80_Sort.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		// long b64IntoB6 = 0b000000_000001_000101_000010L;
		long b64IntoB6 = B64IntoB6.genB64IntoB6ByAry32(2, 3, 1);
		O.l("bef=" + O.L + B64IntoB6.str24(b64IntoB6));

		b64IntoB6 = B64IntoB6.selSort(b64IntoB6);
		O.l("sort=" + O.L + B64IntoB6.str24(b64IntoB6));

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(B64IntoB6.selSort(b64IntoB6));
		O.l("sortDesc=" + O.L + B64IntoB6.str24(b64IntoB6));

		O.l();

		int min = B64IntoB6.atFromR(b64IntoB6, 0);
		int max = B64IntoB6.leftestFromR(b64IntoB6);

		O.l("min=" + min);
		O.l("max=" + max);

	}

}
