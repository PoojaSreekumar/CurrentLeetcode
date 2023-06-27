import java.util.Stack;

public class ValidateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ")";
		System.out.println(new ValidateParanthesis().validate(str));
		

	}

	private boolean validate(String str) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();

			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();

			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();

			}
			else {
				return false;
			}

		}
		return stack.isEmpty();
	}

}
