package lGpl20.comb.wDup;

import java.io.Serializable;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.keyNVal.MapOfSNInt32WCompa;
import lGpl20.o.keyNVal.SNInt32WCompa;

/**
 * @version 2019/04/11_15:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DatToShW_A" >DatToShW_A.java</a>
 *
 * @see DatToShW
 */
public abstract class DatToShW_A implements Serializable {

	private static final Class<DatToShW_A> CLASS_THIS = DatToShW_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Default divisor.<br/>
	 * Default divisor.
	 */
	public static final int DEF_DIVISOR_INT32 = 6;

	/**
	 * Default divisor.<br/>
	 * Default divisor.
	 */
	public static final int $6 = DEF_DIVISOR_INT32;

	public String sWDup;

	public int k;

	public String[] distinctSortedByValSAry;

	public String[] catagSAry;

	public long sortedDescB64IntoB6OfQtyPlus1;

	public String regToIn = O.Z;

	public String regToEx = O.S64;

	public Matcher matcherIn;// Pattern.compile(regToIn).matcher(O.Z).reset(tempStr);

	public Matcher matcherEx;

	public int total32 = 0;

	public StringBuilder retStr;

	public CharSequence prefix;

	public CharSequence lineWr;// = O.L;

	/**
	 * To gen B64IntoB6 of QR.<br/>
	 * To gen B64IntoB6 of QR.
	 */
	public void regu() {

		String[] oriSAryToBecomeCatagSAry = this.sWDup.split(O.S44);

		Arrays.sort(oriSAryToBecomeCatagSAry);// important

		MapOfSNInt32WCompa mapOfSNInt32 = new MapOfSNInt32WCompa(oriSAryToBecomeCatagSAry);

		mapOfSNInt32.sortByVal();// important

		O.l("mapOfSNInt32" + O.S64 + CLASS_THIS + "=");
		O.l(mapOfSNInt32.toStr());

		///////////////////////////////////////////////////////////////////////////

		this.distinctSortedByValSAry = new String[mapOfSNInt32.iSize];

		Ery<String> eryOfS = new Ery<String>();

		SNInt32WCompa[] aryOfSNInt32 = mapOfSNInt32.aryOfSNInt32WCompa;

		SNInt32WCompa sNInt32;

		for (int i = 0; i != mapOfSNInt32.iSize; i++) {

			sNInt32 = aryOfSNInt32[i];

			this.distinctSortedByValSAry[i] = sNInt32.s;

			// O.l("sNInt32.s=" + sNInt32.s + O.S64 + CLASS_THIS + "=");
			// O.l("sNInt32.count32=" + sNInt32.count32 + O.S64 + CLASS_THIS + "=");

			for (int iEryOfS = 0; iEryOfS != sNInt32.count32; iEryOfS++) {

				// O.l("add " + sNInt32.s);
				eryOfS.a(sNInt32.s);

			}

			this.sortedDescB64IntoB6OfQtyPlus1 = (this.sortedDescB64IntoB6OfQtyPlus1 << B64IntoB6.$6)
					| (long) (sNInt32.count32 + 1);

		}

		O.l("distinctSortedByValSAry" + O.S64 + CLASS_THIS + "=");
		O.l(distinctSortedByValSAry);

		this.catagSAry = eryOfS.toGenericAry(O.S_ARY0);
		// this.catagSAry = eryOfS.trim().aryOfElem();

		O.l("catagSAry" + O.S64 + CLASS_THIS + "=");
		O.l(catagSAry);

		StringBuilder str24 = B64IntoB6.str24(this.sortedDescB64IntoB6OfQtyPlus1);
		O.l("sortedDescB64IntoB6OfQtyPlus1=" + str24 + O.S32 + CLASS_THIS);

		matcherIn = Pattern.compile(this.regToIn).matcher(O.Z);
		matcherEx = Pattern.compile(this.regToEx).matcher(O.Z);

		this.retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

	}

}
