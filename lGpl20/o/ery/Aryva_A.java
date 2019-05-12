package lGpl20.o.ery;

import java.io.Serializable;
import java.util.Arrays;

import lGpl20.o.O;

/**
 * 陣列小幫手娃.<br/>
 * <br/>
 * The aid to array.
 * 
 * @version 2019/03/26_16:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Aryva_A" >Aryva_A.java</a>
 * 
 * @see Aryva_C
 */
public abstract class Aryva_A implements Serializable {

	private static final Class<Aryva_A> CLASS_THIS = Aryva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To check if contain.<br/>
	 * To check if contain.
	 */
	public static boolean ifContain(final long[] ary, int from, int to, long key) {

		for (int i = from; i < to; i++) {

			if (ary[i] == key) {

				return true;

			}

		}

		return false;

	}

	/**
	 * To check if contain.<br/>
	 * To check if contain.
	 */
	public static boolean ifContain(final long[] ary, long key) {

		for (int i = 0; i < ary.length; i++) {

			if (ary[i] == key) {

				return true;

			}

		}

		return false;

	}

	/**
	 * To check if there is duplicated.<br/>
	 * To check if there is duplicated.
	 */
	public static int checkDup(long[] ary) {

		Arrays.sort(ary);// todo: if its necessary or not

		for (int i = 0, lenMinus1 = ary.length - 1; i != lenMinus1; i++) {

			if (ary[i] == ary[i + 1]) {

				return i;

			}

		}

		return -1;

	}

	/**
	 * 把字串陣列轉為 64 位元整數陣列.<br/>
	 * To convert the String[] to long[];
	 */
	public static long[] toAry(String[] sAry) {

		long[] ary = new long[sAry.length];

		for (int i = 0; i < ary.length; i++) {

			ary[i] = Long.parseLong(sAry[i]);

		}

		return ary;

	}

	/**
	 * 回傳新陣列, 為舊陣列內所有整數位置顛倒.<br/>
	 * To return the reversed array.
	 * 
	 * @return the reversed array.
	 */
	public static long[] genRevAry(long[] ary, int from, int to) {

		// example:
		// long[] ary = new long[] { 1, 2, 3, 4, 5, 6, 7 };
		// ary = Aryva.genRevAry(ary, 0, 3); // fuck

		long[] tempAry = new long[to - from];

		for (int i = 0, toMinusFrom = to - from, toMinus1 = to - 1; i < toMinusFrom; i++) {

			tempAry[i] = ary[toMinus1 - i];

		}

		return tempAry;

		// for (int i = 0, toMinusFromDiv2 = (to - from)>>>1, toMinus1 = to - 1; i < toMinusFromDiv2; i++) {
		//
		// long temp = ary[i];
		// ary[i] = ary[toMinus1 - i];
		// ary[toMinus1 - i] = temp;
		//
		// }
		//
		// return ary;

	}

	/**
	 * 回傳新陣列, 為舊陣列內所有整數位置顛倒.<br/>
	 * To return the reversed array.
	 * 
	 * @return the reversed array.
	 */
	public static long[] genRevAry(long[] ary) {

		for (int i = 0, toMinusFromDiv2 = ary.length >>> 1, toMinus1 = ary.length - 1; i < toMinusFromDiv2; i++) {

			long temp = ary[i];
			ary[i] = ary[toMinus1 - i];
			ary[toMinus1 - i] = temp;

		}

		return ary;

	}

	/**
	 * 切掉陣列前面的多個 0.<br/>
	 * To remove all 0 of the head digits in the array.
	 */
	public static long[] removeHeadAll0(long[] ary) {

		if (ary.length > 0 && ary[0] == 0) {

			int indexNot0 = 0;

			for (; indexNot0 < ary.length; indexNot0++) {

				if (ary[indexNot0] != 0) {

					break;

				}

			}

			if ((ary.length - indexNot0) < 3) {

				O.l("removeTailAll0 < 3" + O.S32 + ary[0] + O.S32 + CLASS_THIS);

			}

			int tempLen = ary.length - indexNot0;// 0,0,1 => 3-2
			long[] tempAry = new long[tempLen];
			System.arraycopy(ary, indexNot0, tempAry, 0, tempLen);

			return tempAry;
			// return Arrays.copyOfRange(ary, 0, indexNot0 + 1);

		}

		return ary;

	}

}
