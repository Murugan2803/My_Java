package Probelm_solving;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5};
		int n=arr.length+1;
		int totalSum=n*(n+1)/2;
		int arraySum=0;
		for(int i=0;i<arr.length;i++)
		{
			arraySum+=arr[i];
		}
		int missedNum=totalSum-arraySum;
		System.out.println("Missing Number is:"+missedNum);

	}

}
