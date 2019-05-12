package lGpl20.o.ery;

import java.lang.reflect.Array;
import java.util.Arrays;

import lGpl20.o.O;

/**
 * @version 2017/08/10_07:05:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ery_C" >Ery_C.java</a>
 * 
 * @see Ery_J
 */
public abstract class Ery_C<Elem> extends Ery_A<Elem> {

	@SuppressWarnings("rawtypes")
	private static final Class<Ery_C> CLASS_THIS = Ery_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	@SuppressWarnings("unchecked")
	public Ery_C(Elem... aryOfElem) {

		super(aryOfElem);

	}

	/**
	 * 回傳經反轉後的 Ery.<br/>
	 * To return Ery after reversed.
	 */
	public Ery<Elem> genRevEry(int from, int to) {

		synchronized (KEY_TO_SYN) {

			@SuppressWarnings("unchecked")
			Elem[] tempAryOfElem = (Elem[]) new Object[to - from];

			for (int i = 0, toMinusFrom = to - from, toMinus1 = to - 1; i < toMinusFrom; i++) {

				tempAryOfElem[i] = aryOfElem[toMinus1 - i];

			}

			return new Ery<Elem>(tempAryOfElem);

		}

	}

	// /**
	// * 回傳經反轉後的 Ery.<br/>
	// * To return Ery after reversed.
	// */
	// public Ery<Elem> genRevEry() {// todo: need to check
	//
	// synchronized (KEY_TO_SYN) {
	//
	// for (int i = 0, toMinusFromDiv2 = iLen >>> 1, toMinus1 = iLen - 1; i < toMinusFromDiv2; i++) {
	//
	// Elem elem = aryOfElem[i];
	// aryOfElem[i] = aryOfElem[toMinus1 - i];
	// aryOfElem[toMinus1 - i] = elem;
	//
	// }
	//
	// // O.l("aryOfElem.length=" + aryOfElem.length + O.S32 + CLASS_THIS);
	// return new Ery<Elem>(aryOfElem);// aryOfElem may contain null
	//
	// // return genRevEry(0, iLen);
	//
	// }
	//
	// }

	/**
	 * 轉 Type 陣列 (Type super Elem).<br/>
	 * To convert to a Type array (Type super Elem).
	 * 
	 * @param aryOfType
	 *            for declaring the type of array.
	 */
	@SuppressWarnings("unchecked")
	public <Type> Type[] toGenericAry(Type[] aryOfType) {// Is Type super Elem?

		synchronized (KEY_TO_SYN) {

			Class<Type[]> theClass = (Class<Type[]>) aryOfType.getClass();

			Type[] retAry = ((Object) theClass == (Object) Object[].class) ? (Type[]) new Object[iLen]
					: (Type[]) Array.newInstance(theClass.getComponentType(), iLen);

			// for (int i = 0; i != iLen; i++) {
			//
			// newAry[i] = (Type) aryOfElem[i];
			//
			// }

			// return (Type[]) Arrays.copyOf(aryOfElem, iLen, aryOfType.getClass());

			System.arraycopy(aryOfElem, 0, retAry, 0, iLen);

			return retAry;

		}

	}

	@Override
	public Ery<Elem> clone() {

		synchronized (KEY_TO_SYN) {

			return new Ery<Elem>(Arrays.copyOf(aryOfElem, iLen));

		}

	}

}
