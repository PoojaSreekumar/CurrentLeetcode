
public class IndexOfFirstOccurenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "sadbutsad", needle = "sad";
	}

	public int strStr(String haystack, String needle) {
        if(needle==null||haystack==null||needle.length()>haystack.length()){
            return -1;
        }
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        else{
            return -1;
        }
    }
	
	public int strStr1(String haystack, String needle) {
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
