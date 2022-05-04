package Array;

import java.util.Arrays;

public class Integer_Example
{
  public static void main(String[] args) 
  {
	
	  int [] s1 = new int[5];
	  s1[0] = 400;
	  s1[1] = 500;
	  s1[2] = 200;
	  s1[3] = 300;
	  s1[4] = 100;
	  
	  System.out.println(s1 [4]);
	  
	  
	  System.out.println("---------Type 1---------");
	  
	  for (int i=0; i<=4; i++) 
	  {
		  System.out.println(s1[i]);
	  }
	  
	  System.out.println("--------Type 2------");
	  
	  for (int i=0; i<=s1.length-1; i++) 
	  {
		  System.out.println(s1[i]);
	  }
	  
	  
	  System.out.println("-----Asending Sorting------");
	  
	  Arrays.sort(s1);
	  
	  for (int i=0; i<=4; i++) 
	  {
		  System.out.println(s1[i]);
	  }
	  
	  System.out.println("-----Desending Sorting------");
	  Arrays.sort(s1);
	  
	  for (int i=4; i>=0; i--) 
	  {
		  System.out.println(s1[i]);
	  }
	  
	  
}
	
	
}
