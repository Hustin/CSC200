import java.util.Scanner;

public class MethodsTwo
{

	static double x,y,z;
	static double answer = 0;
	static double power = 0;
	static double sqrt = 1;
	static double count = 0;
	static double absl = 0;
	
	public static void main(String[] args)
	{
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is x?");
		x = in.nextDouble();
		System.out.println("What is y?");
		y = in.nextDouble();
		System.out.println("What is z?");
		z = in.nextDouble();
		h(x);
		f(x,y);
		g(x,y,z);
		
		
		
	}
	public static void h(double x)
	{
		answer = pow(x,10);
		 System.out.println(answer);
	}
	public static void f(double x, double y)
	{
		answer = x+y;
		System.out.println(answer);
	}
	public static void g(double x, double y, double z)
	{
		answer = sqrt(x) + abs(y) + pow(z,y);
		System.out.println(answer);
	}
	public static double pow(double x, double y)
	{
		power = x;
		y=y-1;
		if(y == 0)
		{
			return 1;
		}
		else
		{
			while(y>0)
			{
				power=power*x;
				y--;
			}
		return power;
		}
	}
	public static double sqrt(double x)
	{
		if(x<=0)
		{
			return 0.0;
		}
		else
		{
			while(sqrt!=x)
			{
				count=count+.1;
				sqrt = sqrt*count;
			}
		return count;
		}
	}
	public static double abs(double x)
	{
		if(x<0)
		{
			absl=0-x;
			return absl;
		}
		else
		{
			absl=x;
			return absl;
		}
	}
}

