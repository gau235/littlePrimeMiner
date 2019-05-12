package lGpl20.o.ery;

import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * @version 2017/02/27_19:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Aryva_C" >Aryva_C.java</a>
 * 
 * @see Aryva_J
 */
public abstract class Aryva_C extends Aryva_A {

	private static final Class<Aryva_C> CLASS_THIS = Aryva_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To extend length.<br/>
	 * To extend length.
	 */
	public static long[] extAryToLen32(long[] ary, int newLen) {

		long[] tempAry = new long[newLen];
		System.arraycopy(ary, 0, tempAry, 0, ary.length);

		return tempAry;

	}

	/**
	 * To extend length.<br/>
	 * To extend length.
	 */
	public static long[] extAryToLen32Mul2Plus1024(long[] ary) {

		// if (ary.length == Integer.MAX_VALUE) {
		//
		// throw new IndexOutOfBoundsException("ary.length=" + ary.length);
		//
		// }

		long len64 = ary.length;
		len64 = (len64 << 1) + Ranger.$2POW10;

		if (len64 > Integer.MAX_VALUE) {

			len64 = Integer.MAX_VALUE;

		}

		// O.l("len64=" + SByN.f(len64) + O.S32 + CLASS_THIS);

		long[] tempAry = new long[(int) len64];

		System.arraycopy(ary, 0, tempAry, 0, ary.length);

		return tempAry;

	}

}
