package lGpl20.o.keyNVal;

import java.io.Serializable;

import lGpl20.comb.filter.CompaForStr;
import lGpl20.o.O;

/**
 * 本類別 bit64 與 int.<br/>
 * <br/>
 * Something like an int which is attached to the bit64.
 * 
 * @version 2019/03/07_09:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64NInt32WCompa" >B64NInt32WCompa.java
 *          </a>
 * 
 * @see CompaForStr
 */
public class B64NInt32WCompa implements Comparable<B64NInt32WCompa>, Serializable {

	private static final Class<B64NInt32WCompa> CLASS_THIS = B64NInt32WCompa.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The StringBuilder.<br/>
	 * The StringBuilder.
	 */
	public long b64;

	/**
	 * The int.<br/>
	 * The int.
	 */
	public int count32 = 1;// fuck, start with 1

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public B64NInt32WCompa(long b64) {

		this.b64 = b64;

	}

	/**
	 * 比較彼此的 32 位元整數的大小.<br/>
	 * To compare to other's at0().
	 */
	@Override
	public int compareTo(B64NInt32WCompa otherB64NInt32WCompa) {

		if (this.b64 > otherB64NInt32WCompa.b64) {

			return 1;

		}

		if (this.b64 < otherB64NInt32WCompa.b64) {

			return -1;

		}

		return 0;

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

		if (obj instanceof B64NInt32WCompa) {

			B64NInt32WCompa otherB64NInt32WCompa = (B64NInt32WCompa) obj;

			return compareTo(otherB64NInt32WCompa) == 0;

		}

		return super.equals(obj);

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr() {

		return new StringBuilder(O.DEF_CAPACITY32_FOR_STR).append(this.b64).append(O.C61).append(this.count32);

	}

	@Override
	public String toString() {

		return toStr().toString();

	}

}
