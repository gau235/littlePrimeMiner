package lGpl20.o.ery;

import java.util.Collection;

import lGpl20.o.O;

/**
 * 本類別抽象伍, 內含 1 個物件陣列.<br/>
 * 伍內可裝多個物件 ( 項 ), 所以伍是泛型物件 Elem 為項的陣列.<br/>
 * 伍可多執行緒讀寫, 已做 synchronized, 且盡量減低 IndexOutOfBoundsException 發生.<br/>
 * 若呼叫 add(null) 則不加入項.<br/>
 * <br/>
 * 伍的特性:<br/>
 * 內含的項可重複.<br/>
 * 項有些情況下可排序.<br/>
 * 可同時多執行緒存取.<br/>
 * 存取的依據是 index.<br/>
 * 不可加入 null.<br/>
 * 可關閉.<br/>
 * 當伍在膨脹中, 則執行緒安全, 且存取不易取得 null.<br/>
 * <br/>
 * The container for Elem type elements.<br/>
 * If you added null to this, it will not add.
 * 
 * @version 2018/12/26_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ery" >Ery.java</a>
 * 
 */
public class Ery<Elem> extends Ery_Z<Elem> {

	@SuppressWarnings("rawtypes")
	private static final Class<Ery> CLASS_THIS = Ery.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery(Elem... aryOfElem) {

		super(aryOfElem);
		iLen = aryOfElem.length;

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery() {

		super((Elem[]) O.OBJ_ARY0);// fuck, not checkNull
		aryOfElem = (Elem[]) new Object[DEF_LEN32];
		iLen = 0;// fuck

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery(Collection<Elem> collection) {

		this((Elem[]) collection.toArray());

	}

	/**
	 * 加 1 個項到此伍第 index 位置, 把其餘項往後移動.<br/>
	 * To add the element to the index-th position.
	 */
	public boolean insertAt(int index, Elem elem) {

		synchronized (KEY_TO_SYN) {

			int newEnd = iLen + 1;

			if (elem == null || !isInBound(index, newEnd)) {

				return false;

			}

			int numOfElemNeedToShiftRight = iLen - index;

			// O.l("numOfElemNeedToShiftRight=" + numOfElemNeedToShiftRight + O.S32 + CLASS_THIS);

			ensureLen32(newEnd);
			iLen++;

			if (numOfElemNeedToShiftRight > 0) {

				System.arraycopy(aryOfElem, index, aryOfElem, index + 1, numOfElemNeedToShiftRight);// shift right
				// O.l("arraycopy" + O.S32 + CLASS_THIS);

			}

			aryOfElem[index] = elem;

			return true;

		}

	}

	/**
	 * 加 1 個項到此伍末之後.<br/>
	 * To append the element to after the iLen of this.
	 * 
	 * @see #insertAt(int, Object)
	 */
	public void a(Elem elem) {

		synchronized (KEY_TO_SYN) {

			if (elem == null) {

				return;

			}

			ensureLen32(iLen + 1);
			aryOfElem[iLen++] = elem;

			return;

		}

	}

	/**
	 * 加 all 個項到此伍末之後.<br/>
	 * To append the all to after the iLen of this.
	 * 
	 * @see #insertAt(int, Object)
	 */
	public void appendAll(Ery<Elem> otherEry) {

		synchronized (KEY_TO_SYN) {

			int lenPlusOtherLen = iLen + otherEry.iLen;// we do not syn otherEry's KEY_TO_SYN

			ensureLen32(lenPlusOtherLen);
			System.arraycopy(otherEry.aryOfElem, 0, aryOfElem, iLen, otherEry.iLen);

			iLen = lenPlusOtherLen;

			return;

		}

	}

	/**
	 * 置入並取代此伍的 index 位置的項.<br/>
	 * To replace the element at the index position.
	 */
	public boolean replace(int index, Elem elem) {

		synchronized (KEY_TO_SYN) {

			if (elem == null || !isInBound(index, iLen)) {

				return false;

			}

			aryOfElem[index] = elem;

			return true;

		}

	}

	/**
	 * 剪下第 index 位置的項.<br/>
	 * To cut the element at the index position.<br/>
	 * It costs a lot.
	 */
	public Elem cutAt(int index) {

		synchronized (KEY_TO_SYN) {

			if (!isInBound(index, iLen)) {

				return null;// important

			}

			iLen--;

			Elem elem = aryOfElem[index];
			int numOfTheRearElem = iLen - index;

			if (numOfTheRearElem > 0) {

				System.arraycopy(aryOfElem, index + 1, aryOfElem, index, numOfTheRearElem);

			}

			aryOfElem[iLen] = null;// garbage collection

			return elem;

		}

	}

	/**
	 * 取得並移除第 0 個項.<br/>
	 * 運算成本高.<br/>
	 * To return and to remove the 0-th element (head) of this.<br/>
	 * It costs a lot.
	 * 
	 * @see #cutTail()
	 */
	public Elem cutHead() {

		synchronized (KEY_TO_SYN) {

			if (iLen == 0) {// important

				return null;// important

			}

			Elem elem = aryOfElem[0];

			iLen--;

			if (iLen > 0) {// shift left

				System.arraycopy(aryOfElem, 1, aryOfElem, 0, iLen);

			}

			aryOfElem[iLen] = null;// garbage collection

			return elem;

		}

	}

	/**
	 * 取得並移除第末個項.<br/>
	 * To return and to remove the last element (tail) of this.
	 * 
	 * @see #cutHead()
	 */
	public Elem cutTail() {

		synchronized (KEY_TO_SYN) {

			if (iLen == 0) {// important

				return null;// important

			}

			// O.l("iLen=" + iLen + O.S32 + CLASS_THIS);
			// O.l("aryOfElem.len=" + aryOfElem.length + O.S32 + CLASS_THIS);

			if (iLen < aryOfElem.length) {// for this(Elem[] aryOfElem, boolean isToCopyAryOfElem)

				aryOfElem[iLen] = null;// garbage collection

			}

			iLen--;

			return aryOfElem[iLen];

		}

	}

}
