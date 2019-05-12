package lGpl20.comb;

import java.math.BigInteger;

import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * To derange.<br/>
 * <br/>
 * Derangement.
 * 
 * @version 2019/04/18_09:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Deranger" >Deranger.java</a>
 * 
 * @see Der_A
 */
public abstract class Deranger extends PInEx_Z {

	private static final Class<Deranger> CLASS_THIS = Deranger.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回傳亂序數.<br/>
	 * 即 n 個人排成一列後解散再排成一列, 沒有人排在自己原先的位置的方法數.<br/>
	 * D(n)=nD(n-1)+(-1)^n<br/>
	 * 0, 1, 2, 9, 44, 265, 1854,...<br/>
	 * To return the number of ways that n people line up then dismiss, and<br/>
	 * line up again but nobody is at the previous position.
	 */
	public static long int64(int n) {

		if (n <= 0) {

			O.x("n=" + n);

		}

		if (n == 1) {

			return 0L;

		}

		if (n == 2) {

			return 1L;

		}

		if (n == 3) {

			return 2L;

		}

		if (n == 4) {

			return 9L;

		}

		if (n == 5) {

			return 44L;

		}

		if (n == 6) {

			return 265L;

		}

		if (n == 7) {

			return 1_854L;

		}

		if (n == 8) {

			return 14_833L;

		}

		if (n == 9) {

			return 133_496L;

		}

		if (n == 10) {

			return 1_334_961L;

		}

		if (n == 11) {

			return 14_684_570L;

		}

		if (n == 12) {

			return 176_214_841L;

		}

		if (n == 13) {

			return 2_290_792_932L;

		}

		if (n == 14) {

			return 32_071_101_049L;

		}

		if (n == 15) {

			return 481_066_515_734L;

		}

		if (n == 16) {

			return 7_697_064_251_745L;

		}

		if (n == 17) {

			return 130_850_092_279_664L;

		}

		if (n == 18) {

			return 2_355_301_661_033_953L;

		}

		if (n == 19) {

			return 44_750_731_559_645_106L;

		}

		if (n == 20) {

			return 895_014_631_192_902_121L;

		}

		throw new IllegalArgumentException();

	}

	/**
	 * 回傳亂序數.<br/>
	 * 即 n 個人排成一列後解散再排成一列, 沒有人排在自己原先的位置的方法數.<br/>
	 * D(n)=nD(n-1)+(-1)^n<br/>
	 * Or:<br/>
	 * D(n)=(n-1)[(D(n-1)+D(n-2)]<br/>
	 * 0, 1, 2, 9, 44, 265, 1854,...<br/>
	 * To return the number of ways that n people line up then dismiss, and<br/>
	 * line up again but nobody is at the previous position.
	 */
	public static BigInteger bigInt(int n) {

		if (n <= 0) {

			O.x("n=" + n);

		}

		BigInteger d3 = BigInteger.valueOf(Ranger.$2);// D(n)==I_E(n,n)

		if (n < 4) {

			return BigInteger.valueOf(n - 1);

		}

		for (int i = 4; i <= n; i++) {

			if ((i & 0b1) == 0) {

				d3 = (BigInteger.valueOf(i).multiply(d3)).add(BigInteger.ONE);// D4=4*D3+1

			} else {

				d3 = (BigInteger.valueOf(i).multiply(d3)).subtract(BigInteger.ONE);// D4=4*D3+1

			}

		}

		return d3;

	}

	/**
	 * 回傳亂序數.<br/>
	 * 即 n 個人排成一列後解散再排成一列, 沒有人排在自己原先的位置的方法數.<br/>
	 * D(n,k)=C(n,k)*D(k)<br/>
	 * To return the number of ways that n people line up then dismiss, and<br/>
	 * line up again but nobody is at the previous position.
	 */
	public static long int64(int n, int k) {

		// if (k == 0) {//fuck
		// return 1L;
		//
		// }

		if (n <= 0 || k <= 0) {

			O.x("n=" + n + ", k=" + k);

		}

		if (k == 1) {

			return 0L;

		}

		long ans = Cva.int64(n, k) * int64(k);

		return ans;

	}

	/**
	 * 回傳亂序數.<br/>
	 * 即 n 個人排成一列後解散再排成一列, 沒有人排在自己原先的位置的方法數.<br/>
	 * D(n,k)=C(n,k)*D(k)<br/>
	 * To return the number of ways that n people line up then dismiss, and<br/>
	 * line up again but nobody is at the previous position.
	 */
	public static BigInteger bigInt(int n, int k) {

		BigInteger ans = Cva.bigInt(n, k).multiply(bigInt(k));

		return ans;

	}

}
