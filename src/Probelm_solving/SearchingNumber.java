package Probelm_solving;

public class SearchingNumber {

	public static void main(String[] args) {
		int arr[] = {6,9,5,0,3};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==2)
			{
				System.out.println("Present index:"+i);
				return;// the returns will be end the program here 
			}
		}
		System.out.println("Absent");

	}

}
