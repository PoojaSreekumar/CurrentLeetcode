import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> list= new ArrayList<>();
		generate(list,"",0,0,n);
		System.out.println(list);

	}

	private static void generate(List<String> list, String s, int open, int close, int n) {
		// TODO Auto-generated method stub
		if(open==n&&close==n) {
			list.add(s);
		}
		if(open<n) {
			generate(list,s+"(",open+1,close,n);
		}
		if(close<open) {
			generate(list,s+")",open,close+1,n);
		}
		
		
	}

}
