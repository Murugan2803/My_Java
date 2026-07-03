package easy_problems;

import java.util.*;

public class RunningSumOf_1d_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i] =  sc.nextInt();
		}
		
		for(int i=1; i<size; i++)
		{
			arr[i] = arr[i-1] + arr[i];
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
