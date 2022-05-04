package String_class;

public class Type_of_String 
{
public static void main(String[] args) 
{
	String s1 = "velocity";
	String s2 = "VELOCITY";
	String s3 = "city";
	String s4 = " ";
	String s5 = "abcabcab";
	String s6 = "classes";
	String s7 = "java classes";
	String s8 = "abc xyz abc1";
	
	
	System.out.println(s5.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.contains(s3));
	System.out.println(s1.isEmpty());
	System.out.println(s1.charAt(7));
	System.out.println(s5.indexOf('b'));
	System.out.println(s5.lastIndexOf('c'));
	
	System.out.println("--------------------------");
	
	System.out.println(s1+s6);
	System.out.println(s1.substring(4,7));
	System.out.println(s1.substring(7));
	System.out.println(s1.startsWith("ve"));
	System.out.println(s1.endsWith("city"));
	System.out.println(s1.concat(s6));
	System.out.println(s7.replace("java", "selenium"));
	
	
	System.out.println("------------------------");
	
	String [] ar = s8.split("");
	System.out.println(ar.length);
	for (int i =0; i<=ar.length; i++) 
	{
		System.out.print(ar[i]);
	}
}
}
