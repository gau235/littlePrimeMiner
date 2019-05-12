package lGpl20.comb.cartesianProd.sample;

import java.io.Serializable;

import lGpl20.comb.cartesianProd.CartesianProdCva;
import lGpl20.comb.cartesianProd.CartesianProdva;
import lGpl20.comb.thr.ThrToCByB64As2Pow;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.other.jsp.Jsp;

/**
 * @version 2019/03/23_15:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP25_CartesianProdEachOther" >
 *          SP25_CartesianProdEachOther.java</a>
 *
 * @see CartesianProdva
 */
public abstract class SP25_CartesianProdEachOther implements Serializable {

	private static final Class<SP25_CartesianProdEachOther> CLASS_THIS = SP25_CartesianProdEachOther.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		sAry = new String[] { "A", "B", "C", "D", "E", "F", "G", "H" };

		Ery<long[]> ery = new Ery<>();

		ThrToCByB64As2Pow thrToCByB64As2Pow = new ThrToCByB64As2Pow(0b111L, 2);
		thrToCByB64As2Pow.run();
		ery.a(thrToCByB64As2Pow.box);

		thrToCByB64As2Pow = new ThrToCByB64As2Pow(0b111L << 3, 2);
		thrToCByB64As2Pow.run();
		ery.a(thrToCByB64As2Pow.box);

		StringBuilder str = CartesianProdCva.toStrByEryOfSeq(CartesianProdva.prodEachOther(ery), sAry, " ", Jsp.L);
		O.l("str=");
		O.l(str);

	}

}