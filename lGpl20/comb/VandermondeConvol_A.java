package lGpl20.comb;

import java.io.Serializable;
import java.math.BigInteger;

import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * @version 2019/04/18_10:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=VandermondeConvol_A" >
 *          VandermondeConvol_A.java</a>
 * 
 * @see VandermondeConvol
 */
public abstract class VandermondeConvol_A implements Serializable {

	private static final Class<VandermondeConvol_A> CLASS_THIS = VandermondeConvol_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Vandermonde's convolution.<br/>
	 * Vandermonde's convolution.
	 */
	public static StringBuilder script(int totalN, int totalK, int partN) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		final int totalNMinusPartN = totalN - partN;

		int iLowerBound = 0;
		BigInteger sum = BigInteger.ZERO;
		BigInteger tempBigInt;

		for (; iLowerBound <= partN; iLowerBound++) {

			int totalKMinusILowerBound = totalK - iLowerBound;
			// O.l("iLowerBound=" + iLowerBound);
			if (iLowerBound <= totalK) {

				tempBigInt = Cva.bigInt(partN, iLowerBound).multiply(Cva.bigInt(totalNMinusPartN, totalKMinusILowerBound));
				retStr.append("C(" + partN + "," + iLowerBound + ")*C(" + totalNMinusPartN + "," + totalKMinusILowerBound + ") = "
						+ SByN.f(tempBigInt));

				sum = sum.add(tempBigInt);
				retStr.append(O.C_A_L);

			}

		}

		tempBigInt = Cva.bigInt(totalN, totalK);
		retStr.append("C(" + totalN + "," + totalK + ") = " + SByN.f(tempBigInt));

		if (!sum.equals(tempBigInt)) {

			O.x();

		}

		return retStr;

	}

}
