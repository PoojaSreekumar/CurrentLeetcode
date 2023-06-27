import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	boolean isPrime1(int n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	boolean isPrime2(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static List<Integer> primeNumbersTill(int n) {
	    return IntStream.rangeClosed(2, n)
	      .filter(x -> isPrime4(x)).boxed()
	      .collect(Collectors.toList());
	}
	private static boolean isPrime4(int number) {
	    return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
	      .allMatch(n -> number % n != 0);
	}
}
