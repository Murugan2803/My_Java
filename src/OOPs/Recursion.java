package OOPs;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Natural Number's using Recursion");
		natPrint(10);
		
		
	}
	public static void natPrint(int n) {
		if(n==1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(n);
			natPrint(n-1);
		}
	}

}
