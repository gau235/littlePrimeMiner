package lGpl20.b32;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2019/03/15_17:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B32va_C" >B32va_C.java</a>
 * 
 * @see B32va_M
 */
public abstract class B32va_J extends B32va_E {

	private static final Class<B32va_J> CLASS_THIS = B32va_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To retrieve.<br/>
	 * To retrieve.
	 * 
	 * @see B64IntoB6#countDup(long)
	 */
	public static long retrieveOccurFromKey1To63ByB64IntoB6(long b64IntoB6) {

		long retB64IntoB6 = 0b0L;

		for (int i = 0; i < 10; i++) {

			retB64IntoB6 = retB64IntoB6 | ((int) b64IntoB6 & B64IntoB6.MASK32);
			// O.l("i=" + i + ", value=" + retB64IntoB6);

			b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6;
			retB64IntoB6 = retB64IntoB6 << B64IntoB6.$6;

		}

		return retB64IntoB6;

	}

}
