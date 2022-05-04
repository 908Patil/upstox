package Logical__Programme;

public class Example_Factorial 
{

	public static void main(String[] args) 
	{
	
		int num = 3;
		 int fact = 1;
		 
		 for(int i =num; i>=1; i--) 
		 {
			 fact = fact*i;
			 
		 }
		 
		 System.out.println("Factorial of given number is: " +fact);
	}
}
