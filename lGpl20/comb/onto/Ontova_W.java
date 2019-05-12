package lGpl20.comb.onto;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.cartesianProd.CartesianProdCva;
import lGpl20.comb.filter.Condi;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;
import lGpl20.shareWXyz.ShWGo;

/**
 * @version 2019/03/26_21:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ontova_W" >Ontova_W.java</a>
 * 
 * @see Ontova_Y
 */
public abstract class Ontova_W extends Ontova_U {

	private static final Class<Ontova_W> CLASS_THIS = Ontova_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Onto.<br/>
	 * Onto.
	 * 
	 * @throws InterruptedException
	 */
	public static Ery<Seq> goByCartesianProd(Condi condi) throws InterruptedException {

		long[] aryOfB64IntoB6 = ShWGo.go(condi.n, condi.k, condi.min, condi.max);

		Ery<Seq> retEryOfSeq = new Ery<Seq>();

		for (int i = 0; i != aryOfB64IntoB6.length; i++) {

			if (condi.min == 1) {

				retEryOfSeq.appendAll(
						CartesianProdCva.prodAmongGroup(B64IntoB6.revAgainstB6FromR(aryOfB64IntoB6[i]), condi.n, false));

			} else {

				//O.l("i=" + i + O.S32 + CLASS_THIS);

				retEryOfSeq.appendAll(CartesianProdCva
						.prodAmongGroup(DiIGo.adjustByMinNRevAgainstB6FromR(aryOfB64IntoB6[i], condi.min), condi.n, false));

			}

		}

		return retEryOfSeq;

	}

}
