package lGpl20.other.iO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.regex.Pattern;

import lGpl20.o.O;
import lGpl20.other.Coder;

/**
 * @version 2018/06/04_13:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=IOr_U" >IOr_U.java</a>
 * 
 * @see IOr_W
 */
public abstract class IOr_U extends IOr_T {

	private static final Class<IOr_U> CLASS_THIS = IOr_U.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 列出某資料夾下所有子資料夾或檔案名稱 ( 對子資料夾以遞迴方式繼續列出 ).<br/>
	 * To list sub directory or file of the directory with recursion.
	 */
	public static void listSubFileNDir(String sRootDir, Pattern patternIn, Pattern patternEx, StringBuilder retStr)
			throws IOException {

		final File dir = new File(sRootDir);

		// O.l("sRootDir=" + sRootDir + O.S32 + CLASS_THIS);
		// O.l("isDir=" + dir.isDirectory() + O.S32 + CLASS_THIS);

		File[] aryOfFileOrDir = dir.listFiles();
		File fileOrDir;
		String sCanonicalPath;

		for (int i = 0; i != aryOfFileOrDir.length; i++) {

			fileOrDir = aryOfFileOrDir[i];
			sCanonicalPath = fileOrDir.getCanonicalPath();
			// O.l("sCanonicalPath=" + sCanonicalPath + O.S32 + CLASS_THIS);

			if ((patternIn.matcher(sCanonicalPath).find()) && (!patternEx.matcher(sCanonicalPath).find())) {

				retStr.append(sCanonicalPath).append(O.C_A_L);

				if (fileOrDir.isDirectory()) {

					listSubFileNDir(sCanonicalPath, patternIn, patternEx, retStr);// recursion

				}

			}

		}

	}

	/**
	 * 列出某資料夾下所有子資料夾或檔案名稱 ( 對子資料夾以遞迴方式繼續列出 ).<br/>
	 * To list sub directory or file of the directory with recursion.
	 */
	public static StringBuilder listSubFileNDir(String sRootDir, String regToIn, String regToEx) throws IOException {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		Pattern patternIn = Pattern.compile(regToIn);
		Pattern patternEx = Pattern.compile(regToEx);

		if ((patternIn.matcher(sRootDir).find()) && (!patternEx.matcher(sRootDir).find())) {

			listSubFileNDir(sRootDir, patternIn, patternEx, retStr);

		}

		return retStr;

	}

	/**
	 * To load source code then to put in map wrapper.<br/>
	 * To load source code then to put in map wrapper.
	 */
	public static TreeMap<String, StringBuilder> loadSourceCodeNDelComment(String[] sAryForFilePath) {

		TreeMap<String, StringBuilder> mapToReturn = new TreeMap<String, StringBuilder>();

		for (int i = 0; i != sAryForFilePath.length; i++) {

			// O.l("sAry[i]=" + sAry[i] + O.S32 + CLASS_THIS);

			StringBuilder strSourceCode = IOr.readStrFrom(Paths.get(sAryForFilePath[i]));
			// StringBuilder strSourceCodeWComment =new StringBuilder(strSourceCode );

			// String s = strSourceCode.toString();
			//
			// try {
			//
			// s = new String(s.getBytes("UTF-8"), "MS950");
			//
			// } catch (UnsupportedEncodingException e) {
			//
			// e.printStackTrace();
			//
			// }
			//
			// strSourceCode = new StringBuilder(s);

			String nameOfOnlyClass = Coder.getNameOfClass(Coder.delComment(Coder.delNameOfPackage(strSourceCode)));
			mapToReturn.put(nameOfOnlyClass, strSourceCode);
			// mapToReturn.put(nameOfOnlyClass, strSourceCodeWComment);

		}

		return mapToReturn;

	}

}