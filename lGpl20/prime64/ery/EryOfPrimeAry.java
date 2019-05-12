package lGpl20.prime64.ery;

import lGpl20.o.O;
import lGpl20.o.str.S;
import lGpl20.prime64.Miner;

/**
 * 本類別質數隊伍.<br/>
 * <br/>
 * The Ery&lt;long[]&gt;.<br/>
 * Not thread safe.
 * 
 * @version 2019/04/27_10:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=EryOfPrimeAry" >EryOfPrimeAry.java</a>
 * 
 * @see Miner
 */
public class EryOfPrimeAry extends EryOfPrimeAry_A {

	private static final Class<EryOfPrimeAry> CLASS_THIS = EryOfPrimeAry.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 長度為 0 的 EryOfPrimeAry 陣列.<br/>
	 * The EryOfPrimeAry array which length is 0.
	 */
	public static final EryOfPrimeAry[] ERY_OF_PRIME_ARY_ARY0 = new EryOfPrimeAry[0];

	/**
	 * To gen array of EryOfPrimeAry.<br/>
	 * To gen array of EryOfPrimeAry.
	 */
	public static EryOfPrimeAry[] genAryOfEryOfPrimeAry(int len) {

		EryOfPrimeAry[] aryOfEryOfPrimeAry = new EryOfPrimeAry[len];

		for (int i = 0; i != aryOfEryOfPrimeAry.length; i++) {

			aryOfEryOfPrimeAry[i] = new EryOfPrimeAry();

		}

		return aryOfEryOfPrimeAry;

	}

	/**
	 * 取得所有 EryOfPrimeAry 並且合併成 1 個 EryOfPrimeAry.<br/>
	 * To get all of EryOfPrimeAry then to merge in 1 EryOfPrimeAry.
	 */
	public static EryOfPrimeAry mergeAllEryOfPrimeAry(EryOfPrimeAry[] aryOfEryOfPrimeAry) {

		if (aryOfEryOfPrimeAry.length == 1) { // Miner.ID_TO_MINE_PRIME_W_1_ERY_OF_PRIME_ARY

			O.l("aryOfEryOfPrimeAry.length=" + aryOfEryOfPrimeAry.length + O.S32 + CLASS_THIS);
			return aryOfEryOfPrimeAry[0];

		}

		int totalLen = 0;
		EryOfPrimeAry tempEryOfPrimeAry;
		int iBig = 0;

		for (; iBig != aryOfEryOfPrimeAry.length; iBig++) {

			tempEryOfPrimeAry = aryOfEryOfPrimeAry[iBig];
			totalLen = totalLen + tempEryOfPrimeAry.iLen;

		}

		long[][] retAryOfAry = new long[totalLen][];

		int iSmall;
		int iRet = 0;

		for (iBig = 0; iBig != aryOfEryOfPrimeAry.length; iBig++) {

			tempEryOfPrimeAry = aryOfEryOfPrimeAry[iBig];

			for (iSmall = 0; iSmall != tempEryOfPrimeAry.iLen; iSmall++) {

				retAryOfAry[iRet++] = tempEryOfPrimeAry.aryOfElem[iSmall];

			}

		}

		// O.l("retAryOfAry.len=" + retAryOfAry.length + O.S32 + CLASS_THIS);
		EryOfPrimeAry eryOfPrimeAry = new EryOfPrimeAry(retAryOfAry);
		// O.l("eryOfPrimeAry.totalPrime()=" + SByN.f(eryOfPrimeAry.totalPrime()) + O.S32 + CLASS_THIS);

		return eryOfPrimeAry;

	}

	/**
	 * To merge.<br/>
	 * To merge.
	 */
	public static long[] mergeIn1AryOfPrimeByToCopy(long[] oldAryOfPrime, EryOfPrimeAry sortedEryOfPrimeAry) {

		final int newTotal = (int) sortedEryOfPrimeAry.totalPrime() + oldAryOfPrime.length;

		if (newTotal == oldAryOfPrime.length) {

			return oldAryOfPrime;

		}

		final long[] retAryOfPrime = new long[newTotal];
		int iRetAryOfPrime = oldAryOfPrime.length;

		long[] fromAry;

		System.arraycopy(oldAryOfPrime, 0, retAryOfPrime, 0, iRetAryOfPrime);

		for (int iFrom = 0; iRetAryOfPrime != newTotal; iFrom++) {

			fromAry = sortedEryOfPrimeAry.aryOfElem[iFrom];
			System.arraycopy(fromAry, 0, retAryOfPrime, iRetAryOfPrime, fromAry.length);
			iRetAryOfPrime = iRetAryOfPrime + fromAry.length;

		}

		return retAryOfPrime;

	}

	/**
	 * 找出輸入的 EryOfPrimeAry 物件中含有的全部連續質數伍的最末位置的之後.<br/>
	 * To get the index after tail among the sequential arrays of prime.
	 */
	public static int getIndexAftTailSeqAryOfPrime(long oldTailPrime, EryOfPrimeAry eryOfPrimeAry) {

		long[] aryOfPrime;

		int indexPlus1 = 0;

		for (int lenOfEry = eryOfPrimeAry.len(); indexPlus1 != lenOfEry; indexPlus1++) {

			aryOfPrime = eryOfPrimeAry.at(indexPlus1);

			if (Miner.isAnyPrimeWithin(oldTailPrime + 1, aryOfPrime[0] - 1)) {

				return indexPlus1;

			}

			oldTailPrime = aryOfPrime[aryOfPrime.length - 1];

		}

		O.l("getIndexAftTailSeqAryOfPrime=" + indexPlus1 + O.S32 + CLASS_THIS);

		return indexPlus1;

	}

	/**
	 * 質數隊伍的建構方法.<br/>
	 * The constructor.
	 */
	public EryOfPrimeAry() {// fuck

		super(new long[DEF_LEN32][0]);// fuck
		// super(DEF_LEN);
		// super((long[][]) Array.newInstance(O.ARY0.getClass(), DEF_LEN));
		iLen = 0;// fuck

	}

	/**
	 * 質數隊伍的建構方法.<br/>
	 * The constructor.
	 */
	public EryOfPrimeAry(long[][] aryOfAry64) {

		super(aryOfAry64);

	}

	/**
	 * 取前端子集合.<br/>
	 * To get the head subset from 0 to toIndex (exclusive).
	 */
	public EryOfPrimeAry headEryOfPrimeAry(int toIndex) {

		long[][] retAryOfAry = new long[iLen][];

		for (int i = 0; i != toIndex; i++) {

			retAryOfAry[i] = aryOfElem[i];

		}

		return new EryOfPrimeAry(retAryOfAry);

	}

	/**
	 * To merge in 1 array if got the sequential array of prime in EryOfPrimeAry.<br/>
	 * To merge in 1 array if got the sequential array of prime in EryOfPrimeAry.
	 */
	public static long[] mergeIn1AryOfPrimeIfGetSeqAryOfPrime(EryOfPrimeAry sortedEryOfPrimeAry) {

		int indexPlus1 = getIndexAftTailSeqAryOfPrime(Miner.tailPrimeInOriAryOfPrime(), sortedEryOfPrimeAry);
		if (indexPlus1 == 0) {

			throw new IllegalArgumentException("getIndexAftTailSeqAryOfPrime=" + indexPlus1);

		}

		return mergeIn1AryOfPrimeByToCopy(Miner.getOriAryOfPrime(), sortedEryOfPrimeAry.headEryOfPrimeAry(indexPlus1));

	}

	/**
	 * To set after to merge.<br/>
	 * To set after to merge.
	 */
	public static void setOriAryOfPrimeInMinerAftToMerge(EryOfPrimeAry[] aryOfEryOfPrimeAry) {

		EryOfPrimeAry bigEry = EryOfPrimeAry.mergeAllEryOfPrimeAry(aryOfEryOfPrimeAry);

		bigEry.sort();

		long[] retAry = EryOfPrimeAry.mergeIn1AryOfPrimeIfGetSeqAryOfPrime(bigEry);

		S str = new S().a("headP=" + retAry[0] + ", tailP=" + retAry[retAry.length - 1] + O.S32 + CLASS_THIS);
		
		O.l(str.str);

		Miner.setOriAryOfPrime(retAry, CLASS_THIS);

	}

}
