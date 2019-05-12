package lGpl20.comb.filter;

import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.o.O;

/**
 * Condition.<br/>
 * <br/>
 * Condition.
 * 
 * @version 2018/05/28_21:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Condi" >Condi.java</a>
 * 
 * @see S2va
 */
public class Condi implements Comparable<Condi> {

	private static final Class<Condi> CLASS_THIS = Condi.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public int n;

	public int k;

	public int min;

	public int max;

	boolean isEachKDistinct;

	/**
	 * 檢查是否超出界限.<br/>
	 * To check if it is between.
	 */
	public void checkArg() {

		if (n <= 0 || n > 30 || k <= 0 || min < 0 || max > n || min > max) { // n > 30, see toStrToOntoBySAryByB32

			O.x("n=" + n + ", k=" + k + ", min=" + min + ", max=" + max);

		}

	}

	@Override
	public Condi clone() {

		Condi clonedConi = new Condi();

		clonedConi.n = n;
		clonedConi.k = k;
		clonedConi.min = min;
		clonedConi.max = max;

		return clonedConi;

	}

	@Override
	public int compareTo(Condi otherCondi) {

		if (n > otherCondi.n) {

			return 1;

		}

		if (n < otherCondi.n) {

			return -1;

		}

		if (k > otherCondi.k) {

			return 1;

		}

		if (k < otherCondi.k) {

			return -1;

		}

		if (min > otherCondi.min) {

			return 1;

		}

		if (min < otherCondi.min) {

			return -1;

		}

		if (max > otherCondi.max) {

			return 1;

		}

		if (max < otherCondi.max) {

			return -1;

		}

		return 0;

	}

}
