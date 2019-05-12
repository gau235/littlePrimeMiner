package lGpl20.recycle;

import java.io.Serializable;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.other.jsp.Jsp;
import lGpl20.prime64.ery.EryOfPrimeAry;

/**
 * 本類別字串娃.<br/>
 * <br/>
 * My girl to handle the string.
 * 
 * @version 2017/01/04_18:27:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyStrvaForJsp" >MyStrvaForJsp.java</a>
 * 
 */
public abstract class MyStrvaForJsp implements Serializable {

	private static final Class<MyStrvaForJsp> CLASS_THIS = MyStrvaForJsp.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 生成欲顯示文字 .<br/>
	 * To generate the str of the summary of the paragraph.
	 */
	public static StringBuilder genRangedStrAsSummary(StringBuilder strN1, StringBuilder strN2, StringBuilder strTotalPrime,
			StringBuilder strTimeCost) {

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		// str.a(Jsp.L);
		str.append(Jsp.C_A_3_HTML_BLANK);
		str.append(strN1);
		str.append(Jsp.C_A_3_HTML_BLANK);
		str.append(O.C126);
		str.append(Jsp.C_A_3_HTML_BLANK);
		str.append(strN2);
		str.append(Jsp.C_A_3_HTML_BLANK);

		str.append("<a href=\"doMinePrime.jsp?from=" + strN1 + "&amp;to=" + strN2 + "\" "
				+ "target=\"_blank\" style=\"color:#000000;\" >" + strTotalPrime + "&nbsp;p</a>");

		str.append(Jsp.C_A_3_HTML_BLANK);
		str.append(strTimeCost);
		str.append(Jsp.C_A_HTML_BLANK);
		str.append(O.C115);
		str.append(Jsp.L);
		str.append(Jsp.L);

		return str;

	}

	/**
	 * 生成欲顯示文字 .<br/>
	 * To generate the text to show.
	 */
	public static StringBuilder genRangedStrToShowFromPrimeAry(long[] primeAry, float timeCost) {

		StringBuilder strN1, strN2, strTotalPrime, strTimeCost;
		int len = primeAry.length;
		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		if (len > 0) {

			long tailPrime = primeAry[len - 1];

			strN1 = SByN.f(primeAry[0]);
			strN2 = SByN.f(tailPrime);
			strTotalPrime = SByN.f(len);
			strTimeCost = new StringBuilder(String.format(SByN.REGEX_FLOAT, timeCost));

			str.append(genRangedStrAsSummary(strN1, strN2, strTotalPrime, strTimeCost));

		}

		return str;

	}

	/**
	 * To gen str to show.<br/>
	 * To gen str to show.
	 */
	public static StringBuilder genRangedStrToShowFromEryOfPrimeAry(EryOfPrimeAry eryOfPrimeAry, float timeCost) {

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		int index = eryOfPrimeAry.len() - 1;
		int indexToRec = index;
		int indexViewed = eryOfPrimeAry.indexViewed;

		for (; index > indexViewed; index--) {

			long[] primeAry = eryOfPrimeAry.at(index);

			str.append(genRangedStrToShowFromPrimeAry(primeAry, timeCost));

		}

		eryOfPrimeAry.indexViewed = indexToRec;// fuck

		return str;

	}

}
