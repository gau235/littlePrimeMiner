package lGpl20.b32;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2019/05/10_20:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ary32va_Z" >Ary32va_Z.java</a>
 * 
 * @see Ary32va
 */
public abstract class Ary32va_Z extends Ary32va_K {

	private static final Class<Ary32va_Z> CLASS_THIS = Ary32va_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To sum.<br/>
	 * To sum.
	 */
	public static long sum64(int[] ary32) {

		long ans = 0L;

		for (int i = 0; i != ary32.length; i++) {

			ans = ans + ary32[i];

		}

		return ans;

	}

	/**
	 * To sum.<br/>
	 * To sum.
	 */
	public static long sum64(int[] ary32, int from, int to) {

		long ans = 0L;

		for (int i = from; i < to; i++) {

			ans = ans + ary32[i];

		}

		return ans;

	}

	/**
	 * To add n to every element.<br/>
	 * To add n to every element.
	 */
	public static int[] addNToEvery(int[] ary32, int n) {

		for (int i = 0; i != ary32.length; i++) {

			ary32[i] = ary32[i] + n; 

		}

		return ary32;

	}

	/**
	 * To check if find.<br/>
	 * To check if find.
	 */
	public static int findFirstOccur(int[] ary32, int fromIndex, final int key32) {

		for (int i = fromIndex; i != ary32.length; i++) {

			if (ary32[i] == key32) {

				return i;

			}

		}

		return Integer.MIN_VALUE;

	}

	/**
	 * To check if find.<br/>
	 * To check if find.
	 * 
	 * @see B64IntoB6#findFirstOccurFromTail(long, int, int)
	 */
	public static int findFirstOccurFromTail(int[] ary32, int fromIndex, final int key32) {

		for (int i = fromIndex; i >= 0; i--) {

			if (ary32[i] == key32) {

				return i;

			}

		}

		return Integer.MIN_VALUE;

	}

}