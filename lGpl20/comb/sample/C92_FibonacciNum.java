package lGpl20.comb.sample;

import java.math.BigInteger;

import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * Fibonacci number.<br/>
 * <br/>
 * Fibonacci number.
 * 
 * @version 2019/04/17_21:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C92_FibonacciNum" >C92_FibonacciNum.java
 *          </a>
 */
public class C92_FibonacciNum {

	/**
	 * 回傳 Fibonacci 數列某項的數字.<br/>
	 * To return the n-th Fibonacci number of the Fibonacci list.<br/>
	 * fibonacci(0)=0, fibonacci(1)=1, fibonacci(2)=1, fibonacci(3)=2.
	 */
	public static BigInteger fibonacciBigInt(int n) {

		if (n < 0) {

			O.x("n=" + n);

		}

		if (n <= 1) {

			return BigInteger.valueOf(n);

		}

		BigInteger fib0 = BigInteger.ZERO;
		BigInteger fib1 = BigInteger.ONE;
		BigInteger fib2 = BigInteger.ONE;

		for (int i = 2; i <= n; i++) {

			fib2 = fib1.add(fib0);
			fib0 = fib1;
			fib1 = fib2;

		}

		return fib2;

	}

	public static void main(String[] sAry) throws Throwable {

		int n = 98;

		O.l("fibonacciBigInt=" + SByN.f(fibonacciBigInt(n)));

	}

}
