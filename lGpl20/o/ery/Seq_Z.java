package lGpl20.o.ery;

import lGpl20.o.O;

/**
 * @version 2017/03/17_09:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq_Z" >Seq_Z.java</a>
 * 
 * @see Seq
 */
public abstract class Seq_Z extends Seq_J {

	private static final Class<Seq_Z> CLASS_THIS = Seq_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq_Z(long[] ary) {

		super(ary);

	}

	/**
	 * 取得第 index 個項.<br/>
	 * To get the element of this by index.<br/>
	 * Not thread safe.<br/>
	 */
	public long at(int index) {

		try {

			return ary[index];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver" + O.S58 + O.S32 + "iLen=" + iLen + O.S32 + "seq.len=" + ary.length + O.S32 + CLASS_THIS);

			return Long.MIN_VALUE;// fuck

		}

	}

	/**
	 * 取得第 0 個項.<br/>
	 * To return the 0-th element (head) of this.<br/>
	 * Not thread safe.<br/>
	 * 
	 * @see #tail()
	 */
	public long head() {

		try {

			return ary[0];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver" + O.S58 + O.S32 + "iLen=" + iLen + O.S32 + "seq.len=" + ary.length + O.S32 + CLASS_THIS);

			return Long.MIN_VALUE;// fuck

		}

	}

	/**
	 * 取得第末個項.<br/>
	 * To return the last element (tail) of this.<br/>
	 * Not thread safe.<br/>
	 * 
	 * @see #head()
	 */
	public long tail() {

		try {

			return ary[iLen - 1];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver" + O.S58 + O.S32 + "iLen=" + iLen + O.S32 + "seq.len=" + ary.length + O.S32 + CLASS_THIS);

			return Long.MIN_VALUE;// fuck

		}

	}

	/**
	 * 置入並取代此伍的 index 位置的項.<br/>
	 * To replace the element at the index position.
	 */
	public boolean replace(int index, long int64) {

		if (!Ery.isInBound(index, iLen)) {

			return false;

		}

		ary[index] = int64;

		return true;

	}

}
