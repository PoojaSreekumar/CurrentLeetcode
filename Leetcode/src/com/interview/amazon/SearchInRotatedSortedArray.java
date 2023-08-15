package com.interview.amazon;

public class SearchInRotatedSortedArray extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {4,5,6,7,8,1,2,3};
		int tar=8;
		System.out.println(new SearchInRotatedSortedArray().search(nums, tar));

	}
	public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[start]<=nums[mid]){ //check if left is sorted
                    if(target>=nums[start]&&target<nums[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }

                }
                else{ // it comes here if left is not sorted that means right is sorted
                    if(target<=nums[end]&&target>nums[mid]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                    
                }
                
            }
            return -1;
        }
	
	
	//
	
	
	public int search1(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        
        // Find the index of the pivot element (the smallest element)
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[n - 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        // Binary search over elements on the pivot element's left
        int answer = binarySearch(nums, 0, left - 1, target);
        if (answer != -1) {
            return answer;
        }
        
        // Binary search over elements on the pivot element's right
        return binarySearch(nums, left, n - 1, target);
    }
    
    // Binary search over an inclusive range [left_boundary ~ right_boundary]
    private int binarySearch(int[] nums, int leftBoundary, int rightBoundary, int target) {
        int left = leftBoundary, right = rightBoundary;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    }


