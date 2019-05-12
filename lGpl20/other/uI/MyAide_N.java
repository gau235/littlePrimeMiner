package lGpl20.other.uI;

import java.util.TreeMap;

import lGpl20.o.O;
import lGpl20.other.uI.thr.MyThrToSendToHttp;

/**
 * @version 2017/08/20_09:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAide_N" >MyAide_N.java</a>
 * 
 * @see MyAide_U
 */
public abstract class MyAide_N extends MyAide_L {

	private static final Class<MyAide_N> CLASS_THIS = MyAide_N.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To send error to http.<br/>
	 * To send error to http.
	 */
	public static void sendHttpErr(CharSequence errCharSequence, CharSequence charSequenceAsNote) {

		TreeMap<String, String> mapOfParam = new TreeMap<String, String>();

		mapOfParam.put("err", errCharSequence.toString());
		mapOfParam.put("note", charSequenceAsNote.toString());

		new MyThrToSendToHttp(MY_URL_TO_REC_ERR, mapOfParam).start();

	}

}
