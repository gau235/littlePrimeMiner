package lGpl20.o.ery;

import lGpl20.o.O;

/**
 * @version 2019/03/16_11:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq_C" >Seq_C.java</a>
 * 
 * @see Seq_J
 */
public abstract class Seq_C extends Seq_A {

	private static final Class<Seq_C> CLASS_THIS = Seq_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq_C(long[] ary) {

		super(ary);

	}

	/**
	 * 確保不會 IndexOutOfBoundsException.<br/>
	 * To ensure the length of data array and to avoid the IndexOutOfBoundsException.<br/>
	 * Not thread safe.
	 */
	protected void ensureLen32(int newLen32) {

		if (ary.length >= newLen32) {

			return;

		}

		if (O.IS_TO_DEV) {

			O.l("ary.length=" + ary.length + ", newLen32=" + newLen32 + O.S32 + CLASS_THIS);

		}

		int tempLen = ary.length;
		do {

		} while ((tempLen = (tempLen << Ery.NUM_OF_2_POW_TO_ENSURE_LEN32)) < newLen32);// must be while

		// O.l("newLen32=" + newLen32 + O.S32 + CLASS_THIS);
		long[] tempAry = new long[tempLen];
		System.arraycopy(ary, 0, tempAry, 0, ary.length);

		ary = tempAry;

	}

	/**
	 * To array.<br/>
	 * To array.
	 */
	public long[] ary(boolean isToClone) {

		if (isToClone) {

			return ary.clone();

		}

		return ary;

	}

	/**
	 * 縮減空間.<br/>
	 * To trim the inside array length to the number of elements.
	 */
	public Seq_C trim() {

		if (iLen < ary.length) {

			long[] newAry = new long[iLen];
			System.arraycopy(ary, 0, newAry, 0, iLen);

			ary = newAry;

		}

		return this;

	}

	/**
	 * The sum of long[].<br/>
	 * The sum of long[].
	 */
	public long sum() {

		long sum = 0L;

		for (int i = 0; i < iLen; i++) {

			sum = sum + ary[i];

		}

		return sum;

	}

}
