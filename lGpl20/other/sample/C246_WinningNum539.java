package lGpl20.other.sample;

import java.io.IOException;
import java.util.TreeMap;

import lGpl20.o.O;
import lGpl20.o.str.Strva;
import lGpl20.o.time.T64;
import lGpl20.other.jsp.Jsp;

/**
 * To open a Http connection.<br/>
 * <br/>
 * To open a Http connection.
 * 
 * @version 2018/08/15_14:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C246_WinningNum539" >C246_WinningNum539.
 *          java</a>
 * 
 */
public class C246_WinningNum539 {

	public static String[] strAryWinningNumRecent3Day() throws IOException {

		String sUrl = "http://www.taiwanlottery.com.tw/lotto/DailyCash/history.aspx";
		TreeMap<String, String> mapOfParam = new TreeMap<String, String>();

		StringBuilder str = Jsp.doPostNDownload(sUrl, mapOfParam);
		// O.l(str);

		String[] sAryDate = new String[3];
		sAryDate[0] = T64.toTimeStr(T64.t64() - T64.$1_DAY * 0).substring(5, 10);
		sAryDate[1] = T64.toTimeStr(T64.t64() - T64.$1_DAY * 1).substring(5, 10);
		sAryDate[2] = T64.toTimeStr(T64.t64() - T64.$1_DAY * 2).substring(5, 10);

		String[] retSAry = new String[] { "<hr>", "<hr>", "<hr>" };
		int indexS = 0;
		int offset = 945;

		if (O.IS_LINUX) {

			offset = 930;

		}

		for (int i = 0; i != 3; i++) {

			if (str.indexOf(sAryDate[indexS]) > 0) {

				int index = str.indexOf(sAryDate[indexS]) + offset;
				// O.l(index);

				String tempS = str.substring(index, index + 600).trim();

				String[] tempSAry = O.splitNTrimAll(tempS, "</span>");// only \n fuck
				// O.l(tempSAry);

				tempS = tempSAry[0].substring(tempSAry[0].length() - 2, tempSAry[0].length()) + ",&nbsp;";
				tempS += tempSAry[1].substring(tempSAry[1].length() - 2, tempSAry[1].length()) + ",&nbsp;";
				tempS += tempSAry[2].substring(tempSAry[2].length() - 2, tempSAry[2].length()) + ",&nbsp;";
				tempS += tempSAry[3].substring(tempSAry[3].length() - 2, tempSAry[3].length()) + ",&nbsp;";
				tempS += tempSAry[4].substring(tempSAry[4].length() - 2, tempSAry[4].length());

				retSAry[indexS] = sAryDate[indexS] + O.S32 + "&nabla;" + Jsp.L + tempS + O.L + "<hr>";

				// O.l("retSAry[indexS]=" + retSAry[indexS]);

			}

			indexS++;

		}

		return retSAry;

	}

	public static void main(String[] sAry) throws Throwable {

		StringBuilder str = Strva.mergeInStr(strAryWinningNumRecent3Day(), Jsp.L);
		O.l(str);
		// O.l(strAryWinningNumIn3Day());
		O.l();

	}

}
