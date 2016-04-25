public class DayDriver
{
	public static void main(String[] args)
	{
		int x = 3;
		Day test = new Day();
		test.setDay();
		System.out.println("Day of the week: " + test.getDay());
		System.out.println("The next day is " + test.getNextDay());
		System.out.println("The previous day is " +test.getPreviousDay());
		System.out.println("The day plus "+ x + " days is " +test.getDayAt(x));
	}
}