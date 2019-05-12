package lGpl20.comb.filter;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * 32 位元整數陣列比較器.<br/>
 * The comparator of int[].
 * 
 * @version 2019/03/14_14:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaForAry32" >CompaForAry32.java</a>
 * 
 */
public class CompaForAry32 implements Comparator<int[]>, Serializable {

	private static final Class<CompaForAry32> CLASS_THIS = CompaForAry32.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public int compare(int[] ary32_1, int[] ary32_2) {// ary32_1.length is equal to ary32_2.length

		int len1 = ary32_1.length;
		int len2 = ary32_2.length;

		int n1;
		int n2;

		if (len1 > len2) {

			for (int i = 0; i != len2; i++) {

				n1 = ary32_1[i];
				n2 = ary32_2[i];

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

				n1 = ary32_1[i];
				n2 = ary32_2[i];

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

			n1 = ary32_1[i];
			n2 = ary32_2[i];

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
	public static int compa(int[] ary32_1, int[] ary32_2) {

		int len1 = ary32_1.length;
		int len2 = ary32_2.length;

		int n1;
		int n2;

		if (len1 > len2) {

			for (int i = 0; i != len2; i++) {

				n1 = ary32_1[i];
				n2 = ary32_2[i];

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

				n1 = ary32_1[i];
				n2 = ary32_2[i];

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

			n1 = ary32_1[i];
			n2 = ary32_2[i];

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