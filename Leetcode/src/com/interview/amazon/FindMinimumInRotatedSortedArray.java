package com.interview.amazon;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 3,4,5,1,2 };
		System.out.println(new FindMinimumInRotatedSortedArray().findMin(nums));
	}

	public int findMin(int[] nums) {
		int start = 0;
		int min = nums[0];
		int end = nums.length - 1;
		if (nums[start] < nums[end]) {
			return min;
		} else {
			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (nums[mid] >= min) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
				min = Integer.min(min, nums[mid]);

			}
			return min;
		}
	}
	
	
	///
	
	    public int findMin1(int[] nums) {
	        // If the list has just one element then return that element.
	        if (nums.length == 1) {
	            return nums[0];
	        }

	        // initializing left and right pointers.
	        int left = 0, right = nums.length - 1;

	        // if the last element is greater than the first element then there is no
	        // rotation.
	        // e.g. 1 < 2 < 3 < 4 < 5 < 7. Already sorted array.
	        // Hence the smallest element is first element. A[0]
	        if (nums[right] > nums[0]) {
	            return nums[0];
	        }

	        // Binary search way
	        while (right >= left) {
	            // Find the mid element
	            int mid = left + (right - left) / 2;

	            // if the mid element is greater than its next element then mid+1 element is the
	            // smallest
	            // This point would be the point of change. From higher to lower value.
	            if (nums[mid] > nums[mid + 1]) {
	                return nums[mid + 1];
	            }

	            // if the mid element is lesser than its previous element then mid element is
	            // the smallest
	            if (nums[mid - 1] > nums[mid]) {
	                return nums[mid];
	            }

	            // if the mid elements value is greater than the 0th element this means
	            // the least value is still somewhere to the right as we are still dealing with
	            // elements
	            // greater than nums[0]
	            if (nums[mid] > nums[0]) {
	                left = mid + 1;
	            } else {
	                // if nums[0] is greater than the mid value then this means the smallest value
	                // is somewhere to
	                // the left
	                right = mid - 1;
	            }
	        }
	        return Integer.MAX_VALUE;
	    }
	

}
