package lGpl20.o;

/**
 * 本類別原生人.<br/>
 * 提供每個類別 1 個識別數字.<br/>
 * <br/>
 * The origin.
 * 
 * @version 2019/04/27_13:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O" >O.java</a>
 * 
 */
public abstract class O extends O_Z {

	private static final Class<O> CLASS_THIS = O.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 大版本.<br/>
	 * The main version.
	 */
	public static final String STRING_VERSION = "prime64LGPL20";

	/**
	 * The updated time.<br/>
	 * The updated time.
	 */
	public static final String STRING_UPDATED_TIME = "2006/02/01_10:00:00.123+08:00";// will auto update

}
