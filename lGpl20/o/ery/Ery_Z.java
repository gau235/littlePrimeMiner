package lGpl20.o.ery;

import lGpl20.o.O;
import lGpl20.o.str.S;
import lGpl20.o.time.T64;
import lGpl20.other.jsp.Jsp;
import lGpl20.other.uI.MyAide;

/**
 * @version 2017/05/09_22:07:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ery_Z" >Ery_Z.java</a>
 * 
 * @see Ery
 */
public abstract class Ery_Z<Elem> extends Ery_X<Elem> {

	@SuppressWarnings("rawtypes")
	private static final Class<Ery_Z> CLASS_THIS = Ery_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery_Z(Elem... aryOfElem) {

		super(aryOfElem);

	}

	/**
	 * 取得第 index 個項.<br/>
	 * To get the element of this by index.<br/>
	 * Not thread safe.<br/>
	 */
	public Elem at(int index) {

		try {

			return aryOfElem[index];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver" + O.S58 + O.S32 + "index=" + index + O.S32 + "aryOfElem.len=" + aryOfElem.length + O.S32
					+ CLASS_THIS);

			return null;

		}

	}

	/**
	 * 取得第 index 個項.<br/>
	 * To get the element of this by index.<br/>
	 * Not thread safe.<br/>
	 */
	public Elem at(int index, Class<?> calledByWhichClass) {

		try {

			Elem elem = aryOfElem[index];

			if (O.IS_TO_DEV && elem == null) {

				S errS = new S();
				errS.lineWr = Jsp.L;

				errS.l(T64.toTimeStr() + O.S32 + CLASS_THIS);
				errS.l("fuck calledByWhichClass=" + calledByWhichClass);
				errS.l("elem=" + elem);
				errS.l("index=" + index);
				errS.l("iLen=" + iLen);
				errS.l("aryOfElem.length=" + aryOfElem.length);
				errS.l("elem=" + aryOfElem[index]);
				errS.l();

				// MyAide.saveErrCharSeqInFile(errS.str());
				MyAide.sendHttpErr(errS.str, O.Z);

			}

			return elem;

		} catch (Exception e) {

			S errS = new S();

			errS.l(T64.toTimeStr() + O.S32 + CLASS_THIS);
			errS.l("calledByWhichClass=" + calledByWhichClass);
			errS.l("index=" + index);
			errS.l("iLen=" + iLen);
			errS.l("aryOfElem.length=" + aryOfElem.length);
			errS.l(O.toStrByThrowable(e));
			errS.l();

			MyAide.sendHttpErr(errS.str, O.Z);

			return null;

		}

	}

	/**
	 * 取得第 0 個項.<br/>
	 * To return the 0-th element (head) of this.<br/>
	 * Not thread safe.<br/>
	 * 
	 * @see #tail()
	 */
	public Elem head() {

		try {

			return aryOfElem[0];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver" + O.S58 + O.S32 + "iLen=" + iLen + O.S32 + "aryOfElem.len=" + aryOfElem.length + O.S32
					+ CLASS_THIS);

			O.x();

			return null;

		}

	}

	/**
	 * 取得第末個項.<br/>
	 * To return the last element (tail) of this.<br/>
	 * Not thread safe.<br/>
	 * 
	 * @see #head()
	 */
	public Elem tail() {

		// synchronized (KEY_TO_SYN) {

		// if (iLen == 0) {
		//
		// return null;
		//
		// }

		try {

			return aryOfElem[iLen - 1];

		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

			O.l("aryIndexOver" + O.S58 + O.S32 + "iLen=" + iLen + O.S32 + "aryOfElem.len=" + aryOfElem.length + O.S32
					+ CLASS_THIS);

			O.x();

			return null;

		}

	}

}
