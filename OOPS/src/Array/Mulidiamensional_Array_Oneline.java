package Array;


public class Mulidiamensional_Array_Oneline 
{

	public static void main(String[] args) 
	{
		
		int [] [] ar = {{10,20,30},{40,50,60}};
		System.out.println(ar[1][2]);
		
		
		System.out.println("--------------");
		
		for (int i=0; i<=1; i++)
		{
			for (int j=0; j<=2; j++) 
			{
				System.out.print(ar [i][j]+ " ");
			}
		 
		        System.out.println();
		}
	}
}
