package Probelm_solving;
import java.util.*;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double bill=sc.nextDouble();
		double disc=0;
		double amnt;
		
		if(bill<1000)
		{
			disc=bill*0.05;
//			System.out.println(disc);
			amnt=bill-disc;
			System.out.println(amnt);
		}
		else if(bill<=1000 && bill>=5000)
		{
			disc=bill*0.10;
//			System.out.println(disc);
			amnt=bill-disc;
			System.out.println(amnt);
		}
		else
		{
			disc=bill*0.15;
//			System.out.println(disc);
			amnt=bill-disc;
			System.out.println(amnt);
		}

	}

}
