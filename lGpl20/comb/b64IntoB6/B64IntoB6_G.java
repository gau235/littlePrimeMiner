package lGpl20.comb.b64IntoB6;

import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/03/16_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_G" >B64IntoB6_G.java</a>
 * 
 * @see B64IntoB6_H
 */
public abstract class B64IntoB6_G extends B64IntoB6_F {

	private static final Class<B64IntoB6_G> CLASS_THIS = B64IntoB6_G.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To get the cell at index of B64IntoB6.<br/>
	 * To get the cell at index of B64IntoB6.
	 */
	public static int atFromR(long b64IntoB6, int index) {// first index is 0

		return ((int) (b64IntoB6 >>> ($6 * index))) & MASK32;

	}

	/**
	 * To get the tail cell of B64IntoB6.<br/>
	 * To get the tail cell of B64IntoB6.
	 */
	public static int leftestFromR(long b64IntoB6) {// tail

		// O.l("mask64=" + O.L + str24((int) mask64) + O.S32 + CLASS_THIS);

		if (b64IntoB6 == 0b0L) {

			throw new IndexOutOfBoundsException();

		}

		do {

			if ((b64IntoB6 >>> $6) == 0b0L) {

				return ((int) b64IntoB6) & MASK32;

			}

		} while ((b64IntoB6 = (b64IntoB6 >>> $6)) != 0b0L);

		throw new IndexOutOfBoundsException();

	}

	/**
	 * To replace the cell at index of B64IntoB6.<br/>
	 * To replace the cell at index of B64IntoB6.
	 */
	public static long pasteAtFromR(long b64IntoB6, int index, int value) {// first index is 0

		final int nOfToShiftL = index * $6;

		b64IntoB6 = b64IntoB6 & (~(MASK1TO_6 << nOfToShiftL));// clear the cell

		return b64IntoB6 | ((long) value << nOfToShiftL);

	}

	/**
	 * To swap.<br/>
	 * To swap.
	 */
	public static long swapB6(long b64IntoB6, int index1, int index2) {

		int v1 = ((int) (b64IntoB6 >>> ($6 * index1))) & MASK32;// atFromR(b64IntoB6, index1);
		int v2 = ((int) (b64IntoB6 >>> ($6 * index2))) & MASK32;// atFromR(b64IntoB6, index2);

		b64IntoB6 = pasteAtFromR(b64IntoB6, index1, v2);
		b64IntoB6 = pasteAtFromR(b64IntoB6, index2, v1);

		return b64IntoB6;

	}

	/**
	 * To append all from left.<br/>
	 * To append all from left.
	 */
	public static long appendAllFromL(long b64IntoB6, long otherB64IntoB6) {

		b64IntoB6 = revAgainstB6FromR(b64IntoB6);

		int temp32;
		do {

			temp32 = ((int) b64IntoB6) & MASK32;
			otherB64IntoB6 = (otherB64IntoB6 << $6) | (long) temp32;

		} while ((b64IntoB6 = b64IntoB6 >>> $6) != 0b0L);

		return otherB64IntoB6;

	}

}
