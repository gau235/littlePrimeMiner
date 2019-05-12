package lGpl20.o.ery;

import java.util.Arrays;

import lGpl20.o.O;

/**
 * @version 2018/05/21_11:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ery_P" >Ery_P.java</a>
 * 
 * @see Ery_R
 */
public abstract class Ery_P<Elem> extends Ery_J<Elem> {

	@SuppressWarnings("rawtypes")
	private static final Class<Ery_P> CLASS_THIS = Ery_P.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery_P(Elem... aryOfElem) {

		super(aryOfElem);

	}

	/**
	 * 縮減空間.<br/>
	 * To trim the inside array length to the number of elements.
	 */
	public Ery_P<Elem> trim() {

		synchronized (KEY_TO_SYN) {

			if (iLen < aryOfElem.length) {

				aryOfElem = Arrays.copyOf(aryOfElem, iLen);

				// todo:
				// T[] copy = ((Object)newType == (Object)Object[].class)
				// ? (T[]) new Object[newLength]
				// : (T[]) Array.newInstance(newType.getComponentType(), newLength);
				// System.arraycopy(original, 0, copy, 0,
				// Math.min(original.length, newLength));

			}

			return this;

		}

	}

	/**
	 * To get aryOfElem.<br/>
	 * To get aryOfElem.
	 */
	public Elem[] aryOfElem() {

		// O.l(aryOfElem.getClass() + O.S32 + CLASS_THIS);

		return aryOfElem;

	}

}
