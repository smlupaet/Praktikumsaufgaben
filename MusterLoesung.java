package Testat_12;

public class MusterLoesung 
{
	public static void main(String[] args) 
	{		
		int[][] arr = { {1,2,3}, {3,4,5}, {6,7,8} };
		int[][] arr2 = { {1,2}, {3} };
	}
		
		//call by value --> So arbeitet Java
		/*
		 * int k = 3;
		 * test(3);
		 * Sysout(k);
		 * 
		 * public static void test(int k)
		 * {
		 * 	k = 5;
		 * }
		 */
		
		
		
		
	public static boolean isSquare(int[][] arr5) 
	{
		int cache = arr5.length;
		
			for (int i = 0; i < arr5.length; i++)
			{
				if (arr5[i].length != cache)
				{
					return false;
				}				
			}
			
		return true;
		
	}
		
		
	public static void scalarMult(int[][] arr, int k)
	{			
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] *= k;
			}
		}
	}
		
	public static int[]extractDiagonal(int[][] arr) 
	{			
		int [] diag = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++)
		{
			diag[i] = arr[i][i];
		}
		return diag;			
	}
}



