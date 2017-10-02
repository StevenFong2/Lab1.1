// Steven Fong Period 2
public class ControlStructures 
{
	public static void main(String[] args)
	{
		primePrinter();
		fooBarBaz();
	}
	public static void primePrinter()
	{
		int num = 2;
		int counter = 0;
		while(counter < 50)
		{
			boolean result = isPrime(num);
			if(result == true)
			{
				System.out.print(num + " ");
				counter++;
				num++;
				if(counter % 10 == 0)
				{
					System.out.println();
				}
			}
			else
			{
				num++;
			}
		}
	}
	public static boolean isPrime(int num)
	{
		for(int i = 2; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true; 
	}
	public static void fooBarBaz()
	{
		int a = 3;
		String A = "foo";
		int b = 7;
		String B = "Bar";
		int c = 10;
		String C = "Baz";
		for(int i = 1; i <= 500; i++)
		{
			if(i % a == 0 && i % b == 0 && i % c == 0)
			{
				System.out.println(A + B + C);
			}
			else if(i % b == 0 && i % c == 0)
			{
				System.out.println(B + C);
			}
			else if(i % a == 0 && i % c == 0)
			{
				System.out.println(A + C);
			}
			else if(i % a == 0 && i % b == 0)
			{
				System.out.println(A + B);
			}
			else if(i % c == 0)
			{
				System.out.println(C);
			}
			else if(i % b == 0)
			{
				System.out.println(B);
			}
			else if(i % a == 0)
			{
				System.out.println(A);
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
