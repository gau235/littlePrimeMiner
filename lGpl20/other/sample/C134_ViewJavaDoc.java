package lGpl20.other.sample;

/**
 * 看線上 Java doc.<br/>
 * <br/>
 * To view online Java doc.
 * 
 * @version 2015/04/10_21:07:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C134_ViewJavaDoc" >C134_ViewJavaDoc.java
 *          </a>
 * 
 */
public class C134_ViewJavaDoc {

	public static void main(String[] sAry) throws Throwable {

		ProcessBuilder processBuilder = new ProcessBuilder("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe",
				"http://c64.tw/w20/prime64LGPL20/srcTxtNDoc/doc");

		Process process = processBuilder.start();

		// int exitValue = process.waitFor();
		// O.l("exitValue=" + exitValue);
		// process.destroy();

	}

}
