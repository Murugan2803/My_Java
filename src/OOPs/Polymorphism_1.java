package OOPs;
// Is Method OverLoading---

class MathUnits{
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
}

public class Polymorphism_1 {

	public static void main(String[] args) {
		
		MathUnits ob = new MathUnits();
		System.out.println(ob.add(5, 6));
		System.out.println(ob.add(5, 6, 7));

	}

}
