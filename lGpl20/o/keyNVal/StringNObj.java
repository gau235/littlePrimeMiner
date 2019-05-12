package lGpl20.o.keyNVal;

import lGpl20.o.O;

/**
 * 本類別字串與泛型物件, 其內第 0 位置是字串, 第 1 位置是泛型物件.<br/>
 * <br/>
 * Something like a pair with a String and a generic type object.
 * 
 * @version 2014/07/03_20:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=StringNObj" >StringNObj.java</a>
 * 
 * @see Int64NObj
 * 
 * @see CompaNObj
 */
public class StringNObj<At1> extends CompaNObj<String, At1> {

	@SuppressWarnings("rawtypes")
	private static final Class<StringNObj> CLASS_THIS = StringNObj.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法, 生成物件的字串 ( 第 0 位置 ) 是 at0, 的泛型物件 ( 第 1 位置 ) 是 null.<br/>
	 * Constructor; the String is at0 and the generic type object is null.
	 */
	public StringNObj(String at0) {

		super(at0);
	}

	/**
	 * 建構方法, 生成物件的字串 ( 第 0 位置 ) 是 at0, 的泛型物件 ( 第 1 位置 ) 是 at1.<br/>
	 * Constructor; the String is at0 and the generic type object is at1.
	 */
	public StringNObj(String at0, At1 at1) {

		super(at0, at1);

	}

}
