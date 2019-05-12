package lGpl20.o;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @version 2019/04/21_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_Z" >O_Z.java</a>
 * 
 * @see O
 */
public abstract class O_Z extends O_Y {

	private static final Class<O_Z> CLASS_THIS = O_Z.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To getSysUserDotName.<br/>
	 * To getSysUserDotName.
	 */
	public static final String getSysUserDotName() {

		try {

			String fileDotEncoding = System.getProperty("file.encoding");
			l("file.encoding=" + fileDotEncoding + S32 + CLASS_THIS);

			String oldS = System.getProperty("user.name");
			String newS = new String(oldS.getBytes(fileDotEncoding), StandardCharsets.UTF_8);
			// String newS = new String(oldS.getBytes("MS950"), "UTF8");
			// String newS = new String(oldS.getBytes("UTF8"), "MS950");

			l("old user.name=" + oldS + S32 + CLASS_THIS);
			l("new user.name=" + newS + S32 + CLASS_THIS);

			l("new user.name=" + new String(oldS.getBytes(), "MS950") + S32 + CLASS_THIS);
			l("new user.name=" + new String(oldS.getBytes(), "BIG5") + S32 + CLASS_THIS);
			l("new user.name=" + new String(oldS.getBytes(), "UTF8") + S32 + CLASS_THIS);

			return newS;

		} catch (UnsupportedEncodingException unsupportedEncodingException) {

			unsupportedEncodingException.printStackTrace();
			return null;

		}

	}

	/**
	 * Is Linux?<br/>
	 * Is Linux?
	 */
	public static final boolean IS_LINUX = "linux".compareToIgnoreCase(System.getProperty("os.name")) == 0;

	/**
	 * The user.name.<br/>
	 * The user.name.
	 */
	public static final String SYS_USER_DOT_NAME = System.getProperty("user.name");// getSysUserDotName();

	/**
	 * Is developer?<br/>
	 * Is developer?
	 */
	public static boolean isToDev() {

		return (SYS_USER_DOT_NAME != null && SYS_USER_DOT_NAME.startsWith("gau"));

	}

	/**
	 * Is developer?<br/>
	 * Is developer?
	 * 
	 * @see #IS_HIGH_MEM
	 */
	public static final boolean IS_TO_DEV = (!IS_LINUX) && isToDev();

}
