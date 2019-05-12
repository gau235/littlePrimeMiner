package lGpl20.comb.b64IntoB6.sample;

import java.io.Serializable;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2019/03/21_10:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP92_FindFirstOccurFromTail" >
 *          SP92_FindFirstOccurFromTail.java </a>
 *
 * @see SP88_TestSelSort
 */
public abstract class SP92_FindFirstOccurFromTail implements Serializable {

	private static final Class<SP92_FindFirstOccurFromTail> CLASS_THIS = SP92_FindFirstOccurFromTail.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		int[] ary32 = new int[] { 1, 2, 2, 2, 2, 2, 40 };

		long b64IntoB6 = B64IntoB6.genB64IntoB6ByAry32(ary32);

		O.l(B64IntoB6.findFirstOccurFromTail(b64IntoB6, ary32.length - 1, 2));

	}

}