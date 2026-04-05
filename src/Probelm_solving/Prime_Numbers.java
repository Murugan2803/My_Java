package Probelm_solving;
import java.util.*;
public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean flag= false;
		
		if(num==0 || num==1)
		{
			flag= true;
		}
		for(int i=2; i<=num/2;i++)
		{
			if(num%2==0)
			{
				flag=true;
				break;
			}
			
		}
		if(!flag)
		{
			System.out.println("Is Prime Number");
		}
		else
		{
			System.out.println("Is not Prime Number");
		}

	}

}
