package Probelm_solving;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,0,1,1,1,0,1,1};
		int cnt=0;
		int maxcnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				cnt++;
			}
			else
			{
				cnt=0;
			}
			if(cnt>maxcnt)
				maxcnt=cnt;
		}
		System.out.println("MaxConsecutiveOnes:"+maxcnt);

	}

}
