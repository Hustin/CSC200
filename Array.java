public class Array
{
	static double [] numbers = new double [10];
	public Array()
	{
	
		
		
	}
	public static double [] setArray(double [] num)
	{
		for(int x = 0; x<10; x++)
		{
			numbers[x] = num[x]; 
		}
			return numbers;
	}
	
	public static double [] organize(double [] num)
	{
		for(int x = 0; x<10; x++)
		{
			numbers[x] = num[x]; 
		}
		double min = num[0];
		int minInd = 0;
		int minOldInd = 0;
		for(int i = 0; i<numbers.length;i++)
		{
			if(num[i]<min)
			{
				min = num[i];
				minInd = i;
				numbers[minInd]=numbers[minOldInd];
				numbers[minOldInd] = min;				
			}
		}
		return numbers;
	}
}