package week1.day2;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main(String[] args) 
	{
		int num[]= {10,40,20,50,30};
		
		Arrays.sort(num);
int len= num.length;
System.out.println("Length of the Array=" + len);
System.out.println("Second Largest Array=" +num[len-2]);

	}

}
