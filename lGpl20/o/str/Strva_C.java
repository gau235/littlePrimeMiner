package lGpl20.o.str;

import java.util.Enumeration;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * @version 2019/03/01_15:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Strva_C" >Strva_C.java</a>
 * 
 * @see Strva_H
 */
public abstract class Strva_C extends Strva_A {

	private static final Class<Strva_C> CLASS_THIS = Strva_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To merge all string in array of string.<br/>
	 * To merge all string in array of string.
	 */
	public static StringBuilder mergeInStr(String[] sAry, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
		for (int i = 0; i != sAry.length;) {

			retStr.append(sAry[i]);

			if (++i != sAry.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

	/**
	 * To merge all string in array of string.<br/>
	 * To merge all string in array of string.
	 */
	public static String[] mergeIn1SAry(Ery<String[]> eryOfSAry) {

		int i;
		int len;
		int bigLen32 = 0;

		// String[][] ss2 = eryOfSAry.toGenericAry(new String[0][0]);
		// String[] ss1=

		Object[] objAry = eryOfSAry.aryOfElem();

		for (i = 0, len = eryOfSAry.len(); i != len; i++) {

			bigLen32 = bigLen32 + ((String[]) objAry[i]).length;

		}

		String[] retSAry = new String[bigLen32];

		int iRetSAry = 0;

		String[] tempSAry;

		for (i = 0; i != len; i++) {

			tempSAry = (String[]) objAry[i];

			System.arraycopy(tempSAry, 0, retSAry, iRetSAry, tempSAry.length);

			iRetSAry = iRetSAry + tempSAry.length;

		}

		return retSAry;

	}

	/**
	 * 把 TreeMap 轉字串建立者.<br/>
	 * To convert the TreeMap to StringBuilder with line wrapper.
	 */
	public static StringBuilder toStrWLineWr(Properties properties, CharSequence lineWr) {

		Enumeration<?> enumeration = properties.propertyNames();

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		String key;
		while (enumeration.hasMoreElements()) {

			key = (String) enumeration.nextElement();
			retStr.append(key).append(O.C61).append(properties.getProperty(key)).append(lineWr);// everyone with lineWr

		}

		return retStr;

	}

	/**
	 * 把 TreeMap 轉字串建立者.<br/>
	 * To convert the Map to StringBuilder with line wrapper.
	 */
	public static StringBuilder toStrWLineWr(Map<?, ?> map, CharSequence lineWr) { // todo: StrByReflect

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		// Set<Map.Entry<String, ? extends CharSequence>> allEntry = map.entrySet();
		Object[] objAry = map.entrySet().toArray();

		// Entry<?, ?>
		for (int i = 0; i != objAry.length;) {

			Entry<?, ?> entry = (Entry<?, ?>) objAry[i];
			// O.l("entry" + entry + O.S32 + CLASS_THIS);
			retStr.append(entry.getKey()).append(O.C61).append(entry.getValue());
			// O.l("retStr=" + retStr + O.S32 + CLASS_THIS);

			if (++i != objAry.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

}
