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
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MapOfStrNInt32WCompa" >
 *          MapOfStrNInt32WCompa.java</a>
 * 
 * @see SNInt32WCompa
 */
public class MapOfStrNInt32WCompa implements Serializable {

	private static final Class<MapOfStrNInt32WCompa> CLASS_THIS = MapOfStrNInt32WCompa.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public StrNInt32WCompa[] aryOfStrNInt32WCompa;

	public int iSize;
	
	
	public static final CompaByValInStrNInt32 COMPA_BY_VAL = new CompaByValInStrNInt32();

	/**
	 * 確保不會 IndexOutOfBoundsException.<br/>
	 * To ensure the length of data array and to avoid the IndexOutOfBoundsException.<br/>
	 * Not thread safe.
	 */
	protected void ensureLen32(int newLen32) {

		if (aryOfStrNInt32WCompa.length < newLen32) {

			// O.l("old len=" + aryOfSNInt32WCompa.length + O.S32 + CLASS_THIS);
			// O.l("new len=" + newLen32 + O.S32 + CLASS_THIS);
			// O.l("ensureLen32=" + (aryOfSNInt32WCompa.length << Ery.NUM_OF_2_POW_TO_ENSURE_LEN32) + O.S32 +
			// CLASS_THIS);

			StrNInt32WCompa[] tempAry = new StrNInt32WCompa[aryOfStrNInt32WCompa.length << Ery.NUM_OF_2_POW_TO_ENSURE_LEN32];

			System.arraycopy(aryOfStrNInt32WCompa, 0, tempAry, 0, aryOfStrNInt32WCompa.length);

			aryOfStrNInt32WCompa = tempAry;

		}

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfStrNInt32WCompa putInNCount(StringBuilder str) {

		StrNInt32WCompa tempStrNInt32WCompa = new StrNInt32WCompa(str);

		int indexAftSearch = Arrays.binarySearch(aryOfStrNInt32WCompa, 0, iSize, tempStrNInt32WCompa);
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

				System.arraycopy(aryOfStrNInt32WCompa, positiveOr0Index, aryOfStrNInt32WCompa, positiveOr0Index + 1,
						numOfElemNeedToShiftR);// shift right

			}

			aryOfStrNInt32WCompa[positiveOr0Index] = tempStrNInt32WCompa;

			iSize++;// important

		} else {// found

			aryOfStrNInt32WCompa[indexAftSearch].count32++;

		}

		return this;

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfStrNInt32WCompa(StringBuilder[] strAry) {

		aryOfStrNInt32WCompa = new StrNInt32WCompa[Ery.DEF_LEN32];
		iSize = 0;// fuck

		for (int i = 0; i != strAry.length; i++) {

			putInNCount(strAry[i]);

		}

	}

	/**
	 * To array of distinct items.<br/>
	 * To array of distinct items.
	 */
	public MapOfStrNInt32WCompa() {

		aryOfStrNInt32WCompa = new StrNInt32WCompa[Ery.DEF_LEN32];
		iSize = 0;// fuck

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStr() {

		StringBuilder str =  new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		StrNInt32WCompa strNInt32WCompa;
		for (int i = 0; i != iSize;) {

			strNInt32WCompa = aryOfStrNInt32WCompa[i];
			str.append(strNInt32WCompa.str).append(O.C61).append(strNInt32WCompa.count32);

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

		StringBuilder str =  new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		StrNInt32WCompa strNInt32WCompa;
		for (int i = 0; i != iSize;) {

			strNInt32WCompa = aryOfStrNInt32WCompa[i];
			str.append(i + 1).append(prefix).append(strNInt32WCompa.str).append(O.C61).append(strNInt32WCompa.count32);

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
