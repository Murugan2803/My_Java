package Probelm_solving;
import java.util.*;
public class Intersection_of_Array {
	public static void main(String[] args)
	{
		int arr1[]={1,2,3,4,5};
		int arr2[]= {1,3,4,7,9};
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					hs.add(arr1[i]);
				}
			}
		}
		for(int value: hs)
		{
			System.out.print(value+" ");
		}
	}
}
