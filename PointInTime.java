package Testat_21;

public class PointInTime 
{
	private int year, day, hour;
	
	public PointInTime(int year, int day, int hour)
	{
		if (year > 999 && year < 10000)
		{
			this.year = year;
		}
		if (day > 1 && day < 1)
		{
			this.day = day;			
		}
		if (hour > 0 && hour < 23)
		{
			this.hour = hour;
		}
	}
	
	public String toString()
	{
		return this.year + "/" + this.day + "/" + this.hour;
	}
	
	public PointInTime clone()
	{
		PointInTime cloned = new PointInTime(2017, 21, 12);
		return cloned;
	}
	
	public void change(int addHours)
	{
		if (addHours < 0)
		{
			this.hour = hour;
		}
		else
		{
			this.hour = addHours;
		}
	}
	
	

	public static void main(String[] args) 
	{		
		PointInTime object1 = new PointInTime(2017, 22, 12);
		PointInTime object2 = new PointInTime(2017, 22, 12);
		PointInTime object3 = new PointInTime(2017, 22, 12);
	}

}
