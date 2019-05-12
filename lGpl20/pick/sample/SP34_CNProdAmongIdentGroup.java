package lGpl20.pick.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.cartesianProd.CartesianProdCva;
import lGpl20.o.O;

/**
 * To product.<br/>
 * <br/>
 * To product.
 * 
 * @version 2019/03/17_16:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP34_CNProdAmongIdentGroup" >
 *          SP34_CNProdAmongIdentGroup.java</a>
 * 
 */
public class SP34_CNProdAmongIdentGroup {

	private static final Class<SP34_CNProdAmongIdentGroup> CLASS_THIS = SP34_CNProdAmongIdentGroup.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		long b64IntoB6 = B64IntoB6.genB64IntoB6ByAry32(2, 1, 2, 1);// (1,1,2) (1,2,1) (2,1,1)
		b64IntoB6 = B64IntoB6.selSort(b64IntoB6);// must sort
		O.l("bef=" + O.L + B64IntoB6.str24(b64IntoB6));

		int n = 6;// n must >= B64IntoB6.sum32(b64IntoB6)

		O.l("ans=" + CartesianProdCva.prod64OfToCAmongIdentGroup(n, b64IntoB6));

		long b64IntoB6CountDup = B64IntoB6.countDup(b64IntoB6);

		StringBuilder str = B64IntoB6.toStrForToDiI(b64IntoB6CountDup, 1);
		O.l("str=" + str);

	}

}
