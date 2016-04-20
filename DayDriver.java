public class DayDriver
{
	public static void main(String[] args)
	{
		Day test = new Day();
		test.setDay();
		System.out.println("Day of the week: " + test.getDay())
		test.getNextDay();
		test.getPreviousDay();
		test.getDayAt(3);
	}
}