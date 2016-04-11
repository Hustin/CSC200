
public class Car
{
	private String color = "";
	private int horsePower = 0;
	private double engineSize = 0.0;
	private String make = "";
	
	public Car()
	{
		this.color = "white";
		this.horsePower = 250;
		this.engineSize = 4.0;
		this.make = "Toyota";
	}
	public Car(String colorIn, int horsePowerIn, double engineSizeIn, String makeIn)
	{
		this.color = colorIn;
		this.horsePower = horsePowerIn;
		this.engineSize = engineSizeIn;
		this.make = makeIn;
	}
	public void setColor(String colorIn)
	{
		this.color = colorIn;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setHorsePower(int horsePowerIn)
	{
		this.horsePower = horsePowerIn;
	}
	public double getHorsePower()
	{
		return this.horsePower;
	}
	public void setEngineSize(double engineSizeIn)
	{
		this.engineSize = engineSizeIn;
	}
	public double getEngineSize()
	{
		return this.engineSize;
	}
	public void setMake(String makeIn)
	{
		this.make = makeIn;
	}
	public String getMake()
	{
		return this.make;
	}
	public String toString()
	{
		return "Color: " + this.color + "\nHorse Power: " + this.horsePower + "\nEngine Size: " + this.engineSize + "\nMake: " + this.make;
	}
}