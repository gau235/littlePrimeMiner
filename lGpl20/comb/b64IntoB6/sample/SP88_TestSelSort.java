package lGpl20.comb.b64IntoB6.sample;

import java.io.Serializable;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2019/03/19_22:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP88_TestSelSort" >SP88_TestSelSort.java
 *          </a>
 *
 * @see SP84_TestSelSortInAry32
 */
public abstract class SP88_TestSelSort implements Serializable {

	private static final Class<SP88_TestSelSort> CLASS_THIS = SP88_TestSelSort.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		int[] ary32 = new int[] { 1, 52, 3, 4, 5, 51, 2, 53, 54 };

		O.l(SP84_TestSelSortInAry32.selSort(ary32.clone()));

		long b64IntoB6 = B64IntoB6.genB64IntoB6ByAry32(ary32);
		long b64IntoB6_2 = B64IntoB6.genB64IntoB6ByAry32(ary32);

		b64IntoB6_2 = B64IntoB6.selSort(b64IntoB6_2);

		if (b64IntoB6 != b64IntoB6_2) {

			// O.x();

		}

		O.l(B64IntoB6.toStrByValInB6Cell(b64IntoB6));

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		O.l(B64IntoB6.toStrByValInB6Cell(b64IntoB6));

	}

}