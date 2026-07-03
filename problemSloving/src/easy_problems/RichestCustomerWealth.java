package easy_problems;

import java.util.*;
public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int acc[][] = {{1,5}, {5,7}, {3,5}};
		int sum, max=0;
		
		for(int i=0; i<acc.length; i++) {
			sum=0;
			for(int j=0; j<acc[i].length; j++) {
				sum+=acc[i][j];
			}
			if(sum > max)
			{
				max=sum;
			}
		}
		System.out.println("Maximum:"+max);
	}

}
