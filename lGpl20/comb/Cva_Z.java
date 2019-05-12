package lGpl20.comb;

import lGpl20.b32.B32va;
import lGpl20.o.O;
import lGpl20.o.str.Strva;
import lGpl20.other.jsp.Jsp;

/**
 * @version 2019/04/16_17:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Cva_Z" >Cva_Z.java</a>
 * 
 * @see Cva
 */
public abstract class Cva_Z extends Cva_Y {

	private static final Class<Cva_Z> CLASS_THIS = Cva_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());


	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toHtmlStrToCByB32As2PowBySAry(int[] ary32, String[] sAry, CharSequence sHtmlClass) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		final StringBuilder strHtmlStart = new StringBuilder("<table class=\"").append(sHtmlClass).append("\" ><thead><tr><td>");
		final StringBuilder strHtmlStart2 = new StringBuilder("</td></tr></thead>").append(O.C_A_L);

		for (int i = 0; i != ary32.length;) {

			retStr.append(strHtmlStart).append(i + 1).append(strHtmlStart2);
			retStr.append("<tr><td>");
			retStr.append(B32va.toStrByLog2OfLowest1AtB32BySAry(ary32[i], sAry));
			retStr.append(Strva.STR_HTML_TABLE_END);

			if (++i != ary32.length) {

				retStr.append(Jsp.L);

				if (i == Strva.int32MaxRowForHtml) {

					return retStr;

				}

			}

		}

		return retStr;

	}

}
