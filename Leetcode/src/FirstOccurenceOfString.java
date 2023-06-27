
public class FirstOccurenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new FirstOccurenceOfString().strStr("sadbutsad", "sad"));
	}

	public int strStr(String haystack, String needle) {
       
        	int mainlen=haystack.length();
        	int sublen=needle.length();
        	int j=0;
        	int value=0;
            for(int i=0;i<mainlen;i++) {
            	if(j<sublen&&haystack.charAt(i)==needle.charAt(j)) {
            		
            		value=i-j;
            		j++;
            	}
            	else if(j==sublen) {
            		return value;
            	}
            	else {
            		i=i-j;
            	j=0;
            	}
            }
            if(j==sublen){
                return value;
            }
            
        
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();

        for (int windowStart = 0; windowStart <= n - m; windowStart++) {
            for (int i = 0; i < m; i++) {
                if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
                    break;
                }
                if (i == m - 1) {
                    return windowStart;
                }
            }
        }

        return -1;
    }
}

