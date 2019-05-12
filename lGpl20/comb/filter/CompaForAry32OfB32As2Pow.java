package lGpl20.comb.filter;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * 32 位元整數陣列比較器.<br/>
 * The comparator of int[].
 * 
 * @version 2019/03/21_22:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaForAry32OfB32As2Pow" >
 *          CompaForAry32OfB32As2Pow.java</a>
 * 
 * @see CompaForAryOfB64IntoB6
 */
public class CompaForAry32OfB32As2Pow implements Comparator<int[]>, Serializable {

	private static final Class<CompaForAry32OfB32As2Pow> CLASS_THIS = CompaForAry32OfB32As2Pow.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public int compare(int[] ary32OfB32As2Pow1, int[] ary32OfB32As2Pow2) {

		if (ary32OfB32As2Pow1.length > ary32OfB32As2Pow2.length) {

			return 1;

		}

		if (ary32OfB32As2Pow1.length < ary32OfB32As2Pow2.length) {

			return -1;

		}

		// ary32OfB32As2Pow1.length == ary32OfB32As2Pow2.length

		int bitCount1;
		int bitCount2;
		for (int i = 0; i != ary32OfB32As2Pow1.length; i++) {

			bitCount1 = Integer.bitCount(ary32OfB32As2Pow1[i]);
			bitCount2 = Integer.bitCount(ary32OfB32As2Pow2[i]);

			// O.l("bitCount1=" + bitCount1 + ", bitCount2=" + bitCount2 + O.S32 + CLASS_THIS);
			//
			// // StringBuilder str1 = Strva.toStrToOntoByB32As2Pow(ary32OfB32As2Pow1[i]);
			// StringBuilder str1 = B32va.toStrByLog2OfLowest1AtB32(ary32OfB32As2Pow1[i]);
			// StringBuilder str2 = B32va.toStrByLog2OfLowest1AtB32(ary32OfB32As2Pow2[i]);
			// O.l("str1=" + str1 + O.S32 + CLASS_THIS);
			// O.l("str2=" + str2 + O.S32 + CLASS_THIS);

			if (bitCount1 > bitCount2) {

				return 1;

			}

			if (bitCount1 < bitCount2) {

				return -1;

			}

		}

		int int32_1;
		int int32_2;
		for (int i = 0; i != ary32OfB32As2Pow1.length; i++) {

			int32_1 = ary32OfB32As2Pow1[i];
			int32_2 = ary32OfB32As2Pow2[i];

			if (int32_1 > int32_2) {

				return 1;

			}

			if (int32_1 < int32_2) {

				return -1;

			}

		}

		return 0;

	}

}