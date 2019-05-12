package lGpl20.other.jsp;

import java.io.Serializable;
import java.util.TimeZone;

import lGpl20.o.KeyToSyn;
import lGpl20.o.str.Strva;

/**
 * @version 2019/05/11_20:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Jsp_D" >Jsp_D.java</a>
 * 
 * @see Jsp_K
 */
public abstract class Jsp_D extends Jsp_A {

	private static final Class<Jsp_D> CLASS_THIS = Jsp_D.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 用於多執行緒的同步.<br/>
	 * For synchronizing.
	 */
	protected static final Serializable KEY_TO_SYN = new KeyToSyn();

	public static final String $HOME = "http://c64.tw";

	public static final String $HOME_PREFIX = "http://c64.tw/";

	public static final String $JDK_DOWNLOAD = "http://www.oracle.com/technetwork/java/javase/downloads";

	public static final String $JAVA_DOC = "http://docs.oracle.com/javase/7/docs/api/";

	public static final String $JAR_N_USER_GUIDE_ZIP = $HOME_PREFIX + "w20/prime64LGPL20/jarNUserGuide.zip";

	public static final String $STRING_FILE_PRIME64_DIY_PORTABLE = "prime64LGPL20DIYPortable.zip";

	public static final String $STRING_FILE_PRIME64_PORTABLE = "prime64LGPL20Portable.zip";

	public static final String $PRIME64_DIY_PORTABLE = $HOME_PREFIX + "w20/prime64LGPL20/" + $STRING_FILE_PRIME64_DIY_PORTABLE;

	// public static final String $PRIME64_PORTABLE = $HOME_PREFIX + "w20/prime64LGPL20/" + $STRING_FILE_PRIME64_PORTABLE;
	public static final String $PRIME64_PORTABLE = $HOME_PREFIX + "d2.jsp";

	public static final String $PRIME64_DIY_PORTABLE_BY_CACHE = $HOME_PREFIX + "w20/o/download.jsp?nameOfFile="
			+ $STRING_FILE_PRIME64_DIY_PORTABLE;

	public static final String $PRIME64_JAVA_DOC = $HOME_PREFIX + "w20/prime64LGPL20/srcTxtNDoc/doc";

	public static final String $PRIME64_DOCX = $HOME_PREFIX + "w20/prime64Old/userGuide.docx";

	public static final String STRING_ERY_OF_STRING_OF_DIR_OF_JAR_C64_TW = "STRING_ERY_OF_STRING_OF_DIR_OF_JAR_C64_TW";

	public static final String STRING_CLASS_LOADER_FOR_J_F_OBJ_C64_TW = "STRING_CLASS_LOADER_FOR_J_F_OBJ_C64_TW";

	public static final String STRING_ERY_OF_OPTION_TO_COMPILE_C64_TW = "STRING_ERY_OF_OPTION_TO_COMPILE_C64_TW";

	// public static final String STRING_KEY_TO_DOWNLOAD_PRIME64_DIY_PORTABLE_C64_TW =
	// "STRING_KEY_TO_DOWNLOAD_PRIME64_DIY_PORTABLE_C64_TW";

	public static final String STRING_CLASS_INS_OF_DB_DRIVER_C64_TW = "STRING_CLASS_INS_OF_DB_DRIVER_C64_TW";

	public static final String DB_DRIVER_NAME = "com.mysql.jdbc.Driver";

	public static final String S_MP32 = "S_MP32";

	public static final String STRING_INS_REC_ERY_IN_APP_C64_TW = "STRING_INS_REC_ERY_IN_APP_C64_TW";

	public static final String STRING_INS_REC_TEST_ERY_IN_APP_C64_TW = "STRING_INS_REC_TEST_ERY_IN_APP_C64_TW";

	public static final TimeZone MY_TIME_ZONE = TimeZone.getTimeZone("Asia/Taipei");

	public static final String STRING_DIR_FOR_TO_DOWNLOAD_FILE = IS_LINUX ? "/home/c64tw/c64.tw/w20/prime64LGPL20"
			: "C:/e44/w/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/w20/w20/prime64LGPL20";

	/**
	 * For Jsp.<br/>
	 * For Jsp.
	 * 
	 * @see Strva#int32MaxRowForHtml
	 */
	public static int int32MaxRowForHtmlInJsp = 0b1_000_000_000_000_000;;

	private final static String getUrlForDb() {

		if (IS_LINUX) {

			return "jdbc:mysql://localhost/c64tw_c64twtab1?useUnicode=true&characterEncoding=utf8";

		}

		if (IS_TO_DEV) {

			return "jdbc:mysql://gau89/test?useUnicode=true&characterEncoding=utf8";

		}

		return "jdbc:mysql://localhost/test?useUnicode=true&characterEncoding=utf8";

	}

	public static final String DB_URL = getUrlForDb();

	/**
	 * The String POST.<br/>
	 * The String POST.
	 */
	public static final String STRING_POST = "POST";

	/**
	 * getAttribute 的方法名稱.<br/>
	 * The name of getAttribute method.
	 */
	public static final String NAME_METHOD_GET_ATTRITUBE = "getAttribute";

	/**
	 * setAttribute 的方法名稱.<br/>
	 * The name of getAttribute method.
	 */
	public static final String NAME_METHOD_SET_ATTRITUBE = "setAttribute";

	/**
	 * The String STRING_T64_OF_PREVIOUS_ACCESS.<br/>
	 * The String STRING_T64_OF_PREVIOUS_ACCESS.
	 */
	public static final String STRING_T64_OF_PREVIOUS_ACCESS = "STRING_T64_OF_PREVIOUS_ACCESS";

	public static final String LOGIN_ID = "c64tw_c64twtab1";

	public static final String LOGIN_PASSWORD = "123";

	public static final String STRING_TEST1_FOR_C64_TW = "STRING_TEST1_FOR_C64_TW";

	public static final String STRING_TEST2_FOR_C64_TW = "STRING_TEST2_FOR_C64_TW";

	public static final String STRING_TEST3_FOR_C64_TW = "STRING_TEST3_FOR_C64_TW";

}