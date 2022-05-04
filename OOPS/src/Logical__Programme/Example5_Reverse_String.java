package Logical__Programme;

public class Example5_Reverse_String 
{

	
	public static void main(String[] args) 
	{
		
		
		String Original = "Gaurav";
		String Reverse = "";
		
		for(int i = Original.length()-1; i>=0; i--) 
		{
			Reverse = Reverse+Original.charAt(i);
		}
		
		System.out.println("Original String :" + Original);
		
		System.out.println("Reverse string :" + Reverse);
	}
}
