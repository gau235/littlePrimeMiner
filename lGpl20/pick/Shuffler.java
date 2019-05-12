package lGpl20.pick;

import java.util.Arrays;

import lGpl20.o.O;

/**
 * @version 2019/02/27_12:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=shuffleNPickr" >shuffleNPickr.java</a>
 *
 * @see Pickva
 */
public abstract class Shuffler extends Shuffler_D {

	private static final Class<Shuffler> CLASS_THIS = Shuffler.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To shuffle then to pick.<br/>
	 * To shuffle then to pick.
	 * 
	 * @see Pickva#pickNRandomlyFrom(String[], int)
	 */
	public static String[] shuffleNPick(String[] sAry, int k) {// sAry.length (0b1 << NUM32_TO_SHIFT) - 1

		// 如果 array 大 pick 少, 用 pickNRandomlyFrom 比較好
		// 如果 array 小 pick 多, 用 shuffleNPick 比較好
		int[] tempAry32 = new int[sAry.length];
		String[] retSAry = new String[k];

		int i = 0;
		for (; i != tempAry32.length; i++) {

			// int temp32 = O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT;

			// O.l(temp32 + "+" + (i));

			tempAry32[i] = (O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT) | i;

		}

		Arrays.sort(tempAry32);

		// int index32;
		for (i = 0; i != k; i++) {

			// index32 = (tempAry32[i] & MASK32);
			// O.l(index32 + O.S32 + CLASS_THIS);

			retSAry[i] = sAry[(tempAry32[i] & MASK32)];

		}

		return retSAry;

	}

	/**
	 * To shuffle then to pick.<br/>
	 * To shuffle then to pick.
	 * 
	 * @see Pickva#pickNRandomlyFrom(long[], int)
	 */
	public static long[] shuffleNPick(long[] ary, int k) {// sAry.length (0b1 << NUM32_TO_SHIFT) - 1

		// 如果 array 大 pick 少, 用 pickNRandomlyFrom 比較好
		// 如果 array 小 pick 多, 用 shuffleNPick 比較好
		int[] tempAry32 = new int[ary.length];
		long[] retAry = new long[k];

		int i = 0;
		for (; i != tempAry32.length; i++) {

			// int temp32 = O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT;

			// O.l(temp32 + "+" + (i));

			tempAry32[i] = (O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT) | i;

		}

		Arrays.sort(tempAry32);

		// int index32;
		for (i = 0; i != k; i++) {

			// index32 = (tempAry32[i] & MASK32);
			// O.l(index32 + O.S32 + CLASS_THIS);

			retAry[i] = ary[(tempAry32[i] & MASK32)];

		}

		return retAry;

	}

	/**
	 * To shuffle then to pick.<br/>
	 * To shuffle then to pick.
	 * 
	 * @see Pickva#pickNRandomlyFrom(int[], int)
	 */
	public static int[] shuffleNPick(int[] ary32, int k) {// sAry.length (0b1 << NUM32_TO_SHIFT) - 1

		// 如果 array 大 pick 少, 用 pickNRandomlyFrom 比較好
		// 如果 array 小 pick 多, 用 shuffleNPick 比較好
		int[] tempAry32 = new int[ary32.length];
		int[] retAry32 = new int[k];

		int i = 0;
		for (; i != tempAry32.length; i++) {

			// int temp32 = O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT;

			// O.l(temp32 + "+" + (i));

			tempAry32[i] = (O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT) | i;

		}

		Arrays.sort(tempAry32);

		// int index32;
		for (i = 0; i != k; i++) {

			// index32 = (tempAry32[i] & MASK32);
			// O.l(index32 + O.S32 + CLASS_THIS);

			retAry32[i] = ary32[(tempAry32[i] & MASK32)];

		}

		return retAry32;

	}

}
