package lGpl20.other.sample;

import java.util.TreeMap;

import lGpl20.o.O;
import lGpl20.other.jsp.Jsp;

/**
 * 檢查新版.<br/>
 * <br/>
 * To check if it is up to date.
 * 
 * @version 2017/01/12_07:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C136_CheckVersion" >C136_CheckVersion.
 *          java</a>
 * 
 */
public class C136_CheckVersion {

	public static void main(String[] sAry) throws Throwable {

		String sUrl = "http://c64.tw/w20/prime64LGPL20/srcTxtNDoc/src/lGpl20/o/O.txt";
		TreeMap<String, String> mapOfParam = new TreeMap<String, String>();

		StringBuilder str = Jsp.doPostNDownload(sUrl, mapOfParam);
		// O.l(str);

		if (str.indexOf("STRING_UPDATED_TIME") > 0) {

			int index = str.indexOf("STRING_UPDATED_TIME") + 23;
			// O.l(index);
			String strOnlineVersion = str.substring(index, index + 29);

			O.l("online version=" + O.L + strOnlineVersion);
			O.l("my version=" + O.L + O.STRING_UPDATED_TIME);

		}

	}

}
