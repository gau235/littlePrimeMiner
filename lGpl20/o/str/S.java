package lGpl20.o.str;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 本類別字串包覆者.<br/>
 * The wrapper for string.
 * 
 * @version 2019/04/23_01:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S" >S.java</a>
 * 
 */
public class S implements Serializable {

	private static final Class<S> CLASS_THIS = S.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 換行符號.<br/>
	 * The line separator.
	 */
	public CharSequence lineWr = O.L;

	/**
	 * 內建的字串建立者.<br/>
	 * The inside StringBuilder.
	 */
	public StringBuilder str;

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S a(boolean b) {

		str.append(b);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S a(int int32) {

		str.append(int32).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S a(long int64) {

		str.append(int64).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S a(float f32) {

		str.append(f32).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S a(double f64) {

		str.append(f64);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S a(char c) {

		str.append(c);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S a(char[] aryOfChar) {

		str.append(aryOfChar);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S a(CharSequence charSequence) {

		str.append(charSequence);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S l(boolean b) {

		str.append(b).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S l(int int32) {

		str.append(int32).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S l(long int64) {

		str.append(int64).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S l(float f32) {

		str.append(f32).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S l(double f64) {

		str.append(f64).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S l(char c) {

		str.append(c).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S l(char[] aryOfChar) {

		str.append(aryOfChar).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S l(CharSequence charSequence) {

		str.append(charSequence).append(lineWr);
		return this;

	}

	/**
	 * 串接文字.<br/>
	 * To append.
	 */
	public S l() {

		str.append(lineWr);
		return this;

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public S(int capacity) {

		str = new StringBuilder(capacity);

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public S() {

		this(O.DEF_CAPACITY32_FOR_STR);

	}

}