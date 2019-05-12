package lGpl20.prime64;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.prime64.thr.ThrToPeekAtMarker;

/**
 * To mark primes.<br/>
 * <br/>
 * To mark primes.
 * 
 * @version 2019/04/20_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Marker" >Marker.java</a>
 * 
 * @see Miner
 */
public class Marker extends Marker_Z {

	private static final Class<Marker> CLASS_THIS = Marker.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To construct.<br/>
	 * To construct.
	 */
	public Marker(long tailN) {

		if (tailN > $MAX_TEST_N || tailN <= this.tailN) {

			O.x();

		}

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		this.tailN = tailN;
		root2OfTailN = (long) StrictMath.sqrt(tailN) + 1L;
		int len32OfB32Ary = (int) (tailN >>> 6) + 1;

		str.append("tailN=" + SByN.f(tailN) + O.S32 + CLASS_THIS + O.L);
		str.append("root2OfTailN=" + SByN.f(root2OfTailN) + O.S32 + CLASS_THIS + O.L);
		str.append("len32OfB32Ary=" + SByN.f(len32OfB32Ary) + O.S32 + CLASS_THIS + O.L);

		O.l(str);

		box = new int[len32OfB32Ary];

	}

	/**
	 * If passes test.<br/>
	 * If passes test.
	 */
	public static void passTest() {

		final Marker marker = new Marker(Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME);
		marker.start();

		ThrToPeekAtMarker thrToPeekAtToMarkPrime = new ThrToPeekAtMarker(marker);
		thrToPeekAtToMarkPrime.start();

		try {

			thrToPeekAtToMarkPrime.join();

		} catch (InterruptedException interruptedEx) {

			interruptedEx.printStackTrace();

		}

		if ((int) marker.countPrimeByB32AryForCompo(1L,
				Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME) != Miner.$MAX_LEN32_OF_ORI_ARY_OF_PRIME) {

			O.x = 1 / 0;

		}

		////////////////////////////////////////////////////

		if (marker.retrievePrimeAry(1, 1).length != 0) {

			O.x = 1 / 0;

		}

		if (marker.retrievePrimeAry(1, 2).length != 1) {

			O.x = 1 / 0;

		}

		if (marker.retrievePrimeAry(1, 3).length != 2) {

			O.x = 1 / 0;

		}

		if (marker.retrievePrimeAry(1, 4).length != 2) {

			O.x = 1 / 0;

		}

		if (marker.retrievePrimeAry(2, 2).length != 1) {

			O.x = 1 / 0;

		}

		if (marker.retrievePrimeAry(2, 3).length != 2) {

			O.x = 1 / 0;

		}

		if (marker.retrievePrimeAry(2, 4).length != 2) {

			O.x = 1 / 0;

		}

		if (marker.retrievePrimeAry(3, 3).length != 1) {

			O.x = 1 / 0;

		}

		if (marker.retrievePrimeAry(3, 4).length != 1) {

			O.x = 1 / 0;

		}

		if (marker.retrievePrimeAry(4, 4).length != 0) {

			O.x = 1 / 0;

		}

		//////////////////////////////

		if (marker.countPrimeByB32AryForCompo(1, 1) != 0) {// http://c64.tw/w20/o/recErr.jsp

			O.x = 1 / 0;

		}

		if (marker.countPrimeByB32AryForCompo(1, 2) != 1) {

			O.x = 1 / 0;

		}

		if (marker.countPrimeByB32AryForCompo(1, 3) != 2) {

			O.x = 1 / 0;

		}

		if (marker.countPrimeByB32AryForCompo(1, 4) != 2) {

			O.x = 1 / 0;

		}

		if (marker.countPrimeByB32AryForCompo(2, 2) != 1) {

			O.x = 1 / 0;

		}

		if (marker.countPrimeByB32AryForCompo(2, 3) != 2) {

			O.x = 1 / 0;

		}

		if (marker.countPrimeByB32AryForCompo(2, 4) != 2) {

			O.x = 1 / 0;

		}

		if (marker.countPrimeByB32AryForCompo(3, 3) != 1) {

			O.x = 1 / 0;

		}

		if (marker.countPrimeByB32AryForCompo(3, 4) != 1) {

			O.x = 1 / 0;

		}

		if (marker.countPrimeByB32AryForCompo(4, 4) != 0) {

			O.x = 1 / 0;

		}

	}

}
