package lGpl20.other.sample;

import java.util.Arrays;

import lGpl20.b32.eqDiv.Fr64;
import lGpl20.o.O;

/**
 * 分數比大小.<br/>
 * <br/>
 * To sort the array of Fr64.
 * 
 * @version 2016/11/16_16:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C272_Fraction" >C272_Fraction.java</a>
 * 
 */
public class C272_Fraction {

	public static void main(String[] sAry) throws Throwable {

		Fr64 f1 = new Fr64("0.8");
		Fr64 f2 = new Fr64("5/7");
		Fr64 f3 = new Fr64("1.3");

		Fr64[] aryOfFr64 = { f1, f2, f3 };

		Arrays.sort(aryOfFr64);

		for (Fr64 f : aryOfFr64) {

			O.l(f);

		}

	}

}
