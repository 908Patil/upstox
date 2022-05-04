package Logical__Programme;

public class Example9_Amstrong_Number 
{
 public static void main(String[] args) 
 {
         int orgNum=124;
         int sum = 0;
         
         for(int i= orgNum; i>0; i=i/10) 
         {
        	 int rem = i%10;
        	 sum = sum +(rem*rem*rem);	 
         }
         
         if(orgNum==sum) 
         {
        	 System.out.println("Given Number is "+orgNum+" is an Armstrong Number" );
        	 
        	 
         }
         
         else 
         {
        	 
        	 System.out.println("Given Number is " +orgNum+ " is not an Armstrong Number" );
         }
	 
	 
}
	
	
}
