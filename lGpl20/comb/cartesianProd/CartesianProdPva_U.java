package lGpl20.comb.cartesianProd;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.thr.ThrToPByB64As2Pow;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/03/21_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CartesianProdPva_U" >CartesianProdPva_U.java</a>
 * 
 * @see CartesianProdPva
 */
public abstract class CartesianProdPva_U extends CartesianProdPva_L {

	private static final Class<CartesianProdPva_U> CLASS_THIS = CartesianProdPva_U.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To pick.<br/>
	 * To pick.
	 * 
	 * @see CartesianProdCva#prodAmongGroup(long, int, boolean)
	 */
	public static Ery<Seq> prodAmongGroup(long b64IntoB6ForAllVal32, int n, boolean isIdentGroup) throws InterruptedException {

		if (n > 62) { // long allB64As2Pow = (0b1L << n) - 1L;

			O.x("n=" + n);

		}

		int total32 = B64IntoB6.totalNone0B6CellFromR(b64IntoB6ForAllVal32);

		long allB64As2Pow = (0b1L << n) - 1L;

		Ery<Seq> bigRetEry = new Ery<Seq>();
		Ery<Seq> bigTempEry = new Ery<Seq>();

		int iForVal32 = 0;
		// int val32 = ary32[iForVal32];
		int val32 = ((int) (b64IntoB6ForAllVal32 >>> (B64IntoB6.$6 * iForVal32)))
				& B64IntoB6.MASK32;
		// B64IntoB6.findFirstOccurFromTail(b64IntoB6ForAllVal32, iForVal32 - 1, val32);
		iForVal32++;

		ThrToPByB64As2Pow thrToPByB64As2Pow = new ThrToPByB64As2Pow(allB64As2Pow, val32);
		thrToPByB64As2Pow.run();

		long[] tempAry = thrToPByB64As2Pow.box;
		for (int i = 0; i != tempAry.length; i++) {

			bigRetEry.a(new Seq(tempAry[i]));

		}

		/////////////////////////////////////
		// StringBuilder tempStr = B64IntoB6.toStrByAryOfB64IntoB6(tempAry, O.L);
		// O.l(tempStr);
		/////////////////////////////////////

		Seq leftHandSideSeq;
		long restB64As2Pow;
		Object[] objAryOfSeq;

		int index32;
		for (; iForVal32 != total32; iForVal32++) {

			// val32 = ary32[iForVal32];
			// index32 = Ary32va.findFirstOccurFromTail(ary32, iForVal32 - 1, val32);
			val32 = ((int) (b64IntoB6ForAllVal32 >>> (B64IntoB6.$6 * iForVal32)))
					& B64IntoB6.MASK32;// B64IntoB6.atFromR
			
			index32 = B64IntoB6.findFirstOccurFromTail(b64IntoB6ForAllVal32, iForVal32 - 1, val32);

			objAryOfSeq = bigRetEry.trim().aryOfElem();

			for (int i = 0; i != objAryOfSeq.length; i++) {

				leftHandSideSeq = (Seq) objAryOfSeq[i];

				// A,B,C,D we have A,C then to take B,D
				restB64As2Pow = allB64As2Pow ^ sumAftConvertToB64As2PowByB6Cell(leftHandSideSeq.ary(false));

				thrToPByB64As2Pow = new ThrToPByB64As2Pow(restB64As2Pow, val32);
				thrToPByB64As2Pow.run();

				if (isIdentGroup) {

					// O.l("cloneNJoin=" + O.S32 + CLASS_THIS);
					cloneNJoin(leftHandSideSeq, thrToPByB64As2Pow.box, index32, bigTempEry);

				} else {

					cloneNJoin(leftHandSideSeq, thrToPByB64As2Pow.box, bigTempEry);

				}

			}

			// StringBuilder str2 = toStrByEryOfSeqAftP(bigTempEry, new String[] { "A", "B", "C", "D" }, "\t", O.L);
			// O.l(str2);

			bigRetEry = bigTempEry;
			bigTempEry = new Ery<Seq>();

		}

		return bigRetEry;

	}

}
