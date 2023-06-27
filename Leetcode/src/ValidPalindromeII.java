
public class ValidPalindromeII {

	/*
	 * Given a string s, return true if the s can be palindrome after deleting 
	 * at most one character from it.

 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean validPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s,i,j-1)||isPalindrome(s,i+1,j);
            }
        }
        return true;
    }
    public boolean isPalindrome(String z,int a,int b){
        while(a<b){
            if(z.charAt(a)!=z.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

}
