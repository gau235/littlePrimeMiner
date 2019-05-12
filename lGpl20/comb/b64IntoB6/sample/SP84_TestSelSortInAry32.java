package lGpl20.comb.b64IntoB6.sample;

import java.io.Serializable;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2019/03/19_15:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP84_TestSelSortInAry32" >
 *          SP84_TestSelSortInAry32.java</a>
 *
 * @see SP88_TestSelSort
 */
public class SP84_TestSelSortInAry32 implements Serializable {

	private static final Class<SP84_TestSelSortInAry32> CLASS_THIS = SP84_TestSelSortInAry32.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void swapValInAry32(int[] ary32, int index1, int index2) {

		int temp32;

		temp32 = ary32[index1];
		ary32[index1] = ary32[index2];
		ary32[index2] = temp32;

	}

	public static int[] selSort(int[] ary32) {

		int i = 0;
		int temp, iTemp, min, iMin;
		for (; i != ary32.length; i++) {

			iMin = i;
			min = ary32[i];

			for (iTemp = i + 1; iTemp != ary32.length; iTemp++) {

				if ((temp = ary32[iTemp]) < min) {

					min = temp;
					iMin = iTemp;

				}

			}

			if (iMin != i) {

				swapValInAry32(ary32, i, iMin);

			}

		}

		return ary32;

	}

	public static void main(String[] sAry) throws Throwable {

		int[] ary32 = new int[] { 1, 2, 13, 4, 5, 11, 12, 3, 14 };

		O.l(SP84_TestSelSortInAry32.selSort(ary32.clone()));

		long b64IntoB6 = B64IntoB6.genB64IntoB6ByAry32(ary32);

		b64IntoB6 = B64IntoB6.selSort(b64IntoB6);

		O.l(B64IntoB6.toStrByValInB6Cell(b64IntoB6));

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		O.l(B64IntoB6.toStrByValInB6Cell(b64IntoB6));

	}

}
