package Testat_21;
/*
 * Paetzel, Lukas
 * version 1.0.0
 */

//Klasse
public class Period 
{
	//Deklaration der Variablen
	private int minuten, sekunden;
	
	//Konstruktor
	public Period(int minuten)
	{
		if (minuten >= 0)
		{
			this.minuten = minuten;
		}
		else
		{
			this.minuten = 0;
		}
		
	}
	
	public Period(int minuten, int sekunden)
	{
		if (minuten >= 0)
		{
			this.minuten = minuten;
		}
		else
		{
			this.minuten = 0;
		}
		
		if (sekunden >= 0)
		{
			this.sekunden = sekunden;
		}
		else
		{
			this.sekunden = 0;
		}
		
	}

/*
 * ----------------------------------------------------------------------------------------------------------------------------------------	
 */	
	
	public int getMinuten()
	{
		return minuten;
	}
	
	public int getSekunden()
	{
		return sekunden;
	}
	
/*
 * ----------------------------------------------------------------------------------------------------------------------------------------
 */	
	
	public static void main(String[] args) 
	{
		Period objekt = new Period(-12);
		Period objekt2 = new Period(12, 34);
		
			System.out.println(objekt.getMinuten());
			System.out.println(objekt2.getMinuten() + ":" + objekt.getSekunden());

	}

}
