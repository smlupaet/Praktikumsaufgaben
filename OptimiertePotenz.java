package Testat_22;

public class OptimiertePotenz 
{
	
	public OptimiertePotenz()
	{ }
	
	
	public static int powerPlus(int a, int n)
	{
		if (n < 0) throw new RuntimeException();
		
		if (a == 0)
		{
			return 0;
		}		
		else 
		{
			if (n == 0)
			{
				return 1;
			}
			else
            {
                int val = 0;    // wichtig!
                
                if (n % 2 == 0)
                {
                    val = powerPlus(a,n/2);
                    return val * val;
                }
                else
                {
                    val = powerPlus(a, (n - 1) / 2);
                    return a * val * val;
                }                
            }
		}
		
	}

	public static void main(String[] args) 
	{
		OptimiertePotenz object = new OptimiertePotenz();
		
		System.out.println(object.powerPlus(2, 6));
	}
}
