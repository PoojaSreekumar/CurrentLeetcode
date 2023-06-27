
public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,0,2,0,3,4,5};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
		for(int num:arr) {
			System.out.print(num);
		}

		int[] arr1= {0,1,0,0,2,0,3,4,5};
		int j1=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=0&&arr1[j1]==0) {
				int temp=arr1[j1];
				arr1[j1]=arr1[i];
				arr1[i]=temp;
				
			}
			if(arr1[j1]!=0) {
				j1++;
			}
		}
		for(int num:arr1) {
			System.out.println(num);
		}
	}

}
