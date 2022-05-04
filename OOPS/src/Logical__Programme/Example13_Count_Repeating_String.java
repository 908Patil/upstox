package Logical__Programme;

import java.util.HashMap;
import java.util.Set;

public class Example13_Count_Repeating_String 
{

	public static void main(String[] args) 
	{
		String s1 = "Welcome to UK Welcome";
       String ar [] = s1.split(" ");
       
       HashMap<String,Integer>mp = new  HashMap<String,Integer>();
       
       for(int i=0; i<=ar.length-1; i++) 
       {
      	String s2 = ar[i];
      	 if(mp.containsKey(s2)) 
      	 {
      		mp.put(s2, mp.get(s2)+1);
      	 }
      	 
      	 else 
      	 {
      		 mp.put(s2, 1);
      	 }
      	 
       }
       
       Set<String> keys = mp.keySet();
       
       for(String key:keys) 
       {
      	 System.out.println(key + ":  "+mp.get(key));
      	 
       }
		
	}	
	
	
}
