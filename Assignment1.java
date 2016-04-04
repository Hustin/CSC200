import javax.swing.JApplet;
import java.awt.Graphics;

public class Assignment1 extends JApplet
{
	public void paint(Graphics canvas)
	{
		canvas.drawOval(250, 250, 100, 100);
		canvas.fillOval(275, 275, 50, 50);
		
		canvas.drawArc(350, 225, 150, 150, 90, 180);
		canvas.drawArc(100, 225, 150, 150, -90, 180);
		canvas.drawArc(225, 100, 150, 150, 0, -180);
		canvas.drawArc(225, 350, 150, 150, 0, 180);
	}
}