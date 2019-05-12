package lGpl20.o.keyNVal;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 本類別 32 位元整數與泛型物件, 其內第 0 位置是 32 位元整數, 第 1 位置是泛型物件.<br/>
 * <br/>
 * Something like a long which is attached to the generic type object.
 * 
 * @version 2018/04/09_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Int32NObj" >Int32NObj.java</a>
 * 
 * @see Int64NObj
 * 
 * @see StringNObj
 */
public class Int32NObj<At1> implements Comparable<Int32NObj<At1>>, Serializable {

	@SuppressWarnings("rawtypes")
	private static final Class<Int32NObj> CLASS_THIS = Int32NObj.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 本可比較介面與泛型物件中的可比較介面 ( 第 0 位置 ).<br/>
	 * The Comparable(the 0-th position) of this.
	 */
	private final int AT0;

	/**
	 * 本可比較介面與泛型物件中的泛型物件 ( 第 1 位置 ).<br/>
	 * The generic type object(the 1-th position) of this.
	 */
	private final At1 AT1;

	/**
	 * 建構方法, 生成物件的 64 位元整數是 at0, 第 1 位置的泛型物件 at1.<br/>
	 * Constructor; the Int64NObj object's int64 is at0 and the generic type object is at1.
	 */
	public Int32NObj(int at0, At1 at1) {

		AT0 = at0;
		AT1 = at1;

	}

	/**
	 * 建構方法, 生成物件的 64 位元整數是 at0, 第 1 位置的泛型物件 null.<br/>
	 * Constructor; the Int64NObj object's int64 is at0 and the generic type object is null.
	 */
	public Int32NObj(int at0) {

		this(at0, null);

	}

	/**
	 * 取本可比較介面與泛型物件中的可比較介面 ( 第 0 位置 ).<br/>
	 * To get the Comparable of this.
	 * 
	 * @see #at1()
	 */
	public int at0() {

		return AT0;

	}

	/**
	 * 取本可比較介面與泛型物件中的泛型物件 ( 第 1 位置 ).<br/>
	 * To get the generic type object of this.
	 * 
	 * @see #at0()
	 */
	public At1 at1() {

		return AT1;

	}

	/**
	 * 比較彼此的 32 位元整數的大小.<br/>
	 * To compare to other's at0().
	 */
	@Override
	public int compareTo(Int32NObj<At1> int32NObj) {

		int at0 = at0();
		int otherAt0 = int32NObj.at0();

		if (at0 > otherAt0) {

			return 1;

		}

		if (at0 < otherAt0) {

			return -1;

		}

		return 0;

	}

	/**
	 * 比較彼此的 64 位元整數的大小.<br/>
	 * To compare to other's at0().
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {

			return false;

		}

		if (obj instanceof CompaNObj) {

			return compareTo((Int32NObj<At1>) obj) == 0;

		}

		return super.equals(obj);

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr() {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		retStr.append(O.C40).append(AT0);
		retStr.append(O.C94);

		Object obj1 = CompaNObj.toStrByToReflect(AT1);

		if (obj1 instanceof StringBuilder) {

			retStr.append((StringBuilder) obj1);

		} else {

			retStr.append(obj1);

		}

		return retStr.append(O.C41);

	}

	@Override
	public String toString() {

		return toStr().toString();

	}

}
