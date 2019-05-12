package lGpl20.comb.selfCallva.sample;

import lGpl20.comb.selfCallva.Recursva;
import lGpl20.o.O;

/**
 * 遞迴累加.<br/>
 * <br/>
 * To sum with recursion.
 * 
 * @version 2016/01/03_12:29:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP02_SumWRecursion" >SP02_SumWRecursion
 *          </a>
 * 
 */
public class SP02_SumWRecursion {

	public static void main(String[] sAry) throws Throwable {

		O.l(Recursva.sumByToCallSelfBackward(10));

	}

}
