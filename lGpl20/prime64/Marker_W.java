package lGpl20.prime64;

import lGpl20.o.O;

/**
 * @version 2017/07/07_08:18:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Marker_W" >Marker_W.java</a>
 * 
 * @see Marker_Z
 */
public abstract class Marker_W extends Marker_R {

	private static final Class<Marker_W> CLASS_THIS = Marker_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public void run() {

		///////////////////////////////// to mark
		int q;
		int rDiv2;
		// int v;

		long divisorMulDivisor;
		long divisorMul2;

		for (; divisor < root2OfTailN; divisor = divisor + Ranger.$2) {

			// O.l("divisor=" + divisor + O.S32 + CLASS_THIS);
			///////////////////////////////////// replace get0Or1InB32AryForCompo(divisor)
			q = (int) (divisor >>> 6);
			rDiv2 = ((int) (divisor & 0b11_1111L)) >>> 1;

			if (((box[q] >>> rDiv2) & 0b1) == 0) { // if (get0Or1InB32AryForCompo(divisor) == 0) {

				divisorMulDivisor = (divisor * divisor);
				divisorMul2 = divisor << 1;

				do {

					// O.l("divisorMulDivisor=" + divisorMulDivisor + O.S32 + CLASS_THIS);
					//////////////////////////////////////////// mark1InB32AryForCompo(divisorMulDivisor);
					q = (int) (divisorMulDivisor >>> 6);
					rDiv2 = (((int) divisorMulDivisor) & 0b11_1111) >>> 1;// r=2 or r=3, the pos is 1

					// v = box[q];
					// if (((v >>> rDiv2) & 0b1) == 0b0) {
					//
					// box[q] = v | (0b1 << rDiv2);
					//
					// } else {
					//
					// O.l("box[q] =" + B32va.str32(box[q]) + O.S32 + CLASS_THIS);
					//
					// }
					////////////////////////////////////////////
					box[q] = box[q] | (0b1 << rDiv2);// for CPU performance
					divisorMulDivisor = divisorMulDivisor + divisorMul2;

				} while (divisorMulDivisor <= tailN);// more nature

			}

		}
		///////////////////////////////// end to mark

	}

}
