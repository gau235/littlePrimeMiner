package lGpl20.o.keyNVal;

import java.io.Serializable;
import java.util.Arrays;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * 問題在資料結構.<br/>
 * 因為資料結構不好, 才會想一直抓住它, 丟也丟不掉 若資料結構好, 心中的大石頭就放下了.<br/>
 * 
 * @version 2019/03/17_14:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MapOfB64NInt32WCompa" >
 *          MapOfB64NInt32WCompa.java</a>
 * 
 * @see SNInt32WCompa
 */
public class MapOfB64NInt32WCompa implements Serializable {

	private static final Class<MapOfB64NInt32WCompa> CLASS_THIS = MapOfB64NInt32WCompa.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public B64NInt32WCompa[] aryOfB64NInt32WCompa;

	public int iSize;

	public static final CompaByValInB64NInt32 COMPA_BY_VAL = new CompaByValInB64NInt32();

	// public static final int BOUND32_TO_BINARY_SEARCH = 1_000;

	/**
	 * 確保不會 IndexOutOfBoundsException.<br/>
	 * To ensure the length of data array and to avoid the IndexOutOfBoundsException.<br/>
	 * Not thread safe.
	 */
	protected void ensureLen32(int newLen32) {

		if (aryOfB64NInt32WCompa.length < newLen32) {

			// O.l("old len=" + aryOfSNInt32WCompa.length + O.S32 + CLASS_THIS);
			// O.l("new len=" + newLen32 + O.S32 + CLASS_THIS);
			// O.l("ensureLen32=" + (aryOfSNInt32WCompa.length << Ery.NUM_OF_2_POW_TO_ENSURE_LEN32) + O.S32 +
			// CLASS_THIS);

			B64NInt32WCompa[] tempAry = new B64NInt32WCompa[aryOfB64NInt32WCompa.length << Ery.NUM_OF_2_POW_TO_ENSURE_LEN32];

			System.arraycopy(aryOfB64NInt32WCompa, 0, tempAry, 0, aryOfB64NInt32WCompa.length);

			aryOfB64NInt32WCompa = tempAry;

		}

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfB64NInt32WCompa putInNCount(long b64) {

		// int min = 1;
		// StringBuilder sDiI = B64IntoB6.toStrForToDiI(b64, min);// b64IntoB6OfQtyPlus1
		// O.l("add " + sDiI);
		//
		// StringBuilder str24 = B64IntoB6.str24((int) b64);
		//
		// O.l("add " + str24);

		B64NInt32WCompa tempB64NInt32 = new B64NInt32WCompa(b64);

		// Arrays.sort(aryOfSNInt32WCompa, 0, iLen, COMPA_BY_VAL);// sort before to search

		int indexAftSearch = Arrays.binarySearch(aryOfB64NInt32WCompa, 0, iSize, tempB64NInt32);
		int positiveOr0Index;
		int numOfElemNeedToShiftR;

		if (indexAftSearch < 0) {// not found

			// ensureLen32(iLen + 1);
			// aryOfSNInt32WCompa[iLen++] = tempSNInt32;

			// =========================================================

			ensureLen32(iSize + 1);

			positiveOr0Index = -(indexAftSearch + 1);// aft search, index32 plus 1 and apply absolute value
			numOfElemNeedToShiftR = iSize - positiveOr0Index;
			// O.l("indexAftSearch=" + indexAftSearch + O.S32 + CLASS_THIS);
			// O.l("numOfElemNeedToShiftR=" + numOfElemNeedToShiftR + O.S32 + CLASS_THIS);

			if (numOfElemNeedToShiftR > 0) {

				O.x();// important

				System.arraycopy(aryOfB64NInt32WCompa, positiveOr0Index, aryOfB64NInt32WCompa, positiveOr0Index + 1,
						numOfElemNeedToShiftR);// shift right

			}

			aryOfB64NInt32WCompa[positiveOr0Index] = tempB64NInt32;

			iSize++;// important

		} else {// found

			aryOfB64NInt32WCompa[indexAftSearch].count32++;

		}

		return this;

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfB64NInt32WCompa(long[] aryOfB64) {

		aryOfB64NInt32WCompa = new B64NInt32WCompa[Ery.DEF_LEN32];
		iSize = 0;// fuck

		for (int i = 0; i != aryOfB64.length; i++) {

			putInNCount(aryOfB64[i]);

		}

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfB64NInt32WCompa() {

		aryOfB64NInt32WCompa = new B64NInt32WCompa[Ery.DEF_LEN32];
		iSize = 0;// fuck

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfB64NInt32WCompa sort() {

		Arrays.sort(aryOfB64NInt32WCompa, 0, iSize);

		return this;

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfB64NInt32WCompa sortByVal() {

		Arrays.sort(aryOfB64NInt32WCompa, 0, iSize, COMPA_BY_VAL);

		return this;

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr() {

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		B64NInt32WCompa tempB64NInt32;
		for (int i = 0; i != iSize;) {

			tempB64NInt32 = aryOfB64NInt32WCompa[i];
			str.append(tempB64NInt32.b64).append(O.C61).append(tempB64NInt32.count32);

			if (++i != iSize) {

				str.append(O.C_A_L);

			}

		}

		return str;

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr(CharSequence prefix, CharSequence lineWr) {

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		B64NInt32WCompa tempB64NInt32;
		for (int i = 0; i != iSize;) {

			tempB64NInt32 = aryOfB64NInt32WCompa[i];
			str.append(i + 1).append(prefix).append(tempB64NInt32.b64).append(O.C61).append(tempB64NInt32.count32);

			if (++i != iSize) {// todo: if (i++ != Strva.int32MaxRowForHtml) {

				str.append(lineWr);

			}

		}

		return str;

	}

	@Override
	public String toString() {

		return toStr().toString();

	}

}
