package lGpl20.other.iO.sample;

import java.util.regex.Pattern;

import lGpl20.o.O;
import lGpl20.other.iO.IOr;

/**
 * 列出某資料夾下所有子資料夾或檔案名稱 ( 對子資料夾以遞迴方式繼續列出 ).<br/>
 * <br/>
 * To list sub directory or file of the directory with recursion.
 * 
 * @version 2019/04/19_19:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP43_ListSubFileNDir" >
 *          SP43_ListSubFileNDir.java</a>
 * 
 */
public class SP43_ListSubFileNDir {

	public static void main(String[] sAry) throws Throwable {

		// String sRootDir = "C:/temp/srcTxtNDoc/src/lGpl20";
		String sRootDir = "R:/";

		// String regToIn = "(64)";
		String regToIn = O.Z;
		String regToEx = "RECYCLE|System";
		// String regToEx = O.LINE_SEPARATOR;

		Pattern patternIn = Pattern.compile(regToIn);
		Pattern patternEx = Pattern.compile(regToEx);
		//
		// O.l("patternIn.matcher(sRootDir).find()=" + patternIn.matcher(sRootDir).find() + O.S32 + SP43_ListSubFileNDir.class);

		StringBuilder str = IOr.listSubFileNDir(sRootDir, regToIn, regToEx);

		O.l(str);

		/////////////////////////////////////////////
		sAry = str.toString().split(O.LINE_SEPARATOR);

		for (int i = 0; i != sAry.length; i++) {

			if (sAry[i].endsWith(".txt")) {

				O.l(sAry[i]);

			}

		}
		/////////////////////////////////////////////

	}

}
