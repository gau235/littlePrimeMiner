package lGpl20.comb.filter;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * StringBuilder 比較器.<br/>
 * The comparator of long[].
 * 
 * @version 2019/03/14_14:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaForStr" >CompaForStr.java</a>
 * 
 */
public class CompaForStr implements Comparator<StringBuilder>, Serializable {

	private static final Class<CompaForStr> CLASS_THIS = CompaForStr.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public int compare(StringBuilder str1, StringBuilder str2) {

		int len1 = str1.length();
		int len2 = str2.length();

		char[] cAry1 = new char[len1];
		char[] cAry2 = new char[len2];

		str1.getChars(0, len1, cAry1, 0);
		str2.getChars(0, len2, cAry2, 0);

		char c1;
		char c2;

		if (len1 > len2) {

			for (int i = 0; i != len2; i++) {

				c1 = cAry1[i];
				c2 = cAry2[i];

				if (c1 > c2) {

					return 1;

				}

				if (c1 < c2) {

					return -1;

				}

			}

			return 1;

		}

		if (len1 == len2) {

			for (int i = 0; i != len1; i++) {

				c1 = cAry1[i];
				c2 = cAry2[i];

				if (c1 > c2) {

					return 1;

				}

				if (c1 < c2) {

					return -1;

				}

			}

			return 0;

		}

		// if (len1 < len2) {

		for (int i = 0; i != len1; i++) {

			c1 = cAry1[i];
			c2 = cAry2[i];

			if (c1 > c2) {

				return 1;

			}

			if (c1 < c2) {

				return -1;

			}

		}

		return -1;

	}

	/**
	 * To compare.<br/>
	 * To compare.
	 */
	public static int compa(StringBuilder str1, StringBuilder str2) {

		int len1 = str1.length();
		int len2 = str2.length();

		char[] cAry1 = new char[len1];
		char[] cAry2 = new char[len2];

		str1.getChars(0, len1, cAry1, 0);
		str2.getChars(0, len2, cAry2, 0);

		char c1;
		char c2;

		if (len1 > len2) {

			for (int i = 0; i != len2; i++) {

				c1 = cAry1[i];
				c2 = cAry2[i];

				if (c1 > c2) {

					return 1;

				}

				if (c1 < c2) {

					return -1;

				}

			}

			return 1;

		}

		if (len1 < len2) {

			for (int i = 0; i != len1; i++) {

				c1 = cAry1[i];
				c2 = cAry2[i];

				if (c1 > c2) {

					return 1;

				}

				if (c1 < c2) {

					return -1;

				}

			}

			return -1;

		}

		// if (len1 == len2) {

		for (int i = 0; i != len1; i++) {

			c1 = cAry1[i];
			c2 = cAry2[i];

			if (c1 > c2) {

				return 1;

			}

			if (c1 < c2) {

				return -1;

			}

		}

		return 0;

	}

}