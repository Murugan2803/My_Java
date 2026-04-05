package OOPs;

public class WithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = add(10,15);
		res*=10;
		System.out.println(res);
	}
	public static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}

}
