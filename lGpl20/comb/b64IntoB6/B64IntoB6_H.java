package lGpl20.comb.b64IntoB6;

import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/04/18_21:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_H" >B64IntoB6_H.java</a>
 * 
 * @see B64IntoB6_J
 */
public abstract class B64IntoB6_H extends B64IntoB6_G {

	private static final Class<B64IntoB6_H> CLASS_THIS = B64IntoB6_H.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To sort.<br/>
	 * The most right hand side is the smallest.<br/>
	 */
	public static long selSort(long b64IntoB6) {

		final int total = totalNone0B6CellFromR(b64IntoB6);

		int i = 0;
		int temp, iTemp, min, iMin;

		int v1, v2;
		for (; i != total; i++) {

			iMin = i;
			min = ((int) (b64IntoB6 >>> ($6 * i))) & MASK32;// atFromR

			for (iTemp = i + 1; iTemp != total; iTemp++) {

				temp = ((int) (b64IntoB6 >>> ($6 * iTemp))) & MASK32;
				if (temp < min) {

					min = temp;
					iMin = iTemp;

				}

			}

			if (iMin != i) {

				v1 = ((int) (b64IntoB6 >>> ($6 * i))) & MASK32;
				v2 = ((int) (b64IntoB6 >>> ($6 * iMin))) & MASK32;

				// O.l("swap v1, v2=" + v1 + ", " + v2 + O.S32 + CLASS_THIS);

				b64IntoB6 = pasteAtFromR(b64IntoB6, i, v2);
				b64IntoB6 = pasteAtFromR(b64IntoB6, iMin, v1);

			}

		}

		return b64IntoB6;

	}

	/**
	 * To sort in descending order.<br/>
	 * The most right hand side is the smallest.<br/>
	 */
	public static long selSortDesc(long b64IntoB6) {

		final int total = totalNone0B6CellFromR(b64IntoB6);

		int i = 0;
		int temp, iTemp, min, iMin;

		int v1, v2;
		for (; i != total; i++) {

			iMin = i;
			min = ((int) (b64IntoB6 >>> ($6 * i))) & MASK32;// atFromR

			for (iTemp = i + 1; iTemp != total; iTemp++) {

				temp = ((int) (b64IntoB6 >>> ($6 * iTemp))) & MASK32;
				if (temp < min) {

					min = temp;
					iMin = iTemp;

				}

			}

			if (iMin != i) {

				v1 = ((int) (b64IntoB6 >>> ($6 * i))) & MASK32;
				v2 = ((int) (b64IntoB6 >>> ($6 * iMin))) & MASK32;

				// O.l("swap v1, v2=" + v1 + ", " + v2 + O.S32 + CLASS_THIS);

				b64IntoB6 = pasteAtFromR(b64IntoB6, i, v2);
				b64IntoB6 = pasteAtFromR(b64IntoB6, iMin, v1);

			}

		}

		return revAgainstB6FromR(b64IntoB6);

	}

}
