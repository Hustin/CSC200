
import javax.swing.JOptionPane;
public class Rectangle
{
	public static void main(String[] args)
	{
		String length, width;
		double lengthD, widthD, area, perimeter;
		
		length = JOptionPane.showInputDialog("Enter the length of a rectangle");
		width = JOptionPane.showInputDialog("Enter the width of a rectangle");
		lengthD = Double.parseDouble(length);
		widthD = Double.parseDouble(width);
		
		area = lengthD*widthD;
		perimeter = (2*lengthD) + (2*widthD);
		JOptionPane.showMessageDialog(null,"The perimeter is: " + perimeter + "\nThe area is: " + area);
	}
}
