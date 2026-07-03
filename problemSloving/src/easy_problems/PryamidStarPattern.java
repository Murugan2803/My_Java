package easy_problems;

public class PryamidStarPattern {

	public static void main(String[] args) {
		int row=4;
		int star=1, space=3;
		for(int i=0; i<row; i++) 
		{
			for(int j=0; j<space; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<star; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star+=2;
		}

	}

}
