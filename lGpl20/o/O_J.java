package lGpl20.o;

/**
 * @version 2019/04/21_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_J" >O_J.java</a>
 * 
 * @see O_L
 */
public abstract class O_J extends O_G {

	private static final Class<O_J> CLASS_THIS = O_J.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Default capacity for StringBuilder.<br/>
	 * Default capacity for StringBuilder.
	 */
	public static final int DEF_CAPACITY32_FOR_STR = 128;

	/**
	 * For temp.<br/>
	 * For temp.
	 */
	public static int x;

	/**
	 * For temp.<br/>
	 * For temp.
	 */
	public static void x() {

		throw new RuntimeException();

	}

	/**
	 * For temp.<br/>
	 * For temp.
	 */
	public static void x(CharSequence charSequence) {

		throw new RuntimeException(charSequence.toString());

	}

}
