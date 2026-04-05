package Probelm_solving;
import java.util.*;
public class Remove_Dupliacte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,10,1,3,2,1};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			hs.add(num);
		}
		System.out.println(hs);
		System.out.println(hs.size());
	}

}
