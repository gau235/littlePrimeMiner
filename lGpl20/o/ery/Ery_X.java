package lGpl20.o.ery;

import lGpl20.o.O;
import lGpl20.o.keyNVal.CompaNObj;

/**
 * @version 2018/04/07_17:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ery_X" >Ery_X.java</a>
 * 
 * @see Ery_Z
 */
public abstract class Ery_X<Elem> extends Ery_R<Elem> {

	@SuppressWarnings("rawtypes")
	private static final Class<Ery_X> CLASS_THIS = Ery_X.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery_X(Elem... aryOfElem) {

		super(aryOfElem);

	}

	/**
	 * 把陣列轉成字串建立者.<br/>
	 * To convert the array to StringBuilder.
	 * 
	 * @see CompaNObj#toStrByToReflect(Object)
	 */
	public StringBuilder toStr() {

		synchronized (KEY_TO_SYN) {

			StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
			Object objAsStr;

			for (int i = 0; i != iLen;) {

				objAsStr = CompaNObj.toStrByToReflect(aryOfElem[i]);

				if (objAsStr instanceof StringBuilder) {

					retStr.append((StringBuilder) objAsStr);

				} else {

					retStr.append(objAsStr);

				}

				if (++i != iLen) {

					retStr.append(O.C_A_L);

				}

			}

			return retStr;

		}

	}

}
