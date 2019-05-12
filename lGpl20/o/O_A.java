package lGpl20.o;

/**
 * @version 2019/05/06_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_A" >O_A.java</a>
 * 
 * @see O_C
 */
public abstract class O_A extends Origin {

	private static final Class<O_A> CLASS_THIS = O_A.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/// 組合用有序排列實作
	// 排列 先取(組合)再排

	// 排列組合, 少用除法

	// 例如電腦 重新命名, 只有記憶體配置, 沒有減法
	// 5! always eq C(5,2)*2!*C(3,3)*3!
	// C(6,1)*C(5,2)*C(3,3) eq 定值 eq C(6,2)*C(4,3)*C(1,1)

	// todo:

	// search double value 5.0d change to 5.0D

	// rewrite ... the three point argument to one argument or with array

	// Jsp_V mapOfParamToEncodedArg(TreeMap<String, String> mapOfParam)
	// change to Jsp_V mapOfParamToEncodedArg(TreeMap<String, CharSeq> mapOfParam)

	// Strva_H StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR) str.delete(str) do not delete afterward

	// new File(), mkdirs() convert to nio.Path.get()

	// 到底先 syn 還是先 call method?
	//
	// syn{
	//
	// 先 syn 後 call method 後再離開
	// syn 區塊
	//
	// }

	// Circ W Blank for JSP c314.jsp

	// note: Arrays.fill(tempCharAry, '0');// for (int i = 0, len = tempCharAry.length; i != len; i++)

	// code template: ///////////////////////////////

	// for (int i = 0; i != ary.length; i++) {
	// O.l(ary[i]);
	// }
	//
	// O.l("min=" + min + O.S32 + CLASS_THIS);

	///////////////////////////////////////////////

	// try{
	// } catch (Throwable throwable) {}

	///////////////////////////////////////////////

	// try{
	//
	// } catch (InterruptedException interruptedEx) {
	//
	// interruptedEx.printStackTrace();
	//
	// }

}
