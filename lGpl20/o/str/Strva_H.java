package lGpl20.o.str;

import lGpl20.o.O;

/**
 * @version 2018/10/30_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Strva_H" >Strva_H.java</a>
 * 
 * @see Strva_J
 */
public abstract class Strva_H extends Strva_C {

	private static final Class<Strva_H> CLASS_THIS = Strva_H.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 把陣列轉成字串建立者.<br/>
	 * To convert the array to StringBuilder.
	 */
	public static StringBuilder toStr(long[] ary, int from, int to) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = from; i < to;) {

			retStr.append(ary[i]);

			if (++i < to) {

				retStr.append(O.STR_C44C32);

			}

		}

		return retStr;

	}

	/**
	 * 把陣列轉成字串建立者.<br/>
	 * To convert the array to StringBuilder.
	 */
	public static StringBuilder toStr(long[] ary, int from, int to, int numOfWordPerLine, CharSequence lineWr) {

		if (numOfWordPerLine <= 0) {

			return toStr(ary, from, to);

		}

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		int countOfWordInLine = 0;
		for (int i = from; i < to;) {

			retStr.append(ary[i]);

			if (++i < to) {

				retStr.append(O.STR_C44C32);

			} else {

				return retStr;

			}

			if (++countOfWordInLine == numOfWordPerLine) {

				retStr.append(lineWr);
				countOfWordInLine = 0;

			}

		}

		return retStr;

	}

	/**
	 * 把陣列轉成字串建立者, 降序排列.<br/>
	 * To convert the array to StringBuilder in descending order.
	 */
	public static StringBuilder toStrDesc(long[] ary, int numOfWordPerLine, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		int countOfWordInLine = 0;
		for (int i = ary.length - 1; i >= 0; i--) {

			retStr.append(ary[i]).append(O.STR_C44C32);

			if (++countOfWordInLine == numOfWordPerLine) {

				retStr.append(lineWr);
				countOfWordInLine = 0;

			}

		}

		int lenOfStr = retStr.length();
		if (lenOfStr > 1) {

			retStr.delete(retStr.lastIndexOf(O.S44), lenOfStr);

		}

		return retStr;

	}

	/**
	 * 把陣列轉成字串建立者.<br/>
	 * To convert the array to StringBuilder.
	 */
	public static StringBuilder toStr(int[] ary32, int from, int to) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = from; i < to;) {

			retStr.append(ary32[i]);

			if (++i < to) {

				retStr.append(O.STR_C44C32);

			}

		}

		return retStr;

	}

	/**
	 * 把陣列轉成字串建立者.<br/>
	 * To convert the array to StringBuilder.
	 */
	public static StringBuilder toStr(int[] ary32, int from, int to, int numOfWordPerLine, CharSequence lineWr) {

		if (numOfWordPerLine <= 0) {

			return toStr(ary32, from, to);

		}

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		int countOfWordInLine = 0;
		for (int i = from; i < to;) {

			retStr.append(ary32[i]);

			if (++i < to) {

				retStr.append(O.STR_C44C32);

			} else {

				return retStr;

			}

			if (++countOfWordInLine == numOfWordPerLine) {

				retStr.append(lineWr);
				countOfWordInLine = 0;

			}

		}

		return retStr;

	}

}
