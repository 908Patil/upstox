package Constructor;

public class Loop1 
{
public static void main(String[] args) 
{
	J(55);
	J(30);
	J(58);
	J(20);
	J(15);
	J(87);
	J(22);
	J(15);
	
}
	
public static void J(int marks) 
{

	if (marks>=35) 
	{
		System.out.println("Marks :"+marks);
		System.out.println("-----Congratulation------");
		System.out.println("You are Pass in Exam");
		
	}
	else
	{
		System.out.println("Marks :"+marks);
		System.out.println("------Next time do better-----");
		System.out.println("You are Fail in exam");
	}

}
	
}

