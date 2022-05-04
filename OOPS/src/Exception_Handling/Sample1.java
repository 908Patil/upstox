package Exception_Handling;

public class Sample1 
{
	
	public static void main(String[] args)
	{
		
	
   int a = 10;
   int b = 20;
   int c = 0;
   
   try 
   {
	   c=a/b;
	   
   }
   catch(Exception e)
   {
	   e.printStackTrace();
   }
   
   System.out.println(c);
   System.out.println("Gaurav Jalindar patil");
   
	}
   
}