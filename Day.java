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
	static String dayS = "";
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
			dayS = "Monday";
			break;
		case TUE:
			dayS = "Tuesday";
			break;
		case WED:
			dayS = "Wednsday";
			break;
		case THU:
			dayS = "Thursday";
			break;
		case FRI:
			dayS =  "Friday";
			break;
		case SAT:
			dayS = "Saturday";
			break;
		case SUN:
			dayS = "Sunday";
			break;
		}
		return dayS;
	}
	public static String getNextDay()
	{
		switch(day)
		{
		case MON:
			dayS =  "Tuesday";
			break;
		case TUE:
			dayS =  "Wednsday";
			break;
		case WED:
			dayS =  "Thursday";
			break;
		case THU:
			dayS =  "Friday";
			break;
		case FRI:
			dayS =  "Saturday";
			break;
		case SAT:
			dayS =  "Sunday";
			break;
		case SUN:
			dayS =  "Monday";
			break;
		}
		return dayS;
	}
	public static String getPreviousDay()
	{
		switch(day)
		{
		case MON:
			dayS =  "Sunday";
			break;
		case TUE:
			dayS = "Monday";
			break;
		case WED:
			dayS = "Tuesday";
			break;
		case THU:
			dayS =  "Wednsday";
			break;
		case FRI:
			dayS =  "Thursday";
			break;
		case SAT:
			dayS =  "Friday";
			break;
		case SUN:
			dayS =  "Saturday";
			break;
		}
		return dayS;
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
			dayS = "Monday";
			break;
		case 1:
			dayS = "Tuesday";
			break;
		case 2:
			dayS = "Wednsday";
			break;
		case 3:
			dayS = "Thursday";
			break;
		case 4:
			dayS = "Friday";
			break;
		case 5:
			dayS = "Saturday";
			break;
		case 6:
			dayS = "Sunday";
			break;
		}
		return dayS;
	}
}