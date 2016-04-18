public class Calc
{
	private static double [] fact = new double [5];
	
	public static double getAverage(double [] num)
	{
		double sum = 0.0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		return (sum/num.length);
	}
	public static double getAverage(double first, double second)
	{
		return (first+second)/2;
	}
	public static double getSum(double [] num)
	{
		double sum = 0.0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		return (sum);
	}
	public static double getSum(double first, double second)
	{
		return(first + second);
	}
	public static double getProduct(double [] num)
	{
		double product = 1.0;
		for(int i=0;i<num.length;i++)
		{
			product = product*num[i];
		}
		return (product);
	}
	public static double getProduct(double first,double second)
	{
		return(first*second);
	}
	public static double [] getFactorial(double [] num)
	{
		int x;
		int i;
		double factorial = 1.0;
		for(i=0;i<num.length;i++)
		{
			factorial = 1.0;
			for(x=1; x<=num[i];x++) 
			{
				factorial = factorial*x;
				
			}
			fact[i] = factorial;	
		}
		return fact;
	}

	public static double getFactorial(double num)
	{
		double factorial = 1.0;
		for(int i=1;i<=num;i++)
		{
			factorial = factorial*i;
		}
		return (factorial);
	}
}