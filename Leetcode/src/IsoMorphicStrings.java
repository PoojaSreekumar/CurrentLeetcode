import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="add";
		String t="egg";
	}
	
	public boolean isIsomorphic(String s, String t) {
        if(s==null&&t==null){
            return true;
        }
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2){
            return false;
        }
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        for(int i=0;i<len1;i++){
            char first=s.charAt(i);
            char second=t.charAt(i);
            if(!map1.containsKey(first)){
                if(map2.containsKey(second)){
                    return false;
                }
                else{
                    map1.put(first,second);
                    map2.put(second,first);
                }
            }
            else{
                if(!map2.containsKey(second)){
                    return false;
                }
                else{
                    if(map1.get(first)!=second||map2.get(second)!=first){
                        return false;
                    }
                }
            }
            
        }
        return true;
    }

	
	
	///
public boolean isIsomorphic1(String s, String t) {
        
        int[] mappingDictStoT = new int[256];
        Arrays.fill(mappingDictStoT, -1);
        
        int[] mappingDictTtoS = new int[256];
        Arrays.fill(mappingDictTtoS, -1);
        
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            // Case 1: No mapping exists in either of the dictionaries
            if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                mappingDictStoT[c1] = c2;
                mappingDictTtoS[c2] = c1;
            }
            
            // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
            // it doesn't match in either of the dictionaries or both 
            else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
                return false;
            }
        }
        
        return true;
    }
}
