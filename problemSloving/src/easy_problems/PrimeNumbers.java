package easy_problems;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int a = 7;
//		int cnt=0;
//		for(int i=1; i<=a; i++)
//		{
//			if(a%i==0)
//			{
//				cnt++;
//			}
//		}
//		if(cnt==2)
//			System.out.println("Is Prime Number");
//		else
//			System.out.println("Not a Prime Number");
		
		int a[] = {3, 6, 10, 17, 22,};
		for(int i=0;i<a.length;i++) {
			int num = a[i];
			boolean isPrime = true;
			
			if(num <=i) {
				isPrime = false;
			}
			else {
				for(int j=2; j<num/2; j++) {
					if(num%j == 0) ß {
						isPrime = false;
					}
				}
			}
			if(isPrime) {
				System.out.println(num);
			}
		}

	}

}
