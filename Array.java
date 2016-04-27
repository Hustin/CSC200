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
		
		
		for(int i = 0; i<num.length -1;i++)
		{
			for(int j = i+1; j<num.length ;j++)
			{
				if(num[i] > num[j])
				{
					double g = num[i];
					num[i] = num[j];
					num[j] = g;
				}
			}
		}
		return num;
	}
}