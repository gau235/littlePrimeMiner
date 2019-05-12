package lGpl20.comb;

import lGpl20.b32.B32va;
import lGpl20.b64.B64va;
import lGpl20.o.O;

/**
 * @version 2019/04/16_19:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Cva_Y" >Cva_Y.java</a>
 * 
 * @see Cva_Z
 */
public abstract class Cva_Y extends Cva_V {

	private static final Class<Cva_Y> CLASS_THIS = Cva_Y.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toStrToCByB32As2PowBySAry(int[] ary32, String[] sAry, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != ary32.length;) {

			// StringBuilder strFromB32 = B32va.toStrByLog2OfLowest1AtB32BySAry(ary32[i], sAry);
			retStr.append(B32va.toStrByLog2OfLowest1AtB32BySAry(ary32[i], sAry));

			if (++i != ary32.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toStrToCByB64As2PowBySAry(long[] ary, String[] sAry, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != ary.length;) {

			// StringBuilder strFromB32 = B32va.toStrByLog2OfLowest1AtB32BySAry(ary32[i], sAry);
			retStr.append(B64va.toStrByLog2OfLowest1AtB64BySAry(ary[i], sAry));

			if (++i != ary.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

}
