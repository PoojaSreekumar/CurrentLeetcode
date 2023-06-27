import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetOfIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3};
		List<Integer> list=new ArrayList<>();
		List<List<Integer>> list1=new ArrayList<>();
		
		findAllSubsets(0,num.length,num,list,list1);
		for(int i=0;i<list1.size();i++) {
			Collections.sort(list1.get(i));
			System.out.print("[");
			for(int j=0;j<list1.get(i).size();j++) {
				System.out.print(list1.get(i).get(j)+" ");
			}
			System.out.print("]");
			System.out.println("");
		}

	}

	private static void findAllSubsets(int i, int length, int[] num, List<Integer> list, List<List<Integer>> list1) {
		// TODO Auto-generated method stub
		list1.add(new ArrayList<>(list));
		for(int j=i;j<length;j++) {
			list.add(num[j]);
			findAllSubsets(j+1,length,num,list,list1);
			list.remove(list.size()-1);
		}
	
		
	}

}
