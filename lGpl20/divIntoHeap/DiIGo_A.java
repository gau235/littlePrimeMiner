package lGpl20.divIntoHeap;

import java.io.Serializable;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * 相同物分堆.<br/>
 * 即 n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
 * To return the number of ways to divide several identical items into several identical heaps.
 * 
 * @version 2018/06/05_15:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DiIGo_A" >DiIGo_A.java</a>
 *
 * @see DiIGo_R
 */
public abstract class DiIGo_A implements Serializable {

	private static final Class<DiIGo_A> CLASS_THIS = DiIGo_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 檢查參數合法性.<br/>
	 * Is the argument legal?
	 */
	public static void checkArg(int n, int k, int min, int max) {// you have to regularize first

		if (k > B64IntoB6.$TOTAL_CELL_INT32 || k > n || k < 1 || min < 1 || max > n) {

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

		int nEqDivK = n / k;
		if (nEqDivK < min || nEqDivK > max) {

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

		if (((n - min * (k - 1)) > B64IntoB6.$MAX_INT32_IN_CELL) /* && (n > k * max) */) {

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

	}

}
