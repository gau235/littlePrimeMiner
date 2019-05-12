package lGpl20.comb.thr;

import java.util.Arrays;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.thr.ThrWBox;

/**
 * many thr, 從 1 全相異數列中取出 n 個數.<br/>
 * many thr, to pick several numbers from a list of distinct numbers.
 * 
 * @version 2016/12/13_15:07:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToCByAry32" >ThrToCByAry32.java</a>
 * 
 */
public class ThrToCByAry32 extends ThrWBox<Ery<int[]>> {

	private static final Class<ThrToCByAry32> CLASS_THIS = ThrToCByAry32.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected final int[] BASE;

	protected final int[] PREFIX;

	protected final int START_AT_BASE;

	/**
	 * 從 1 全相異數列中取出 n 個數.<br/>
	 * To pick several numbers from a list of distinct numbers.
	 */
	public void cByAry32(final int[] base, final int[] prefix, int atBase, int atPrefix, Ery<int[]> retEry) {

		// O.l("k=" + k + O.S32 + CLASS_THIS);
		final int atPrefixPlus1 = atPrefix + 1;
		if (atBase == START_AT_BASE) {

			if (atPrefixPlus1 == prefix.length) {

				prefix[0] = base[atBase];
				O.l("above add prefix " + Arrays.toString(prefix) + currentThread().getName());
				retEry.a(prefix.clone());

				return;

			}

			prefix[0] = base[atBase];
			O.l("above prefix " + Arrays.toString(prefix) + currentThread().getName());
			cByAry32(base, prefix, atBase + 1, 1, retEry);

		} else {

			if (atPrefixPlus1 == prefix.length) {

				for (int i = atBase; i < base.length; i++) {
					// for (int to = base.length - 1, i = to; i >= atBase; i--) {

					prefix[atPrefix] = base[i];
					O.l("below add prefix " + Arrays.toString(prefix) + currentThread().getName());

					retEry.a(prefix.clone());

				}

				return;

			}

			final int baseLenMinusPrefixLenPlusAtPrefixPlus1 = base.length - (prefix.length - atPrefixPlus1);
			// k - atK + atBase <= n

			for (int i = atBase; i < baseLenMinusPrefixLenPlusAtPrefixPlus1;) {

				O.l("below atBase=" + atBase + O.S32 + CLASS_THIS);
				prefix[atPrefix] = base[i];
				O.l("below prefix " + Arrays.toString(prefix) + currentThread().getName());
				cByAry32(base, prefix, ++i, atPrefixPlus1, retEry);

			}

		}

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public ThrToCByAry32(final int[] base, final int[] prefix, int startAtBase, Ery<int[]> retEry) {

		BASE = base;
		PREFIX = prefix;
		START_AT_BASE = startAtBase;

		// O.l("START_AT_BASE=" + START_AT_BASE + O.S32 + CLASS_THIS);

		box = retEry;

	}

	@Override
	public void run() {

		cByAry32(BASE, PREFIX, START_AT_BASE, 0, box);

	}

}
