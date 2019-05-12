package lGpl20.divIntoHeap;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2019/03/24_21:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DiIGo" >DiIGo.java</a>
 * 
 * @see DiIGo
 */
public abstract class DiIGo_Z extends DiIGo_R {

	private static final Class<DiIGo_Z> CLASS_THIS = DiIGo_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To adjust.<br/>
	 * To adjust.
	 */
	public static long adjustByMinNRevAgainstB6FromR(long b64IntoB6, int min) {

		// O.l("here=" + O.S32 + CLASS_THIS);

		int diff32 = min - 1;
		long retB64IntoB6 = 0b0L;

		int val32;
		do {

			val32 = (((int) b64IntoB6) & B64IntoB6.MASK32) + diff32;

			retB64IntoB6 = retB64IntoB6 | (long) val32;

			if ((b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6) == 0b0L) {

				return retB64IntoB6;

			} else {

				retB64IntoB6 = retB64IntoB6 << B64IntoB6.$6;

			}

			// O.l("here22=" + O.S32 + CLASS_THIS);

		} while (true);

	}

}
