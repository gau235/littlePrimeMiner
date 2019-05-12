package lGpl20.other.jsp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.TreeMap;

import lGpl20.o.O;

/**
 * @version 2018/04/09_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Jsp_W" >Jsp_W.java</a>
 * 
 * @see Jsp_Y
 */
public abstract class Jsp_W extends Jsp_V {

	private static final Class<Jsp_W> CLASS_THIS = Jsp_W.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To do HTML post.<br/>
	 * To do HTML post.
	 * 
	 * @throws IOException
	 */
	public static void doPost(String stringForUrl, TreeMap<String, String> mapOfParam) throws IOException {

		// l("stringForUrl=" + S32 + CLASS_THIS + L + stringForUrl);
		String someParam = mapOfParamToEncodedArg(mapOfParam).toString();
		// l("someParam=" + someParam + S32 + CLASS_THIS);

		HttpURLConnection httpUrlConn = (HttpURLConnection) (new URL(stringForUrl).openConnection());

		httpUrlConn.setDoOutput(true);
		// httpUrlConn.setDoInput(true);
		httpUrlConn.setRequestMethod(STRING_POST);
		httpUrlConn.connect();

		try (OutputStreamWriter outWriter = new OutputStreamWriter(httpUrlConn.getOutputStream());
				BufferedWriter bufWriter = new BufferedWriter(outWriter);) {

			bufWriter.write(someParam);// first to write then to flush
			bufWriter.flush();

		}

		// int respCode = httpUrlConn.getResponseCode();
		// l("respCode=" + respCode);
		// if (respCode == HttpURLConnection.HTTP_OK) {}
		// try (BufferedReader bufReader = new BufferedReader(new InputStreamReader(httpUrlConn.getInputStream()));) {}

		httpUrlConn.getInputStream().close();// fuck
		httpUrlConn.disconnect();

	}

	/**
	 * To do HTML post.<br/>
	 * To do HTML post.
	 * 
	 * @throws IOException
	 */
	public static StringBuilder doPostNDownload(String stringForUrl, TreeMap<String, String> mapOfParam) throws IOException {

		// l("stringForUrl=" + S32 + CLASS_THIS + L + stringForUrl);

		String someParam = mapOfParamToEncodedArg(mapOfParam).toString();
		// l("someParam=" + someParam + S32 + CLASS_THIS);

		HttpURLConnection httpUrlConn = (HttpURLConnection) (new URL(stringForUrl).openConnection());

		httpUrlConn.setDoOutput(true);
		httpUrlConn.setDoInput(true);
		httpUrlConn.setRequestMethod(STRING_POST);
		httpUrlConn.connect();

		try (OutputStreamWriter outWriter = new OutputStreamWriter(httpUrlConn.getOutputStream());
				BufferedWriter bufWriter = new BufferedWriter(outWriter);) {

			bufWriter.write(someParam);// first to write then to flush
			bufWriter.flush();

		}

		// download
		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
		try (BufferedReader bufReader = new BufferedReader(new InputStreamReader(httpUrlConn.getInputStream()));) {

			String sLine;

			while ((sLine = bufReader.readLine()) != null) {

				// l(sLine + S32 + CLASS_THIS);
				retStr.append(sLine).append(C_A_L);

			}

		}

		httpUrlConn.disconnect();

		return retStr;

	}

}