package lGpl20.other.jsp;

import lGpl20.o.O_Z;

/**
 * 本類別 Jsp.<br/>
 * priority: system > char[] > StringBuilder > String<br/>
 * For JSP.<br/>
 * 
 * @version 2018/03/28_09:35:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Jsp_A" >Jsp_A.java</a>
 * 
 * @see Jsp_D
 */
public abstract class Jsp_A extends O_Z {

	private static final Class<Jsp_A> CLASS_THIS = Jsp_A.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * HTML 換行符號.<br/>
	 * The HTML line separator.
	 */
	public static final StringBuilder BR = new StringBuilder("<br/>");

	/**
	 * HTML 換行符號.<br/>
	 * The HTML line separator.
	 */
	public static final String S_BR = BR.toString();

	/**
	 * 換行符號.<br/>
	 * The line separator.
	 */
	public static final StringBuilder L = new StringBuilder(S_BR).append(C_A_L);

	/**
	 * The &nbsp;.<br/>
	 * The &nbsp;.
	 */
	public static final char[] C_A_HTML_BLANK = new char[] { '&', 'n', 'b', 's', 'p', ';' };

	/**
	 * The &nbsp;.<br/>
	 * The &nbsp;.
	 */
	public static final char[] C_A_2_HTML_BLANK = new char[] { '&', 'n', 'b', 's', 'p', ';', '&', 'n', 'b', 's', 'p', ';' };

	/**
	 * The &nbsp;.<br/>
	 * The &nbsp;.
	 */
	public static final char[] C_A_3_HTML_BLANK = new char[] { '&', 'n', 'b', 's', 'p', ';', '&', 'n', 'b', 's', 'p', ';', '&',
			'n', 'b', 's', 'p', ';' };

	/**
	 * The &nbsp;.<br/>
	 * The &nbsp;.
	 */
	public static final char[] C_A_6_HTML_BLANK = new char[] { '&', 'n', 'b', 's', 'p', ';', '&', 'n', 'b', 's', 'p', ';', '&',
			'n', 'b', 's', 'p', ';', '&', 'n', 'b', 's', 'p', ';', '&', 'n', 'b', 's', 'p', ';', '&', 'n', 'b', 's', 'p', ';' };

	// /**
	// * The string callback.<br/>
	// * The string callback.
	// */
	// public static final String S_CALLBACK = "callback";

}