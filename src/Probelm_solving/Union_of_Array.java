package Probelm_solving;
import java.util.*;
public class Union_of_Array {
	public static void main(String[] args)
	{
		int arr1[]= {1,2,2,3,4,5,5};
		int arr2[]= {1,2,3,3,4,4,5,6};
		int num=0;
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<arr1.length;i++)
		{
			hs.add(arr1[i]);
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			hs.add(arr2[i]);
		}
		for(int value: hs)
		{
			System.out.print(value+" ");
		}
	}
}
