package lGpl20.other.sample;

import lGpl20.b32.eqDiv.Fr64;
import lGpl20.comb.Cva;
import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * 算出梭哈每一種結果.<br/>
 * <br/>
 * To count the number of ways of Show Hand Poker.
 * 
 * @version 2018/07/14_12:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C243_ShowHandPoker" >C243_ShowHandPoker.
 *          java</a>
 * 
 */
public class C243_ShowHandPoker {

	public static final long N_C52COMMA5 = Cva.int64(52, 5);

	public static final long N_ONE_PAIR = Cva.int64(13, 1) * Cva.int64(4, 2) * Cva.int64(12, 3) * O.pow(4, 3);

	public static final long N_TWO_PAIR = Cva.int64(13, 1) * Cva.int64(4, 2) * Cva.int64(12, 1) * Cva.int64(4, 2)
			* Cva.int64(11, 1) * Cva.int64(4, 1) / 2L;

	public static final long N_THREE_OF_A_KIND = Cva.int64(13, 1) * Cva.int64(4, 3) * Cva.int64(12, 2) * O.pow(4, 2);

	public static final long N_STRAIGHT = 10L * O.pow(4, 5) - 36L - 4L;;

	public static final long N_FLUSH = Cva.int64(13, 5) * 4L - 36L - 4L;

	public static final long N_FULL_HOUSE = Cva.int64(13, 1) * Cva.int64(4, 3) * Cva.int64(12, 1) * Cva.int64(4, 2);;

	public static final long N_FOUR_OF_A_KIND = Cva.int64(13, 1) * Cva.int64(4, 4) * Cva.int64(48, 1);

	public static final long N_STRAIGHT_FLUSH = 10L * 4L - 4L;

	public static final long N_ROYAL_FLUSH = 4L;

	public static final long N_HIGH_CARD = Cva.int64(13, 5) * O.pow(4, 5) - N_STRAIGHT - N_FLUSH - N_STRAIGHT_FLUSH
			- N_ROYAL_FLUSH;

	public static final int DEF_SCALE = 4;

	public static void main(String[] sAry) throws Throwable {

		passTest();

		O.l("One pair:");
		O.l(SByN.f(N_ONE_PAIR) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_ONE_PAIR, N_C52COMMA5).bigDecimal(DEF_SCALE).toPlainString() + O.L);

		O.l("Two pair:");
		O.l(SByN.f(N_TWO_PAIR) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_TWO_PAIR, N_C52COMMA5).bigDecimal(DEF_SCALE).toPlainString() + O.L);

		O.l("Three of a kind:");
		O.l(SByN.f(N_THREE_OF_A_KIND) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_THREE_OF_A_KIND, N_C52COMMA5).bigDecimal(DEF_SCALE).toPlainString() + O.L);

		O.l("Straight:");// need to minus the number of Straight Flush
		O.l(SByN.f(N_STRAIGHT) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_STRAIGHT, N_C52COMMA5).bigDecimal(DEF_SCALE).toPlainString() + O.L);

		O.l("Flush:");
		O.l(SByN.f(N_FLUSH) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_FLUSH, N_C52COMMA5).bigDecimal(DEF_SCALE).toPlainString() + O.L);

		O.l("Full house:");
		O.l(SByN.f(N_FULL_HOUSE) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_FULL_HOUSE, N_C52COMMA5).bigDecimal(DEF_SCALE).toPlainString() + O.L);

		O.l("Four of a kind:");
		O.l(SByN.f(N_FOUR_OF_A_KIND) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_FOUR_OF_A_KIND, N_C52COMMA5).bigDecimal(DEF_SCALE).toPlainString() + O.L);

		O.l("Straight Flush:");
		O.l(SByN.f(N_STRAIGHT_FLUSH) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_STRAIGHT_FLUSH, N_C52COMMA5).bigDecimal(DEF_SCALE + 2).toPlainString() + O.L);

		O.l("Royal Flush:");// 10,J,Q,K,A;
		O.l(SByN.f(N_ROYAL_FLUSH) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_ROYAL_FLUSH, N_C52COMMA5).bigDecimal(DEF_SCALE + 2).toPlainString() + O.L);

		O.l("High card:");// others;
		O.l(SByN.f(N_HIGH_CARD) + " / " + SByN.f(N_C52COMMA5) + " = ");
		O.l(new Fr64(N_HIGH_CARD, N_C52COMMA5).bigDecimal(DEF_SCALE).toPlainString() + O.L);

	}

	public static void passTest() {

		// to verify the calculation of Three of a kind
		long s1 = 13L * 48L;// AAA (A) 5
		long s2 = 13L * 4L * 48L * 47L / 2L; // AAA 3 5
		long s3 = 13L * 4L * 12L * 6L;// Full house
		long s4 = 13L * 48L;// Four of a kind

		long nThreeOfAKind = s1 + s2 - s3 - s4;

		if (nThreeOfAKind != N_THREE_OF_A_KIND) {

			O.x();

		}

	}

}