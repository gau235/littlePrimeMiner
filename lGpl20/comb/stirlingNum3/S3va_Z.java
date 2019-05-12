package lGpl20.comb.stirlingNum3;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.S;
import lGpl20.o.str.Strva;
import lGpl20.other.jsp.Jsp;

/**
 * @version 2019/04/25_13:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S3va_Z" >S3va_Z.java</a>
 * 
 * @see S3va
 */
public abstract class S3va_Z extends S3va_U {

	private static final Class<S3va_Z> CLASS_THIS = S3va_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To string by B64IntoB6.<br/>
	 * To string by B64IntoB6.
	 */
	public static StringBuilder toHtmlRowStrByB64IntoB6(long b64IntoB6, String[] sAry) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		if (b64IntoB6 == 0L) {

			return retStr.append(Jsp.C_A_6_HTML_BLANK);

		}

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);
		// O.l("revAgainstB6NShiftR=" +str24(b64IntoB6));

		int count = 0;

		do {

			// O.l("value32=" + value32 + O.S32 + CLASS_THIS);
			retStr.append(sAry[(((int) b64IntoB6) & B64IntoB6.MASK32) - 1]).append(O.C32);

			if ((b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6) == 0b0L) {

				return retStr;

			} else {

				if (++count == Strva.numOfWordPerLineForS2) {

					retStr.append(Jsp.BR);
					count = 0;

				}

			}

		} while (true);

	}

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toStrByEryOfAryOfB64IntoB6BySAry(Ery<long[]> eryOfAry, String[] sAry, CharSequence lineWr) {

		// call by StirlingNum1

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		Object[] objAry = eryOfAry.trim().aryOfElem();

		long[] ary;

		for (int iObjAry = 0; iObjAry != objAry.length;) {

			ary = (long[]) objAry[iObjAry];
			retStr.append(O.C91);

			for (int iAry = 0; iAry != ary.length;) {

				retStr.append(B64IntoB6.toStrByValMinus1InB6Cell(ary[iAry], sAry));

				if (++iAry != ary.length) {

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
	public static StringBuilder toHtmlStrByEryOfAryOfB64IntoB6BySAry(Ery<long[]> eryOfAry, String[] sAry, CharSequence lineWr,
			CharSequence sHtmlClass) {// called by S1, c321.jsp

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		Object[] objAry = eryOfAry.trim().aryOfElem();// fuck
		long[] ary;

		S strHtmlStart = new S().a("<table class=\"").a(sHtmlClass).a("\" ><thead><tr><td>");
		S strHtmlStartTail = new S().a("</td></tr></thead><tr><td>");

		for (int iObjAry = 0; iObjAry != objAry.length;) {

			ary = (long[]) objAry[iObjAry];

			retStr.append(strHtmlStart.str).append(iObjAry + 1).append(strHtmlStartTail.str);

			for (int iAry = 0; iAry != ary.length;) {

				retStr.append(toHtmlRowStrByB64IntoB6(ary[iAry], sAry));

				if (++iAry != ary.length) {

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
