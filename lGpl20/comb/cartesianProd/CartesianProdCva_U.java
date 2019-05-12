package lGpl20.comb.cartesianProd;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.thr.ThrToCByB64As2Pow;
import lGpl20.o.O;
import lGpl20.o.ery.Aryva;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/03/21_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CartesianProdCva_U" >CartesianProdCva_U.
 *          java</a>
 * 
 * @see CartesianProdCva
 */
public abstract class CartesianProdCva_U extends CartesianProdCva_L {

	private static final Class<CartesianProdCva_U> CLASS_THIS = CartesianProdCva_U.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To pick.<br/>
	 * To pick.
	 * 
	 * @see CartesianProdPva#prodAmongGroup(long, int, boolean)
	 */
	public static Ery<Seq> prodAmongGroup(long b64IntoB6ForAllVal32, int n, boolean isIdentGroup) throws InterruptedException {

		if (n > 61) {// int newB32As2Pow = (currB32As2Pow << 1) -1;// so max int32 must be 30 bits or 29 bits?

			O.x("n=" + n);

		}

		long total32 = B64IntoB6.totalNone0B6CellFromR(b64IntoB6ForAllVal32);

		long allB64As2Pow = (0b1L << n) - 1L;

		Ery<Seq> bigRetEry = new Ery<Seq>();
		Ery<Seq> bigTempEry = new Ery<Seq>();

		int iForVal32 = 0;
		int val32 = ((int) (b64IntoB6ForAllVal32 >>> (B64IntoB6.$6 * iForVal32))) & B64IntoB6.MASK32;// B64IntoB6.atFromR

		iForVal32++;

		ThrToCByB64As2Pow thrToCByB64As2Pow = new ThrToCByB64As2Pow(allB64As2Pow, val32);
		thrToCByB64As2Pow.run();

		long[] tempAry = thrToCByB64As2Pow.box;
		for (int i = 0; i != tempAry.length; i++) {

			bigRetEry.a(new Seq(tempAry[i]));

		}

		/////////////////////////////////////
		// StringBuilder str1 = Strva.toStrToCByB32As2PowBySAry(tempAry32, Jsp.L);
		// O.l("str1=" + O.L + str1);
		/////////////////////////////////////

		Seq leftHandSideSeq;
		long restB64As2Pow;
		Object[] objAryOfSeq;

		int index32;
		for (; iForVal32 != total32; iForVal32++) {

			// val32 = ary32[iForVal32];
			// index32 = Ary32va.findFirstOccurFromTail(ary32, iForVal32 - 1, val32);
			val32 = ((int) (b64IntoB6ForAllVal32 >>> (B64IntoB6.$6 * iForVal32))) & B64IntoB6.MASK32;// B64IntoB6.atFromR

			index32 = B64IntoB6.findFirstOccurFromTail(b64IntoB6ForAllVal32, iForVal32 - 1, val32);

			objAryOfSeq = bigRetEry.trim().aryOfElem();

			for (int i = 0; i != objAryOfSeq.length; i++) {

				leftHandSideSeq = (Seq) objAryOfSeq[i];

				// A,B,C,D we have A,C then to take B,D
				restB64As2Pow = allB64As2Pow ^ Aryva.sum(leftHandSideSeq.ary(false), 0, leftHandSideSeq.iLen);

				// Integer.lowestOneBit(restB64As2Pow)
				thrToCByB64As2Pow = new ThrToCByB64As2Pow(restB64As2Pow, val32);
				thrToCByB64As2Pow.run();

				if (isIdentGroup) {

					// O.l("cloneNJoinIfGt=" + O.S32 + CLASS_THIS);
					cloneNJoinIfGt(leftHandSideSeq, thrToCByB64As2Pow.box, index32, bigTempEry);

				} else {

					cloneNJoin(leftHandSideSeq, thrToCByB64As2Pow.box, bigTempEry);

				}

			}

			bigRetEry = bigTempEry;
			bigTempEry = new Ery<Seq>();

		}

		return bigRetEry;

	}

}
