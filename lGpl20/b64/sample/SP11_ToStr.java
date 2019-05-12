package lGpl20.b64.sample;

import lGpl20.b32.B32va;
import lGpl20.b64.B64va;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * B64va.str64.<br/>
 * B64va.str64.
 * 
 * @version 2019/04/16_14:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP11_ToStr" >SP11_ToStr.java</a>
 *
 */
public class SP11_ToStr {

	public static void main(String[] sAry) throws Throwable {

		long int64 = 0b0111_0001_0010_0011;// Long.MIN_VALUE
		// long int64 = Long.MIN_VALUE;

		int int32 = (int) int64;

		O.l("B64va.str64=" + O.L + B64va.str(int64));

		O.l();

		O.l("B32va.str16=" + O.L + B32va.str16(int32));
		O.l("B32va.str32=" + O.L + B32va.str(int32));

		O.l();
		O.l("B64IntoB6.str24=" + O.L + B64IntoB6.str24(int64));

		O.l();

		O.l("B64IntoB6.str64=" + O.L + B64IntoB6.str(int64));

	}

}
