package lGpl20.other.jsp;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.TreeMap;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * @version 2018/04/09_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Jsp_W" >Jsp_W.java</a>
 * 
 * @see Jsp_W
 */
public abstract class Jsp_V extends Jsp_K {

	private static final Class<Jsp_V> CLASS_THIS = Jsp_V.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * From MapOfParam to arg.<br/>
	 * From MapOfParam to arg.
	 * 
	 * @throws UnsupportedEncodingException
	 */
	public static StringBuilder mapOfParamToEncodedArg(TreeMap<String, String> mapOfParam) throws UnsupportedEncodingException {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		Ery<String> eryOfKey = new Ery<String>(mapOfParam.keySet());

		for (int i = 0, len = eryOfKey.len(); i != len; i++) {

			String key = eryOfKey.at(i);
			String value = mapOfParam.get(key);

			if (i == 0) {

				retStr.append(key).append(C61);

			} else {

				retStr.append(C38).append(key).append(C61);

			}

			retStr.append(URLEncoder.encode(value, S_UTF_8));// important

		}

		return retStr;

	}

}