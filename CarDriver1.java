import javax.swing.JOptionPane;
public class CarDriver1
{
	public enum Cars {MyCar, HisCar, HerCar};
	public static void main(String[] args)
	{ 
		Car countC = new Car();
		Car myCar = null;
		Car hisCar = null;
		Car herCar = null;
		int count = countC.getCount();
		String answer = "";
		
		Cars[] choices = {Cars.MyCar, Cars.HisCar, Cars.HerCar};
		Cars[] compChoices = {Cars.HisCar, Cars.HerCar};
		Cars input = null;
		 
		answer = JOptionPane.showInputDialog(null,"Would you like to enter info for the cars");
		answer = answer.toLowerCase();
		if(answer.equals("yes"))
		{
			while(count <4)
			{
			input = (Cars)JOptionPane.showInputDialog(null,"Select the car you want to input the info for", "Cars", JOptionPane.INFORMATION_MESSAGE ,null, choices, choices[0]);
				switch(input)
				{
				case MyCar:
					myCar = new Car();
					myCar.setColor();
					myCar.setHorsePower();
					myCar.setEngineSize();
					myCar.setMake();
					count = countC.getCount();
					break;
				case HisCar:
					hisCar = new Car();
					hisCar.setColor();
					hisCar.setHorsePower();
					hisCar.setEngineSize();
					hisCar.setMake();
					count = countC.getCount();
					break;
				case HerCar:
					herCar = new Car();
					herCar.setColor();
					herCar.setHorsePower();
					herCar.setEngineSize();
					herCar.setMake();
					count = countC.getCount();
					break;
				}
			}
		}
		else
		{
			System.exit(0);
			
		}
		System.out.println("My Car\n" + myCar);
		System.out.println("His Car\n" + hisCar);
		System.out.println("Her Car\n" + herCar);
		
		answer = JOptionPane.showInputDialog(null,"Would you like to compare a car to your own?");
		answer = answer.toLowerCase();
		
		while(answer.equals("yes"))
		{
			input = (Cars)JOptionPane.showInputDialog(null,"What car do you want to compare to yours.", "Cars", JOptionPane.INFORMATION_MESSAGE ,null, compChoices, compChoices[0]);
			switch(input)
				{				
				case HisCar:
					JOptionPane.showMessageDialog(null,myCar.equals(hisCar));
					break;
				case HerCar:
					JOptionPane.showMessageDialog(null,myCar.equals(herCar));
					break;
				}
		answer = JOptionPane.showInputDialog(null,"Would you like to compare a car to your own?");
		answer = answer.toLowerCase();
		}
	}	
}