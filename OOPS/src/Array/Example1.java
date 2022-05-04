package Array;

public class Example1 
{

	public static void main(String[] args)
	{
		
		
		String [] ar = new String [5];
		ar[0] = "Ganesh";
		ar[1] = "Ramesh";
		ar[2] = "Mahesh";
		ar[3] = "Suresh";
		ar[4] = "Rahul";
		
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		System.out.println("----Output when use loop----");
		
		for (int i=0; i<=4;i++) 
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("-----Output in loop in differnt way---");
		
		for (int i=0; i<=ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
				
	}
}
