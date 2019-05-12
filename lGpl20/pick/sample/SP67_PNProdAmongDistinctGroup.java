package lGpl20.pick.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.cartesianProd.CartesianProdPva;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;
import lGpl20.other.jsp.Jsp;

/**
 * @version 2019/03/21_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP67_PNProdAmongDistinctGroup" >
 *          SP67_PNProdAmongDistinctGroup.java</a>
 *
 * @see SP63_CNProdAmongDistinctGroup
 */
public abstract class SP67_PNProdAmongDistinctGroup {

	public static void main(String[] sAry) throws Throwable {

		sAry = new String[] { "A", "B", "C", "D", "E", "F", "G", "H" };

		long b64IntoB6ForAllVal32 = B64IntoB6.genB64IntoB6ByAry32(2, 1, 2);

		// int n = sAry.length;// sAry.length must gte B64IntoB6.sum32(b64IntoB6)
		int n = B64IntoB6.sum32(b64IntoB6ForAllVal32);

		Ery<Seq> eryOfSeq = CartesianProdPva.prodAmongGroup(b64IntoB6ForAllVal32, n, false);

		StringBuilder str = CartesianProdPva.toStrByEryOfSeq(eryOfSeq, sAry, " ", Jsp.L);
		O.l("str=");
		O.l(str);

		long ans = CartesianProdPva.prod64OfToPAmongDistinctGroup(n, b64IntoB6ForAllVal32);

		if (eryOfSeq.len() != ans) {

			O.x("eryOfSeq.len()=" + eryOfSeq.len() + " ans=" + ans);

		}

		O.l("ans=" + ans);

	}

}
