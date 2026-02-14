package javacodinginterviewpractice;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateNumbersInArrayFinder {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,2,1,5};
		
		duplicateNumbersInArray(nums);
	}
	
	
	private static void duplicateNumbersInArray(int[] nums) {
		Set<Integer> hasSet=new HashSet<Integer>();
		Set<Integer> dupNos=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(!hasSet.add(nums[i])) {
				dupNos.add(nums[i]);
			}
		}
	
		System.out.println("printing duplicate numbers");
		Iterator dups=dupNos.iterator();
		while(dups.hasNext()) {
			System.out.println(dups.next());
		}
		
	}
	
	
	
	
	/*private static void duplicateNumbersInArray(int[] nums) {
		System.out.println("printing duplicate Numbers");
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					System.out.println(nums[i]);
				}
			}
		}
	}*/

}
