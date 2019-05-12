package lGpl20.o.ery;

import java.lang.reflect.Array;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * @version 2018/12/26_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ery_J" >Ery_J.java</a>
 * 
 * @see Ery_P
 */
public abstract class Ery_J<Elem> extends Ery_C<Elem> {

	@SuppressWarnings("rawtypes")
	private static final Class<Ery_J> CLASS_THIS = Ery_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery_J(Elem... aryOfElem) {

		super(aryOfElem);

	}

	/**
	 * 取得比較器.<br/>
	 * To return the Comparator&lt;Elem&gt;.
	 */
	public Comparator<Elem> getComparator() {

		return comparator;

	}

	/**
	 * 設定比較器.<br/>
	 * To set the Comparator&lt;Elem&gt;.
	 */
	public void setComparator(Comparator<Elem> comparator) {

		synchronized (KEY_TO_SYN) {

			this.comparator = comparator;

		}

	}

	/**
	 * 回傳此伍含有幾個項.<br/>
	 * To return the number of elements inside this.
	 */
	public int len() {

		return iLen;

	}

	/**
	 * 確保不會 IndexOutOfBoundsException.<br/>
	 * To ensure the length of data array and to avoid the IndexOutOfBoundsException.<br/>
	 * Not thread safe.
	 */
	@SuppressWarnings("unchecked")
	protected void ensureLen32(int newLen32) {

		if (aryOfElem.length >= newLen32) {

			return;

		}

		if (O.IS_TO_DEV) {

			O.l("aryOfElem.length=" + aryOfElem.length + ", newLen32=" + newLen32 + O.S32 + CLASS_THIS);

		}

		int tempLen = aryOfElem.length;
		do {

		} while ((tempLen = (tempLen << Ery.NUM_OF_2_POW_TO_ENSURE_LEN32)) < newLen32);// must be while

		// Class<? extends Elem[]> newType = (Class<? extends Elem[]>) aryOfElem.getClass();
		// aryOfElem = (Elem[]) Arrays.copyOf(aryOfElem, newLen32, newType);

		Elem[] tempAry;

		// if ((Object) newType == (Object) Object[].class) {
		if (aryOfElem.getClass() == (Object) Object[].class) {

			if (O.IS_TO_DEV) {

				O.l("aryOfElem.getClass()=" + aryOfElem.getClass() + O.S32 + CLASS_THIS);

			}

			tempAry = (Elem[]) new Object[tempLen];

		} else {

			// tempAry = (Elem[]) Array.newInstance(aryOfElem.getComponentType(), newLen32);
			tempAry = (Elem[]) Array.newInstance(aryOfElem[0].getClass(), tempLen);

		}

		System.arraycopy(aryOfElem, 0, tempAry, 0, aryOfElem.length);

		// Elem[] tempAry = (Elem[]) new Object[newLen32];
		// System.arraycopy(aryOfElem, 0, tempAry, 0, aryOfElem.length);

		aryOfElem = tempAry;

	}

}
