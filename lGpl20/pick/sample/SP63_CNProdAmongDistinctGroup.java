package lGpl20.pick.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.cartesianProd.CartesianProdCva;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;
import lGpl20.o.str.Strva;
import lGpl20.other.jsp.Jsp;

/**
 * @version 2019/05/08_16:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP63_CNProdAmongDistinctGroup" >
 *          SP63_CNProdAmongDistinctGroup.java</a>
 *
 * @see SP67_PNProdAmongDistinctGroup
 */
public abstract class SP63_CNProdAmongDistinctGroup {

	public static void main(String[] sAry) throws Throwable {

		Strva.int32MaxRowForHtml = 123456789;

		sAry = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I" };

		long b64IntoB6ForAllVal32 = B64IntoB6.genB64IntoB6ByAry32(1, 2, 3, 3);

		// int n = sAry.length;// sAry.length must gte B64IntoB6.sum32(b64IntoB6)
		int n = B64IntoB6.sum32(b64IntoB6ForAllVal32);

		Ery<Seq> eryOfSeq = CartesianProdCva.prodAmongGroup(b64IntoB6ForAllVal32, n, false);

		StringBuilder str = CartesianProdCva.toStrByEryOfSeq(eryOfSeq, sAry, " ", Jsp.L);
		O.l("str=");
		O.l(str);

		long ans = CartesianProdCva.prod64OfToCAmongDistinctGroup(n, b64IntoB6ForAllVal32);

		if (eryOfSeq.len() != ans) {

			O.x("eryOfSeq.len()=" + eryOfSeq.len() + " ans=" + ans);

		}

		O.l("ans=" + ans);

	}

}
