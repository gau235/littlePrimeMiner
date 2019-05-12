package lGpl20.recycle;

import java.util.TreeMap;

import lGpl20.comb.filter.CompaForStr;
import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.other.jsp.Jsp;
import lGpl20.prime64.Recva;

/**
 * @version 2019/04/15_18:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Zw8" >Zw8.java</a>
 *
 * @see Zw18
 */
public abstract class Zw8 {

	private static final Class<Zw8> CLASS_THIS = Zw8.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		Recva recva = new Recva();

		recva.n1 = 1;
		recva.n2 = 100;
		recva.numOfThr = 1;

		recva.totalPrime = 50;
		recva.f32TimeCost = 50;

		recva.charSequenceAsNote = new StringBuilder(O.DEF_CAPACITY32_FOR_STR).append("RP").append(SByN.pad0D2(1));
		recva.tempObj = O.SYS_USER_DOT_NAME;

		String S_URL = "http://c64.tw/w20/test/insertDb.jsp";

		TreeMap<String, String> mapOfParam = new TreeMap<String, String>();

		mapOfParam.put("n1", SByN.f(recva.n1).toString());
		mapOfParam.put("n2", SByN.f(recva.n2).toString());
		mapOfParam.put("numOfThr", Integer.toString(recva.numOfThr));

		mapOfParam.put("totalPrime", SByN.f(recva.totalPrime).toString());
		mapOfParam.put("timeCost", String.format(SByN.REGEX_FLOAT, recva.f32TimeCost));

		mapOfParam.put("note", recva.charSequenceAsNote.toString());
		mapOfParam.put("tempObj", recva.tempObj.toString());

		try {

			Jsp.doPost(S_URL, mapOfParam);

		} catch (Throwable throwable) {

			throwable.printStackTrace();

		}

	}

	public static void main4(String[] sAry) throws Throwable {

		String s1 = "";
		String s2 = "B";

		StringBuilder str1 = new StringBuilder(s1);
		StringBuilder str2 = new StringBuilder(s2);

		int retV1 = CompaForStr.compa(str1, str2);
		int retV2 = s1.compareTo(s2);

		if (retV1 > 0 && retV2 <= 0) {

			O.l("retV1=" + retV1);
			O.l("retV2=" + retV2);

			O.x();

		}

		O.l("retV1=" + retV1);

	}

}
