package Testat_21;
/*
 * Paetzel, Lukas
 * version 1.0.0
 */


//Klasse
public class Box 
{
	//Deklaration der Variablen
	private int width, height, depth;
	
	
	//Konstruktor
	public Box (int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

/*
 * ----------------------------------------------------------------------------------------------------------------------------------------
 */
	//Getter - Methoden
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getDepth()
	{
		return depth;
	}
	
/*
 * ----------------------------------------------------------------------------------------------------------------------------------------
 */
	//Berechnende - Methoden
	
	public int getVolumeSize()
	{
		return width * height * depth;
	}
	
	public int getAreaSize()
	{
		return 2 * width * height + 2 * width * depth + 2 * height * depth;
	}
	
	public int getEdgesLength()
	{
		return (4 * width) +  (4 * depth) + (4 * height);
	}

/*
 * ----------------------------------------------------------------------------------------------------------------------------------------
 */
	
	public boolean isCube()
	{
		if (width == height & width == depth)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

/*
 * ----------------------------------------------------------------------------------------------------------------------------------------
 */
	
	public static int compareTo(Box f)
	{
		int result = 0;
		Box objekt2 = new Box(10, 5, 25);
		
		System.out.print("Box: --> " + objekt2.getVolumeSize() + ", ");
		System.out.print("f: --> " + f.getVolumeSize() + "  x: ");
		
		
		if (objekt2.getVolumeSize() > f.getVolumeSize())
		{
			result = 1;
		}
		else if (objekt2.getVolumeSize() < f.getVolumeSize())
		{
			result = -1;
		}
		else result = 0;
		
		return result;
		
	}
	
/*
 * ---------------------------------------------------------------------------------------------------------------------------------------
 */
	
//	public static boolean encloses(Box f)
//	{
//		Box objekt = new Box(11, 31, 21);
//		
//		if (f.getVolumeSize() > objekt.getVolumeSize())
//		{
//			return false;
//		}
//		else
//		{
//			return true;
//		}
//	}
	
	public static boolean encloses(Box f)
	{
		Box objekt = new Box(10, 10, 10);
		
		return false;
		
		
	}
	
/*
 * ---------------------------------------------------------------------------------------------------------------------------------------
 */
	
	
	public static void main(String[] args) 
	{
		Box objekt = new Box(10, 5, 25);
		Box f = new Box(10, 25, 5);
		
		Box bsp = new Box(30, 20, 10);
		
			System.out.print("VolumeSize: ");
			System.out.print(objekt.getVolumeSize());
		
			System.out.println("");
			System.out.println("");
		
			System.out.print("AreaSize: ");
			System.out.print(objekt.getAreaSize());
		
			System.out.println("");
			System.out.println("");
		
			System.out.print("EdgesLength: ");
			System.out.print(objekt.getEdgesLength());
			
			System.out.println("");
			System.out.println("");
		
			System.out.print("isCube: ");
			System.out.print(objekt.isCube());
		
			System.out.println("");
			System.out.println("");
		
			System.out.print("CompareTo: ");
			System.out.print(compareTo(f));
		
			System.out.println("");
			System.out.println("");
		
			System.out.print("encloses: ");
			System.out.print(encloses(bsp));
				
	}

}
