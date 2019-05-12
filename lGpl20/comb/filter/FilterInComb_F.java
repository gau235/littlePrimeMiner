package lGpl20.comb.filter;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * @version 2018/10/16_10:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=FilterInComb_F" >FilterInComb_F.java</a>
 * 
 * @see FilterInComb_W
 */
public abstract class FilterInComb_F extends FilterInComb_A {

	private static final Class<FilterInComb_F> CLASS_THIS = FilterInComb_F.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To check if int32 all between min and max (both inclusive).<br/>
	 * To check if int32 all between min and max (both inclusive).
	 */
	public static boolean ifEveryBitCountInAry32Between(int[] ary32, int min, int max) {

		for (int i = 0; i < ary32.length; i++) {

			int bitCount = Integer.bitCount(ary32[i]);
			// O.l("bitCount=" + bitCount + O.S32 + CLASS_THIS);
			if (bitCount < min || bitCount > max) {

				return false;

			}

		}

		return true;

	}

	/**
	 * To check if int64 all between min and max (both inclusive).<br/>
	 * To check if int64 all between min and max (both inclusive).
	 */
	public static boolean ifEveryBitCountInAryBetween(long[] ary, int min, int max) {

		for (int i = 0; i < ary.length; i++) {

			int totalNone0B6CellFromR = B64IntoB6.totalNone0B6CellFromR(ary[i]);
			// O.l("bitCount=" + bitCount + O.S32 + CLASS_THIS);
			if (totalNone0B6CellFromR < min || totalNone0B6CellFromR > max) {

				return false;

			}

		}

		return true;

	}

	/**
	 * To filter.<br/>
	 * To filter.
	 */
	public static Ery<int[]> keepIfEveryBitCountInAry32Between(Ery<int[]> eryOfAry32, int min, int max) {

		Ery<int[]> retEryOfAry32 = new Ery<int[]>();

		for (int i = 0, len = eryOfAry32.len(); i != len; i++) {

			int[] ary32 = eryOfAry32.at(i);
			if (ifEveryBitCountInAry32Between(ary32, min, max)) {

				// O.l("add=" + Arrays.toString(ary32) + O.S32 + CLASS_THIS);
				retEryOfAry32.a(ary32);

			}

		}

		// retEryOfAry32.close();

		return retEryOfAry32;

	}

	/**
	 * To filter.<br/>
	 * To filter.
	 */
	public static Ery<long[]> keepIfEveryBitCountInAryBetween(Ery<long[]> eryOfAry, int min, int max) {

		Ery<long[]> retEryOfAry = new Ery<long[]>();

		for (int i = 0, len = eryOfAry.len(); i != len; i++) {

			long[] ary = eryOfAry.at(i);
			if (ifEveryBitCountInAryBetween(ary, min, max)) {

				// O.l("add=" + Arrays.toString(ary) + O.S32 + CLASS_THIS);
				retEryOfAry.a(ary);

			}

		}

		return retEryOfAry;

	}

	/**
	 * To check if contain.<br/>
	 * To check if contain.
	 */
	public static boolean ifContainAtLeastCountOf0(final int[] ary32, final int atLeastCountOf0) {

		if (atLeastCountOf0 == 0) {

			for (int i = 0; i < ary32.length; i++) {

				if (ary32[i] == 0) {

					return false;

				}

			}

			return true;

		}

		int countOf0 = 0;
		for (int i = 0; i < ary32.length; i++) {

			if (ary32[i] == 0) {

				if ((++countOf0) == atLeastCountOf0) {

					return true;

				}

			}

		}

		// if (countOf0 >= 2) {
		//
		// O.l("countOf0=" + countOf0 + O.S32 + CLASS_THIS);
		//
		// }

		return false;

	}

	/**
	 * To filter.<br/>
	 * To filter.
	 */
	public static Ery<int[]> keepIfContainAtLeastCountOf0(Ery<int[]> eryOfAry32, int atLeastCountOf0) {

		Ery<int[]> retEryOfAry32 = new Ery<int[]>();

		for (int i = 0, len = eryOfAry32.len(); i != len; i++) {

			int[] ary32 = eryOfAry32.at(i);
			if (ifContainAtLeastCountOf0(ary32, atLeastCountOf0)) {

				// O.l("add=" + Arrays.toString(ary32) + O.S32 + CLASS_THIS);
				retEryOfAry32.a(ary32);

			}

		}

		return retEryOfAry32;

	}

}