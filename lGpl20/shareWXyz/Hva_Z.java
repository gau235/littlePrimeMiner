package lGpl20.shareWXyz;

import lGpl20.o.O;

/**
 * @version 2018/11/27_20:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Hva_Z" >Hva_Z.java</a>
 *
 * @see Hva
 */
public abstract class Hva_Z extends Hva_R {

	private static final Class<Hva_Z> CLASS_THIS = Hva_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	// 缺點: min, max 沒作用
	// /**
	// * 即 n 個相同物品分成給 k 人, 每人最少 0 個.<br/>
	// * To return the number of ways to share several identical items with every person. int k as termination condition.
	// */
	// public static Seq reGoWB64IntoB6OfQtyPlus1(final int max32, int numOfCell, long prefixB64IntoB6, final Seq retSeq) {
	//
	// int tailCell = (((int) prefixB64IntoB6) & B64IntoB6.$6_1_OF_32BIT);
	// long tempPrefixB64IntoB6;
	//
	// if (--numOfCell == 0) {
	//
	// do {
	//
	// tempPrefixB64IntoB6 = ((prefixB64IntoB6 << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) (tailCell++));
	// retSeq.add(tempPrefixB64IntoB6);
	//
	// } while (tailCell <= max32);
	//
	// return retSeq;
	//
	// }
	//
	// do {
	//
	// tempPrefixB64IntoB6 = ((prefixB64IntoB6 << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) (tailCell++));
	//
	// reGoWB64IntoB6OfQtyPlus1(max32, numOfCell, tempPrefixB64IntoB6, retSeq);
	//
	// } while (tailCell <= max32);
	//
	// return retSeq;
	//
	// }

	// /**
	// * 即 n 個相同物品分成給 k 人, 每人最少 0 個.<br/>
	// * To return the number of ways to share several identical items with every person. int k as termination condition.
	// */
	// public static long[] goWB64IntoB6OfQtyPlus1(int max32, int numOfCell) {// need to consider min, max
	//
	// // H(3,5) with min==0 equals to H(3,8) with min==1
	// // H(3,8) with min==1 equals to ShW(8,3) with min==1
	//
	// final Seq retSeq = new Seq();
	//
	// // DiIGo.checkArg
	// DiIAns.checkArg(numOfCell + max32, max32, 1, numOfCell + max32);
	//
	// final int numOfCellMinus1 = numOfCell - 1;
	// for (int temp32 = 1; temp32 <= max32; temp32++) {
	//
	// reGoWB64IntoB6OfQtyPlus1(max32, numOfCellMinus1, (long) temp32, retSeq);
	//
	// }
	//
	// return retSeq.trim().ary(false);
	//
	// }

}
