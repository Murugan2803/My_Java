package Probelm_solving;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,7,11,15};
		int target=9;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(target==sum)
				{
					System.out.println("Target of index: " + i + " " + j);
				}
			}
		}

	}
}
