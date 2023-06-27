package com.interview.amazon;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "b", t = "abc";
		System.out.println(new IsSubsequence().isSubsequence(s, t));

	}
	
	public boolean isSubsequence(String s, String t) {
        String sub="";
        if(s==null||t==null){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        char[] a=s.toCharArray();
        int j=0;
        for(int i=0;i<t.length()&&j<a.length;i++){
            if(t.charAt(i)==a[j]){
                sub=sub+t.charAt(i);
                j++;
            }
        }
        if(sub.equals(s)){
            return true;
        }
        return false;
    }

	//
	public boolean isSubsequence1(String s, String t) {
        Integer leftBound = s.length(), rightBound = t.length();
        Integer pLeft = 0, pRight = 0;

        while (pLeft < leftBound && pRight < rightBound) {
            // move both pointers or just the right pointer
            if (s.charAt(pLeft) == t.charAt(pRight)) {
                pLeft += 1;
            }
            pRight += 1;
        }
        return pLeft == leftBound;
    }
}


class Solution5 {
    String source, target;
    Integer leftBound, rightBound;

    private boolean rec_isSubsequence(int leftIndex, int rightIndex) {
        // base cases
        if (leftIndex == leftBound)
            return true;
        if (rightIndex == rightBound)
            return false;

        // consume both strings or just the target string
        if (source.charAt(leftIndex) == target.charAt(rightIndex))
            ++leftIndex;
        ++rightIndex;

        return rec_isSubsequence(leftIndex, rightIndex);
    }

    public boolean isSubsequence(String s, String t) {
        this.source = s;
        this.target = t;
        this.leftBound = s.length();
        this.rightBound = t.length();

        return rec_isSubsequence(0, 0);
    }
}