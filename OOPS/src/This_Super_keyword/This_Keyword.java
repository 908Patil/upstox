package This_Super_keyword;

public class This_Keyword 
{
	
	 int a= 10;
	 int b= 20;


  public void m1 () 
  {
	  int a = 30;
	  int b = 40;
	  
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(this.a);
	  System.out.println(this.b);
	
  }
  
  public static void main(String[] args) 
  {
	
	  This_Keyword d1 =new This_Keyword();
	  d1.m1();
}
}