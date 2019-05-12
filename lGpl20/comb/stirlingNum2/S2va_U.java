package lGpl20.comb.stirlingNum2;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.cartesianProd.CartesianProdCva;
import lGpl20.comb.filter.Condi;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/03/25_12:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S2va_U" >S2va_U.java</a>
 * 
 * @see S2va_Z
 */
public abstract class S2va_U extends S2va_L {

	private static final Class<S2va_U> CLASS_THIS = S2va_U.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Stirling number of the second kind.<br/>
	 * Stirling number of the second kind.
	 * 
	 * @throws InterruptedException
	 */
	public static Ery<Seq> goByCartesianProd(Condi condi) throws InterruptedException {

		long[] aryOfB64IntoB6 = DiIGo.go(condi.n, condi.k, condi.min, condi.max);

		Ery<Seq> retEryOfSeq = new Ery<Seq>();

		for (int i = 0; i != aryOfB64IntoB6.length; i++) {

			if (condi.min == 1) {

				retEryOfSeq.appendAll(
						CartesianProdCva.prodAmongGroup(B64IntoB6.revAgainstB6FromR(aryOfB64IntoB6[i]), condi.n, true));

			} else {

				retEryOfSeq.appendAll(CartesianProdCva
						.prodAmongGroup(DiIGo.adjustByMinNRevAgainstB6FromR(aryOfB64IntoB6[i], condi.min), condi.n, true));

			}

		}

		return retEryOfSeq;

	}

	/**
	 * Stirling number of the second kind.<br/>
	 * Stirling number of the second kind.
	 * 
	 * @throws InterruptedException
	 */
	public static Ery<Seq> collectToKByToGoByCartesianProd(Condi condi) throws InterruptedException {

		Ery<Seq> retEryOfSeq = new Ery<Seq>();

		final int endK = condi.k;

		Condi clonedConi = condi.clone();
		clonedConi.min = 1;// fuck

		for (int k = 1; k <= endK; k++) {

			clonedConi.k = k;

			retEryOfSeq.appendAll(goByCartesianProd(clonedConi));

		}

		return retEryOfSeq;

	}

}
