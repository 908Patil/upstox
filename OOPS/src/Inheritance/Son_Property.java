package Inheritance;

public class Son_Property extends Father_Property

{
public void m1() 
{
  System.out.println("New Car :Balleno");
  
  System.out.println("New bike : Duke");
  
}

public static void main(String[] args) 
{
	Son_Property j1 = new Son_Property();
	j1.m3();
	j1.m2();
	j1.m1();
	
	
}
	
}
