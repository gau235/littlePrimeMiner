package lGpl20.comb.onto;

import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.S;
import lGpl20.o.str.Strva;

/**
 * @version 2019/04/28_19:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ontova_Z" >Ontova_Z.java</a>
 * 
 * @see Ontova
 */
public abstract class Ontova_Z extends Ontova_Y {

	private static final Class<Ontova_Z> CLASS_THIS = Ontova_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toHtmlStrWHeadSByAryOfB32As2PowBySAry(Ery<int[]> eryOfAry32, String[] sAry, String[] sAryForHead,
			CharSequence lineWr, CharSequence sHtmlClass) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		Object[] objAry = eryOfAry32.trim().aryOfElem();// fuck
		int[] ary32;

		S strHtmlStart = new S().a("<table class=\"").a(sHtmlClass).a("\" ><thead><tr><td>");
		S strHtmlStartTail = new S().a("</td></tr></thead>");

		final StringBuilder strHead = new StringBuilder("<tr><td>");
		int size32 = ((int[]) objAry[0]).length;

		// O.l("size32=" + size32 + O.S32 + CLASS_THIS);

		for (int i = 0; true;) {

			strHead.append(sAryForHead[i++]);

			if (i != size32) {

				strHead.append(Strva.STR_HTML_MIDDLE_TD);

			} else {

				strHead.append("</td></tr>");

				break;

			}

		}

		for (int iObjAry = 0; iObjAry != objAry.length;) {

			ary32 = (int[]) objAry[iObjAry];

			retStr.append(strHtmlStart.str).append(iObjAry + 1).append(strHtmlStartTail.str);

			retStr.append(strHead);

			retStr.append("<tr>");

			for (int iAry32 = 0; iAry32 != ary32.length;) {

				retStr.append("<td>").append(S2va.toHtmlRowStrByB32As2PowBySAry(ary32[iAry32], sAry));

				if (++iAry32 != ary32.length) {

					retStr.append("</td>");

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
