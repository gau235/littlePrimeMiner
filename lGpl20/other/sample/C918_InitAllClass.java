package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.other.iO.IOr;

/**
 * 列出某資料夾下所有子資料夾或檔案名稱 ( 對子資料夾以遞迴方式繼續列出 ).<br/>
 * <br/>
 * To list sub directory or file of the directory with recursion.
 * 
 * @version 2018/03/27_21:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C918_InitAllClass" >C918_InitAllClass.
 *          java</a>
 * 
 */
public class C918_InitAllClass {

	public static void main(String[] sAry) throws Throwable {

		String regToIn = O.Z;
		// String regToEx = O.L;
		String regToEx = "(.bat|.class|.html|.txt|.xml|$R|.jar|test.)";

		StringBuilder str = IOr.listSubFileNDir("C:/temp/prime64LGPL20/src", regToIn, regToEx);

		String[] newSAry = str.toString().split(O.LINE_SEPARATOR);

		String sExistence = "1";
		for (int i = 0; i != newSAry.length; i++) {

			String s = (newSAry[i]);
			if (s.endsWith(".java")) {

				s = s.replace("C:\\temp\\prime64LGPL20\\src\\", O.Z);
				s = s.replace("\\", ".");
				s = s.replace(".java", "");

				// O.l(s);
				try {

					@SuppressWarnings("unused")
					Class<?> theClass = Class.forName(s);
					O.l(s + O.S32 + "exist=" + sExistence);

				} catch (ClassNotFoundException classNotFoundException) {

					sExistence = "classNotFoundException";
					O.l(s + O.S32 + "exist=" + sExistence);

				} catch (NoClassDefFoundError noClassDefFoundError) {

					sExistence = "noClassDefFoundError";
					// noClassDefFoundError.printStackTrace();
					O.l(s + O.S32 + "exist=" + sExistence);

				}

			}

		}

	}

}
