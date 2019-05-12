package lGpl20.o;

import java.net.URL;

/**
 * priority: system > char[] > StringBuilder > String
 * 
 * @version 2019/03/18_12:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_G" >O_G.java</a>
 * 
 * @see O_J
 */
public abstract class O_G extends O_E {

	private static final Class<O_G> CLASS_THIS = O_G.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 換行符號.<br/>
	 * The line separator.
	 */
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	/**
	 * 換行符號.<br/>
	 * The line separator.
	 */
	public static final char[] C_A_L = LINE_SEPARATOR.toCharArray();// CHAR_ARY_AS_LINE_SEPERATOR

	/**
	 * 換行符號.<br/>
	 * The line separator.
	 */
	public static final StringBuilder L = new StringBuilder(LINE_SEPARATOR); // like \r\n

	// /**
	// * 空字串建立者.<br/>
	// * The empty StringBuilder.
	// */
	// public static final StringBuilder STR0 = new StringBuilder();

	/**
	 * 空字串.<br/>
	 * The empty String.
	 */
	public static final String Z = new String();// empty string

	/**
	 * 長度 0 的 32 位元整數陣列.<br/>
	 * The int array which length is 0.
	 */
	public static final int[] INT32_ARY0 = new int[0];

	/**
	 * 長度 0 的 64 位元整數陣列.<br/>
	 * The long array which length is 0.
	 */
	public static final long[] ARY0 = new long[0];

	/**
	 * 長度 0 的 32 位元浮點數陣列.<br/>
	 * The float array which length is 0.
	 */
	public static final float[] F32_ARY0 = new float[0];

	/**
	 * 長度 0 的 64 位元浮點數陣列.<br/>
	 * The double array which length is 0.
	 */
	public static final double[] F64_ARY0 = new double[0];

	/**
	 * 長度 0 的字元陣列.<br/>
	 * The char array which length is 0.
	 */
	public static final char[] CHAR_ARY0 = new char[0];

	/**
	 * 長度 0 的字串陣列.<br/>
	 * The String array which length is 0.
	 */
	public static final String[] S_ARY0 = new String[0];

	/**
	 * 長度 0 的 Object 陣列.<br/>
	 * The Object array which length is 0.
	 */
	public static final Object[] OBJ_ARY0 = new Object[0];

	/**
	 * 長度 0 的 StringBuilder 陣列.<br/>
	 * The StringBuilder array which length is 0.
	 */
	public static final StringBuilder[] STR_ARY0 = new StringBuilder[0];

	/**
	 * 長度為 0 的 執行緒陣列.<br/>
	 * The Thread array which length is 0.
	 */
	public static final Thread[] THR_ARY0 = new Thread[0];

	/**
	 * 長度為 0 的 URL 陣列.<br/>
	 * The URL array which length is 0.
	 */
	public static final URL[] URL_ARY0 = new URL[0];

	/**
	 * C44 and C32.<br/>
	 * C44 and C32.
	 */
	public static final StringBuilder STR_C44C32 = new StringBuilder().append(C44).append(C32);

	/**
	 * main 方法的名字 main.<br/>
	 * The word 'main'.
	 */
	public static final String STRING_LOWER_CASE_MAIN = "main";

	/**
	 * toStr 的方法名稱.<br/>
	 * The name of toStr method.
	 */
	public static final String NAME_METHOD_TO_STR = "toStr";

	/**
	 * toString 的方法名稱.<br/>
	 * The name of toString method.
	 */
	public static final String NAME_METHOD_TO_STRING = "toString";

	/**
	 * The String UTF-8.<br/>
	 * The String UTF-8.
	 */
	public static final String S_UTF_8 = "UTF-8";

	// /**
	// * 系統預設的輸出.<br/>
	// * The System.out.
	// */
	// public static final PrintStream OUT = System.out;

}
