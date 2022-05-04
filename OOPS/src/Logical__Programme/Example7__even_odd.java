package Logical__Programme;

import java.util.Scanner;

public class Example7__even_odd 
{

	
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no : ");
		
		int num = scan.nextInt();
		
		
		if(num % 2 == 0) 
		{
			
			System.out.println("Given number is even");
		}
		
		else 
		{
			System.out.println("Given number is odd");
		}
		
	}
}
