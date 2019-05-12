package lGpl20.comb.filter;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * 64 位元整數陣列比較器.<br/>
 * The comparator of long[].
 * 
 * @version 2019/03/21_21:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaForAryOfB64IntoB6" >
 *          CompaForAryOfB64IntoB6.java</a>
 * 
 * @see CompaForAry32OfB32As2Pow
 */
public class CompaForAryOfB64IntoB6 implements Comparator<long[]>, Serializable {

	private static final Class<CompaForAryOfB64IntoB6> CLASS_THIS = CompaForAryOfB64IntoB6.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public int compare(long[] ary1, long[] ary2) {

		if (ary1.length > ary2.length) {

			return 1;

		}

		if (ary1.length < ary2.length) {

			return -1;

		}

		// if (ary1.length == ary2.length) {

		int total32_1;
		int total32_2;
		for (int i = 0; i != ary1.length; i++) {

			total32_1 = B64IntoB6.totalNone0B6CellFromR(ary1[i]);
			total32_2 = B64IntoB6.totalNone0B6CellFromR(ary2[i]);

			// O.l("total32_1=" + total32_1 + ", total32_2=" + total32_2 + O.S32 + CLASS_THIS);

			// StringBuilder str1 = B64IntoB6.toStrByB64IntoB6(b64IntoB6_1);
			// StringBuilder str2 = B64IntoB6.toStrByB64IntoB6(b64IntoB6_2);
			// O.l("str1=" + str1 + O.S32 + CLASS_THIS);
			// O.l("str2=" + str2 + O.S32 + CLASS_THIS);

			if (total32_1 > total32_2) {

				return 1;

			}

			if (total32_1 < total32_2) {

				return -1;

			}

		}

		// total32_1 == total32_2
		long sorted64_1;
		long sorted64_2;

		int val32_1;
		int val32_2;

		for (int i = 0; i != ary1.length; i++) {

			// sorted1 = B64IntoB6.bubbleSortDesc(ary1[i]);
			sorted64_1 = B64IntoB6.revAgainstB6FromR(ary1[i]);
			sorted64_2 = B64IntoB6.revAgainstB6FromR(ary2[i]);
			// O.l("total1=" + total1 + ", total2=" + total2 + O.S32 + CLASS_THIS);
			//
			// StringBuilder str1 = B64IntoB6.toStrByB64IntoB6(b64IntoB6_1);
			// StringBuilder str2 = B64IntoB6.toStrByB64IntoB6(b64IntoB6_2);
			// O.l("str1=" + str1 + O.S32 + CLASS_THIS);
			// O.l("str2=" + str2 + O.S32 + CLASS_THIS);

			while ((val32_1 = (((int) sorted64_1) & B64IntoB6.MASK32)) > 0) {

				val32_2 = ((int) sorted64_2) & B64IntoB6.MASK32;

				if (val32_1 > val32_2) {

					return 1;

				}

				if (val32_1 < val32_2) {

					return -1;

				}

				sorted64_1 = sorted64_1 >>> B64IntoB6.$6;
				sorted64_2 = sorted64_2 >>> B64IntoB6.$6;

			}

		}

		return 0;

	}

}