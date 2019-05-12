package lGpl20.o.ery;

import lGpl20.o.O;

/**
 * @version 2019/03/16_11:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq32_C" >Seq32_C.java</a>
 * 
 * @see Seq32_F
 */
public abstract class Seq32_C extends Seq32_A {

	private static final Class<Seq32_C> CLASS_THIS = Seq32_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq32_C(int[] ary32) {

		super(ary32);

	}

	/**
	 * 確保不會 IndexOutOfBoundsException.<br/>
	 * To ensure the length of data array and to avoid the IndexOutOfBoundsException.<br/>
	 * Not thread safe.
	 */
	protected void ensureLen32(int newLen32) {

		if (ary32.length >= newLen32) {

			return;

		}

		int tempLen = ary32.length;
		do {

		} while ((tempLen = (tempLen << Ery.NUM_OF_2_POW_TO_ENSURE_LEN32)) < newLen32);// must be while

		// O.l("newLen32=" + newLen32 + O.S32 + CLASS_THIS);
		int[] tempAry32 = new int[tempLen];
		System.arraycopy(ary32, 0, tempAry32, 0, ary32.length);

		ary32 = tempAry32;

	}

	/**
	 * To array.<br/>
	 * To array.
	 */
	public int[] ary32(boolean isToClone) {

		if (isToClone) {

			return ary32.clone();

		}

		return ary32;

	}

	/**
	 * 縮減空間.<br/>
	 * To trim the inside array length to the number of elements.
	 */
	public Seq32_C trim() {

		if (iLen < ary32.length) {

			int[] newAry32 = new int[iLen];
			System.arraycopy(ary32, 0, newAry32, 0, iLen);

			ary32 = newAry32;

		}

		return this;

	}

}
