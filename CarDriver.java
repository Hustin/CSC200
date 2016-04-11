
public class CarDriver
{
	public static void main(String[] args)
	{ 
	
		Car myCar = new Car();
		Car hisCar = new Car("Black",400,3.5,"Honda");
		Car herCar = new Car("Pink",300,2.5,"Volks");
		
		System.out.println("My Car\n" + myCar);
		System.out.println("His Car\n" + hisCar);
		System.out.println("Her Car\n" + herCar);
		
		myCar.setColor("Blue");
		hisCar.setColor("Blue");
		herCar.setColor("Blue");
		
		myCar.setHorsePower(650);
		hisCar.setHorsePower(650);
		herCar.setHorsePower(650);
		
		myCar.setEngineSize(6.5);
		hisCar.setEngineSize(6.5);
		herCar.setEngineSize(6.5);
		
		myCar.setMake("Ferrari");
		hisCar.setMake("Ferrari");
		herCar.setMake("Ferrari");
		
		System.out.println(myCar.getColor() + " " + myCar.getHorsePower() + " " + myCar.getEngineSize() + " " + myCar.getMake());
		System.out.println(hisCar.getColor() + " " + hisCar.getHorsePower() + " " + hisCar.getEngineSize() + " " + hisCar.getMake());
		System.out.println(herCar.getColor() + " " + herCar.getHorsePower() + " " + herCar.getEngineSize() + " " + herCar.getMake());
		
	}
		
}