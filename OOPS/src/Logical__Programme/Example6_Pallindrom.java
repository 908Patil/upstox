package Logical__Programme;

public class Example6_Pallindrom 
{

	
	public static void main(String[] args) 
	{
		String org = "India";
		String rev = "";
		
		for(int i = org.length()-1; i>=0; i--) 
		{
			rev = rev+org.charAt(i);
		}
		
		System.out.println("Original String is: "+ org);
		
		System.out.println("Reverse String is: "+ rev);
		
		if(org.equals(rev)) 
		{
			System.out.println("Given String is Pallindrome");
		}
		else 
		{
			System.out.println("Given String is Not Pallindrome");
		}
		
		
	}
}
