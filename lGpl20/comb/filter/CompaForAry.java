package lGpl20.comb.filter;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * 64 位元整數陣列比較器.<br/>
 * The comparator of long[].
 * 
 * @version 2019/03/14_14:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaForAry" >CompaForAry.java</a>
 * 
 */
public class CompaForAry implements Comparator<long[]>, Serializable {

	private static final Class<CompaForAry> CLASS_THIS = CompaForAry.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public int compare(long[] ary1, long[] ary2) {// todo: ary1.length maybe not equals to ary2.length

		int len1 = ary1.length;
		int len2 = ary2.length;

		long n1;
		long n2;

		if (len1 > len2) {

			for (int i = 0; i != len2; i++) {

				n1 = ary1[i];
				n2 = ary2[i];

				if (n1 > n2) {

					return 1;

				}

				if (n1 < n2) {

					return -1;

				}

			}

			return 1;

		}

		if (len1 < len2) {

			for (int i = 0; i != len1; i++) {

				n1 = ary1[i];
				n2 = ary2[i];

				if (n1 > n2) {

					return 1;

				}

				if (n1 < n2) {

					return -1;

				}

			}

			return -1;

		}

		// if (len1 == len2) {

		for (int i = 0; i != len1; i++) {

			n1 = ary1[i];
			n2 = ary2[i];

			if (n1 > n2) {

				return 1;

			}

			if (n1 < n2) {

				return -1;

			}

		}

		return 0;

	}

	/**
	 * To compare.<br/>
	 * To compare.
	 */
	public static int compa(long[] ary1, long[] ary2) {

		int len1 = ary1.length;
		int len2 = ary2.length;

		long n1;
		long n2;

		if (len1 > len2) {

			for (int i = 0; i != len2; i++) {

				n1 = ary1[i];
				n2 = ary2[i];

				if (n1 > n2) {

					return 1;

				}

				if (n1 < n2) {

					return -1;

				}

			}

			return 1;

		}

		if (len1 < len2) {

			for (int i = 0; i != len1; i++) {

				n1 = ary1[i];
				n2 = ary2[i];

				if (n1 > n2) {

					return 1;

				}

				if (n1 < n2) {

					return -1;

				}

			}

			return -1;

		}

		// if (len1 == len2) {

		for (int i = 0; i != len1; i++) {

			n1 = ary1[i];
			n2 = ary2[i];

			if (n1 > n2) {

				return 1;

			}

			if (n1 < n2) {

				return -1;

			}

		}

		return 0;

	}

}