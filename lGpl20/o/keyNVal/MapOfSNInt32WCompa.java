package lGpl20.o.keyNVal;

import java.io.Serializable;
import java.util.Arrays;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * 問題在資料結構.<br/>
 * 因為資料結構不好, 才會想一直抓住它, 丟也丟不掉 若資料結構好, 心中的大石頭就放下了.<br/>
 * 
 * @version 2019/03/08_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MapOfSNInt32WCompa" > MapOfSNInt32WCompa.
 *          java</a>
 * 
 * @see SNInt32WCompa
 */
public class MapOfSNInt32WCompa implements Serializable {

	private static final Class<MapOfSNInt32WCompa> CLASS_THIS = MapOfSNInt32WCompa.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public SNInt32WCompa[] aryOfSNInt32WCompa;

	public int iSize;

	public static final CompaByValInSNInt32 COMPA_BY_VAL = new CompaByValInSNInt32();

	// public static final int BOUND32_TO_BINARY_SEARCH = 1_000;

	/**
	 * 確保不會 IndexOutOfBoundsException.<br/>
	 * To ensure the length of data array and to avoid the IndexOutOfBoundsException.<br/>
	 * Not thread safe.
	 */
	protected void ensureLen32(int newLen32) {

		if (aryOfSNInt32WCompa.length < newLen32) {

			// O.l("old len=" + aryOfSNInt32WCompa.length + O.S32 + CLASS_THIS);
			// O.l("new len=" + newLen32 + O.S32 + CLASS_THIS);
			// O.l("ensureLen32=" + (aryOfSNInt32WCompa.length << Ery.NUM_OF_2_POW_TO_ENSURE_LEN32) + O.S32 +
			// CLASS_THIS);

			SNInt32WCompa[] tempAry = new SNInt32WCompa[aryOfSNInt32WCompa.length << Ery.NUM_OF_2_POW_TO_ENSURE_LEN32];

			System.arraycopy(aryOfSNInt32WCompa, 0, tempAry, 0, aryOfSNInt32WCompa.length);

			aryOfSNInt32WCompa = tempAry;

		}

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfSNInt32WCompa putInNCount(String s) {

		SNInt32WCompa tempSNInt32 = new SNInt32WCompa(s);

		// Arrays.sort(aryOfSNInt32WCompa, 0, iLen, COMPA_BY_VAL);// sort before to search

		int indexAftSearch = Arrays.binarySearch(aryOfSNInt32WCompa, 0, iSize, tempSNInt32);
		int positiveOr0Index;
		int numOfElemNeedToShiftR;

		// O.l("indexAftSearch=" + indexAftSearch + O.S32 + CLASS_THIS);

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

				System.arraycopy(aryOfSNInt32WCompa, positiveOr0Index, aryOfSNInt32WCompa, positiveOr0Index + 1,
						numOfElemNeedToShiftR);// shift right

			}

			aryOfSNInt32WCompa[positiveOr0Index] = tempSNInt32;

			iSize++;// important

		} else {// found

			aryOfSNInt32WCompa[indexAftSearch].count32++;

		}

		return this;

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfSNInt32WCompa(String[] sAry) {

		aryOfSNInt32WCompa = new SNInt32WCompa[Ery.DEF_LEN32];
		iSize = 0;// fuck

		for (int i = 0; i != sAry.length; i++) {

			putInNCount(sAry[i]);

		}

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfSNInt32WCompa() {

		aryOfSNInt32WCompa = new SNInt32WCompa[Ery.DEF_LEN32];
		iSize = 0;// fuck

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfSNInt32WCompa sort() {

		Arrays.sort(aryOfSNInt32WCompa, 0, iSize);

		return this;

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfSNInt32WCompa sortByVal() {

		Arrays.sort(aryOfSNInt32WCompa, 0, iSize, COMPA_BY_VAL);

		return this;

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr() {

		StringBuilder str =  new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		SNInt32WCompa sNInt32;
		for (int i = 0; i != iSize;) {

			sNInt32 = aryOfSNInt32WCompa[i];
			str.append(sNInt32.s).append(O.C61).append(sNInt32.count32);

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

		SNInt32WCompa sNInt32;
		for (int i = 0; i != iSize;) {

			sNInt32 = aryOfSNInt32WCompa[i];
			str.append(i + 1).append(prefix).append(sNInt32.s).append(O.C61).append(sNInt32.count32);

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
