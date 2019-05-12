package lGpl20.pick.sample;

import lGpl20.b32.Ary32va;
import lGpl20.o.O;
import lGpl20.pick.Pickva;
import lGpl20.pick.Shuffler;

/**
 * To shuffle the array.<br/>
 * <br/>
 * To shuffle the array.
 * 
 * @version 2019/03/21_22:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP87_ShuffleAry" >SP87_ShuffleAry.java
 *          </a>
 * 
 */
public class SP87_ShuffleAry {

	public static void main(String[] sAry) throws Throwable {

		sAry = new String[] { "A", "B", "C", "D", "E", "F", };

		O.l("sAry=");
		O.l(sAry);
		sAry = Shuffler.shuffle(sAry);

		O.l();
		O.l("aft shuffle=");
		O.l(sAry);

	}

	public static void main3(String[] sAry) throws Throwable {

		int[] ary32 = Ary32va.genAscAry32From1(6);
		O.l(ary32);
		ary32 = Pickva.pickNRandomlyFrom(ary32, ary32.length);

		O.l();
		O.l("aft shuffle=");
		O.l(ary32);

	}

}