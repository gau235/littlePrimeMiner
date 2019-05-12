package lGpl20.o;

import static java.lang.System.out;

/**
 * @version 2018/04/08_17:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_M" >O_M.java</a>
 * 
 * @see O_V
 */
public abstract class O_M extends O_L {

	private static final Class<O_M> CLASS_THIS = O_M.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(boolean b) {

		out.println(b);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(int int32) {

		out.println(int32);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(long n) {

		out.println(n);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(float f32) {

		out.println(f32);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(double f64) {

		out.println(f64);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(char c) {

		out.println(c);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(int[] ary32) {

		StringBuilder retStr = new StringBuilder(DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != ary32.length;) {

			retStr.append(ary32[i]);

			if (++i != ary32.length) {

				retStr.append(C_A_L);

			}

		}

		out.println(retStr);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(long[] ary) {

		StringBuilder retStr = new StringBuilder(DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != ary.length;) {

			retStr.append(ary[i]);

			if (++i != ary.length) {

				retStr.append(C_A_L);

			}

		}

		out.println(retStr);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(char[] charAry) {

		StringBuilder retStr = new StringBuilder(DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != charAry.length;) {

			retStr.append(charAry[i]);

			if (++i != charAry.length) {

				retStr.append(C_A_L);

			}

		}

		out.println(retStr);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(StringBuilder[] strAry) {

		StringBuilder retStr = new StringBuilder(DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != strAry.length;) {

			retStr.append(strAry[i]);

			if (++i != strAry.length) {

				retStr.append(C_A_L);

			}

		}

		out.println(retStr);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(String[] sAry) {

		StringBuilder retStr = new StringBuilder(DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != sAry.length;) {

			retStr.append(sAry[i]);

			if (++i != sAry.length) {

				retStr.append(C_A_L);

			}

		}

		out.println(retStr);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(String s) {

		out.println(s);

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l(Object obj) {

		out.println(String.valueOf(obj));

	}

	/**
	 * 印出文字.<br/>
	 * To print line.
	 */
	public static void l() {

		out.println();

	}

}
