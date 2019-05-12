package lGpl20.pick;

import java.util.Arrays;

import lGpl20.o.O;

/**
 * @version 2019/03/21_22:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Shuffler_A" >Shuffler_A.java</a>
 *
 * @see Shuffler_D
 */
public abstract class Shuffler_A {

	private static final Class<Shuffler_A> CLASS_THIS = Shuffler_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static final int RANGE32 = 0b1_0000_0000_0000_0000;// 2 ^16

	public static final int NUM32_TO_SHIFT = 7;

	public static final int MASK32 = (0b1 << NUM32_TO_SHIFT) - 1;// (0b1<<6)-1

	/**
	 * To shuffle.<br/>
	 * To shuffle.
	 * 
	 * @see Pickva#pickNRandomlyFrom(long[], int)
	 */
	public static long[] shuffle(long[] ary) {// sAry.length (0b1 << NUM32_TO_SHIFT) - 1

		// 如果 array 大 pick 少, 用 pickNRandomlyFrom 比較好
		// 如果 array 小 pick 多, 用 shuffle 比較好
		int[] tempAry32 = new int[ary.length];
		long[] retAry = new long[ary.length];

		int i = 0;
		for (; i != ary.length; i++) {

			// int temp32 = O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT;

			// O.l(temp32 + "+" + (i));

			tempAry32[i] = (O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT) | i;

		}

		Arrays.sort(tempAry32);

		// int index32;
		for (i = 0; i != ary.length; i++) {

			// index32 = (tempAry32[i] & MASK32);
			// O.l(index32 + O.S32 + CLASS_THIS);

			retAry[i] = ary[(tempAry32[i] & MASK32)];

		}

		return retAry;

	}

	/**
	 * To shuffle.<br/>
	 * To shuffle.
	 * 
	 * @see Pickva#pickNRandomlyFrom(int[], int)
	 */
	public static int[] shuffle(int[] ary32) {// sAry.length (0b1 << NUM32_TO_SHIFT) - 1

		// 如果 array 大 pick 少, 用 pickNRandomlyFrom 比較好
		// 如果 array 小 pick 多, 用 shuffle 比較好
		int[] tempAry32 = new int[ary32.length];
		int[] retAry32 = new int[ary32.length];

		int i = 0;
		for (; i != ary32.length; i++) {

			// int temp32 = O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT;

			// O.l(temp32 + "+" + (i));

			tempAry32[i] = (O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT) | i;

		}

		Arrays.sort(tempAry32);

		// int index32;
		for (i = 0; i != ary32.length; i++) {

			// index32 = (tempAry32[i] & MASK32);
			// O.l(index32 + O.S32 + CLASS_THIS);

			retAry32[i] = ary32[(tempAry32[i] & MASK32)];

		}

		return retAry32;

	}

	/**
	 * To shuffle.<br/>
	 * To shuffle.
	 * 
	 * @see Pickva#pickNRandomlyFrom(String[], int)
	 */
	public static String[] shuffle(String[] sAry) {// sAry.length (0b1 << NUM32_TO_SHIFT) - 1

		// 如果 array 大 pick 少, 用 pickNRandomlyFrom 比較好
		// 如果 array 小 pick 多, 用 shuffle 比較好
		int[] tempAry32 = new int[sAry.length];
		String[] retSAry = new String[sAry.length];

		int i = 0;
		for (; i != sAry.length; i++) {

			// int temp32 = O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT;

			// O.l(temp32 + "+" + (i));

			tempAry32[i] = (O.THR_LOCAL_RANDOM.nextInt(RANGE32) << NUM32_TO_SHIFT) | i;

		}

		Arrays.sort(tempAry32);

		// int index32;
		for (i = 0; i != sAry.length; i++) {

			// index32 = (tempAry32[i] & MASK32);
			// O.l(index32 + O.S32 + CLASS_THIS);

			retSAry[i] = sAry[(tempAry32[i] & MASK32)];

		}

		return retSAry;

	}

}
