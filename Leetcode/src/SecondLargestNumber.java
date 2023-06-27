
public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,3,4,6,2,7};
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				
				secondMax=max;
				max=nums[i];
			}
			else if(nums[i]>secondMax&&nums[i]<max) {
				secondMax=nums[i];
			}
			
		}
		System.out.println(secondMax);
	}

}
