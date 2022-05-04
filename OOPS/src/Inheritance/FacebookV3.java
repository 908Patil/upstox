package Inheritance;

public class FacebookV3 extends FacebookV2
{

	public void VideoCalling() 
	{
		System.out.println("VideoCalling");
	}
	
	public static void main(String[] args) 
	{
		FacebookV3 V3 = new FacebookV3();
		V3.TextMSG();
		V3.AudioCalling();
		V3.VideoCalling();
	}
	
}
