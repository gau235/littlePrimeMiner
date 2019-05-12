package lGpl20.o.str;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 本類別字串娃.<br/>
 * <br/>
 * The girl to handle string.
 * 
 * @version 2019/04/04_17:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Strva_A" >Strva_A.java</a>
 * 
 * @see Strva_C
 */
public abstract class Strva_A implements Serializable {

	private static final Class<Strva_A> CLASS_THIS = Strva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static final String[] S_ARY_A_J = { O.S65, O.S66, O.S67, O.S68, O.S69, O.S70, O.S71, O.S72, O.S73, O.S74 };

	public static int numOfWordPerLineForS2 = 2;

	public static final StringBuilder STR_HTML_MIDDLE_TD = new StringBuilder("</td><td>");

	public static final StringBuilder STR_HTML_TABLE_END = new StringBuilder("</td></tr></table>");

	public static int int32MaxRowForHtml = 1_000;

}
