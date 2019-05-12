package lGpl20.recycle;

import java.io.File;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

import lGpl20.o.O;

/**
 * @version 2019/04/18_22:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Zw18" >Zw18.java</a>
 *
 * @see Zw38
 */
public abstract class Zw18 implements Serializable {

	private static final Class<Zw18> CLASS_THIS = Zw18.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main44(String[] sAry) throws Throwable {

	}

	public static void main55(String[] sAry) throws Throwable {

		File f = new File("D:/err2.txt");

		f.setReadable(true, false);
		f.setWritable(true, false);
		f.setExecutable(true, false);

		O.l("file exist=" + f.exists());
		// O.l("file delete=" + f.delete());

	}

	public static void main3(String[] sAry) throws Throwable {

		String string = "A,B,C,D";
		String reg = "(Z|B,C)";

		// O.l(Pattern.matches(reg1, a));

		Pattern pattern = Pattern.compile(reg);
		// O.l("find=" + pattern.matcher(string).find());

	}

	public static void main(String[] sAry) throws Throwable {

		System.setProperty("sun.jnu.encoding", "UTF-8");
		System.setProperty("file.encoding", "UTF-8");

		O.l("\u6E2C\u8A66");
		O.l("====測試編碼212_1====" + O.S32 + CLASS_THIS);
		O.l("Default Charset=" + Charset.defaultCharset() + O.S32 + CLASS_THIS);
		O.l("file.encoding=" + System.getProperty("file.encoding") + O.S32 + CLASS_THIS);
		O.l("sun.jnu.encoding=" + System.getProperty("sun.jnu.encoding") + O.S32 + CLASS_THIS);
		O.l("====測試編碼212_2====" + CLASS_THIS);

	}

}
