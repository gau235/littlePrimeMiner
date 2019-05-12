package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.o.time.T64;
import lGpl20.prime64.Ranger;

/**
 * 畢達哥拉斯三元數.<br/>
 * <br/>
 * Pythagorean triple.
 * 
 * @version 2016/10/15_15:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C222_PythagoreTriple" >
 *          C222_PythagoreTriple.java</a>
 * 
 */
public class C222_PythagoreTriple {

	public static void main(String[] sAry) throws Throwable {

		// 5*5 (25-1)/2 (25+1)/2
		// 7*7 (49-1)/2 (49+1)/2
		// 9*9 (49-1)/2 (81+1)/2

		long t0 = T64.t64();

		int lower = 1;
		int upper = 1000;

		for (int i1 = lower; i1 < upper; i1++) {

			for (int i2 = i1 + 1; i2 < upper; i2++) {

				for (int i3 = i2 + 1; i3 < upper; i3++) {

					if (!Ranger.checkRelativelyPrime(i1, i2)) {

						continue;

					}

					int i1MulI1 = i1 * i1;

					int i2MulI2 = i2 * i2;
					int i3MulI3 = i3 * i3;

					if (i1MulI1 + i2MulI2 == i3MulI3) {

						O.l(new StringBuilder(O.DEF_CAPACITY32_FOR_STR).append(i1).append(O.STR_C44C32).append(i2)
								.append(O.STR_C44C32).append(i3));

					}

				}

			}

		}

		O.l(T64.difInF32Sec(t0));

	}

}