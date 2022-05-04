package Array;

import java.util.Arrays;

public class Example2 
{
public static void main(String[] args) 
{
	
	
	int [] ar = {400,300,100,500,200};
	
	System.out.println(ar[2]);
	System.out.println(ar.length);
	
	System.out.println("-------------");
	
	for (int i=0; i<=4; i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("--------sorting------");
	Arrays.sort(ar);
	
	for (int i=0; i<=4; i++) 
	{
		System.out.println(ar[i]);
	}
}
}
