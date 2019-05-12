package lGpl20.comb.b64IntoB6;

import lGpl20.b32.B32va;
import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/04/13_21:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_K" >B64IntoB6_K.java</a>
 * 
 * @see B64IntoB6_L
 */
public abstract class B64IntoB6_K extends B64IntoB6_J {

	private static final Class<B64IntoB6_K> CLASS_THIS = B64IntoB6_K.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To count of the occurrence of every value.<br/>
	 * The input need to sort first, as 0b000011_000010_000001 <br/>
	 * When inputing 0b000010_000001_000001_000001 then to return: 000000_000011<br/>
	 * When inputing 0b000000_000000_000001_000011 then to return: 000000_000000<br/>
	 * 
	 * @see B32va#retrieveOccurFromKey1To63ByB64IntoB6(long)
	 */
	public static long countDup(long sortedB64IntoB6) {

		int val32InB6 = (((int) sortedB64IntoB6) & MASK32);

		int count32OfDup = 0;

		long retB64IntoB6 = 0b0L;

		for (int min32 = val32InB6; true;) {

			do {

				count32OfDup++;
				sortedB64IntoB6 = sortedB64IntoB6 >>> $6;
				val32InB6 = ((int) sortedB64IntoB6) & MASK32;

				if (sortedB64IntoB6 == 0b0L) {

					if (count32OfDup > 1) {// fuck

						retB64IntoB6 = ((retB64IntoB6 << $6) | (long) count32OfDup);

					}

					// O.l("retB64IntoB6=" + O.L + str24(retB64IntoB6) + O.S32 + CLASS_THIS);
					return retB64IntoB6;

				}

			} while (min32 == val32InB6);

			// O.l("min32=" + min32 + O.S32 + CLASS_THIS);
			// O.l("count32OfDup=" + count32OfDup + O.S32 + CLASS_THIS);
			if (count32OfDup > 1) {// fuck

				retB64IntoB6 = ((retB64IntoB6 << $6) | (long) count32OfDup);

			}

			// min32++;
			min32 = val32InB6;// check if pass B64IntoB6.genB64IntoB6ByAry32(1, 1, 2, 3, 4)
			count32OfDup = 0;

		}

	}

	/**
	 * To convert.<br/>
	 * To convert.
	 * 
	 * @see #toB32As2PowByB6Cell(long)
	 */
	public static int[] toAry32OfB32As2Pow(long b64IntoB6) {

		// b64IntoB6 = revAgainstB6NShiftR(b64IntoB6);

		// O.l("totalNone0B6CellFromR=" + O.L + totalNone0B6CellFromR);

		int[] retAry32OfB32As2Pow = new int[totalNone0B6CellFromR(b64IntoB6)];

		int temp32;
		int i = 0;

		do {

			temp32 = ((int) b64IntoB6) & MASK32;

			if (temp32 != 0) {

				retAry32OfB32As2Pow[i++] = (0b1 << (temp32 - 1));// minus 1

			}

		} while ((b64IntoB6 = b64IntoB6 >>> $6) != 0b0L);

		return retAry32OfB32As2Pow;

	}

}
