public class FibonacciSeries
{
	public static void main(String args[])
	{
		int count = Integer.parseInt(args[0]);
		System.out.println("Enter the number to find FibonacciSeries : " +count);
		
		int num1 = 0 , num2 = 1 ;
		int num3;
		
		System.out.print(num1+ " " +num2);
		
		for (int i = 2; i < count; i++) 
		{
			num3 = num1+num2;
			System.out.print(" "+num3);
			
			num1=num2;
			num2=num3;
		}
			
	}

}
