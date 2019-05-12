package lGpl20.o;

/**
 * @version 2019/03/15_18:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_E" >O_E.java</a>
 * 
 * @see O_G
 */
public abstract class O_E extends O_C {

	private static final Class<O_E> CLASS_THIS = O_E.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The power of.<br/>
	 * The power of.
	 */
	public static long pow(long base, int pow) {

		if (pow < 0) {

			O.x("pow=" + pow);

		}

		long ans = 1L;

		for (int i = 0; i != pow; i++) {

			ans = ans * base;

		}

		return ans;

	}

	/**
	 * 以 2 為底取 log.<br/>
	 * To log with base 2.
	 */
	public static int log2(long n) {

		if (n < 1L) {

			O.x();

		}

		int i = 0;

		for (; n > 1L; i++) {

			n = n >>> 1;

		}

		return i;

	}

	/**
	 * 以 2 為底取 log.<br/>
	 * To log with base 2.
	 */
	public static int log2(int n) {

		if (n < 1) {

			O.x();

		}

		int i = 0;

		for (; n > 1; i++) {

			n = n >>> 1;

		}

		return i;

	}

}
