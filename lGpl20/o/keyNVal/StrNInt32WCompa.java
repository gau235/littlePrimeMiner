package lGpl20.o.keyNVal;

import java.io.Serializable;

import lGpl20.comb.filter.CompaForStr;
import lGpl20.o.O;

/**
 * 本類別 String 與 int.<br/>
 * <br/>
 * Something like a String which is attached to the int.
 * 
 * @version 2019/02/14_14:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=StrNInt32WCompa" >StrNInt32WCompa.java</a>
 * 
 * @see CompaForStr
 */
public class StrNInt32WCompa implements Comparable<StrNInt32WCompa>, Serializable {

	private static final Class<StrNInt32WCompa> CLASS_THIS = StrNInt32WCompa.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The StringBuilder.<br/>
	 * The StringBuilder.
	 */
	public StringBuilder str;

	/**
	 * The int.<br/>
	 * The int.
	 */
	public int count32 = 1;// fuck, start with 1

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public StrNInt32WCompa(StringBuilder str) {

		this.str = str;

	}

	/**
	 * 比較彼此的 32 位元整數的大小.<br/>
	 * To compare to other's at0().
	 */
	@Override
	public int compareTo(StrNInt32WCompa otherStrNInt32) {

		return CompaForStr.compa(str, otherStrNInt32.str);

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

		if (obj instanceof StrNInt32WCompa) {

			StrNInt32WCompa otherStrNInt32 = (StrNInt32WCompa) obj;

			return CompaForStr.compa(str, otherStrNInt32.str) == 0;

		}

		return super.equals(obj);

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr() {

		return new StringBuilder(O.DEF_CAPACITY32_FOR_STR).append(this.str).append(O.C61).append(this.count32);

	}

	@Override
	public String toString() {

		return toStr().toString();

	}

}
