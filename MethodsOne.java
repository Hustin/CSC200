import java.util.Scanner;
public class MethodsOne
{
	static double x,y,z;
	static double answer = 0;
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
		answer = Math.pow(x,10);
		 System.out.println(answer);
	}
	public static void f(double x, double y)
	{
		answer = x +y;
		System.out.println(answer);
	}
	public static void g(double x, double y, double z)
	{
		answer = Math.sqrt(x) + Math.abs(y) + Math.pow(z,y);
		System.out.println(answer);
	}
}