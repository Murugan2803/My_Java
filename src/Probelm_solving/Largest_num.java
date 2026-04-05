package Probelm_solving;

import java.util.Arrays;

public class Largest_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=0;
		int arr[] = {19,32,0,87,9};
		//Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
