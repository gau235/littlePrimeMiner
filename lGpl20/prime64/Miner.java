package lGpl20.prime64;

import lGpl20.o.O;
import lGpl20.prime64.ery.EryOfPrimeAry;
import lGpl20.prime64.thr.Thrva;

/**
 * 本類別找質數的人.<br/>
 * 在找質數的人類別撰寫完後, 我發現要將找一段質數這件大工作分成一小段一小段找, 每次只找一小段區間質數, 放入質數隊伍,<br/>
 * 繼續找下一小段區間質數.<br/>
 * 所以質數卵就是由找質數的人, 質數隊伍, 找質數的執行緒, 縱貫構成.<br/>
 * <br/>
 * To mine prime by threads.
 * 
 * @version 2017/03/23_09:58:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner" >Miner</a>
 * 
 * @see EryOfPrimeAry
 * 
 * @see Thrva
 * 
 * @see Marker
 */
public class Miner extends Miner_Z {

	private static final Class<Miner> CLASS_THIS = Miner.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * If passes test.<br/>
	 * If passes test.
	 */
	public static void passTest() {

		if (mineWFitLenAry(1, 1).length != 0) {

			O.x();

		}

		if (mineWFitLenAry(1, 2).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(1, 3).length != 2) {

			// O.l("Arrays.toString=" + Arrays.toString(mine(1, 3)) + O.S32 + CLASS_THIS);
			O.x();

		}

		if (mineWFitLenAry(1, 4).length != 2) {

			O.x();

		}

		if (mineWFitLenAry(2, 2).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(2, 3).length != 2) {

			O.x();

		}

		if (mineWFitLenAry(2, 4).length != 2) {

			O.x();

		}

		if (mineWFitLenAry(3, 3).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(3, 4).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(4, 4).length != 0) {

			O.x();

		}

		//////////////////////////

		if (mineWFitLenAry(2_147_483_645L, 2_147_483_645L).length != 0) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_645L, 2_147_483_646L).length != 0) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_645L, 2_147_483_647L).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_645L, 2_147_483_648L).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_645L, 2_147_483_649L).length != 1) {// 2,147,483,645

			O.x();

		}

		if (mineWFitLenAry(2_147_483_646L, 2_147_483_646L).length != 0) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_646L, 2_147_483_647L).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_646L, 2_147_483_648L).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_646L, 2_147_483_649L).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_647L, 2_147_483_647L).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_647L, 2_147_483_648L).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_647L, 2_147_483_649L).length != 1) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_648L, 2_147_483_648L).length != 0) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_648L, 2_147_483_649L).length != 0) {

			O.x();

		}

		if (mineWFitLenAry(2_147_483_649L, 2_147_483_649L).length != 0) {

			O.x();

		}

		//////////////////////////

		if (countPrime(1, 1) != 0) {

			O.x();

		}

		if (countPrime(1, 2) != 1) {

			O.x();

		}

		if (countPrime(1, 3) != 2) {

			O.x();

		}

		if (countPrime(1, 4) != 2) {

			O.x();

		}

		if (countPrime(2, 2) != 1) {

			O.x();

		}

		if (countPrime(2, 3) != 2) {

			O.x();

		}

		if (countPrime(2, 4) != 2) {

			O.x();

		}

		if (countPrime(3, 3) != 1) {

			O.x();

		}

		if (countPrime(3, 4) != 1) {

			O.x();

		}

		if (countPrime(4, 4) != 0) {

			O.x();

		}

		//////////////////////////

		if (countPrime(2_147_483_645L, 2_147_483_645L) != 0) {

			O.x();

		}

		if (countPrime(2_147_483_645L, 2_147_483_646L) != 0) {

			O.x();

		}

		if (countPrime(2_147_483_645L, 2_147_483_647L) != 1) {

			O.x();

		}

		if (countPrime(2_147_483_645L, 2_147_483_648L) != 1) {

			O.x();

		}

		if (countPrime(2_147_483_645L, 2_147_483_649L) != 1) {

			O.x();

		}

		if (countPrime(2_147_483_646L, 2_147_483_646L) != 0) {

			O.x();

		}

		if (countPrime(2_147_483_646L, 2_147_483_647L) != 1) {

			O.x();

		}

		if (countPrime(2_147_483_646L, 2_147_483_648L) != 1) {

			O.x();

		}

		if (countPrime(2_147_483_646L, 2_147_483_649L) != 1) {

			O.x();

		}

		if (countPrime(2_147_483_647L, 2_147_483_647L) != 1) {

			O.x();

		}

		if (countPrime(2_147_483_647L, 2_147_483_648L) != 1) {

			O.x();

		}

		if (countPrime(2_147_483_647L, 2_147_483_649L) != 1) {

			O.x();

		}

		if (countPrime(2_147_483_648L, 2_147_483_648L) != 0) {

			O.x();

		}

		if (countPrime(2_147_483_648L, 2_147_483_649L) != 0) {

			O.x();

		}

		if (countPrime(2_147_483_649L, 2_147_483_649L) != 0) {

			O.x();

		}

	}

	

	

}