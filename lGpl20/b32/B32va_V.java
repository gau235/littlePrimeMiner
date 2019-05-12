package lGpl20.b32;

import lGpl20.b64.B64va;
import lGpl20.o.O;

/**
 * @version 2018/03/10_22:59:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B32va_V" >B32va_V.java</a>
 * 
 * @see B32va_W
 */
public abstract class B32va_V extends B32va_M {

	private static final Class<B32va_V> CLASS_THIS = B32va_V.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 以 2 為底取 log.<br/>
	 * To log with base 2.
	 * 
	 * @see B64va#log2OfLowest1(long)
	 */
	public static int log2OfLowest1(int b32As2Pow) {

		if (b32As2Pow == 0b1) {

			return 0;

		}

		if (b32As2Pow == 0b10) {

			return 1;

		}

		if (b32As2Pow == 0b100) {

			return 2;

		}

		if (b32As2Pow == 0b1000) {

			return 3;

		}

		if (b32As2Pow == 0b1_0000) {

			return 4;

		}

		if (b32As2Pow == 0b10_0000) {

			return 5;

		}

		if (b32As2Pow == 0b100_0000) {

			return 6;

		}

		if (b32As2Pow == 0b1000_0000) {

			return 7;

		}

		if (b32As2Pow == 0b1_0000_0000) {

			return 8;

		}

		if (b32As2Pow == 0b10_0000_0000) {

			return 9;

		}

		if (b32As2Pow == 0b100_0000_0000) {

			return 10;

		}

		if (b32As2Pow == 0b1000_0000_0000) {

			return 11;

		}

		if (b32As2Pow == 0b1_0000_0000_0000) {

			return 12;

		}

		if (b32As2Pow == 0b10_0000_0000_0000) {

			return 13;

		}

		if (b32As2Pow == 0b100_0000_0000_0000) {

			return 14;

		}

		if (b32As2Pow == 0b1000_0000_0000_0000) {

			return 15;

		}

		if (b32As2Pow == 0b1_0000_0000_0000_0000) {

			return 16;

		}

		if (b32As2Pow == 0b10_0000_0000_0000_0000) {

			return 17;

		}

		if (b32As2Pow == 0b100_0000_0000_0000_0000) {

			return 18;

		}

		if (b32As2Pow == 0b1000_0000_0000_0000_0000) {

			return 19;

		}

		if (b32As2Pow == 0b1_0000_0000_0000_0000_0000) {

			return 20;

		}

		if (b32As2Pow == 0b10_0000_0000_0000_0000_0000) {

			return 21;

		}

		if (b32As2Pow == 0b100_0000_0000_0000_0000_0000) {

			return 22;

		}

		if (b32As2Pow == 0b1000_0000_0000_0000_0000_0000) {

			return 23;

		}

		if (b32As2Pow == 0b1_0000_0000_0000_0000_0000_0000) {

			return 24;

		}

		if (b32As2Pow == 0b10_0000_0000_0000_0000_0000_0000) {

			return 25;

		}

		if (b32As2Pow == 0b100_0000_0000_0000_0000_0000_0000) {

			return 26;

		}

		if (b32As2Pow == 0b1000_0000_0000_0000_0000_0000_0000) {

			return 27;

		}

		if (b32As2Pow == 0b1_0000_0000_0000_0000_0000_0000_0000) {

			return 28;

		}

		if (b32As2Pow == 0b10_0000_0000_0000_0000_0000_0000_0000) {

			return 29;

		}

		if (b32As2Pow == 0b100_0000_0000_0000_0000_0000_0000_0000) {

			return 30;

		}

		// if (b32As2Pow == 0b1000_0000_0000_0000_0000_0000_0000_0000) {
		//
		// return 31;
		//
		// }

		throw new IllegalArgumentException();

	}

	/**
	 * To get the i-th 1 bit from right.<br/>
	 * To get the i-th 1 bit from right.
	 */
	public static int i_th1AtB32FromR(int b32As2Pow, int i) {

		int index = 0;

		if ((b32As2Pow & 0b1) == 0b1) {

			if (++index == i) {

				return 0b1;

			}

		}

		if ((b32As2Pow & 0b10) == 0b10) {

			if (++index == i) {

				return 0b10;

			}

		}

		if ((b32As2Pow & 0b100) == 0b100) {

			if (++index == i) {

				return 0b100;

			}

		}

		if ((b32As2Pow & 0b1000) == 0b1000) {

			if (++index == i) {

				return 0b1000;

			}

		}

		if ((b32As2Pow & 0b1_0000) == 0b1_0000) {

			if (++index == i) {

				return 0b1_0000;

			}

		}

		if ((b32As2Pow & 0b10_0000) == 0b10_0000) {

			if (++index == i) {

				return 0b10_0000;

			}

		}

		if ((b32As2Pow & 0b100_0000) == 0b100_0000) {

			if (++index == i) {

				return 0b100_0000;

			}

		}

		if ((b32As2Pow & 0b1000_0000) == 0b1000_0000) {

			if (++index == i) {

				return 0b1000_0000;

			}

		}

		if ((b32As2Pow & 0b1_0000_0000) == 0b1_0000_0000) {

			if (++index == i) {

				return 0b1_0000_0000;

			}

		}

		if ((b32As2Pow & 0b10_0000_0000) == 0b10_0000_0000) {

			if (++index == i) {

				return 0b10_0000_0000;

			}

		}

		if ((b32As2Pow & 0b100_0000_0000) == 0b100_0000_0000) {// 10

			if (++index == i) {

				return 0b100_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1000_0000_0000) == 0b1000_0000_0000) {// 11

			if (++index == i) {

				return 0b1000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1_0000_0000_0000) == 0b1_0000_0000_0000) {// 12

			if (++index == i) {

				return 0b1_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b10_0000_0000_0000) == 0b10_0000_0000_0000) {// 13

			if (++index == i) {

				return 0b10_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b100_0000_0000_0000) == 0b100_0000_0000_0000) {// 14

			if (++index == i) {

				return 0b100_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1000_0000_0000_0000) == 0b1000_0000_0000_0000) {// 15

			if (++index == i) {

				return 0b1000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1_0000_0000_0000_0000) == 0b1_0000_0000_0000_0000) {// 16

			if (++index == i) {

				return 0b1_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b10_0000_0000_0000_0000) == 0b10_0000_0000_0000_0000) {// 17

			if (++index == i) {

				return 0b10_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b100_0000_0000_0000_0000) == 0b100_0000_0000_0000_0000) {// 18

			if (++index == i) {

				return 0b100_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1000_0000_0000_0000_0000) == 0b1000_0000_0000_0000_0000) {// 19

			if (++index == i) {

				return 0b1000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1_0000_0000_0000_0000_0000) == 0b1_0000_0000_0000_0000_0000) {// 20

			if (++index == i) {

				return 0b1_0000_0000_0000_0000_0000;

			}

		}

		/////////////

		if ((b32As2Pow & 0b10_0000_0000_0000_0000_0000) == 0b10_0000_0000_0000_0000_0000) {// 21

			if (++index == i) {

				return 0b10_0000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b100_0000_0000_0000_0000_0000) == 0b100_0000_0000_0000_0000_0000) {// 22

			if (++index == i) {

				return 0b100_0000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1000_0000_0000_0000_0000_0000) == 0b1000_0000_0000_0000_0000_0000) {// 23

			if (++index == i) {

				return 0b1000_0000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1_0000_0000_0000_0000_0000_0000) == 0b1_0000_0000_0000_0000_0000_0000) {// 24

			if (++index == i) {

				return 0b1_0000_0000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b10_0000_0000_0000_0000_0000_0000) == 0b10_0000_0000_0000_0000_0000_0000) {// 25

			if (++index == i) {

				return 0b10_0000_0000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b100_0000_0000_0000_0000_0000_0000) == 0b100_0000_0000_0000_0000_0000_0000) {// 26

			if (++index == i) {

				return 0b100_0000_0000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1000_0000_0000_0000_0000_0000_0000) == 0b1000_0000_0000_0000_0000_0000_0000) {// 27

			if (++index == i) {

				return 0b1000_0000_0000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b1_0000_0000_0000_0000_0000_0000_0000) == 0b1_0000_0000_0000_0000_0000_0000_0000) {// 28

			if (++index == i) {

				return 0b1_0000_0000_0000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b10_0000_0000_0000_0000_0000_0000_0000) == 0b10_0000_0000_0000_0000_0000_0000_0000) {// 29

			if (++index == i) {

				return 0b10_0000_0000_0000_0000_0000_0000_0000;

			}

		}

		if ((b32As2Pow & 0b100_0000_0000_0000_0000_0000_0000_0000) == 0b100_0000_0000_0000_0000_0000_0000_0000) {// 30

			if (++index == i) {

				return 0b100_0000_0000_0000_0000_0000_0000_0000;

			}

		}

		// O.x();
		return 0b0;

	}

}
