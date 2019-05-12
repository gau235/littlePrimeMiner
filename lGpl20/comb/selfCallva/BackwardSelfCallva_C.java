package lGpl20.comb.selfCallva;

import lGpl20.o.O;

/**
 * @version 2017/03/17_09:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=BackwardSelfCallva_C" >
 *          BackwardSelfCallva_C.java</a>
 * 
 * @see BackwardSelfCallva_Z
 */
public abstract class BackwardSelfCallva_C extends BackwardSelfCallva_A {

	private static final Class<BackwardSelfCallva_C> CLASS_THIS = BackwardSelfCallva_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 河內塔的演算法, 將第 1 根有盤子的柱子 A, 搬動到第 2 根柱子 B, 搬動的過程中可利用第 3 根柱子 T.<br/>
	 * Tower Of Hanoi recursion.
	 */
	public static StringBuilder towerOfHanoi(char from, char to, char temp, final int n, final StringBuilder str,
			CharSequence lineWr) {

		if (n <= 0 || str == null) {

			O.x("n=" + n);

		}

		if (n == 1) {

			str.append(from).append(O.C45).append(O.C62).append(to).append(lineWr);

			return str;

		} else {

			str.append(towerOfHanoi(from, temp, to, n - 1, new StringBuilder(O.DEF_CAPACITY32_FOR_STR), lineWr));

			str.append(from).append(O.C45).append(O.C62).append(to).append(lineWr);

			str.append(towerOfHanoi(temp, to, from, n - 1, new StringBuilder(O.DEF_CAPACITY32_FOR_STR), lineWr));

			return str;

		}

	}

	/**
	 * 河內塔的演算法, 將第 1 根有盤子的柱子 A, 搬動到第 2 根柱子 B, 搬動的過程中可利用第 3 根柱子 T.<br/>
	 * Tower Of Hanoi recursion.
	 */
	public static StringBuilder towerOfHanoi(String from, String to, String temp, final int n, final StringBuilder str,
			CharSequence lineWr) {

		if (n <= 0 || str == null) {

			O.x("n=" + n);

		}

		if (n == 1) {

			str.append(from).append(O.C45).append(O.C62).append(to).append(lineWr);

			return str;

		} else {

			str.append(towerOfHanoi(from, temp, to, n - 1, new StringBuilder(O.DEF_CAPACITY32_FOR_STR), lineWr));

			str.append(from).append(O.C45).append(O.C62).append(to).append(lineWr);

			str.append(towerOfHanoi(temp, to, from, n - 1, new StringBuilder(O.DEF_CAPACITY32_FOR_STR), lineWr));

			return str;

		}

	}

	/**
	 * 河內塔的演算法, 將第 1 根有盤子的柱子 A, 搬動到第 2 根柱子 B, 搬動的過程中可利用第 3 根柱子 T.<br/>
	 * Tower Of Hanoi recursion.
	 */
	public static StringBuilder towerOfHanoi(char from, char to, char temp, final int n) {

		if (n <= 0) {

			O.x("n=" + n);

		}

		return towerOfHanoi(from, to, temp, n, new StringBuilder(O.DEF_CAPACITY32_FOR_STR), O.L);

	}

	/**
	 * 河內塔的演算法, 將第 1 根有盤子的柱子 A, 搬動到第 2 根柱子 B, 搬動的過程中可利用第 3 根柱子 T.<br/>
	 * Tower Of Hanoi recursion.
	 */
	public static StringBuilder towerOfHanoi(String from, String to, String temp, final int n) {

		return towerOfHanoi(from, to, temp, n, new StringBuilder(O.DEF_CAPACITY32_FOR_STR), O.L);

	}

}
