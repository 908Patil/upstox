package Array;

import java.util.Arrays;

public class Example3 
{

	public static void main(String[] args) 
	{
		
		String [] ar = {"Rahul" , "Gaurav" , "Ranjeet" , "Ganesh", "Mahesh"};
		
		System.out.println(ar[3]);
		
	     System.out.println(ar.length);
	     
	     System.out.println("-----loop----------");
	     for (int i=0; i<=4; i++) 
	     {
	    	 System.out.println(ar[i]);
	     }
	     
	     System.out.println("-----Sorting=-------");
	     
	     Arrays.sort(ar);
	     for (int i=0; i<=4; i++) 
	     {
	    	 System.out.println(ar[i]);
	     }
	}
}
