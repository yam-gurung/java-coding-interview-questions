package javacodinginterviewpractice;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 15;
		boolean result = isPrimeNumber(number);
		if(result==true) {
			System.out.println("number "+number+" is a prime number");
		}else {
			System.out.println("number "+number+" is not a prime number");
		}
		
	}

	private static boolean isPrimeNumber(int number) {
		// TODO Auto-generated method stub
		/*
		10
		2 5 10 // so not a prime number
		
		17
		17 prime number
		*/
		if(number<=1)
			return false;
		
		for(int i=2;i<number;i++) {
			if(number%i==0)
				return false;
		}
		
		return true;
	}

}
