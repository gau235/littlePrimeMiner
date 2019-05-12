package lGpl20.comb.stirlingNum2;

import lGpl20.b32.B32va;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.S;
import lGpl20.o.str.Strva;
import lGpl20.other.jsp.Jsp;

/**
 * @version 2019/04/28_14:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S2va_Z" >S2va_Z.java</a>
 * 
 * @see S2va
 */
public abstract class S2va_Z extends S2va_U {

	private static final Class<S2va_Z> CLASS_THIS = S2va_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder from String ary via bit32.<br/>
	 * To StringBuilder from String ary via bit32.
	 */
	public static StringBuilder toHtmlRowStrByB32As2PowBySAry(int b32As2Pow, String[] sAry) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		if (b32As2Pow == 0b0) {

			return retStr.append(Jsp.C_A_6_HTML_BLANK);

		}

		int mask32 = 0b1;
		int temp32;
		int count = 0;

		do {

			temp32 = b32As2Pow & mask32;
			mask32 = mask32 << 1;// fuck

			if (mask32 > b32As2Pow) {// terminate

				if (temp32 != 0b0) {

					retStr.append(sAry[B32va.log2OfLowest1(temp32)]).append(O.C32);

				}

				return retStr;

			} else {

				if (temp32 != 0b0) {

					retStr.append(sAry[B32va.log2OfLowest1(temp32)]).append(O.C32);

					if (++count == Strva.numOfWordPerLineForS2) {

						retStr.append(Jsp.BR);
						count = 0;

					}

				}

			}

		} while (true);

	}

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toStrByEryOfAryOfB32As2PowBySAry(Ery<int[]> eryOfAryOfB32As2Pow, String[] sAry,
			CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		Object[] objAry = eryOfAryOfB32As2Pow.trim().aryOfElem();// fuck
		int[] ary32;

		for (int iObjAry = 0; iObjAry != objAry.length;) {

			ary32 = (int[]) objAry[iObjAry];
			retStr.append(O.C91);

			for (int iAry32 = 0; iAry32 != ary32.length;) {

				retStr.append(B32va.toStrByLog2OfLowest1AtB32BySAry(ary32[iAry32], sAry));

				if (++iAry32 != ary32.length) {

					retStr.append(O.C124);

				}

			}

			retStr.append(O.C93);

			if (++iObjAry != objAry.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toHtmlStrByAryOfB32As2PowBySAry(Ery<int[]> eryOfAry32, String[] sAry, CharSequence lineWr,
			CharSequence sHtmlClass) {// called by S2, c322.jsp

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		Object[] objAry = eryOfAry32.trim().aryOfElem();// fuck
		int[] ary32;

		S strHtmlStart = new S().a("<table class=\"").a(sHtmlClass).a("\" ><thead><tr><td>");
		S strHtmlStartTail = new S().a("</td></tr></thead><tr><td>");

		for (int iObjAry = 0; iObjAry != objAry.length;) {

			ary32 = (int[]) objAry[iObjAry];

			retStr.append(strHtmlStart.str).append(iObjAry + 1).append(strHtmlStartTail.str);

			for (int iAry32 = 0; iAry32 != ary32.length;) {

				retStr.append(toHtmlRowStrByB32As2PowBySAry(ary32[iAry32], sAry));

				if (++iAry32 != ary32.length) {

					retStr.append(Strva.STR_HTML_MIDDLE_TD);

				}

			}

			retStr.append(Strva.STR_HTML_TABLE_END);

			if (++iObjAry != objAry.length) {

				retStr.append(lineWr);

				if (iObjAry == Strva.int32MaxRowForHtml) {

					return retStr;

				}

			}

		}

		return retStr;

	}

}
