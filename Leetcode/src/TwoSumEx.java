import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,7,11,15};
		int target=9;
		//System.out.println(new TwoSumEx().twoSum(arr, target));
		System.out.println(new TwoSumEx().isPalindrome(11));
		
		
	}
	
	public List<Integer> twoSum(int[] a,int t){
		Map<Integer,Integer> map=new HashMap<>();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			int val=t-a[i];
			if(map.containsKey(val)) {
				list.add(i);
				list.add(map.get(val));
				return list;
				
			}
			else {
				map.put(a[i], i);
			}
		}
		return null;
		
	}
	
	public boolean isPalindrome(int value) {
		if(value<0) {
			return false;
		}
		String a=String.valueOf(value);
		int len=a.length();
		
		for(int i=0,j=len-1;i<len/2;i++) {
			if(a.charAt(i)!=a.charAt(j)) {
				return false;
			}
		}
		return true;
		
	}
	

}
