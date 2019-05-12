package lGpl20.comb.b64IntoB6;

import lGpl20.b32.Ary32va;
import lGpl20.b32.B32va;
import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/03/20_08:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_B" >B64IntoB6_B.java</a>
 * 
 * @see B64IntoB6_C
 */
public abstract class B64IntoB6_B extends B64IntoB6_A {

	private static final Class<B64IntoB6_B> CLASS_THIS = B64IntoB6_B.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To index of none 0 cells in a B64IntoB6.<br/>
	 * The first index of cell from right hand side is 0.
	 */
	public static int totalNone0B6CellFromR(long b64IntoB6) {

		if ((b64IntoB6 & MASK1TO_6) == 0L) {// first index is 0

			return 0;

		}

		if ((b64IntoB6 & MASK7TO_12) == 0L) {

			return 1;

		}

		if ((b64IntoB6 & MASK13TO_18) == 0L) {

			return 2;

		}

		if ((b64IntoB6 & MASK19TO_24) == 0L) {

			return 3;

		}

		if ((b64IntoB6 & MASK25TO_30) == 0L) {

			return 4;

		}

		if ((b64IntoB6 & MASK31TO_36) == 0L) {

			return 5;

		}

		if ((b64IntoB6 & MASK37TO_42) == 0L) {

			return 6;

		}

		if ((b64IntoB6 & MASK43TO_48) == 0L) {

			return 7;

		}

		if ((b64IntoB6 & MASK49TO_54) == 0L) {

			return 8;

		}

		if ((b64IntoB6 & MASK55TO_60) == 0L) {

			return 9;

		}

		return 10;

	}

	/**
	 * If contain.<br/>
	 * If contain.
	 * 
	 * @see Ary32va#findFirstOccurFromTail(int[], int, int)
	 */
	public static int findFirstOccurFromTail(long b64IntoB6, int fromIndex, int key32) {

		for (int index = fromIndex; index >= 0; index--) {

			if ((((int) (b64IntoB6 >>> ($6 * index))) & MASK32) == key32) {

				return index;

			}

		}

		return Integer.MIN_VALUE;

	}

	/**
	 * To count of occurrence.<br/>
	 * When the ary32 is {1, 3, 3}, then to return:<br/>
	 * 1,2<br/>
	 * To count of occurrence.
	 * 
	 * @see B32va#retrieveOccurFromKey1To63ByB64IntoB6(long)
	 */
	public static long countOccur(int[] ary32) {// todo: need to sort at the beginning

		long int64 = 0L;
		int occur = 0;

		// int index = 0;

		for (int key = 1; key < 64; key++, occur = 0) {

			for (int i = 0; i != ary32.length; i++) {

				if (ary32[i] == key) {

					occur++;

				}

			}

			if (occur > 1) {

				// int64 = int64 | (((long) occur) << (index++) * $6);
				int64 = (int64 << $6) | (long) occur;

			}

			// O.l("key=" + key + ", occur=" + occur);
			// O.l("str32=" + O.L + B32va.str((int) int64));

		}

		return int64;

	}

}
