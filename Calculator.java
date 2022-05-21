package week1.day2;

public class Calculator {

	
	public int add(int a,int b) 
	{
				return a+b;
	}
	
	public double sub(double a,double b) 
	{
				double diff=a-b;
				return diff;
	}
	
	public double mul(double a,double b) 
	{
				double result=a*b;
				return result;
	}
	
	public int div(int a,int b) 
	{
				int div=a-b;
				return div;
	}
	
	public static void main(String[] args) 
	
	{
		Calculator calc = new Calculator();
		System.out.println("Addition of two numbers: " +calc.add(4, 2));
		System.out.println("Subtraction of two numbers: " +calc.sub(678.939, 878.82));
		System.out.println("Multiplication of two numbers: " +calc.mul(233.83, 3432.83));
		System.out.println("Division of two numbers: " +calc.div(8, 3));
		
	}

}
