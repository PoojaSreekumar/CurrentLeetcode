package com.interview.amazon;

import java.util.HashSet;

public class SingleNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int singleNumber(int[] nums) {
	    //    Map<Integer,Integer> map=new HashMap<>();
	        Set<Integer> set=new HashSet<>();
	        for(int i=0;i<nums.length;i++){
	            if(set.contains(nums[i])){
	                set.remove(nums[i]);
	            }
	            else{
	                set.add(nums[i]);
	            }
	        }
	        return set.stream().findFirst().get();
	    }

	 
	 /*f we take XOR of zero and some bit, it will return that bit

    a⊕0=aa \oplus 0 = aa⊕0=a

If we take XOR of two same bits, it will return 0

    a⊕a=0a \oplus a = 0a⊕a=0

a⊕b⊕a=(a⊕a)⊕b=0⊕b=ba \oplus b \oplus a = (a \oplus a) \oplus b = 0 \oplus b = ba⊕b⊕a=(a⊕a)⊕b=0⊕b=b
*/
	 
	 public int singleNumber1(int[] nums) {
		    int a = 0;
		    for (int i : nums) {
		      a ^= i;
		    }
		    return a;
		  }
	 
	 
	 //2(a+b+c)-(a+a+b+b+c)=c
	 public int singleNumber2(int[] nums) {
		    int sumOfSet = 0, sumOfNums = 0;
		    Set<Integer> set = new HashSet();

		    for (int num : nums) {
		      if (!set.contains(num)) {
		        set.add(num);
		        sumOfSet += num;
		      }
		      sumOfNums += num;
		    }
		    return 2 * sumOfSet - sumOfNums;
		  }
}
