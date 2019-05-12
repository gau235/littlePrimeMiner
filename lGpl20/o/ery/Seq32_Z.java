package lGpl20.o.ery;

import lGpl20.o.O;

/**
 * @version 2017/03/17_09:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq32_Z" >Seq32_Z.java</a>
 * 
 * @see Seq32
 */
public abstract class Seq32_Z extends Seq32_F {

	private static final Class<Seq32_Z> CLASS_THIS = Seq32_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq32_Z(int[] ary32) {

		super(ary32);

	}

	/**
	 * 取得第 index 個項.<br/>
	 * To get the element of this by index.<br/>
	 * Not thread safe.<br/>
	 */
	public int at(int index) {

		try {

			return ary32[index];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver" + O.S58 + O.S32 + "iLen=" + iLen + O.S32 + "seq.len=" + ary32.length + O.S32 + CLASS_THIS);

			return Integer.MIN_VALUE;// fuck

		}

	}

	/**
	 * 取得第 0 個項.<br/>
	 * To return the 0-th element (head) of this.<br/>
	 * Not thread safe.<br/>
	 * 
	 * @see #tail()
	 */
	public int head() {

		try {

			return ary32[0];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver" + O.S58 + O.S32 + "iLen=" + iLen + O.S32 + "seq.len=" + ary32.length + O.S32 + CLASS_THIS);

			return Integer.MIN_VALUE;// fuck

		}

	}

	/**
	 * 取得第末個項.<br/>
	 * To return the last element (tail) of this.<br/>
	 * Not thread safe.<br/>
	 * 
	 * @see #head()
	 */
	public int tail() {

		try {

			return ary32[iLen - 1];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver" + O.S58 + O.S32 + "iLen=" + iLen + O.S32 + "seq.len=" + ary32.length + O.S32 + CLASS_THIS);

			return Integer.MIN_VALUE;// fuck

		}

	}

	/**
	 * 置入並取代此伍的 index 位置的項.<br/>
	 * To replace the element at the index position.
	 */
	public boolean replace(int index, int int32) {

		if (!Ery.isInBound(index, iLen)) {

			return false;

		}

		ary32[index] = int32;

		return true;

	}

}
