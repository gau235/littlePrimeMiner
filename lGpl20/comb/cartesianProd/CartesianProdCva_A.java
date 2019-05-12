package lGpl20.comb.cartesianProd;

import lGpl20.comb.Cva;
import lGpl20.comb.Pva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * To product.<br/>
 * <br/>
 * To product.
 * 
 * @version 2019/03/17_16:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CartesianProdCva_A" >CartesianProdCva_A.java</a>
 * 
 * @see CartesianProdCva_L
 */
public abstract class CartesianProdCva_A extends CartesianProdva_Z {

	private static final Class<CartesianProdCva_A> CLASS_THIS = CartesianProdCva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To sum.<br/>
	 * To sum.
	 * 
	 * @see CartesianProdPva#prod64OfToPAmongDistinctGroup(int, long)
	 */
	public static long prod64OfToCAmongDistinctGroup(int n, long b64IntoB6) {

		long ans = 1L;

		int val32;

		do {

			val32 = ((int) b64IntoB6) & B64IntoB6.MASK32;

			ans = ans * Cva.int64(n, val32);
			n = n - val32;

		} while ((b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6) != 0b0L);

		// O.l("ans=" + ans + O.S32 + CLASS_THIS);

		return ans;

	}

	/**
	 * To sum.<br/>
	 * To sum.
	 * 
	 * @see CartesianProdPva#prod64OfToPAmongIdentGroup(int, long)
	 */
	public static long prod64OfToCAmongIdentGroup(int n, long sortedB64IntoB6) {// must be sorted

		long ans = 1L;
		final long b64IntoB6Dup = sortedB64IntoB6;// must be

		int val32;

		do {

			val32 = ((int) sortedB64IntoB6) & B64IntoB6.MASK32;

			ans = ans * Cva.int64(n, val32);
			n = n - val32;

		} while ((sortedB64IntoB6 = sortedB64IntoB6 >>> B64IntoB6.$6) != 0b0L);

		long b64IntoB6CountDup = B64IntoB6.countDup(b64IntoB6Dup);

		if (b64IntoB6CountDup == 0b0L) {

			return ans;

		}

		b64IntoB6CountDup = B64IntoB6.revAgainstB6FromR(b64IntoB6CountDup);// performance
		// O.l("b64IntoB6CountDup=" + O.L + B64IntoB6.str24(b64IntoB6CountDup) + O.S32 + CLASS_THIS);

		do {

			ans = ans / Pva.int64(((int) b64IntoB6CountDup) & B64IntoB6.MASK32);

		} while ((b64IntoB6CountDup = b64IntoB6CountDup >>> B64IntoB6.$6) != 0b0L);

		// O.l("ans=" + ans + O.S32 + CLASS_THIS);

		return ans;

	}

}
