package lGpl20.shareWXyz;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2018/11/27_20:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Hva_A" >Hva_A.java</a>
 *
 * @see Hva_R
 */
public abstract class Hva_A implements Serializable {

	private static final Class<Hva_A> CLASS_THIS = Hva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * H(n,r) = C(n+r-1,r)<br/>
	 * H(n,r) = C(n+r-1,r)
	 */
	public static long int64(int n, int k, int min, int max) {

		return ShWAns.int64(k, n, min, max);

	}

}
