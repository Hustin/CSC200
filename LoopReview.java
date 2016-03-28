public class LoopReview
{
	public static void main(String[] args)
	{
		int y = 1;
		int x = 2;
		//prints first 100 odd num
		for(int i = 0; i<=201; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}
		//prints first 100 even num
		do
		{
			System.out.println(x);
			x = x+2;
		}while(x<=202);
		//prints a diamond made out of "*"
		while(y<6)
		{
			switch(y)
			{
				case 1:
					System.out.println("  *");
					break;
				case 2:
					System.out.println(" ***");
					break;
				case 3:
					System.out.println("*****");
					break;
				case 4:
					System.out.println(" ***");
					break;
				case 5:
					System.out.println("  *");
					break;
			}
		y++;	
		}
	}
}