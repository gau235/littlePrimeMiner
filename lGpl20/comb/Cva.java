package lGpl20.comb;

import java.math.BigInteger;

import lGpl20.b32.eqDiv.BigFraction;
import lGpl20.comb.selfCallva.Recursva;
import lGpl20.o.O;

/**
 * 本类别组合数学, 算高中数学的排列组合.<br/>
 * <br/>
 * To do some Combinatorics exercise.
 * 
 * @version 2018/07/09_21:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Cva" >Cva.java</a>
 * 
 * @see Recursva
 */
public abstract class Cva extends Cva_Z {

	private static final Class<Cva> CLASS_THIS = Cva.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 求有幾種組合的方法數 C(n,r).<br/>
	 * n&gt;0, C(-n,r)= ((-1)^r)*C(n+r-1,r)<br/>
	 * C(1/2,3)= ((1/2)*(-1/2)*(-3/2))/3!= 1/16<br/>
	 * To return C(n,r).<br/>
	 * The combination of the two input numbers (0 &lt;= r &lt;= n).
	 */
	public static BigFraction cInBigFraction(BigFraction n, int r) {

		if (r < 0) {

			O.x("r=" + r);

		}

		if (r == 0) {

			return BigFraction.$1;

		}

		BigFraction f = n.sub(new BigFraction(r, 1)).add(BigFraction.$1);
		BigFraction ans = BigFraction.$1;

		for (int i = 1; i <= r; i++, f = f.add(BigFraction.$1)) {

			ans = ans.mul(f);

		}

		return ans.div(new BigFraction(Pva.bigInt(r), BigInteger.ONE));

	}

}