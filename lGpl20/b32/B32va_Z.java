package lGpl20.b32;

import lGpl20.o.O;

/**
 * @version 2019/04/16_17:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B32va_Z" >B32va_Z.java</a>
 * 
 * @see B32va
 */
public abstract class B32va_Z extends B32va_W {

	private static final Class<B32va_Z> CLASS_THIS = B32va_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder from String array via bit32.<br/>
	 * To StringBuilder from String array via bit32.
	 */
	public static StringBuilder toStrByLog2OfLowest1AtB32BySAry(int b32As2Pow, String[] sAry) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		// int theIndex = Integer.highestOneBit(n);
		int mask32 = 0b1;
		int temp32;

		do {

			temp32 = b32As2Pow & mask32;
			mask32 = mask32 << 1;// fuck
			// O.l("temp32=" + str16(temp32) + O.S32 + CLASS_THIS);
			// O.l("========" + O.S32 + CLASS_THIS);

			if (mask32 > b32As2Pow) {// terminate

				if (temp32 != 0b0) {// its necessary

					retStr.append(sAry[log2OfLowest1(temp32)]);

				}

				return retStr;

			} else {

				if (temp32 != 0b0) {// its necessary

					retStr.append(sAry[log2OfLowest1(temp32)]).append(O.C44);

				}

			}

		} while (true);

	}

}