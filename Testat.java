package Testat_22;

public class Testat 
{
	
	static int[] arr = {2, 4, 6, 8, 6, 4, 2};
	
	public Testat()
	{ }
	
	public static int testat(int[] arr, int i)
	{
		if (i < 0 || i >= arr.length) throw new RuntimeException();
		
		if(i == 0 && arr[0] > 0)
		{
			return arr[0];
		}
		else
		{
			if (arr[i] > 0)
			{
				return arr[i] + testat(arr, i - 1);
			}
			else
			{
				return -1;
			}
		}
	}
	
/*
 * ----------------------------------------------------------------------------------------------------------------------------------------	
 */
	
	public static int countZeros(int[] arr, int i)
	{		
		if (i < 0 || i >= arr.length) //throw new RuntimeException();
		{
			return 0;
		}
		
		if (i == 0)
		{
			if (arr[0] == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		if (arr[i] == 0)
		{
			return 1 + countZeros(arr, i - 1);
		}
		else 
		{
			return countZeros(arr, i - 1);
		}		
	}

	
/*
 * ----------------------------------------------------------------------------------------------------------------------------------------	
 */	
	
	public static void main(String[] args) 
	{
		Testat object = new Testat();
		
		System.out.println(object.testat(arr, 6));
		System.out.println();
		System.out.println(object.countZeros(arr, 6));

	}

}
