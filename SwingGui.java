import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SwingGui implements ActionListener
{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel output;
	private JTextField num1T;
	private JTextField num2T;
	private JButton button;
	public SwingGui()
	{
		frame = new JFrame("sum");
		frame.setVisible(true);
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		
		label = new JLabel();
		output = new JLabel();
		label.setText("Sum: ");
		output.setText("--");
		num1T = new JTextField(5);
		num2T = new JTextField(5);
		
		button = new JButton("Calculate");
		button.addActionListener(this);
		panel.add(label);
		panel.add(output);
		panel.add(num1T);
		panel.add(num2T);
		panel.add(button);
		
		frame.add(panel);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String in1 = num1T.getText();
		String in2 = num2T.getText();
		double num1D = Double.parseDouble(in1);
		double num2D = Double.parseDouble(in2);
		double sum = num1D + num2D;
		output.setText(Double.toString(sum));
	}
}