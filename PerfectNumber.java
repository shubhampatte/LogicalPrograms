public class PerfectNumber
{
	public static void main(String args[])
	{
		
		System.out.println("PERFECT NUMBER PROGRAM");
		
		int number = Integer.parseInt(args[0]);
		
		System.out.println("Enter the Number :  " +number);

		
		int result = 0;

		for (int i=1; i<number; i++)
		{
			if (number % i == 0)
			{
				result += i;	
			}
		}	
		
		if (result == number)
		{
			System.out.println(number+ " is a Perfect Number ");
		}
		else
		{	
			System.out.println(number+ " is not a Perfect Number");	
		}
	}

}
