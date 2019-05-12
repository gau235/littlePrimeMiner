package lGpl20.other.sample;

import java.util.TreeMap;
import java.util.regex.Pattern;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.other.iO.IOr;

/**
 * 列出某資料夾下所有子資料夾或檔案名稱 ( 對子資料夾以遞迴方式繼續列出 ).<br/>
 * <br/>
 * To list sub directory or file of the directory with recursion.
 * 
 * @version 2018/03/27_21:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C888_SearchSrc" >C888_SearchSrc.java</a>
 * 
 */
public class C888_SearchSrc {

	public static void main(String[] sAry) throws Throwable {

		TreeMap<String, StringBuilder> mapOfSrc = null;

		String regToIn = O.Z;
		String regToEx = O.LINE_SEPARATOR;

		try {

			String stringRootDir = "./src/lGpl20";
			StringBuilder str = IOr.listSubFileNDir(stringRootDir, regToIn, regToEx);
			String[] sAryForFilePath = str.toString().split(O.LINE_SEPARATOR);

			Ery<String> myEry = new Ery<String>();

			for (String s : sAryForFilePath) {

				if (s.endsWith(".java")) {

					myEry.a(s);

				}

			}

			mapOfSrc = IOr.loadSourceCodeNDelComment(myEry.toGenericAry(O.S_ARY0));

		} catch (Exception e) {

			e.printStackTrace();

		}

		regToIn = "(\\+ O.C[0-9][0-9]|\\+ O.C[0-9][0-9][0-9]|\\+ O.STR_C44C32)";
		regToIn = "(\\+ C[0-9][0-9]|\\+ C[0-9][0-9][0-9]|\\+ STR_C44C32)";

		regToIn = "(O.C[0-9][0-9] \\+|O.C[0-9][0-9][0-9] \\+|O.STR_C44C32 \\+)";
		regToIn = "(C[0-9][0-9] \\+|C[0-9][0-9][0-9] \\+|STR_C44C32 \\+)";

		regToIn = "O.S46 \\+";
		regToIn = "append\\(O.S[0-9][0-9]";
		regToIn = "append\\(S[0-9][0-9]";
		regToIn = "append\\(O.L";
		regToIn = "append\\(L";
		regToIn = "\\+ L";
		regToIn = "\\+ O.L";

		regToIn = "replaceAll";
		regToIn = "replaceAll";
		regToIn = "nameOfClass=";
		regToIn = "Gp(?!z|l)";

		O.l("search:");

		Ery<String> eryOfKey = new Ery<String>(mapOfSrc.keySet());

		for (int i = 0, len = eryOfKey.len(); i != len; i++) {

			String key = eryOfKey.at(i);
			StringBuilder src = mapOfSrc.get(key);

			// Pattern patternIn = Pattern.compile(regToIn,Pattern.CASE_INSENSITIVE);
			Pattern patternIn = Pattern.compile(regToIn);

			if ((patternIn.matcher(src).find())) {

				O.l("key=" + key);

			}

		}

		O.l("done=" + C888_SearchSrc.class);

	}

}
