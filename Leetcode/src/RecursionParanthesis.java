import java.util.HashMap;
import java.util.Map;

public class RecursionParanthesis {

	static String str="{()}";
	static Map<Character,Character> map=new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		map.put(']','[');
		map.put(')','(');
		map.put('}','{');
		new RecursionParanthesis().validate(str,str.charAt(i),i);

	}
	public int validate(String s,char c,int i) {
		if(c=='('||c=='{'||c=='[') {
		  int nextClosed =	validate(s,s.charAt(i+1),i+1);
		  if(nextClosed<0) {
			  return -1;
		  }
		  if(map.get(s.charAt(nextClosed)) == s.charAt(i){
			  return validate()
		  }
		}
		else {
			return i;
		}
		
	}

}
