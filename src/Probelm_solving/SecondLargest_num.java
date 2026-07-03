package Probelm_solving;

import java.util.Arrays;

public class SecondLargest_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,42,83,2,1};
		int max=0;
		int sec=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>sec && arr[i]!=max)
				sec=arr[i];
		}
		System.out.println(sec);
	}

}
