package Logical__Programme;

public class Example8_Reverse_Number 
{

	public static void main(String[] args) 
	{
		int OrgNum = 123456;
		String org = Integer.toString(OrgNum);
		String rev = " ";
		
		for(int i=org.length()-1; i>=0; i--) 
		{
			rev= rev+org.charAt(i);
			
		}
		
		int revNum = Integer.parseInt(rev);
		
		System.out.println(revNum);
		
		
		
		
		
		
	}
}