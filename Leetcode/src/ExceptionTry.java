
public class ExceptionTry {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new ExceptionTry().print();

	}
	public void print() throws Exception {
		try {
			System.out.println("Hi");
		}
		catch(Exception e) {
			//throw new Exception("hello");
			return;
		}
		finally {
			System.out.println("how");
		}
	}

}
