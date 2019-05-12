package lGpl20.comb.b64IntoB6;

import lGpl20.b32.B32va;
import lGpl20.b64.B64va;
import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/04/13_21:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_E" >B64IntoB6_E.java</a>
 * 
 * @see B64IntoB6_F
 */
public abstract class B64IntoB6_E extends B64IntoB6_D {

	private static final Class<B64IntoB6_E> CLASS_THIS = B64IntoB6_E.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To sum.<br/>
	 * To sum.
	 */
	public static int sum32(long b64IntoB6) {

		int sum32 = 0;
		int int32;

		do {

			int32 = ((int) b64IntoB6) & MASK32;
			sum32 = sum32 + int32;

		} while ((b64IntoB6 = b64IntoB6 >>> $6) != 0b0L);

		return sum32;

	}

	/**
	 * To convert.<br/>
	 * To convert.
	 */
	public static long toB64IntoB6ByToLog2OfLowest1NPlus1(int b32As2Pow) {

		long retB64IntoB6 = 0b0L;

		int mask32 = 0b1;
		int temp32;

		do {

			temp32 = b32As2Pow & mask32;

			if (temp32 != 0) {

				retB64IntoB6 = (retB64IntoB6 << $6) | ((long) (B32va.log2OfLowest1(temp32) + 1));

			}

		} while ((mask32 = mask32 << 1) <= b32As2Pow);

		return retB64IntoB6;

	}

	/**
	 * To convert.<br/>
	 * To convert.
	 * 
	 * @see #toB64As2PowByB6Cell(long)
	 */
	public static long toB64IntoB6ByToLog2OfLowest1NPlus1(long b64As2Pow) {// to change 0 at b6Cell to 1 at b6Cell

		long retB64IntoB6 = 0b0L;

		long mask64 = 0b1L;
		long temp64;

		do {

			temp64 = b64As2Pow & mask64;

			if (temp64 != 0b0L) {

				// int thePowOf2 = log2OfLowest1AtB64(temp64);
				retB64IntoB6 = (retB64IntoB6 << $6) | (long) (B64va.log2OfLowest1(temp64) + 1);

			}

		} while ((mask64 = mask64 << 1) <= b64As2Pow);

		return retB64IntoB6;

	}

	/**
	 * To convert.<br/>
	 * To convert.
	 * 
	 * @see #toB64As2PowByB6Cell(long)
	 */
	public static int toB32As2PowByB6Cell(long b64IntoB6) {// b64IntoB6 can be 0

		if (b64IntoB6 == 0b0L) {

			return 0;

		}

		int retB32As2Pow = 0b0;

		do {

			// /int numAs2Pow = 1 << (b6Cell - 1);
			// O.l("temp32=" + temp32 + O.S32 + CLASS_THIS);
			// O.l("numAs2Pow=" + numAs2Pow + O.S32 + CLASS_THIS);

			retB32As2Pow = retB32As2Pow | (1 << ((((int) b64IntoB6) & MASK32) - 1));

		} while ((b64IntoB6 = b64IntoB6 >>> $6) != 0b0L);

		return retB32As2Pow;

	}

	/**
	 * To convert.<br/>
	 * To convert.
	 * 
	 * @see #toB64IntoB6ByToLog2OfLowest1NPlus1(long)
	 */
	public static long toB64As2PowByB6Cell(long b64IntoB6) {// b64IntoB6 can be 0

		if (b64IntoB6 == 0b0L) {

			return 0b0L;

		}

		long retB64As2Pow = 0b0L;
		// int value32;

		do {

			// value32 = ((int) b64IntoB6) & $6_1_OF_32BIT;
			// O.l("value32=" + value32 + O.S32 + CLASS_THIS);

			retB64As2Pow = retB64As2Pow | (0b1L << ((((int) b64IntoB6) & MASK32) - 1));

		} while ((b64IntoB6 = b64IntoB6 >>> $6) != 0b0L);

		return retB64As2Pow;

	}

}
