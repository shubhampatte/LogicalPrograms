public class ReverseNumber
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Reverse Number Program");
		
		int num = Integer.parseInt(args[0]);
		
		System.out.println(" Enter the Number :  " +num);

		
		int result = 0;
		int rem;
		
		while (num > 0 )
		{
			rem = num % 10;
			num = num / 10;
			result = result * 10 + rem;
		}		
				
		System.out.println(" The Reverse of the entered Number is : " +result);
	}

}
