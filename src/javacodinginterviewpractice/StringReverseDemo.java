package javacodinginterviewpractice;

public class StringReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString_Alg3("banana");
	}

	private static void reverseString_Alg3(String str) {
		// TODO Auto-generated method stub'
		char[] originalCharArray=str.toCharArray();
		//char[] reverseCharArray=new char[str.length()-1];
		int firstcharpos=0;
		int endcharpos=originalCharArray.length-1;
		
		/*
		 temp = charfromendcharpos
		 endcharpos = charfromfirstpos
		 firstcharpos = temp
		*/
		while(firstcharpos<endcharpos) {
			
			char temp = originalCharArray[endcharpos];
			originalCharArray[endcharpos]=originalCharArray[firstcharpos];
			originalCharArray[firstcharpos]=temp;
			firstcharpos++;
			endcharpos--;
			
		}
		
		System.out.println("original string: "+str);
		System.out.println("reversed string: "+new String(originalCharArray));
	}

	private static void reverseString_Alg2(String str) {
		// TODO Auto-generated method stub
		System.out.println("method called reverseString_Alg2(String str)");
		StringBuilder reverseStrBuilder = new StringBuilder(str);
		int firstcharpos=0;
		int lastcharpos=str.length()-1;
		
		/*
		temp=charfromendcharpos
		endcharpos=charfromfirstcharpos
		firstcharpos=temp
		*/
		
		for(int i=0;i<str.length()/2;i++) {
			char temp = reverseStrBuilder.charAt(lastcharpos);
			reverseStrBuilder.setCharAt(lastcharpos, reverseStrBuilder.charAt(firstcharpos));
			reverseStrBuilder.setCharAt(firstcharpos, temp);
			firstcharpos++;
			lastcharpos--;
		}
		
		String reversedStr = reverseStrBuilder.toString();
		
		System.out.println("original string : "+str);
		System.out.println("reversed string : "+reversedStr);
	}

	private static void reverseString_Alg1(String str) {
		// TODO Auto-generated method stub
		/*
		temp=charfromendcharpos;
		endcharpos=charfromfirstcharpos;
		firstcharpos=temp;
		*/
		
		StringBuilder reverseStrBuilder = new StringBuilder(str);
		int firstcharpos=0;
		int lastcharpos=str.length()-1;
		//"apple"
		//0<4
		//1<3
		
		
		while(firstcharpos<lastcharpos) {
			System.out.println("firstcharpos: "+firstcharpos);
			System.out.println("lastcharpos: "+lastcharpos);
			
			char temp=reverseStrBuilder.charAt(lastcharpos);
			reverseStrBuilder.setCharAt(lastcharpos, reverseStrBuilder.charAt(firstcharpos));
			reverseStrBuilder.setCharAt(firstcharpos, temp);
			firstcharpos++;
			lastcharpos--;
		}
		
		System.out.println("original string: "+str);
		System.out.println("reversed string: "+reverseStrBuilder.toString());
		
		
	}

}
