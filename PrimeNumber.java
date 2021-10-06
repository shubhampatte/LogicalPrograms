public class PrimeNumber
{
	public static void main(String args[])
	{
		
		System.out.println(" PRIME NUMBER PROGRAM ");
		
		int number = Integer.parseInt(args[0]);
		
		System.out.println(" Enter the Number :  " +number);

		
		int flag = 0; 
		int divide = number/2;
		
		if (number ==0 || number == 1)
		{
			System.out.println(number+ " is not a Prime Number");
		}		
		else
		{			
			for (int i=2; i<=divide; i++)
			{
				if (number % i == 0)
				{
				System.out.println(number+ " is not a Prime Number");
				flag = 1;
				break;	
				}
			}
		}		
		
		if (flag == 0)
		{
			System.out.println(number+ " is a Prime Number ");
		}
		
			
		
	}

}
