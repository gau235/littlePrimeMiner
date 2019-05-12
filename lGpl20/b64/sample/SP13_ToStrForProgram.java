package lGpl20.b64.sample;

import lGpl20.b32.B32va;
import lGpl20.b64.B64va;
import lGpl20.o.O;

/**
 * B64va.str64.<br/>
 * B64va.str64.
 * 
 * @version 2019/05/10_20:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP11_ToStr" >SP11_ToStr.java</a>
 *
 */
public class SP13_ToStrForProgram {

	public static void main(String[] sAry) {

		int int32 = 0b100;
		StringBuilder str = B32va.str16(int32);
		O.l(str);

		str = B64va.str(int32);
		O.l(str);

		int k = 0;
		for (long i = 0b1L; i < O.pow(2, 62); i = i << 1, k++) {

			str = B64va.str(i);
			O.l("if (b64As2Pow ==0b" + str + "L){\n\n  return " + k + ";\n\n }\n");

		}

	}

}
