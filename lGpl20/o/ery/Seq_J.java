package lGpl20.o.ery;

import java.util.Arrays;

import lGpl20.o.O;

/**
 * @version 2018/04/07_17:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq_J" >Seq_J.java</a>
 * 
 * @see Seq_Z
 */
public abstract class Seq_J extends Seq_C {

	private static final Class<Seq_J> CLASS_THIS = Seq_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq_J(long[] ary) {

		super(ary);

	}

	/**
	 * To sort.<br/>
	 * To sort.
	 */
	public Seq_J sort(int fromIndex, int toIndex) {

		Arrays.sort(ary, fromIndex, toIndex);
		return this;

	}

	/**
	 * To sort.<br/>
	 * To sort.
	 */
	public Seq_J sort() {

		sort(0, iLen);
		return this;

	}

	/**
	 * 搜尋.<br/>
	 * To search (not null).
	 */
	public int biSearch(int fromIndex, int toIndex, long key) {

		return Arrays.binarySearch(ary, fromIndex, toIndex, key);

	}

	/**
	 * 搜尋.<br/>
	 * To search (not null).
	 */
	public int biSearch(long key) {

		return biSearch(0, iLen, key);

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr() {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != iLen;) {

			retStr.append(ary[i]);

			if (++i != iLen) {

				retStr.append(O.C_A_L);

			}

		}

		return retStr;

	}

}
