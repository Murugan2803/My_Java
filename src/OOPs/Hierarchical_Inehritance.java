package OOPs;

public class Hierarchical_Inehritance {
	public static void main(String[] args) {
		Mother  M = new Mother();
		System.out.println(M.gender);
		M.print();
		
		Uncle U = new Uncle();
		System.out.println(U.gender);
		U.print();
		
	}

}

class GrandFather{
	char gender = 'M';
	void print() {
		System.out.println("Parent Class");
	}
}

class Mother extends GrandFather{
	char gender = 'F';
}

class Uncle extends GrandFather{
//	char gender = 'M';
}