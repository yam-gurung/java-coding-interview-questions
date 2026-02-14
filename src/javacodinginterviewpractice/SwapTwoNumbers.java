package javacodinginterviewpractice;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapNumbers_Alg3(100,200);
	}
	
	/*
	 *  using Bitwise XOR(^) operator
	 */
	private static void swapNumbers_Alg3(int i,int j) {
		/*
		int i = 100 binary 01010
		int j = 200 binary 10100
		*/
		i = i ^ j; // i becomes i ^ j
		j = i ^ j; // j becomes (i ^ j) ^ j, which results into original i 
		i = i ^ j; // i becomes (i ^ j) ^ i, which results into original j
		System.out.println("");
	}
	
	/*
	 * using arithmetic operation
	 */
	private static void swapNumbers_Alg2(int i, int j) {
		// TODO Auto-generated method stub
		

		System.out.println("original value of i: "+i);
		System.out.println("original value of j: "+j);
		
		/*original 
		i = 100
		j = 200
		*/
		
		/*
		i= i + j // i becomes sum of original  i and j
		j= i - j // j becomes the new i - original j
		i= i - j // i becomes the new i - new j
		/*/
		i = i + j; 
		j = i - j;
		i = i - j;
		
		System.out.println("final value of i: "+i);
		System.out.println("final value of j: "+j);
	}



	/*
	 * using a third variable
	 */
	private static void swapNumbers_Alg1(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("using third variable ");
		System.out.println("original value of i: "+i);
		System.out.println("orginal value of j: "+j);
		
		/*
		temp=i;
		i=j;
		j=temp;
		*/
		int temp =i;
		i=j;
		j=temp;
		
		System.out.println("after swap value of i: "+i);
		System.out.println("after swap value of j: "+j);
		
	}

}
