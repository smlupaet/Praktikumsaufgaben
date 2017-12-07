package Testat_22;

public class HarmonischeZahl 
{
	private double result = 0;
	
	public HarmonischeZahl()
	{ }
	
	
	public static double harm(int n)
	{		
		if (n < 1)
		{
			throw new RuntimeException();
		}
		else if(n == 1)
		{
			return 1.0;
		}
		else
		{
			return 1.0 / n + harm(n - 1); // double value wichtig
		}
	}
	

	public static void main(String[] args) 
	{		
		HarmonischeZahl object = new HarmonischeZahl();
		
		//System.out.println("value: -2 " + object.harm(-2));
		System.out.println("value: 1 --> " + object.harm(1));
		System.out.println("value: 5 --> " + object.harm(5));
	}

}
