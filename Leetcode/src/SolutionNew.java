import java.util.Objects;

public class SolutionNew {

	int id;
	String name;
	SolutionNew(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SolutionNew other = (SolutionNew) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionNew s1=new SolutionNew(1,"A");
		SolutionNew s2=new SolutionNew(2,"B");
		
		

	}

}
