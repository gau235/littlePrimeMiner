package lGpl20.shareWXyz;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.str.Strva;
import lGpl20.other.jsp.Jsp;

/**
 * @version 2019/04/17_08:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWGo_Z" >ShWGo_Z.java</a>
 *
 * @see ShWGo
 */
public abstract class ShWGo_Z extends ShWGo_Y {

	private static final Class<ShWGo_Z> CLASS_THIS = ShWGo_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder by B64IntoB6.<br/>
	 * To StringBuilder by B64IntoB6.
	 */
	public static StringBuilder toHtmlStrToHWHeadS(long b64IntoB6, int min, StringBuilder strHeadRow) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		retStr.append(strHeadRow).append(O.C_A_L);

		retStr.append("<tr><td>");

		final int diff32 = min - 1;
		int value32;

		do {

			value32 = ((int) b64IntoB6) & B64IntoB6.MASK32;
			retStr.append(value32 + diff32);

			if ((b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6) == 0b0L) {

				retStr.append("</td></tr>");

				return retStr;

			} else {

				retStr.append(Strva.STR_HTML_MIDDLE_TD);

			}

		} while (true);

	}

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toHtmlStrToHWHeadSByAryOfB64IntoB6(long[] aryOfB64IntoB6, int min, String[] sAryForHead,
			CharSequence sHtmlClass) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		final StringBuilder strTHead = new StringBuilder("<table class=\"").append(sHtmlClass).append("\" ><thead><tr><td>");
		final StringBuilder strTHeadEnd = new StringBuilder("</td></tr></thead>").append(O.C_A_L);

		final StringBuilder strHeadRow = new StringBuilder("<tr><td>");
		for (int i = 0; true;) {

			strHeadRow.append(sAryForHead[i]);

			if (++i != sAryForHead.length) {

				strHeadRow.append(Strva.STR_HTML_MIDDLE_TD);

			} else {

				strHeadRow.append("</td></tr>");

				break;

			}

		}

		for (int i = 0; i != aryOfB64IntoB6.length;) {

			retStr.append(strTHead).append(i + 1).append(strTHeadEnd);
			retStr.append(toHtmlStrToHWHeadS(aryOfB64IntoB6[i], min, strHeadRow));
			retStr.append("</table>");

			if (++i != aryOfB64IntoB6.length) {

				retStr.append(Jsp.L);

				if (i == Strva.int32MaxRowForHtml) {

					return retStr;

				}

			}

		}

		return retStr;

	}

}
