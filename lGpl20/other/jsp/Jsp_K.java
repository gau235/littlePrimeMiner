package lGpl20.other.jsp;

import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lGpl20.o.str.S;
import lGpl20.other.iO.IOr;

/**
 * @version 2018/03/27_22:07:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Jsp_K" >Jsp_K.java</a>
 * 
 * @see Jsp_V
 */
public abstract class Jsp_K extends Jsp_D {

	private static final Class<Jsp_K> CLASS_THIS = Jsp_K.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	public static String filterNReplaceWHtmlTag(String string) {

		string = string.trim();

		string = string.replaceAll("[=\\%&*|?\'\"]", Z);
		// string = string.replaceAll("\\+", T64.Z);//+
		// string = string.replaceAll("\\-", T64.S95);//-

		// Pattern pattern = Pattern.compile("(or)", Pattern.CASE_INSENSITIVE);
		// Matcher matcher = pattern.matcher(string);
		// string = matcher.replaceAll("$1_");

		Pattern pattern = Pattern.compile("(insert)", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(string);
		string = matcher.replaceAll("$1_");

		pattern = Pattern.compile("(update)", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(string);
		string = matcher.replaceAll("$1_");

		pattern = Pattern.compile("(del)", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(string);
		string = matcher.replaceAll("$1_");

		// pattern = Pattern.compile("(into)", Pattern.CASE_INSENSITIVE);
		// matcher = pattern.matcher(string);
		// string = matcher.replaceAll("$1_");

		string = string.replaceAll("<", "&lt;");

		string = string.replaceAll("<", "&lt;");
		string = string.replaceAll(">", "&gt;");
		string = string.replaceAll("\r\n", S_BR);// <br/>

		return string;

	}

	public static StringBuilder viewSource(String fromPath, String link) throws IOException {

		S str = new S();
		str.lineWr = L;

		// ex: ".java", ".html", ".jar", ".bat", ".xml", ".jsp";

		String regToIn = Z;
		String regToEx = "@@@@@";// L.toString();

		StringBuilder strOfPath = IOr.listSubFileNDir(fromPath, regToIn, regToEx);

		String[] aryOfPath = strOfPath.toString().split(LINE_SEPARATOR);// fuck

		Arrays.sort(aryOfPath);

		for (int i = 0; i != aryOfPath.length; i++) {

			String sPath = aryOfPath[i].trim();

			sPath = sPath.replace(fromPath, Z);

			sPath = sPath.replace("\\", "/");
			String nameOfClassTxt = sPath.substring(sPath.lastIndexOf("/") + 1);

			sPath = link + sPath + "\" id=\"" + nameOfClassTxt
					+ "\" style=\"font-size:20px; color: #000000;\" target=\"_blank\" >" + sPath + "</a>";

			str.l(sPath);

		}

		return str.str;

	}

}