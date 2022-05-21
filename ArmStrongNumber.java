package week1.day2;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
		
		int input=153;
		int originalno=input;
		int output=0;
		
		// Expected output; (1*1*1) + (5*5*5) + (3*3*3) = 153
		
		while (input>0)
		{
			int rem=input%10;
			output= output+(rem*rem*rem);
			input=input/10;
			
		}
		
		System.out.println(output);
		
		if (originalno == output)
		{
			System.out.println("Armstrong Number");
			
		}
		
		else
		{
			System.out.println("Not an Armstrong Number");
			
		}

			
		

	}

}
