package lGpl20.pick;

import java.io.Serializable;

import lGpl20.b64.B64va;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * To pick.<br/>
 * <br/>
 * To pick.
 * 
 * @version 2018/11/13_17:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Pickva_A" >Pickva_A.java</a>
 * 
 * @see Pickva_C
 */
public abstract class Pickva_A implements Serializable {

	private static final Class<Pickva_A> CLASS_THIS = Pickva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To pick up k elements randomly from all of the n elements.<br/>
	 * To pick up k elements randomly from all of the n elements.
	 */
	public static long pickRandomly(int n, int k) {// maxN = 62

		long b64 = (0b1L << n) - 1L;
		// O.l("b64=" + B32va.str16((int) b64) + O.S32 + CLASS_THIS);

		long mask;

		long retB64IntoB6 = 0b0L;

		int i = 0;

		do {

			mask = 0b1L << O.THR_LOCAL_RANDOM.nextInt(n);
			// O.l("mask=" + B32va.str16((int) mask) + O.S32 + CLASS_THIS);
			// O.l("mask=" + B64IntoB6.toStrInInt32ByB64IntoB6(mask) + O.S32 + CLASS_THIS);
			if ((b64 & mask) != 0b0L) {

				retB64IntoB6 = (retB64IntoB6 << B64IntoB6.$6) | (long) (B64va.log2OfLowest1(mask) + 1);
				// O.l("retB64IntoB6=" + B64IntoB6.toStrInInt32ByB64IntoB6(retB64IntoB6) + O.S32 + CLASS_THIS);

				b64 = b64 ^ mask;

				// O.l("b64=" + B32va.str16((int) b64) + O.S32 + CLASS_THIS);
				i++;

			}

		} while (i != k);

		return retB64IntoB6;

	}

	/**
	 * To pick n elements randomly.<br/>
	 * The array length must be lte 62.<br/>
	 * To pick n elements randomly.<br/>
	 * The array length must be lte 62.<br/>
	 */
	public static int[] pickNRandomlyFrom(int[] ary32, int n) {// maxN = 63 or 62, aka shuffle

		long b64 = (0b1L << ary32.length) - 1L;

		final int[] retAry32 = new int[n];

		long mask;

		int i = 0;

		do {

			mask = 0b1L << O.THR_LOCAL_RANDOM.nextInt(ary32.length);
			// O.l("mask=" + B32va.str16((int) mask) + O.S32 + CLASS_THIS);
			// O.l("mask=" + B64IntoB6.toStrInInt32ByB64IntoB6(mask) + O.S32 + CLASS_THIS);

			if ((b64 & mask) != 0b0L) {

				retAry32[i++] = ary32[B64va.log2OfLowest1(mask)];
				// O.l("retB64IntoB6=" + B64IntoB6.toStrInInt32ByB64IntoB6(retB64IntoB6) + O.S32 + CLASS_THIS);

				b64 = b64 ^ mask;

				// O.l("b64=" + B32va.str16((int) b64) + O.S32 + CLASS_THIS);

			}

		} while (i != n);

		return retAry32;

	}

	/**
	 * To pick n elements randomly.<br/>
	 * The array length must be lte 62.<br/>
	 * To pick n elements randomly.<br/>
	 * The array length must be lte 62.<br/>
	 */
	public static long[] pickNRandomlyFrom(long[] ary, int n) {// maxN = 63 or 62, aka shuffle

		long b64 = (0b1L << ary.length) - 1L;

		final long[] retAry = new long[n];

		long mask;

		int i = 0;

		do {

			mask = 0b1L << O.THR_LOCAL_RANDOM.nextInt(n);
			// O.l("mask=" + B32va.str16((int) mask) + O.S32 + CLASS_THIS);
			// O.l("mask=" + B64IntoB6.toStrInInt32ByB64IntoB6(mask) + O.S32 + CLASS_THIS);

			if ((b64 & mask) != 0b0L) {

				retAry[i++] = ary[B64va.log2OfLowest1(mask)];
				// O.l("retB64IntoB6=" + B64IntoB6.toStrInInt32ByB64IntoB6(retB64IntoB6) + O.S32 + CLASS_THIS);

				b64 = b64 ^ mask;

				// O.l("b64=" + B32va.str16((int) b64) + O.S32 + CLASS_THIS);

			}

		} while (i != n);

		return retAry;

	}

	/**
	 * To pick n elements randomly.<br/>
	 * The array length must be lte 62.<br/>
	 * To pick n elements randomly.<br/>
	 * The array length must be lte 62.<br/>
	 */
	public static String[] pickNRandomlyFrom(String[] sAry, int n) {

		long b64 = (0b1L << sAry.length) - 1L;

		final String[] retSAry = new String[n];

		long mask;

		int i = 0;

		do {

			mask = 0b1L << O.THR_LOCAL_RANDOM.nextInt(n);
			// O.l("mask=" + B32va.str16((int) mask) + O.S32 + CLASS_THIS);
			// O.l("mask=" + B64IntoB6.toStrInInt32ByB64IntoB6(mask) + O.S32 + CLASS_THIS);

			if ((b64 & mask) != 0b0L) {

				retSAry[i++] = sAry[B64va.log2OfLowest1(mask)];
				// O.l("retB64IntoB6=" + B64IntoB6.toStrInInt32ByB64IntoB6(retB64IntoB6) + O.S32 + CLASS_THIS);

				b64 = b64 ^ mask;

				// O.l("b64=" + B32va.str16((int) b64) + O.S32 + CLASS_THIS);

			}

		} while (i != n);

		return retSAry;

	}

}
