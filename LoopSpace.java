import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LoopSpace 
{
	private boolean keyDownSpace = false;
	public static void main(String[] args)
	{	
		Loop test = new Loop();
		
		JFrame window = new JFrame("Loop");
		window.setBounds(50,100,300,300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField typeArea = new JTextField(20);
		typeArea.addKeyListener();
		
		test.isKeyDown();
			while(!keyDown)
		{
			test.displayInfo("Hello");
			
		}
	}
	public void isKeyDown(KeyEvent e)
	{
		if(e.getID == 32)
		{
			keyDownSpace = true;
		}
	}
	public void displayInfo(String a)
	{
		System.out.println(a);
	}
	
		
	
}