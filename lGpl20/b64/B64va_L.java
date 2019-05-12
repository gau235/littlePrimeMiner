package lGpl20.b64;

import lGpl20.o.O;

/**
 * @version 2019/02/21_11:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64va_L" >B64va_L.java</a>
 * 
 * @see B64va_Y
 */
public abstract class B64va_L extends B64va_E {

	private static final Class<B64va_L> CLASS_THIS = B64va_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder from String array via bit64.<br/>
	 * To StringBuilder from String array via bit64.
	 */
	public static StringBuilder toStrByLog2OfLowest1AtB64BySAry(long b64As2Pow, String[] sAry) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		long maskB64 = 0b1L;
		long tempB64;

		do {

			tempB64 = b64As2Pow & maskB64;
			maskB64 = maskB64 << 1;// fuck
			// O.l("temp32=" + str16(temp32) + O.S32 + CLASS_THIS);
			// O.l("========" + O.S32 + CLASS_THIS);

			if (b64As2Pow < maskB64) {// terminate

				if (tempB64 != 0b0L) {// its necessary

					retStr.append(sAry[B64va.log2OfLowest1(tempB64)]);

				}

				return retStr;

			} else {

				if (tempB64 != 0b0L) {// its necessary

					retStr.append(sAry[B64va.log2OfLowest1(tempB64)]).append(O.C44);

				}

			}

		} while (true);

	}

}
