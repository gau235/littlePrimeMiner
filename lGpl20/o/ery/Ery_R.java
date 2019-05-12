package lGpl20.o.ery;

import java.util.Arrays;

import lGpl20.o.O;

/**
 * @version 2018/10/16_10:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ery_R" >Ery_R.java</a>
 * 
 * @see Ery_X
 */
public abstract class Ery_R<Elem> extends Ery_P<Elem> {

	@SuppressWarnings("rawtypes")
	private static final Class<Ery_R> CLASS_THIS = Ery_R.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery_R(Elem... aryOfElem) {

		super(aryOfElem);

	}

	/**
	 * 排序.<br/>
	 * To sort.
	 */
	public Ery_R<Elem> sort(int fromIndex, int toIndex) {// always sync

		synchronized (KEY_TO_SYN) {

			Arrays.sort(aryOfElem, fromIndex, toIndex, comparator);

			return this;

		}

	}

	/**
	 * 排序.<br/>
	 * To sort.
	 * 
	 * @return this.
	 */
	public Ery_R<Elem> sort() {

		synchronized (KEY_TO_SYN) {

			Arrays.sort(aryOfElem, 0, iLen, comparator);

			return this;

		}

	}

	/**
	 * 搜尋.<br/>
	 * To search (not null).
	 */
	public int biSearch(int fromIndex, int toIndex, Elem elem) {// always sync

		if (elem == null) {

			throw new NullPointerException();

		}

		synchronized (KEY_TO_SYN) {

			return Arrays.binarySearch(aryOfElem, fromIndex, toIndex, elem, comparator);

		}

	}

	/**
	 * 搜尋.<br/>
	 * To search.
	 */
	public int biSearch(Elem elem) {

		if (elem == null) {

			throw new NullPointerException();

		}

		synchronized (KEY_TO_SYN) {

			return Arrays.binarySearch(aryOfElem, 0, iLen, elem, comparator);

		}

	}

}
