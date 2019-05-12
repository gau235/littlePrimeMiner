package lGpl20.comb.b64IntoB6;

import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/03/21_10:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_F" >B64IntoB6_F.java</a>
 * 
 * @see B64IntoB6_G
 */
public abstract class B64IntoB6_F extends B64IntoB6_E {

	private static final Class<B64IntoB6_F> CLASS_THIS = B64IntoB6_F.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To reverse against every 6-bit cell.<br/>
	 * To reverse against every 6-bit cell.
	 */
	public static long revAgainstB6FromR(long b64IntoB6) {

		// if (b64IntoB6 == 0b0L) {
		//
		// return b64IntoB6;
		//
		// }

		long retB64IntoB6 = 0b0L;

		do {

			retB64IntoB6 = retB64IntoB6 | (long) (((int) b64IntoB6) & MASK32);

			if ((b64IntoB6 = b64IntoB6 >>> $6) == 0b0L) {

				return retB64IntoB6;

			} else {

				retB64IntoB6 = retB64IntoB6 << $6;

			}

		} while (true);

		// O.l("reverse=" + O.L + B32va.toStrIn64Bit(retB64IntoB6));

	}

	/**
	 * To convert.<br/>
	 * To convert.
	 */
	public static boolean isEveryB6CellLteQty(long b64IntoB6OfQRPlus1, long b64IntoB6OfQtyPlus1) {

		// todo: do not need to compare every cell, just to compare first cell
		int temp32OfB6;
		int temp32OfB6Qty;

		do {

			temp32OfB6 = ((int) b64IntoB6OfQRPlus1) & MASK32;
			temp32OfB6Qty = ((int) b64IntoB6OfQtyPlus1) & MASK32;

			// O.l("temp32OfB6, temp32OfB6Qty=" + temp32OfB6 + ", " + temp32OfB6Qty);

			if (!(temp32OfB6 <= temp32OfB6Qty)) {

				return false;

			}

			b64IntoB6OfQtyPlus1 = b64IntoB6OfQtyPlus1 >>> $6;

		} while ((b64IntoB6OfQRPlus1 = b64IntoB6OfQRPlus1 >>> $6) != 0b0L);

		return true;

	}

	/**
	 * To sum.<br/>
	 * To sum.
	 */
	public static boolean checkEveryB6CellBetween(long b64IntoB6, int min, int max) {

		do {

			int temp32 = ((int) b64IntoB6) & MASK32;

			if (temp32 < min || temp32 > max) {

				return false;

			}

		} while ((b64IntoB6 = b64IntoB6 >>> $6) != 0b0L);

		return true;

	}

	/**
	 * Is it derangement?<br/>
	 * Is it derangement?
	 */
	public static boolean isDerangement(long b64IntoB6, long otherB64IntoB6) {

		int int32_1;
		int int32_2;

		while ((int32_1 = (int) b64IntoB6 & MASK32) > 0) {

			int32_2 = (int) otherB64IntoB6 & MASK32;
			if (int32_1 == int32_2) {

				return false;

			}

			b64IntoB6 = b64IntoB6 >>> $6;
			otherB64IntoB6 = otherB64IntoB6 >>> $6;

		}

		return true;

	}

}
