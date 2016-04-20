/* Justin Rhodes
  4/20/2016
   A. Set the day.  

B. Print the day.  

C. Return the day.  

D. Return the next day.  

E. Return the previous day.  

F. Calculate and return the day by adding certain days to the current day.

For example, if the current day is Monday and we add four days, the day to be returned is Friday. Similarly, if today is Tuesday and we add 13 days, the day to be returned is Monday.  

G. Add the appropriate constructors. */

import javax.swing.JOptionPane;
public class Day
{
	public enum daysWeek {MON,TUE,WED,THU,FRI,SAT,SUN}
	static daysWeek[] choices = {daysWeek.MON,daysWeek.TUE,daysWeek.WED,daysWeek.THU,daysWeek.FRI,daysWeek.SAT,daysWeek.SUN};
	static daysWeek day;
	static int dayN;
	static daysWeek input = null; 
	static String day = "";
	public Day()
	{
		this.day = daysWeek.MON;
	}
	public static void setDay()
	{
	day = (daysWeek)JOptionPane.showInputDialog(null,"Select the day", "Days", JOptionPane.INFORMATION_MESSAGE ,null, choices, choices[0]);
	}
	public static String getDay()
	{
		switch(day)
		{
		case MON:
			day = "Monday";
			break;
		case TUE:
			day = "Tuesday";
			break;
		case WED:
			day = "Wednsday";
			break;
		case THU:
			day = "Thursday";
			break;
		case FRI:
			day =  "Friday";
			break;
		case SAT:
			day = "Saturday";
			break;
		case SUN:
			day = "Sunday";
			break;
		}
		return day;
	}
	public static String getNextDay()
	{
		switch(day)
		{
		case MON:
			day =  "Tuesday";
			break;
		case TUE:
			day =  "Wednsday";
			break;
		case WED:
			day =  "Thursday";
			break;
		case THU:
			day =  "Friday";
			break;
		case FRI:
			day =  "Saturday";
			break;
		case SAT:
			day =  "Sunday";
			break;
		case SUN:
			day =  "Monday";
			break;
		}
		return " ";
	}
	public static String getPreviousDay()
	{
		switch(day)
		{
		case MON:
			day =  "Sunday";
			break;
		case TUE:
			day = "Monday";
			break;
		case WED:
			day = "Tuesday";
			break;
		case THU:
			day =  "Wednsday";
			break;
		case FRI:
			day =  "Thursday";
			break;
		case SAT:
			day =  "Friday";
			break;
		case SUN:
			day =  "Saturday";
			break;
		}
		return " ";
	}
	public static String getDayAt(int add)
	{
		switch(day)
		{
		case MON:
			dayN= 0;
			break;
		case TUE:
			dayN= 1;
			break;
		case WED:
			dayN= 2;
			break;
		case THU:
			dayN= 3;
			break;
		case FRI:
			dayN= 4;
			break;
		case SAT:
			dayN= 5;
			break;
		case SUN:
			dayN= 6;
			break;
		}
		dayN = (dayN + add)%7;
	
		switch(dayN)
		{
		case 0:
			return "Monday";
			break;
		case 1:
			return "Tuesday";
			break;
		case 2:
			return "Wednsday";
			break;
		case 3:
			return "Thursday";
			break;
		case 4:
			return "Friday";
			break;
		case 5:
			return "Saturday";
			break;
		case 6:
			return "Sunday";
			break;
		}
		return " ";
	}
}