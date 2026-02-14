package javacodinginterviewpractice;
/*
 * 0,1,1,2,3,5,8,13,21
 *  fn = fn-1 + fn-2 where seed values f0=0 f1=1
 */
public class FibonacciNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * using alternative approach
		 */
		/*printFibonacciNumbers_Alg1(5);
		*/
		
		/*
		 * using recursive approach
		 */
		int number=5;
		for(int i=0;i<number;i++) {
			System.out.print(printFibonacciNumbers_Alg2(i)+" ");
		}
	}

	/*
	 * using recursive approach
	 */
	static int printFibonacciNumbers_Alg2(int i) {
		// TODO Auto-generated method stub
		if(i<=1)
			return i;
		
		return printFibonacciNumbers_Alg2(i-1)+printFibonacciNumbers_Alg2(i-2);
		
	}

	/*
	 *  using iterative approach
	 */
	private static void printFibonacciNumbers_Alg1(int number) {
		// TODO Auto-generated method stub
		/*
		 * Fibonacci series 0(n1) 1(n2) n3=n1+n2=0+1=1 n1=n2=1 n2=n3=1 n3=n1+n2=1+1=2 2 3 5 8 fn = fn-1 + fn-2
		 */
		/*
		print n1
		n3=n1+n2
		n1=n2
		n2=n3
		*/
		int n1=0, n2=1;
		
		// 2
		// 2-1 + 2-2 (1 +  0) 1

		for(int i=0;i<number;i++) {
			System.out.print(n1+" ");
			
			// swap
			// loop 0
			//n1=0 n2=1
			int n3 = n1 + n2;//n3=0+1=1
			n1 = n2; // n1=n2=1,n1=n2=2
			n2 = n3; // n2=n3=1,n2=n3=2
			// 2nd loop
			// n1 = 1 n2 = 1
			// n3 = n1 + n2 = 1+1=2
		}

	}

}
