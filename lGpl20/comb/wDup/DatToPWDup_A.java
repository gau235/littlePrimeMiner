package lGpl20.comb.wDup;

import java.io.Serializable;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.keyNVal.MapOfB64NInt32WCompa;
import lGpl20.o.keyNVal.MapOfSNInt32WCompa;
import lGpl20.o.keyNVal.SNInt32WCompa;

/**
 * @version 2019/04/01_07:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DatToShW_A" >DatToPWDup_A.java</a>
 *
 * @see DatToPWDup_L
 */
public abstract class DatToPWDup_A implements Serializable {

	private static final Class<DatToPWDup_A> CLASS_THIS = DatToPWDup_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public String sWDup;

	public int k;

	public String[] distinctSortedSAry;

	public String[] catagSAry;

	public long b64As2PowOfQRPlus1;

	public String regToIn = O.Z;

	public String regToEx = O.S64;

	public Matcher matcherIn;// Pattern.compile(regToIn).matcher(O.Z).reset(tempStr);

	public Matcher matcherEx;

	public int total32 = 0;

	// public MapOfStrNInt32WCompa retMapOfStrNInt32WCompa;

	public MapOfB64NInt32WCompa retDistinctSetFromMap;// distinct set

	public CharSequence prefix;

	public CharSequence lineWr;// = O.L;

	/**
	 * To gen B64IntoB6 of QRPlus1.<br/>
	 * To gen B64IntoB6 of QRPlus1.
	 */
	public static long genB64As2PowOfQRPlus1(String[] catagSAry) {

		String currHeadS = catagSAry[0];

		long b64As2PowOfQRPlus1 = 0b0L;

		int q = 0;
		int r = 0;

		String tempS;
		for (int i = 0; i != catagSAry.length;) {

			tempS = catagSAry[i];

			if (currHeadS.equals(tempS)) {

				// Q+R=0; bit64 = 1
				b64As2PowOfQRPlus1 = b64As2PowOfQRPlus1 | (0b1L << (q + r));
				// b64As2PowOfQRPlus1 = b64As2PowOfQRPlus1 | B64IntoB6.toB64As2PowByEveryB6CellMinus1(qAgainstDiv32 +
				// rAgainstDiv32);

				// O.l("tempQRPlus1=" + (qAgainstDiv32 + rAgainstDiv32) + ",b64As2PowOfQRPlus1=" + b64As2PowOfQRPlus1 + O.S32
				// + CLASS_THIS);

				if ((r++) == DatToShW.$6) {

					throw new IndexOutOfBoundsException("tempS=" + tempS);

				}

				i++;

			} else {

				currHeadS = tempS;

				q = q + DatToShW.$6;
				r = 0;

			}

		}

		// O.l("str24=" + O.L + B64IntoB6.str24(b64As2PowOfQRPlus1) + O.S32 + CLASS_THIS);

		return b64As2PowOfQRPlus1;

	}

	/**
	 * To gen B64IntoB6 of QR.<br/>
	 * To gen B64IntoB6 of QR.
	 */
	public void regu() {

		String[] oriSAryToBecomeCatagSAry = this.sWDup.split(O.S44);

		Arrays.sort(oriSAryToBecomeCatagSAry);// important

		MapOfSNInt32WCompa mapOfSNInt32 = new MapOfSNInt32WCompa(oriSAryToBecomeCatagSAry);

		O.l("mapOfSNInt32" + O.S64 + CLASS_THIS + "=");
		O.l(mapOfSNInt32.toStr());

		///////////////////////////////////////////////////////////////////////////

		this.distinctSortedSAry = new String[mapOfSNInt32.iSize];

		Ery<String> eryOfS = new Ery<String>();

		SNInt32WCompa[] aryOfSNInt32 = mapOfSNInt32.aryOfSNInt32WCompa;

		SNInt32WCompa sNInt32;

		for (int i = 0; i != mapOfSNInt32.iSize; i++) {

			sNInt32 = aryOfSNInt32[i];

			this.distinctSortedSAry[i] = sNInt32.s;

			// O.l("sNInt32.s=" + sNInt32.s + O.S64 + CLASS_THIS + "=");
			// O.l("sNInt32.count32=" + sNInt32.count32 + O.S64 + CLASS_THIS + "=");

			for (int iEryOfS = 0; iEryOfS != sNInt32.count32; iEryOfS++) {

				// O.l("add " + sNInt32.s);
				eryOfS.a(sNInt32.s);

			}

		}

		O.l("sortedSAry" + O.S64 + CLASS_THIS + "=");
		O.l(distinctSortedSAry);

		this.catagSAry = eryOfS.toGenericAry(O.S_ARY0);
		// this.catagSAry = eryOfS.trim().aryOfElem();

		O.l("catagSAry" + O.S64 + CLASS_THIS + "=");
		O.l(catagSAry);

		///////////////////////////////////////////////////////////////////////
		this.b64As2PowOfQRPlus1 = genB64As2PowOfQRPlus1(this.catagSAry);

		matcherIn = Pattern.compile(this.regToIn).matcher(O.Z);
		matcherEx = Pattern.compile(this.regToEx).matcher(O.Z);

		// this.retMapOfStrNInt32WCompa = new MapOfStrNInt32WCompa();
		this.retDistinctSetFromMap = new MapOfB64NInt32WCompa();

	}

}
