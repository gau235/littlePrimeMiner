package lGpl20.other.sample;

import com.luhuiguo.chinese.ChineseUtils;
import com.luhuiguo.chinese.pinyin.PinyinFormat;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * 繁體字轉簡體字.<br/>
 * <br/>
 * 繁體字轉簡體字.
 * 
 * @version 2018/11/14_22:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C081_TwToCn" >C081_TwToCn.java</a>
 * 
 */
public class C081_TwToCn {

	public static StringBuilder toCnAgainstEachSWEqSymbol(String[] sAry, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
		String tempS;

		StringBuilder smallStr;
		String[] smallSAry;

		int indexStart = 0;
		if (!O.IS_LINUX) {

			indexStart = 1; // fuck

		}

		for (int iSAry = 0; iSAry != sAry.length; iSAry++) {

			tempS = sAry[iSAry];
			// O.l("tempS=" + tempS);
			smallSAry = tempS.split(O.Z);// theS.split(O.S32);
			smallStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

			for (int indexS = indexStart; indexS != smallSAry.length; indexS++) {

				smallStr.append(ChineseUtils.toSimplified(smallSAry[indexS]));

			}

			retStr.append(tempS).append(O.C61).append(smallStr).append(lineWr);// tw=cn

		}

		return retStr;

	}

	public static StringBuilder toCnPinyinAgainstEachS(String[] sAry, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		StringBuilder smallStr;
		String[] smallSAry;

		int indexStart = 0;
		if (!O.IS_LINUX) {

			indexStart = 1; // fuck

		}

		for (int iSAry = 0; iSAry != sAry.length; iSAry++) {

			smallSAry = sAry[iSAry].split(O.Z);// theS.split(O.S32);
			smallStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

			for (int indexS = indexStart; indexS != smallSAry.length; indexS++) {

				smallStr.append(ChineseUtils.toPinyin(smallSAry[indexS], PinyinFormat.DEFAULT_PINYIN_FORMAT)).append(O.C32);

			}

			retStr.append(smallStr).append(lineWr);

		}

		return retStr;

	}

	public static void main(String[] sAry) throws Throwable {

		Ery<String> ery = new Ery<String>("");
		ery.cutHead();

		ery.a("誒");
		ery.a("關閉");
		ery.a("參與");
		ery.a("領取");

		sAry = ery.trim().aryOfElem();

		O.l(toCnAgainstEachSWEqSymbol(sAry, O.L));
		O.l(toCnPinyinAgainstEachS(sAry, O.L));

	}

}
