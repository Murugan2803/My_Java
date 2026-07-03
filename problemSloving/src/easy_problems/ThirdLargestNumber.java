package easy_problems;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int arr[] = {10, 22, 6, 3, 1};
		System.out.println(thirdLargestNum(arr));
		
	}
		
		static int thirdLargestNum(int[] arr) {
			int n = arr.length;
			int first = Integer.MIN_VALUE,  second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
			
			if(n<3) 
			{
				return -1;
			}
			
			for(int i=0; i<n; i++)
			{
				if(arr[i]>first)
				{
					third = second;
					second = first;
					first = arr[i];
				}
				else if(arr[i]>second)
				{
					third = second;
					second = arr[i];
				}
				else if(arr[i]>third)
				{
					third = arr[i];
				}
			}
			return third;
		}

	

}
