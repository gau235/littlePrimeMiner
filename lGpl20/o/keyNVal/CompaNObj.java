package lGpl20.o.keyNVal;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import lGpl20.o.O;

/**
 * 本類別可比較介面與泛型物件, 把可比較介面當 key, 泛型物件當 value 配成一對.<br/>
 * <br/>
 * Something like a pair with a Comparable and a generic type object.
 * 
 * @version 2016/10/23_12:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaNObj" >CompaNObj.java</a>
 * 
 * @see Int64NObj
 * 
 * @see StringNObj
 */
public class CompaNObj<At0 extends Comparable<? super At0>, At1>
		implements ICompaNObj<At0, At1>, Comparable<CompaNObj<At0, At1>>, Serializable {

	@SuppressWarnings("rawtypes")
	private static final Class<CompaNObj> CLASS_THIS = CompaNObj.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 本可比較介面與泛型物件中的可比較介面 ( 第 0 位置 ).<br/>
	 * The Comparable(the 0-th position) of this.
	 */
	private final At0 AT0;

	/**
	 * 本可比較介面與泛型物件中的泛型物件 ( 第 1 位置 ).<br/>
	 * The generic type object(the 1-th position) of this.
	 */
	private final At1 AT1;

	/**
	 * 建構方法, 生成物件的可比較介面 ( 第 0 位置 ) 是 at0, 的泛型物件 ( 第 1 位置 ) 是 null.<br/>
	 * Constructor; the Comparable is at0 and the generic type object is null.
	 */
	public CompaNObj(At0 at0) {

		this(at0, null);

	}

	/**
	 * 建構方法, 生成物件的可比較介面 ( 第 0 位置 ) 是 at0, 的泛型物件 ( 第 1 位置 ) 是 at1.<br/>
	 * Constructor; the Comparable is at0 and the generic type object is at1.
	 */
	public CompaNObj(At0 at0, At1 at1) {

		if (at0 == null) {

			throw new NullPointerException();

		}

		AT0 = at0;
		AT1 = at1;
	}

	/**
	 * 取本可比較介面與泛型物件中的可比較介面 ( 第 0 位置 ).<br/>
	 * To get the Comparable of this.
	 * 
	 * @see #at1()
	 */
	@Override
	public At0 at0() {

		return AT0;

	}

	/**
	 * 取本可比較介面與泛型物件中的泛型物件 ( 第 1 位置 ).<br/>
	 * To get the generic type object of this.
	 * 
	 * @see #at0()
	 */
	@Override
	public At1 at1() {

		return AT1;

	}

	/**
	 * 比較彼此可比較介面與泛型物件中的可比較介面的大小.<br/>
	 * To compare to other's Comparable(at0()).
	 */
	@Override
	public int compareTo(CompaNObj<At0, At1> compaNObj) {

		return AT0.compareTo(compaNObj.at0());

	}

	/**
	 * 比較彼此可比較介面與泛型物件中的可比較介面的大小.<br/>
	 * To compare to other's Comparable(at0()).
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {

			return false;

		}

		if (obj instanceof CompaNObj) {

			return compareTo((CompaNObj<At0, At1>) obj) == 0;// todo: need to improve

		}

		return super.equals(obj);

	}

	/**
	 * 用反身性呼叫 toStr 或 toString.<br/>
	 * To call toStr or toString by reflect.
	 */
	public static Object toStrByToReflect(Object obj) {

		if (obj instanceof StringBuilder) {

			return obj;

		}

		Class<?> theClass = obj.getClass();

		Method method = null;

		try {

			method = theClass.getMethod(O.NAME_METHOD_TO_STR);

		} catch (NoSuchMethodException noSuchMethodException) {

			try {

				method = theClass.getMethod(O.NAME_METHOD_TO_STRING);

			} catch (NoSuchMethodException | SecurityException e) {

				e.printStackTrace();

			}

		}

		Object retObj = null;

		try {

			retObj = method.invoke(obj);

		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {

			e.printStackTrace();

		}

		return retObj;

	}

	@Override
	public StringBuilder toStr() {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		Object obj0 = toStrByToReflect(AT0);
		Object obj1 = toStrByToReflect(AT1);

		retStr.append(O.C40);

		if (obj0 instanceof StringBuilder) {

			retStr.append((StringBuilder) obj0);

		} else {

			retStr.append(obj0);

		}

		retStr.append(O.C94);

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
