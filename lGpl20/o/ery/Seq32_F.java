package lGpl20.o.ery;

import java.util.Arrays;

import lGpl20.o.O;

/**
 * @version 2017/06/20_16:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq32_F" >Seq32_F.java</a>
 * 
 * @see Seq32_Z
 */
public abstract class Seq32_F extends Seq32_C {

	private static final Class<Seq32_F> CLASS_THIS = Seq32_F.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq32_F(int[] ary32) {

		super(ary32);

	}

	/**
	 * To sort.<br/>
	 * To sort.
	 */
	public Seq32_F sort(int fromIndex, int toIndex) {

		Arrays.sort(ary32, fromIndex, toIndex);
		return this;

	}

	/**
	 * To sort.<br/>
	 * To sort.
	 */
	public Seq32_F sort() {

		sort(0, iLen);
		return this;

	}

	/**
	 * 搜尋.<br/>
	 * To search (not null).
	 */
	public int biSearch(int fromIndex, int toIndex, int key) {

		return Arrays.binarySearch(ary32, fromIndex, toIndex, key);

	}

	/**
	 * 搜尋.<br/>
	 * To search (not null).
	 */
	public int biSearch(int key) {

		return biSearch(0, iLen, key);

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr() {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != iLen;) {

			retStr.append(ary32[i]);

			if (++i != iLen) {

				retStr.append(O.C_A_L);

			}

		}

		return retStr;

	}

}
