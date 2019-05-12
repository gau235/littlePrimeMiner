package lGpl20.pick.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.cartesianProd.CartesianProdCva;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;
import lGpl20.other.jsp.Jsp;

/**
 * @version 2019/03/21_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP61_CNProdAmongIdentGroup" >
 *          SP61_CNProdAmongIdentGroup.java</a>
 *
 * @see SP65_PNProdAmongIdentGroup
 */
public abstract class SP61_CNProdAmongIdentGroup {

	public static void main(String[] sAry) throws Throwable {// S2

		sAry = new String[] { "A", "B", "C", "D", "E", "F", "G", "H" };

		long b64IntoB6ForAllVal32 = B64IntoB6.genB64IntoB6ByAry32(2, 1, 2);

		// int n = sAry.length;// sAry.length must gte B64IntoB6.sum32(b64IntoB6)
		int n = B64IntoB6.sum32(b64IntoB6ForAllVal32);

		Ery<Seq> eryOfSeq = CartesianProdCva.prodAmongGroup(b64IntoB6ForAllVal32, n, true);

		StringBuilder str = CartesianProdCva.toStrByEryOfSeq(eryOfSeq, sAry, " ", Jsp.L);
		O.l("str=");
		O.l(str);

		long ans = CartesianProdCva.prod64OfToCAmongIdentGroup(n, B64IntoB6.selSort(b64IntoB6ForAllVal32));

		if (eryOfSeq.len() != ans) {

			O.x("eryOfSeq.len()=" + eryOfSeq.len() + " ans=" + ans);

		}

		O.l("ans=" + ans);

	}

}
