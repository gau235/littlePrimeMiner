package lGpl20.pick.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.cartesianProd.CartesianProdva;
import lGpl20.o.O;

/**
 * To product.<br/>
 * <br/>
 * To product.
 * 
 * @version 2018/05/22_13:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP22_CartesianProdNMerge" >SP22_CartesianProdNMerge.java
 *          </a>
 * 
 */
public class SP22_CartesianProdNMerge {

	private static final Class<SP22_CartesianProdNMerge> CLASS_THIS = SP22_CartesianProdNMerge.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		long b64IntoB6 = B64IntoB6.genB64IntoB6ByAry32(1, 2);

		long b64IntoB6_2 = B64IntoB6.genB64IntoB6ByAry32(15, 16);
		long b64IntoB6_3 = B64IntoB6.genB64IntoB6ByAry32(25, 26);

		O.l("bef1=" + O.L + B64IntoB6.str24(b64IntoB6));
		O.l("bef1=" + O.L + B64IntoB6.toStrByValInB6Cell(b64IntoB6));

		long[] retAry = CartesianProdva.prodNMergeInB64IntoB6(b64IntoB6, b64IntoB6_2, b64IntoB6_3);

		for (int i = 0; i != retAry.length; i++) {

			long b64 = B64IntoB6.revAgainstB6FromR(retAry[i]);

			StringBuilder str = B64IntoB6.toStrByValInB6Cell(b64);

			O.l();

			O.l("aft=" + O.L + B64IntoB6.str24(b64));
			O.l("aft=" + str);

		}

	}

}
