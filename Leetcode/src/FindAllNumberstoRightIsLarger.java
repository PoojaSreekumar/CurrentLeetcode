import java.util.Stack;

public class FindAllNumberstoRightIsLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5, 1, 4, 3, 6, 8, 10, 7, 9}; 
		Stack<Integer> stack=new Stack<>();
		stack.push(arr[0]);
		for(int i=1;i<arr.length;i++) {
			while(!stack.isEmpty()&&arr[i]<stack.peek()) {
				
					stack.pop();				
			}
				stack.push(arr[i]);
				
			}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
			System.out.println(" , ");
		}
		
		

	}

}
