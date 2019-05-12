package lGpl20.other.uI;

import java.io.Serializable;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import lGpl20.o.O;
import lGpl20.o.keyNVal.Int64NObj;
import lGpl20.o.str.S;
import lGpl20.o.str.SByN;
import lGpl20.o.str.Strva;
import lGpl20.o.time.T64;
import lGpl20.other.jsp.Jsp;
import lGpl20.prime64.ery.EryOfPrimeAry;

/**
 * 本類別字串娃.<br/>
 * My girl to handle the string.
 * 
 * @version 2019/05/01_08:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyStrva" >MyStrva.java</a>
 * 
 */
public abstract class MyStrva implements Serializable {

	private static final Class<MyStrva> CLASS_THIS = MyStrva.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * My JTextArea.<br/>
	 * My JTextArea.
	 */
	public static JTextArea tempJTextArea = new JTextArea(480, 300);

	/**
	 * The count of index to show.<br/>
	 * The count of index to show.
	 */
	public static int BOUND32_OF_INDEX_TO_SHOW = 4096;

	/**
	 * The width of scrollBar of my JTextArea.<br/>
	 * The width of scrollBar of my JTextArea.
	 */
	public static int widthOfScrollBar = 20;

	/**
	 * Default capacity for StringBuilder.<br/>
	 * Default capacity for StringBuilder.
	 */
	public static final int DEF_CAPACITY32_FOR_STR = 0b1 << 15;// 8000 p * 1000 ary, every p is 20
	// public static final int DEF_CAPACITY32_FOR_STR = 64;

	/**
	 * If to show every prime.<br/>
	 * If to show every prime.
	 */
	public static boolean isToShowEveryPrime = true;

	/**
	 * 計算一列有多少個數.<br/>
	 * To count the number of String in every row.
	 */
	public static int countNumOfStringPerLine(long maxPrime, JTextArea jTextArea, int widthOfScrollBar) {

		StringBuilder singleStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR).append(maxPrime).append(O.C44).append(O.C32);

		int widthOfSingleString = SwingUtilities.computeStringWidth(jTextArea.getFontMetrics(jTextArea.getFont()),
				singleStr.toString());

		return (jTextArea.getWidth() - widthOfScrollBar) / widthOfSingleString;

	}

	/**
	 * To generate the head str.<br/>
	 * To generate the head str.
	 */
	public static StringBuilder genHeadStr() {

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
		str.append(O.C_A_L).append(O.C32).append(O.C32).append(O.C32).append(T64.toTimeStrWMilliSecWGmt()).append(O.C_A_L);

		return str;

	}

	/**
	 * 生成欲顯示文字 .<br/>
	 * To generate the str of the summary of the paragraph.
	 */
	public static StringBuilder genStrAsSummaryOfParagraph(StringBuilder strN1, StringBuilder strN2, StringBuilder strTotalPrime,
			StringBuilder strTimeCost) {

		S str = new S();

		str.a(O.C_A_L);
		str.a(O.C32);
		str.a(strN1);
		str.a(O.C32);
		str.a(O.C126);
		str.a(O.C32);
		str.a(strN2);
		str.a(O.C32);
		str.a(O.C32);
		str.a(O.C32);
		str.a(strTotalPrime);
		str.a(O.C32);
		str.a(O.C112);
		str.a(O.C32);
		str.a(O.C32);
		str.a(O.C32);
		str.a(strTimeCost);
		str.a(O.C32);
		str.a(O.C115);
		str.a(O.C_A_L);

		// O.l("genStrAsSummaryOfParagraph=" + O.L + str.str());

		return str.str;

	}

	/**
	 * 生成欲顯示文字 .<br/>
	 * To generate the text to show.
	 */
	public static StringBuilder genStrToShowFrom1PrimeAry(long[] primeAry, float timeCost) {

		StringBuilder strN1, strN2, strTotalPrime, strTimeCost;
		int len = primeAry.length;
		StringBuilder str = new StringBuilder(DEF_CAPACITY32_FOR_STR);

		if (len > 0) {

			long tailPrime = primeAry[len - 1];

			strN1 = SByN.f(primeAry[0]);
			strN2 = SByN.f(tailPrime);
			strTotalPrime = SByN.f(len);
			strTimeCost = new StringBuilder(String.format(SByN.REGEX_FLOAT, timeCost));

			str.append(genStrAsSummaryOfParagraph(strN1, strN2, strTotalPrime, strTimeCost));

			if (isToShowEveryPrime) {

				int numOfPrimeInRow = countNumOfStringPerLine(tailPrime, tempJTextArea, widthOfScrollBar);
				str.append(Strva.toStr(primeAry, 0, len, numOfPrimeInRow, O.L)).append(O.C_A_L);

			}

		}

		// O.l("genStrToShowFromPrimeAry=" + O.L + str);

		return str;

	}

	/**
	 * To gen str to show.<br/>
	 * To gen str to show.
	 */
	public static StringBuilder genStrToShowFromEryOfPrimeAry(EryOfPrimeAry eryOfPrimeAry, float timeCost) {

		StringBuilder str = new StringBuilder(DEF_CAPACITY32_FOR_STR);

		if (eryOfPrimeAry.tailPrime() == 0) {

			return str;

		}

		int index = eryOfPrimeAry.len() - 1;
		int indexToRec = index;
		int indexViewed = eryOfPrimeAry.indexViewed;

		for (; index > indexViewed; index--) {

			long[] aryOfPrime = eryOfPrimeAry.at(index);

			str.append(genStrToShowFrom1PrimeAry(aryOfPrime, timeCost));

		}

		eryOfPrimeAry.indexViewed = indexToRec;// fuck

		// O.l("genStrToShowFromEryOfPrimeAry=" + O.L + str);

		return str;

	}

	/**
	 * To get all not viewed in EryOfPrimeAry then to sort.<br/>
	 * To get all not viewed in EryOfPrimeAry then to sort.
	 */
	public static EryOfPrimeAry getAllNotViewedAryInEryOfPrimeAryNSort(EryOfPrimeAry[] aryOfEryOfPrimeAry) {

		final EryOfPrimeAry retBigEryOfPrimeAry = new EryOfPrimeAry();
		// final int upperBound = BOUND32_OF_INDEX_TO_SHOW / aryOfEryOfPrimeAry.length;
		// O.l("aryOfEryOfPrimeAry.len=" + aryOfEryOfPrimeAry.length + O.S32 + CLASS_THIS);
		// O.l("upperBound.len=" + upperBound + O.S32 + CLASS_THIS);
		EryOfPrimeAry theEryOfPrimeAry;
		int lenMinus1;

		int count32 = 0;
		long[] primeAry;

		for (int iBig = 0; (iBig < aryOfEryOfPrimeAry.length) && (count32 < BOUND32_OF_INDEX_TO_SHOW); iBig++) {

			theEryOfPrimeAry = aryOfEryOfPrimeAry[iBig];
			lenMinus1 = theEryOfPrimeAry.len() - 1;

			for (; (count32 < BOUND32_OF_INDEX_TO_SHOW)
					&& (theEryOfPrimeAry.indexViewed < lenMinus1); theEryOfPrimeAry.indexViewed++, count32++) {

				if (O.IS_TO_DEV) {

					primeAry = theEryOfPrimeAry.at(theEryOfPrimeAry.indexViewed + 1, CLASS_THIS);

				} else {

					primeAry = theEryOfPrimeAry.at(theEryOfPrimeAry.indexViewed + 1);

				}

				if (primeAry == null) {// for debug

					if (O.IS_TO_DEV) {

						S errS = new S();
						errS.lineWr = Jsp.L;

						errS.l(T64.toTimeStr() + O.S32 + CLASS_THIS);
						errS.l("primeAry=" + primeAry);
						errS.l("theEryOfPrimeAry.indexViewed=" + theEryOfPrimeAry.indexViewed);
						errS.l("lenMinus1=" + lenMinus1);
						errS.l("aryOfElem.len=" + theEryOfPrimeAry.aryOfElem().length);
						errS.l("primeAry=" + theEryOfPrimeAry.aryOfElem()[theEryOfPrimeAry.indexViewed]);
						errS.l("count32=" + count32 + O.S32 + CLASS_THIS);

						MyAide.sendHttpErr(errS.str, O.Z);

					}

					primeAry = O.ARY0;// fuck

				}

				retBigEryOfPrimeAry.a(primeAry);

			}

		}

		if (retBigEryOfPrimeAry.len() > 0) {

			retBigEryOfPrimeAry.sort();

		}

		return retBigEryOfPrimeAry;

	}

	/**
	 * To get tail prime and the str to show.<br/>
	 * To get tail prime and the str to show.
	 */
	public static Int64NObj<StringBuilder> getTailPrimeNStrToShowFromAryOfEryOfPrimeAry(EryOfPrimeAry[] aryOfEryOfPrimeAry, float timeCost) {

		EryOfPrimeAry bigEryOfPrimeAry = getAllNotViewedAryInEryOfPrimeAryNSort(aryOfEryOfPrimeAry);
		O.l("bigEryOfPrimeAry.len=" + bigEryOfPrimeAry.len() + O.S32 + CLASS_THIS);

		StringBuilder str = new StringBuilder(DEF_CAPACITY32_FOR_STR);

		long tailPrime = bigEryOfPrimeAry.tailPrime();
		if (tailPrime == 0L) {

			O.l("tailPrime=" + tailPrime + O.S32 + CLASS_THIS);

			return new Int64NObj<StringBuilder>(tailPrime, str);

		}

		str.append(genStrToShowFromEryOfPrimeAry(bigEryOfPrimeAry, timeCost));

		// O.l("getTailPrimeNStrToShowFromThrva=" + O.L + str);

		return new Int64NObj<StringBuilder>(tailPrime, str);

	}

	/**
	 * To get done str.<br/>
	 * To get done str.
	 */
	public static StringBuilder genAllThrTerminatedStr(StringBuilder strN1, StringBuilder strN2, StringBuilder strTotalPrime,
			StringBuilder strTimeCost) {

		S str = new S();

		str.a(O.C32);
		str.a(O.C32);
		str.a(strN1);
		str.a(O.C32);
		str.a(O.C126);
		str.a(O.C32);
		str.a(strN2);
		str.a(O.C32);
		str.a(O.C32);
		str.a(O.C32);
		str.a(strTotalPrime);
		str.a(O.C32);
		str.a(O.C112);
		str.a(O.C32);
		str.a(O.C32);
		str.a(O.C32);
		str.a(strTimeCost);
		str.a(O.C32);
		str.a(O.C115);
		str.a(O.C_A_L);

		return str.str;

	}

}
