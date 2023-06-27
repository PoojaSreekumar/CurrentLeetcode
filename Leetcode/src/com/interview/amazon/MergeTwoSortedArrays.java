package com.interview.amazon;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums3[]=new int[m];
        for(int i=0;i<m;i++){
            nums3[i]=nums1[i];
        }
       int i=0,j=0,k=0;
       while(i<m&&j<n){
           if(nums3[i]<nums2[j]){
               nums1[k]=nums3[i];
               i++;
           }
           else{
               nums1[k]=nums2[j];
               j++;
           }
           k++;
       }
       while(i!=m){
           nums1[k++]=nums3[i++];
       }
       while(j!=n){
           nums1[k++]=nums2[j++];
       }
         
    }
	
	
	//
	public void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
	
	
	public void merge2(int[] nums1, int m, int[] nums2, int n) {
        // Set p1 and p2 to point to the end of their respective arrays.
        int p1 = m - 1;
        int p2 = n - 1;
        
        // And move p backwards through the array, each time writing
        // the smallest value pointed at by p1 or p2.
        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }
        }
    }
}
