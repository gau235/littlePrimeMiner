package lGpl20.o;

import lGpl20.o.str.S;

/**
 * @version 2019/03/15_18:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_V" >O_V.java</a>
 * 
 * @see O_W
 */
public abstract class O_V extends O_M {

	private static final Class<O_V> CLASS_THIS = O_V.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	// /**
	// * To StringBuilder by Exception.<br/>
	// * To StringBuilder by Exception.
	// */
	// public static StringBuilder toStrByEx(Exception e) {
	//
	// S str = new S(L);
	//
	// str.al(e.toString());
	//
	// StackTraceElement[] aryOfStackTraceElem1 = e.getStackTrace();
	//
	// for (int i = 0; i != aryOfStackTraceElem1.length; i++) {
	//
	// str.al(aryOfStackTraceElem1[i]);
	//
	// }
	//
	// Throwable throwable = e.getCause();
	//
	// if (throwable != null) {
	//
	// str.al("Caused by" + S58 + S32 + throwable.toString());
	//
	// StackTraceElement[] aryOfCauseStackTraceElem = throwable.getStackTrace();
	//
	// for (int i = 0; i < aryOfCauseStackTraceElem.length; i++) {
	//
	// str.al(aryOfCauseStackTraceElem[i]);
	//
	// }
	//
	// }
	//
	// return str.str();
	//
	// }

	/**
	 * To StringBuilder by Exception.<br/>
	 * To StringBuilder by Exception.
	 */
	public static StringBuilder toStrByThrowable(Throwable throwable) {

		S str = new S();
		str.l(throwable.toString());

		StackTraceElement[] aryOfCauseStackTraceElem = throwable.getStackTrace();

		for (int i = 0; i != aryOfCauseStackTraceElem.length; i++) {

			str.l(aryOfCauseStackTraceElem[i].toString());

		}

		return str.str;

	}

}
