
public class CountOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CountOfPrime().countPrimes2(10));
		//new CountOfPrime().printPrimes(10);
	}
	public int countPrimes(int n) {
        int count=1;
        if(n<2){
            return 0;
        }
        else if(n==3){
            return 1;
        }
        else{
            for(int i=3;i<n;i=i+2){
                
                    if(isPrime(i)) {
                    	count++;
                    }
                
            }
            return count;
        }

    }

    public static boolean isPrime(int num){
    	for(int i=3;i*i<=num;i++) {
    		if(num%i==0) {
    			return false;
    		}
    	}
    	return true;

    }
    
    public int countPrimes1(int n) {
        boolean arr[]=new boolean[n];
        long c=0;
        for(long i=2;i<n;i++)
        {
            if(arr[(int)i])
             continue;
            c++;
            for(long j=i*i;j<n;j+=i)
             arr[(int)j]=true;
        }
        return (int)c;
    }
    
    public int countPrimes2(int n)
    {
    	boolean arr[]=new boolean[n];
        int c=0;
        for(int i=2;i<=Math.sqrt(n);i++) {
        	if(arr[i]==false) {
        		for(int j=i*i;j<n;j+=i) {
        			arr[j]=true;
        		}
        	}
        }
        for(int i=2;i<n;i++) {
        	if(arr[i]==false) {
        		System.out.println(i);
        		c++;
        	}
        }
        return c;
    }
    /*
    public void printPrimes(int n) {
    	for(int i=2;i<n;i++) {
    		boolean isPrime=true;
    		for(int j=i;j<=n/2;j++) {
    			if(i%j==0) {
    				isPrime=false;
    			}
    		}
    		if(isPrime) {
    			System.out.println(i);
    		}
    	}
    }
    */

}
