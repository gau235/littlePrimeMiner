package lGpl20.other.sample;

import java.util.TreeMap;

import lGpl20.o.O;
import lGpl20.other.jsp.Jsp;

/**
 * To open a Http connection.<br/>
 * <br/>
 * To open a Http connection.
 * 
 * @version 2017/01/14_20:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C109_HttpConn" >C109_HttpConn.java</a>
 * 
 */
public class C109_HttpConn {

	public static void main(String[] sAry) throws Throwable {

		String sUrl = "http://c64.tw/w20/fraction/doFr64NoneJson.jsp";
		// String sUrl = "http://gau89:8080/w20/fraction/doFr64NoneJson.jsp";
		TreeMap<String, String> mapOfParam = new TreeMap<String, String>();
		mapOfParam.put("f1", "1/2");
		mapOfParam.put("f2", "0.3");
		mapOfParam.put("op", "add");

		StringBuilder str = Jsp.doPostNDownload(sUrl, mapOfParam);
		O.l(str);

	}

}
