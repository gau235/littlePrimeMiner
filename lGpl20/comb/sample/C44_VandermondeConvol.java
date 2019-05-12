package lGpl20.comb.sample;

import java.math.BigInteger;

import lGpl20.b32.eqDiv.BigFraction;
import lGpl20.comb.Cva;
import lGpl20.comb.VandermondeConvol;
import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * Vandermonde Convolution.<br/>
 * <br/>
 * Vandermonde Convolution.
 * 
 * @version 2019/04/19_11:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C44_VandermondeConvol" >
 *          C44_VandermondeConvol.java</a>
 * 
 */
public class C44_VandermondeConvol {

	public static void main(String[] sAry) throws Throwable {

		// Vandermonde's convolution
		final int totalN = 39;
		final int totalK = 5;

		final int partN = 10;

		int iLowerBound = 2;
		BigInteger sum = BigInteger.ZERO;

		for (; iLowerBound <= totalK; iLowerBound++) {

			O.l("iLowerBound=" + iLowerBound);
			if (iLowerBound <= totalK) {

				int tempA = partN;
				int tempB = iLowerBound;
				int tempC = totalN - partN;
				int tempD = totalK - iLowerBound;

				BigInteger tempBigInt = Cva.bigInt(tempA, tempB).multiply(Cva.bigInt(tempC, tempD));

				O.l("C(" + tempA + "," + tempB + ")*C(" + tempC + "," + tempD + ") = " + SByN.f(tempBigInt));

				sum = sum.add(tempBigInt);
				O.l();

			}

		}

		BigInteger total = Cva.bigInt(totalN, totalK);
		BigInteger totalBoughtTicket = Cva.bigInt(partN, totalK);
		BigInteger cost = totalBoughtTicket.multiply(BigInteger.valueOf(50L));

		O.l("sum=" + SByN.f(sum));
		O.l("total=" + SByN.f(total));

		O.l();

		O.l("totalBoughtTicket=" + SByN.f(totalBoughtTicket));
		O.l("cost=" + SByN.f(cost));
		O.l();
		O.l("hit rate=" + new BigFraction(sum, total).bigDecimal(5).toPlainString());

		O.l("=========================");
		O.l();

		O.l(VandermondeConvol.script(totalN, totalK, partN));

	}

}