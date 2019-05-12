package lGpl20.o.ery;

import lGpl20.o.O;

/**
 * @version 2018/05/21_10:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Aryva_J" >Aryva_J.java</a>
 * 
 * @see Aryva_Z
 */
public abstract class Aryva_J extends Aryva_C {

	private static final Class<Aryva_J> CLASS_THIS = Aryva_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The sum of long[].<br/>
	 * The sum of long[].
	 */
	public static long sum(long[] ary) {

		long sum = 0L;

		for (int i = 0; i != ary.length; i++) {

			sum = sum + ary[i];

		}

		return sum;

	}

	/**
	 * To sum.<br/>
	 * To sum.
	 */
	public static long sum(long[] ary, int from, int to) {

		long ans = 0L;

		for (int i = from; i < to; i++) {

			ans = ans + ary[i];

		}

		return ans;

	}

	/**
	 * The sum of long[][].<br/>
	 * The sum of long[][].
	 */
	public static long sumOfAry2D(long[][] ary2D) {

		long sum = 0;

		for (int i1 = 0; i1 < ary2D.length; i1++) {

			long[] temAry = ary2D[i1];

			for (int i2 = 0; i2 < temAry.length; i2++) {

				sum = sum + temAry[i2];

			}

		}

		return sum;

	}

}
