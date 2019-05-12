package lGpl20.prime64.ery;

import lGpl20.comb.filter.CompaForAry;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.S;
import lGpl20.other.jsp.Jsp;
import lGpl20.other.uI.MyAide;

/**
 * 本類別質數隊伍.<br/>
 * <br/>
 * The Ery&lt;long[]&gt;<br/>
 * Not thread safe.
 * 
 * @version 2019/04/30_21:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=EryOfPrimeAry_A" >EryOfPrimeAry_A.java
 *          </a>
 * 
 * @see EryOfPrimeAry
 */
public abstract class EryOfPrimeAry_A extends Ery<long[]> {

	private static final Class<EryOfPrimeAry_A> CLASS_THIS = EryOfPrimeAry_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 內建的比較器.<br/>
	 * The Comparator inside.
	 */
	protected static final CompaForAry COMPA_FOR_ARY = new CompaForAry();

	/**
	 * 顯示用 index.<br/>
	 * The index for to show.
	 */
	public int indexViewed = -1;

	/**
	 * 質數隊伍的建構方法.<br/>
	 * The constructor.
	 */
	public EryOfPrimeAry_A(long[][] aryOfAry64) {// important

		super(aryOfAry64);
		setComparator(COMPA_FOR_ARY);

	}

	/**
	 * 檢查後加入.<br/>
	 * To append after checked.
	 */
	@Override
	public void a(long[] aryOfPrime) {

		if (aryOfPrime.length == 0) {// fuck

			return;

		}

		// todo: test prime mod6 +1 or mod6 +5

		super.a(aryOfPrime);

	}

	/**
	 * 取得本伍內最前面的 64 位元整數與 64 位元整數陣列內第 0 位置 64 位元整數.<br/>
	 * To return the 0-th (head) number of this.
	 * 
	 * @see #tailPrime()
	 */
	public long headPrime() {

		try {

			long[] ary = aryOfElem[0];

			return ary[0];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver:" + O.L + "iLen=" + iLen + ", " + "aryOfElem.len=" + aryOfElem.length + O.S32 + CLASS_THIS);

			return 0L; // fuck

		}

	}

	/**
	 * 取得本伍內第末個 64 位元整數與 64 位元整數陣列內第末個數.<br/>
	 * To return the last number (tail) of this.
	 * 
	 * @return 0 if the size is this is 0; empty.
	 *
	 * @see #headPrime()
	 */
	public long tailPrime() {

		try {

			long[] ary = aryOfElem[iLen - 1];

			return ary[ary.length - 1];

		}

		// catch (NullPointerException nullPointerException) {
		//
		// O.l("iLen=" + iLen + O.S32 + CLASS_THIS);
		// O.l("aryOfElem=" + Arrays.toString(aryOfElem) + O.S32 + CLASS_THIS);
		//
		// nullPointerException.printStackTrace();
		//
		// throw new NullPointerException();
		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsEx) {

			// arrayIndexOutOfBoundsException.printStackTrace();
			O.l("aryIndexOver:" + O.L + "iLen=" + iLen + ", " + "aryOfElem.len=" + aryOfElem.length + O.S32 + CLASS_THIS);

			if (O.IS_TO_DEV) {

				S errS = new S();
				errS.lineWr = Jsp.L;

				MyAide.sendHttpErr(errS.l(O.toStrByThrowable(arrayIndexOutOfBoundsEx)).str, O.Z);

				// O.x();

			}

			return 0L; // fuck

		}

	}

	/**
	 * 取得本 64 位元整數與 64 位元整數陣列伍內所有數字個數.<br/>
	 * To return the total primes inside.
	 */
	public long totalPrime() {

		// synchronized (KEY_TO_SYN) {
		long totalPrime = 0L;

		for (int i = 0; i != iLen; i++) {// when the EryOfPrimeAry is expanding will be normal

			totalPrime = totalPrime + (long) aryOfElem[i].length;

		}

		return totalPrime;

	}

	/**
	 * 取得本 64 位元整數與 64 位元整數陣列伍內所有數字個數.<br/>
	 * To return the total primes inside.
	 */
	public static long totalPrime(EryOfPrimeAry... aryOfEryOfPrimeAry) {

		EryOfPrimeAry tempEryOfPrimeAry;
		long retTotalPrime = 0L;

		int bigI = 0;
		int iSmall = 0;
		for (; bigI != aryOfEryOfPrimeAry.length; bigI++) {

			tempEryOfPrimeAry = aryOfEryOfPrimeAry[bigI];

			// when the EryOfPrimeAry is expanding, it will be no exception
			for (iSmall = 0; iSmall != tempEryOfPrimeAry.iLen; iSmall++) {

				retTotalPrime = retTotalPrime + (long) tempEryOfPrimeAry.aryOfElem[iSmall].length;

			}

		}

		return retTotalPrime;

	}

	/**
	 * 取得本 64 位元整數與 64 位元整數陣列伍內所有數字個數.<br/>
	 * To return the total number of numbers from from to to (exclusive).
	 */
	public long totalPrime(int from, int to) {

		// synchronized (KEY_TO_SYN) {
		long retTotalPrime = 0L;

		for (int i = from; i < to; i++) {

			retTotalPrime = retTotalPrime + (long) aryOfElem[i].length;

		}

		return retTotalPrime;

	}

	/**
	 * 把本 64 位元整數與 64 位元整數陣列伍所有 64 位元整數陣列內的數融合成 1 個陣列.<br/>
	 * To merge all numbers in long[] into one array.<br/>
	 * Note: from &lt;= index &lt; to
	 */
	public long[] mergeIn1Ary(int from, int to) {// must close

		// synchronized (KEY_TO_SYN) {

		long[] retAry = new long[(int) totalPrime(from, to)];
		long[] tempAry;

		for (int i = from, iRetAry = 0; i < to; i++) {

			tempAry = aryOfElem[i];
			System.arraycopy(tempAry, 0, retAry, iRetAry, tempAry.length);
			iRetAry = iRetAry + tempAry.length;

		}

		return retAry;

	}

	/**
	 * 把本 64 位元整數與 64 位元整數陣列伍所有 64 位元整數陣列內的數融合成 1 個陣列.<br/>
	 * To merge all numbers in long[] into one array.<br/>
	 */
	public long[] mergeIn1Ary() {

		return mergeIn1Ary(0, iLen);

	}

}
