package Probelm_solving;

public class RemovingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,2,3,0,0,4,5};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{//i =0,
			if(arr[i]!=0)//1!=0,
			{
				int temp=arr[i];//temp=1,
				arr[i]=arr[count];
				arr[count]=temp;
				
				count++;
			}
		}
		for(int num: arr)
		{
			System.out.print(num+" ");
		}
	}

}
