public class CalcDriver
{
	public static void main(String[] args)
	{ 
		double [] num = new double [5];
		num[0] = 2.0;
		num[1] = 4.0;
		num[2] = 5.0;
		num[3] = 7.0;
		num[4] = 8.0;
		
		
		
		
		System.out.println("The sum of the array is: " + Calc.getSum(num));
		System.out.println("The product of the array is: " + Calc.getProduct(num));
		System.out.println("The average of the array is: " + Calc.getAverage(num));
		double [] fact = Calc.getFactorial(num);
		for(int i = 0;i<fact.length;i++)
		{
			System.out.println("The factorial of all numbers of the array is: " + fact[i]);
		}
		
		System.out.println("The sum of 2 + 2 is: " + Calc.getSum(2.0,2.0));
		System.out.println("The product 2 * 3 is: " + Calc.getProduct(2.0,3.0));
		System.out.println("The average of 3 and 4 is: " + Calc.getAverage(3.0,4.0));
		System.out.println("The  factorial of 6 is: " + Calc.getFactorial(6));
		
		
	}
}