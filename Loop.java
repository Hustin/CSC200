public class Loop
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 0;
		
		while(a<100)
		{
			System.out.println((a+1) + "Hello");
			a++;
		}
		
		do
		{
			System.out.println((b+1)+"World");
			b++;
		}while(b<100);
		
		for(int c = 0;c<100;c++)
		{
			System.out.println((c+1)+"!");
		}
	}
}