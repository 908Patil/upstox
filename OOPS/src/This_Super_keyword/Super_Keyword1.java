package This_Super_keyword;

public class Super_Keyword1 extends Super_keyword2  
{

       int a= 10;
       static int b = 20;
	
	
	public  void m1() 
	{
		 int a =50;
		 System.out.println(a);
		 
		 System.out.println(this.a);
		 System.out.println(super.a);
		
		
		
	}
	public static void main(String[] args) 
	{

		Super_Keyword1 s1 = new Super_Keyword1();
		s1.m1();
	}
}
