package lGpl20.o.keyNVal;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 本類別 String 與 int.<br/>
 * <br/>
 * Something like a String which is attached to the int.
 * 
 * @version 2019/03/07_09:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SNInt32WCompa" > SNInt32WCompa.java</a>
 * 
 * @see MapOfSNInt32WCompa
 */
public class SNInt32WCompa implements Comparable<SNInt32WCompa>, Serializable {

	private static final Class<SNInt32WCompa> CLASS_THIS = SNInt32WCompa.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The String.<br/>
	 * The String.
	 */
	public String s;

	/**
	 * The int.<br/>
	 * The int.
	 */
	public int count32 = 1;// fuck, start with 1

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public SNInt32WCompa(String s) {

		this.s = s;

	}

	/**
	 * 比較彼此的 32 位元整數的大小.<br/>
	 * To compare to other's at0().
	 */
	@Override
	public int compareTo(SNInt32WCompa otherSNInt32WCompa) {

		int retInt32 = this.s.compareTo(otherSNInt32WCompa.s);// just compare to String; important

		// if (retInt32 == 0) {
		//
		// if (this.count32 > otherSNInt32WCompa.count32) {
		//
		// return 1;
		//
		// }
		//
		// if (this.count32 < otherSNInt32WCompa.count32) {
		//
		// return -1;
		//
		// }
		//
		// }

		return retInt32;

	}

	/**
	 * 比較彼此的 32 位元整數的大小.<br/>
	 * To compare to other's at0().
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {

			return false;

		}

		if (obj instanceof SNInt32WCompa) {

			SNInt32WCompa otherSNInt32WCompa = (SNInt32WCompa) obj;

			return (compareTo(otherSNInt32WCompa) == 0);

		}

		return super.equals(obj);

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr() {

		return new StringBuilder(O.DEF_CAPACITY32_FOR_STR).append(this.s).append(O.C61).append(this.count32);

	}

	@Override
	public String toString() {

		return toStr().toString();

	}

}
