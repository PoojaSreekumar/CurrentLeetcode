package com.interview.amazon;

public class PowerOfXandN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.00000;
				int n = 10;
				new PowerOfXandN().myPow(x, n);
	}
	
	public double myPow(double x, int n) {
        long n1=(long)n;
         if (n1 == 0) {
            return 1;
        }

        // Handle case where, n < 0.
        if (n1 < 0) {
            n1 = -1 * n1;
            x = 1.0 / x;
        }

        // Perform Binary Exponentiation.
        double result = 1;
        while (n1 != 0) {
            // If 'n' is odd we multiply result with 'x' and reduce 'n' by '1'.
            if (n1 % 2 == 1) {
                result = result * x;
                n1 -= 1;
            }
            // We square 'x' and reduce 'n' by half, x^n => (x^2)^(n/2).
            x = x * x;
            n1 = n1 / 2;
        }
        return result;
        }

//

private double binaryExp(double x, long n) {
    // Base case, to stop recursive calls.
    if (n == 0) {
        return 1;
    }
   
    // Handle case where, n < 0.
    if (n < 0) {
        return 1.0 / binaryExp(x, -1 * n);
    }
   
    // Perform Binary Exponentiation.
    // If 'n' is odd we perform Binary Exponentiation on 'n - 1' and multiply result with 'x'.
    if (n % 2 == 1) {
        return x * binaryExp(x * x, (n - 1) / 2);
    }
    // Otherwise we calculate result by performing Binary Exponentiation on 'n'.
    else {
        return binaryExp(x * x, n / 2);
    }
}

public double myPow1(double x, int n) {
    return binaryExp(x, (long) n);
}

}