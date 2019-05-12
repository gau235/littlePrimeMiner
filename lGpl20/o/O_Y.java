package lGpl20.o;

import lGpl20.prime64.Ranger;

/**
 * @version 2019/03/15_18:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_Y" >O_Y.java</a>
 * 
 * @see O_Z
 */
public abstract class O_Y extends O_W {

	private static final Class<O_Y> CLASS_THIS = O_Y.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The bound as high amount of memory in MB.<br/>
	 * The bound as high amount of memory in MB.
	 */
	public static final int $BOUND32_AS_HIGH_MEM_IN_GB = 30;

	/**
	 * To return the all amount of memory in mega bytes.<br/>
	 * To return the all amount of memory in mega bytes.
	 */
	public static int allMem() {

		return (int) (RUNTIME.maxMemory() / Ranger.$2POW20);

	}

	/**
	 * To return the dirtied amount of memory in mega bytes.<br/>
	 * To return the dirtied amount of memory in mega bytes.
	 */
	public static int dirtiedMem() {

		return (int) (RUNTIME.totalMemory() / Ranger.$2POW20);

	}

	/**
	 * To return the free amount of memory in mega bytes.<br/>
	 * To return the free amount of memory in mega bytes.
	 */
	public static int freeMem() {

		return (int) (RUNTIME.freeMemory() / Ranger.$2POW20);

	}

	/**
	 * Is high amount of memory?<br/>
	 * Is high amount of memory?
	 */
	public static final boolean IS_HIGH_MEM = (((int) (RUNTIME.maxMemory() / Ranger.$2POW30)) > $BOUND32_AS_HIGH_MEM_IN_GB);

}
