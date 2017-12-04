package Testat_22;

public class Potenz 
{
	
	
	public Potenz()
	{ }
	
	public static int power(int a, int n)
	{
		if (n < 0)
		{
			throw new RuntimeException();
		}
		else if (n == 0)
		{
			return 1;
		}
		else if (a == 0)
		{
			return 0;
		}
		else
		{
			return a * power(a, n - 1);
		}
	}

	public static void main(String[] args) 
	{
		Potenz object = new Potenz();
		
		System.out.println(object.power(0, 2));
		System.out.println(object.power(1, 1));
		System.out.println(object.power(2, 2));
		//System.out.println(object.power(2, -4));

	}

}
