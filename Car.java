import javax.swing.JOptionPane;
public class Car
{
	private String color = "";
	private int horsePower = 0;
	private double engineSize = 0.0;
	private String make = "";
	private static int count = 0;
	
	public Car()
	{
		count++;
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
	public void setColor()
	{
		this.color = JOptionPane.showInputDialog(null,"What is the color of the car");
	}
	public String getColor()
	{
		return this.color;
	}
	public void setHorsePower()
	{
		this.horsePower = Integer.parseInt(JOptionPane.showInputDialog(null,"What is the horse power of the car"));
	}
	public double getHorsePower()
	{
		return this.horsePower;
	}
	public void setEngineSize()
	{
		this.engineSize = Double.parseDouble(JOptionPane.showInputDialog(null,"What is the engine size of the car"));
	}
	public double getEngineSize()
	{
		return this.engineSize;
	}
	public void setMake()
	{
		this.make = JOptionPane.showInputDialog(null,"What is the make of the car");;
	}
	public String getMake()
	{
		return this.make;
	}
	public String toString()
	{
		return "Color: " + this.color + "\nHorse Power: " + this.horsePower + "\nEngine Size: " + this.engineSize + "\nMake: " + this.make;
	}
	public boolean equals(Car car)
	{
		if(this.color.equals(car.color) && this.horsePower == car.horsePower && this.engineSize == car.engineSize && this.make.equals(car.make))
			return true;
		else
			return false;
	}
	public static int getCount()
	{
		return count;
	}
}