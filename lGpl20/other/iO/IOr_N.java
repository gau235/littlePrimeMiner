package lGpl20.other.iO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * @version 2019/04/19_19:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=IOr_N" >IOr_N.java</a>
 * 
 * @see IOr_R
 */
public abstract class IOr_N extends IOr_E {

	private static final Class<IOr_N> CLASS_THIS = IOr_N.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 讀取文字檔內容.<br/>
	 * To read the source code file.
	 */
	public static StringBuilder readStrFrom(Path pathOfFile) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		String string;
		int lenOfStr;
		try (BufferedReader bufR = Files.newBufferedReader(pathOfFile, StandardCharsets.UTF_8);) {

			while ((string = bufR.readLine()) != null) {

				retStr.append(string).append(O.C_A_L);

			}

			lenOfStr = retStr.length();
			if (lenOfStr > O.C_A_L.length) {

				retStr.delete(lenOfStr - O.C_A_L.length, lenOfStr);

			}

		} catch (IOException iOException) {

			iOException.printStackTrace();

		}

		return retStr;

	}

	/**
	 * 把程式碼存檔.<br/>
	 * To save the source code to file.
	 */
	public static void appendCharSeqToFile(CharSequence charSequence, Path pathOfFile) {

		try (BufferedWriter bufW = Files.newBufferedWriter(pathOfFile, StandardCharsets.UTF_8, StandardOpenOption.APPEND);) {

			bufW.write(charSequence.toString());
			bufW.flush();

		} catch (IOException iOException) {

			iOException.printStackTrace();

		}

	}

	/**
	 * 把程式碼存檔.<br/>
	 * To save the source code to file.
	 */
	public static void writeCharSeqToFile(CharSequence charSequence, Path pathOfFile) {

		try (BufferedWriter bufW = Files.newBufferedWriter(pathOfFile, StandardCharsets.UTF_8, StandardOpenOption.WRITE);) {

			bufW.write(charSequence.toString());
			bufW.flush();

		} catch (IOException iOException) {

			iOException.printStackTrace();

		}

	}

	/**
	 * 橫列轉直行.<br/>
	 * To divide a row to some rows.
	 */
	public static String[] readNSplit1RowToSAry(Path pathOfFile, String regexToSplit) {

		StringBuilder retStr = readStrFrom(pathOfFile);

		String[] sAry = O.splitNTrimAll(retStr.toString(), regexToSplit);

		return sAry;

	}

	/**
	 * 直行轉橫列.<br/>
	 * To merge some rows into 1 row.
	 */
	public static StringBuilder readNMergeSomeSInto1Row(Path pathOfFile, String regexToSplit, CharSequence lineWr) {

		StringBuilder retStr = readStrFrom(pathOfFile);

		String[] sAry = O.splitNTrimAll(retStr.toString(), regexToSplit);

		return Strva.mergeInStr(sAry, lineWr);

	}

}