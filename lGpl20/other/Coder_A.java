package lGpl20.other;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;

import javax.tools.JavaFileObject.Kind;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * 本類別 Coder for 原始碼 or .class.<br/>
 * The Coder file for source code or .class.
 * 
 * @version 2017/05/20_10:05:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Coder_A" >Coder_A.java</a>
 * 
 * @see Coder_Z
 */
public abstract class Coder_A implements Serializable {

	private static final Class<Coder_A> CLASS_THIS = Coder_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static final String STRING_FILE_PROTOCOL = "file:///"; // 3 slash

	// /public static final String STR_FILE_PROTOCOL2 = "file:";

	public static final String STRING_STR_PROTOCOL = "str:///";// 3 slash

	public static final String STRING_LOWER_CASE_PACKAGE = "package";

	public static final String STRING_LOWER_CASE_PUBLIC_CLASS = "public" + O.S32 + "class";

	public static final String STRING_LOWER_CASE_PUBLIC_ABSTRACT_CLASS = "public" + O.S32 + "abstract" + O.S32 + "class";

	public static final String STRING_LOWER_CASE_PUBLIC_FINAL_CLASS = "public" + O.S32 + "final" + O.S32 + "class";

	public static final String STRING_LOWER_CASE_PUBLIC_INTERFACE = "public" + O.S32 + "interface";

	public static final String STRING_LOWER_CASE_PUBLIC_ABSTRACT_INTERFACE = "public" + O.S32 + "abstract" + O.S32 + "interface";

	public static final String STRING_LOWER_CASE_EXTENDS = "extends";

	public static final String STRING_LOWER_CASE_IMPLEMENTS = "implements";

	public static final String STRING_COMMENT_FROM = O.S47 + O.S42;// /*

	public static final String STRING_COMMENT_TO = O.S42 + O.S47;// */

	public static final String STRING_LOWER_CASE_DOT_JAVA = ".java";

	public static final String STRING_LOWER_CASE_DOT_CLASS = ".class";

	public static final String STRING_LOWER_CASE_DOT_JAR = ".jar";

	public static final String STRING_AT_LOWER_CASE_VERSION = "@version";

	/**
	 * 轉成 str:///MyName.java<br/>
	 * To URI str:///MyName.java
	 */
	public static URI toStrProtocolUri(String nameOfClass, Kind kind) {

		if (Kind.SOURCE.equals(kind)) {

			return URI.create(STRING_STR_PROTOCOL + nameOfClass.replace(O.C46, O.C47) + STRING_LOWER_CASE_DOT_JAVA);

		}

		if (Kind.CLASS.equals(kind)) {

			return URI.create(STRING_STR_PROTOCOL + nameOfClass.replace(O.C46, O.C47) + STRING_LOWER_CASE_DOT_CLASS);

		}

		throw new IllegalArgumentException();

	}

	/**
	 * 列出多個目錄下的所有 jar 檔.<br/>
	 * To list all jar files in dir.
	 */
	public static URL[] getAryOfUrlOfDirNJar(String... sAryOfDir) {

		Ery<URL> ery = new Ery<URL>();

		try {

			for (int i1 = 0; i1 < sAryOfDir.length; i1++) {

				File dir = new File(sAryOfDir[i1]);

				O.l("dir=" + dir);

				if (!dir.isDirectory()) {// dir may not exist

					continue;
					// O.x(dir.getCanonicalPath());

				}

				String[] sAryOfFileOrDir = dir.list();
				int lenOfAryOfFileOrDir = sAryOfFileOrDir.length;

				if (sAryOfFileOrDir == null || lenOfAryOfFileOrDir == 0) {

					continue;

				} else {

					ery.a(new URL(Coder.STRING_FILE_PROTOCOL + dir.getCanonicalPath() + File.separator));

					for (int i2 = 0; i2 < lenOfAryOfFileOrDir; i2++) {

						String nameOfJar = sAryOfFileOrDir[i2].trim();

						if (nameOfJar.indexOf(Coder.STRING_LOWER_CASE_DOT_JAR) > 0) {

							URL urlOfJar = new URL(
									Coder.STRING_FILE_PROTOCOL + dir.getCanonicalPath() + File.separator + nameOfJar);

							ery.a(urlOfJar);

							// O.l(urlOfJar);

						}

					}

				}

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return ery.toGenericAry(O.URL_ARY0);

	}

	/**
	 * 打包多個個 dir 所有 jar 檔.<br/>
	 * To get all jar files in the array of dir.
	 */
	public static URL[] getAryOfUrlOfDirNJar(Ery<String> eryOfStringOfDirNJar) {

		return getAryOfUrlOfDirNJar(eryOfStringOfDirNJar.toGenericAry(O.S_ARY0));

	}

}
