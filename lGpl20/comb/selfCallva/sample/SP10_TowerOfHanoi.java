package lGpl20.comb.selfCallva.sample;

import lGpl20.comb.selfCallva.Recursva;
import lGpl20.o.O;

/**
 * 河內塔的演算法, 將第 1 根有盤子的柱子 A, 搬動到第 2 根柱子 B, 搬動的過程中可利用第 3 根柱子 T.<br/>
 * <br/>
 * Tower Of Hanoi recursion.
 * 
 * @version 2019/04/18_22:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP10_TowerOfHanoi" >SP10_TowerOfHanoi.
 *          java</a>
 * 
 */
public class SP10_TowerOfHanoi {

	public static void main(String[] sAry) throws Throwable {

		StringBuilder str = Recursva.towerOfHanoi("A", "B", "Temp", 3);

		O.l(str);

	}

}
