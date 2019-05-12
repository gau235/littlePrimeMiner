package lGpl20.comb.selfCallva;

import java.util.concurrent.ExecutorService;

import lGpl20.comb.thr.ThrToCByAry32;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * @version 2017/03/17_09:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ForwardSelfCallva_Z" >ForwardSelfCallva_Z.java
 *          </a>
 * 
 * @see ForwardSelfCallva
 */
public abstract class ForwardSelfCallva_Z extends ForwardSelfCallva_E {

	private static final Class<ForwardSelfCallva_Z> CLASS_THIS = ForwardSelfCallva_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 用多執行緒從 1 全相異數列中取出 n 個數.<br/>
	 * To pick several numbers from a list of distinct numbers with threads.
	 */
	public static Ery<int[]> cWThrByAry32(final int[] base, final int k, ExecutorService executorService) {

		final int baseLenMinusK = base.length - k;
		Ery<int[]> retEry = new Ery<int[]>();

		for (int i = 0; i <= baseLenMinusK; i++) {

			// O.l("i=" + i + O.S32 + CLASS_THIS);

			Thread thr = new ThrToCByAry32(base, new int[k], i, retEry);

			executorService.submit(thr);

		}

		return retEry;

	}

}
