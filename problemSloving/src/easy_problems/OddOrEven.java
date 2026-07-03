package easy_problems;
import java.util.ArrayList;
public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		if(a%2==0) {
//			System.out.println("Even Number");
//		}
//		else
//		{
//			System.out.println("Odd Number");
//		}
		
	int a[] = {1, 2, 3, 4, 5};
//		int EvenCnt=0, OddCnt=0;
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]%2==0)
//			{
//				EvenCnt++;
//			}
//			else {
//				OddCnt++;
//			}
//		}
//		
//		int[] even = new int[EvenCnt];
//		int[] odd = new int[OddCnt];
//		int e=0, o=0;
//		
//		for(int i=0;i<a.length; i++)
//		{
//			if(a[i]%2==0)
//			{
//				 even[e++]=a[i];
//			}
//			else {
//				odd[o++]=a[i];
//			}
//		}
//		
//		System.out.print("Even Array: ");
//		PrintArray(even);
//		System.out.println();
//		System.out.print("Odd Array:");
//		PrintArray(odd);
//	}
//	
//	static void PrintArray(int a[]) {
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}

		
		//the best way we use array list for array odd/even..
		
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int num :a)
		{
			if(num%2==0)
				even.add(num);
			else
				odd.add(num);
		}
		
		System.out.println("Even Array: "+ even);
		System.out.println("Odd Array: "+ odd);
	
	
	}	

}
