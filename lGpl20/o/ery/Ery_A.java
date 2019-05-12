package lGpl20.o.ery;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.o.KeyToSyn;
import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * 本類別抽象伍, 內含一個物件陣列.<br/>
 * <br/>
 * The container for Elem type elements.<br/>
 * If you added null to this, it will not add.
 * 
 * @version 2018/12/26_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ery_A" >Ery_A.java</a>
 * 
 * @see Ery_C
 */
public abstract class Ery_A<Elem> implements Serializable {

	@SuppressWarnings("rawtypes")
	private static final Class<Ery_A> CLASS_THIS = Ery_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 內部陣列.<br/>
	 * The inside array.
	 */
	protected Elem[] aryOfElem;

	/**
	 * 內部陣列的初始長度值.<br/>
	 * Initial length of the inside array.
	 */
	public static final int DEF_LEN32 = Ranger.$2POW10_INT32;

	/**
	 * 內部陣列的擴大值.<br/>
	 * The 2 to the power of n to ensure length.
	 */
	public static final int NUM_OF_2_POW_TO_ENSURE_LEN32 = 2;

	/**
	 * 內部陣列的最末項的後 1 個位置.<br/>
	 * The position after the last element of the inside array.
	 */
	protected int iLen = 0;

	/**
	 * 用於多執行緒的同步.<br/>
	 * For synchronizing.
	 */
	protected final Serializable KEY_TO_SYN = new KeyToSyn();

	/**
	 * 比較器.<br/>
	 * The class implements Comparator.
	 */
	protected Comparator<Elem> comparator;

	/**
	 * 抽查陣列內是否有 null.<br/>
	 * To check null in the array randomly.
	 * 
	 * @see O#isAnyNull(Object...)
	 */
	@SuppressWarnings("unchecked")
	public boolean checkNullRandomly(Elem... aryOfElem) {

		if (aryOfElem.length == 0) {

			return false;

		}

		for (int i = 0, numOfTest = O.log2((long) aryOfElem.length + 1L); i < numOfTest; i++) {

			if (aryOfElem[O.THR_LOCAL_RANDOM.nextInt(aryOfElem.length)] == null) {

				return true;

			}

		}

		return false;

	}

	/**
	 * 檢查 index 是否有效.<br/>
	 * Is the index valid?
	 */
	public static boolean isInBound(int index, int currentEnd) {

		// O.l("currentEnd=" + currentEnd + O.S32 + CLASS_THIS);

		return (index < currentEnd && index >= 0);

	}

	// /**
	// * 建構方法.<br/>
	// * Constructor.
	// */
	// public Ery_A(Elem[] aryOfElem, boolean isToCheckNull) {
	//
	// if (aryOfElem.length > MAX_LEN32) {
	//
	// throw new IllegalArgumentException();
	//
	// }
	//
	// if (isToCheckNull && checkNullRandomly(aryOfElem)) {
	//
	// throw new NullPointerException();
	//
	// }
	//
	// this.aryOfElem = aryOfElem;
	//
	// }

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery_A(Elem... aryOfElem) {

		// if (aryOfElem.length > MAX_LEN32) {
		//
		// throw new IllegalArgumentException();
		//
		// }

		if (checkNullRandomly(aryOfElem)) {

			throw new NullPointerException();

		}

		this.aryOfElem = aryOfElem;

	}

}
