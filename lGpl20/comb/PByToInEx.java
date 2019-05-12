package lGpl20.comb;

import java.math.BigInteger;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.onto.Ontova;
import lGpl20.o.O;

/**
 * 排容原理.<br/>
 * 例如 :<br/>
 * A, B, C, D 排成一列, 但 A 不排第 1 位, B 不排第 2 位的方法數 :<br/>
 * 為 4 人有 2 人是限定條件 inEx(4,2).<br/>
 * <br/>
 * To return the inclusion and exclusion function result, the number of<br/>
 * that n people line up but k guys not at their position.<br/>
 * PInEx(n,k)=C(k,0)*(n-0)! -C(k,1)*(n-1)! +C(k,2)*(n-2)! - ... +-C(k,k)*(n-k)!
 * 
 * @version 2018/04/09_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PByToInEx" >PByToInEx.java</a>
 * 
 * @see PInEx_A
 */
public abstract class PByToInEx extends Pva_Z {

	private static final Class<PByToInEx> CLASS_THIS = PByToInEx.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 排容原理.<br/>
	 * 例如 :<br/>
	 * A, B, C, D 排成一列, 但 A 不排第 1 位, B 不排第 2 位的方法數 :<br/>
	 * 為 4 人有 2 人是限定條件 PInEx(4,2).<br/>
	 * To return the inclusion and exclusion function result, the number of<br/>
	 * that n people line up but k guys not at their position.<br/>
	 * PInEx(n,k)=C(k,0)*(n-0)! -C(k,1)*(n-1)! +C(k,2)*(n-2)! - ... +-C(k,k)*(n-k)!
	 */
	public static long int64(int n, int k) {

		if (n <= 0 || k < 0 || n < k) {

			O.x();

		}

		long ans = 0;

		for (int i = 0; i <= k; i++) {

			if ((i & 0b1) == 0) {// odd

				ans = ans + Cva.int64(k, i) * int64(n - i);

			} else {

				ans = ans - Cva.int64(k, i) * int64(n - i);

			}

		}

		return ans;

	}

	/**
	 * 排容原理.<br/>
	 * 例如 :<br/>
	 * A, B, C, D 排成一列, 但 A 不排第 1 位, B 不排第 2 位的方法數 :<br/>
	 * 為 4 人有 2 人是限定條件 PInEx(4,2).<br/>
	 * To return the inclusion and exclusion function result, the number of<br/>
	 * that n people line up but k guys not at their position.<br/>
	 * PInEx(n,k)=C(k,0)*(n-0)! -C(k,1)*(n-1)! +C(k,2)*(n-2)! - ... +-C(k,k)*(n-k)!
	 */
	public static long int64(int n, int k, int topKToEx) {

		if (n <= 0 || k < 0 || topKToEx < 0 || n < k || k < topKToEx) {

			O.x("n=" + n + ", k=" + k + ", topKToEx=" + topKToEx);

		}

		long ans = 0;

		for (int i = 0; i <= topKToEx; i++) {

			if ((i & 0b1) == 0) {// odd

				ans = ans + Cva.int64(topKToEx, i) * int64(k - i);

			} else {

				ans = ans - Cva.int64(topKToEx, i) * int64(k - i);

			}

		}

		return ans * Cva.int64(n, k);

	}

	/**
	 * 排容原理.<br/>
	 * 例如 :<br/>
	 * A, B, C, D 排成一列, 但 A 不排第 1 位, B 不排第 2 位的方法數 :<br/>
	 * 為 4 人有 2 人是限定條件 PInEx(4,2).<br/>
	 * To return the inclusion and exclusion function result, the number of<br/>
	 * that n people line up but k guys not at their position.<br/>
	 * PInEx(n,k)=C(k,0)*(n-0)! -C(k,1)*(n-1)! +C(k,2)*(n-2)! - ... +-C(k,k)*(n-k)!
	 */
	public static BigInteger bigInt(int n, int k) {

		if (n <= 0 || k < 0 || n < k) {

			O.x("n=" + n + ", k=" + k);

		}

		BigInteger ans = BigInteger.ZERO;

		for (int i = 0; i <= k; i++) {

			if ((i & 0b1) == 0) {// odd

				ans = ans.add(Cva.bigInt(k, i).multiply(bigInt(n - i)));

			} else {

				ans = ans.subtract(Cva.bigInt(k, i).multiply(bigInt(n - i)));

			}

		}

		return ans;

	}

	/**
	 * 排容原理.<br/>
	 * 例如 :<br/>
	 * A, B, C, D 排成一列, 但 A 不排第 1 位, B 不排第 2 位的方法數 :<br/>
	 * 為 4 人有 2 人是限定條件 PInEx(4,2).<br/>
	 * To return the inclusion and exclusion function result, the number of<br/>
	 * that n people line up but k guys not at their position.<br/>
	 * PInEx(n,k)=C(k,0)*(n-0)! -C(k,1)*(n-1)! +C(k,2)*(n-2)! - ... +-C(k,k)*(n-k)!
	 */
	public static BigInteger bigInt(int n, int k, int topKToEx) {

		if (n <= 0 || k < 0 || topKToEx < 0 || n < k || k < topKToEx) {

			O.x("n=" + n + ", k=" + k + ", topKToEx=" + topKToEx);

		}

		BigInteger ans = BigInteger.ZERO;

		for (int i = 0; i <= topKToEx; i++) {

			if ((i & 0b1) == 0) {// odd

				ans = ans.add(Cva.bigInt(topKToEx, i).multiply(bigInt(k - i)));

			} else {

				ans = ans.subtract(Cva.bigInt(topKToEx, i).multiply(bigInt(k - i)));

			}

		}

		return ans.multiply(Cva.bigInt(n, k));

	}

	/**
	 * 排列套用排容原理.<br/>
	 * 例如 :<br/>
	 * A, B, C, D, E, F, G 排成一列, 但 A 不排第 1 位, B 不排第 2 位, C 不排第 3 位的方法數 :<br/>
	 * 為 7 人有 3 人是限定條件 PInEx(7,3).<br/>
	 * To return the inclusion and exclusion function result, the number of<br/>
	 * that n people line up but topKToEx guys not at their position.<br/>
	 * PInEx(7,3)= C(3,0)*7! -C(3,1)*6!+C(3,2)*5! -C(3,3)*4!
	 *
	 * @see Ontova#scriptByToInEx(Condi, CharSequence)
	 */
	public static StringBuilder script(int n, int topKToEx, CharSequence lineWr) {

		if (n < 0 || topKToEx < 0 || n < topKToEx) {

			O.x("n=" + n + ", topKToEx=" + topKToEx);

		}

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i <= topKToEx; i++) {

			if ((i & 0b1) == 0) {// 0 , 2, 4,...

				// str.a(" +C(" + topKToEx + "," + i + ")*" + (n - i) + "!");
				retStr.append(O.C67).append(O.C40).append(topKToEx).append(O.C44).append(i).append(O.C41).append(O.C42)
						.append(n - i).append(O.C33).append(O.C32);

			} else {

				retStr.append(O.C45).append(O.C67).append(O.C40).append(topKToEx).append(O.C44).append(i).append(O.C41)
						.append(O.C42).append(n - i).append(O.C33);

				if (i < topKToEx) {

					retStr.append(lineWr).append(O.C43);

				}

			}

		}

		return retStr;

	}

}
