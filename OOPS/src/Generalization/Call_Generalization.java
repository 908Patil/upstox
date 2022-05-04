package Generalization;

public class Call_Generalization 
{

	public static void main(String[] args) 
	{
		
		System.out.println("------Feature of JIO---");
		JIO S1 = new JIO();
		S1.SMS();
		S1.Internet();
		S1.newFeatureA();
		
		System.out.println("------Feature of Airtel---");
		Airtel S2 = new Airtel();
		S2.SMS();
		S2.Internet();
		S2.newFeatureB();
		
		
		System.out.println("------Feature of VI---");
		VI S3 = new VI();
		S3.SMS();
		S3.Internet();
		S3.newFeatureC();
	}
	
	
}
