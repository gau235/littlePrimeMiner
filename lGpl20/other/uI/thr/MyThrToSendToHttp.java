package lGpl20.other.uI.thr;

import java.util.TreeMap;

import lGpl20.o.O;
import lGpl20.other.jsp.Jsp;

/**
 * The thread to send the record to Http.<br/>
 * The thread to send the record to Http.
 * 
 * @version 2019/04/24_22:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyThrToSendToHttp" > MyThrToSendToHttp.
 *          java</a>
 * 
 */
public class MyThrToSendToHttp extends Thread {

	private static final Class<MyThrToSendToHttp> CLASS_THIS = MyThrToSendToHttp.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The URL to record.<br/>
	 * The URL to record.
	 */
	protected final String S_URL;

	protected final TreeMap<String, String> MAP;

	public MyThrToSendToHttp(String sUrl, TreeMap<String, String> mapOfParam) {

		S_URL = sUrl;
		MAP = mapOfParam;

	}

	@Override
	public void run() {

		if (O.IS_TO_DEV) {

			O.l("S_URL=" + S_URL + O.S32 + CLASS_THIS);
			O.l("MAP=" + MAP + O.S32 + CLASS_THIS);

		}

		try {

			Jsp.doPost(S_URL, MAP);

		} catch (Throwable throwable) {

			throwable.printStackTrace();

		}

	}

}
