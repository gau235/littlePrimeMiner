package lGpl20.comb.selfCallva;

import lGpl20.o.O;

/**
 * 本類別前進式自己呼叫自己的人.<br/>
 * <br/>
 * To call self forward.
 * 
 * @version 2015/02/22_21:27:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ForwardSelfCallva" >ForwardSelfCallva.java</a>
 * 
 * @see Recursva
 */
public abstract class ForwardSelfCallva extends ForwardSelfCallva_Z {

	private static final Class<ForwardSelfCallva> CLASS_THIS = ForwardSelfCallva.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

}
