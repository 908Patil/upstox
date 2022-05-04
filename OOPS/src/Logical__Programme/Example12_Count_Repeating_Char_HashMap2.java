package Logical__Programme;

import java.util.HashMap;
import java.util.Set;

public class Example12_Count_Repeating_Char_HashMap2 
{
 public static void main(String[] args) 
 {

	 String s1 = "abcabcad";
     
     HashMap<Character,Integer>mp = new  HashMap<Character,Integer>();
     
     for(int i=0; i<=s1.length()-1; i++) 
     {
    	 char charValue = s1.charAt(i);
    	 if(mp.containsKey(charValue)) 
    	 {
    		 mp.put(charValue, mp.get(charValue)+1);
    	 }
    	 
    	 else 
    	 {
    		 mp.put(charValue,1);
    		 
    	 }
    	 
     }
     
     Set<Character> keys = mp.keySet();
     
     for(Character key:keys) 
     {
    	 System.out.println(key + ":  "+mp.get(key));
    	 
     }
	 
}
	
	
}
