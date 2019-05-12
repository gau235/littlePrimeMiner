package lGpl20.comb;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.str.Strva;
import lGpl20.other.jsp.Jsp;

/**
 * @version 2019/04/16_17:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Pva_Z" >Pva_Z.java</a>
 * 
 * @see Pva
 */
public abstract class Pva_Z extends Pva_W {

	private static final Class<Pva_Z> CLASS_THIS = Pva_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder by B64IntoB6.<br/>
	 * To StringBuilder by B64IntoB6.
	 */
	public static StringBuilder toHtmlStrWHeadSToP(long b64IntoB6, String[] sAry, StringBuilder strHead) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		// if (b64IntoB6 != 0b0L) {
		//
		// O.l("b64IntoB6=" + b64IntoB6 + O.S32 + CLASS_THIS);
		//
		// }

		retStr.append(strHead).append(O.C_A_L);

		retStr.append("<tr><td>");

		int value32;

		do {

			value32 = ((int) b64IntoB6) & B64IntoB6.MASK32;
			retStr.append(sAry[value32 - 1]);

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
	public static StringBuilder toHtmlStrWHeadSToPByAryOfB64IntoB6(long[] aryOfB64IntoB6, String[] sAry, String[] sAryForHead,
			CharSequence sHtmlClass) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		final StringBuilder strHtmlStart = new StringBuilder("<table class=\"").append(sHtmlClass).append("\" ><thead><tr><td>");
		final StringBuilder strHtmlStart2 = new StringBuilder("</td></tr></thead>").append(O.C_A_L);

		final StringBuilder strHead = new StringBuilder("<tr><td>");
		int size32 = B64IntoB6.totalNone0B6CellFromR(aryOfB64IntoB6[0]);

		for (int i = 0; true;) {

			strHead.append(sAryForHead[i++]);

			if (i != size32) {

				strHead.append(Strva.STR_HTML_MIDDLE_TD);

			} else {

				strHead.append("</td></tr>");

				break;

			}

		}

		for (int i = 0; i != aryOfB64IntoB6.length;) {

			retStr.append(strHtmlStart).append(i + 1).append(strHtmlStart2);
			retStr.append(toHtmlStrWHeadSToP(aryOfB64IntoB6[i], sAry, strHead));
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
