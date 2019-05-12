package lGpl20.pick.sample;

import lGpl20.b32.Ary32va;
import lGpl20.o.O;
import lGpl20.o.ery.Aryva;
import lGpl20.pick.Shuffler;

/**
 * To shuffle the array.<br/>
 * <br/>
 * To shuffle the array.
 * 
 * @version 2019/03/21_22:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP89_ShuffleNPick" >SP89_ShuffleNPick.java
 *          </a>
 * 
 */
public class SP89_ShuffleNPick {

	public static void main2(String[] sAry) throws Throwable {

		sAry = new String[] { "A", "B", "C", "D", "E", "F", };
		int k = 3;

		O.l(sAry);
		sAry = Shuffler.shuffleNPick(sAry, k);

		O.l();
		O.l("aft=");
		O.l(sAry);

	}

	public static void main(String[] sAry) throws Throwable {

		long[] ary = Aryva.genAscAryFrom1(6);
		int k = 3;

		O.l(ary);

		long[] retAry = Shuffler.shuffleNPick(ary, k);

		O.l();
		O.l("aft=");
		O.l(retAry);

	}

	public static void main4(String[] sAry) throws Throwable {

		int[] ary32 = Ary32va.genAscAry32From1(6);
		int k = 3;

		O.l(ary32);

		int[] retAry32 = Shuffler.shuffleNPick(ary32, k);

		O.l();
		O.l("aft=");
		O.l(retAry32);

	}

}