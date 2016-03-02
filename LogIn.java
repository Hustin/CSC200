import javax.swing.JOptionPane;
/**
*This program is to check if inputed username and password is correct.
*Justin Rhodes
*
*
*
*/

public class LogIn
{
	public static void main(String[] args)
	{
		String userCheck, passCheck, username, password;
		username = JOptionPane.showInputDialog("Enter your username:");
		password = JOptionPane.showInputDialog("Enter your password:");
		
		userCheck = JOptionPane.showInputDialog("Re-enter your username");
		passCheck = JOptionPane.showInputDialog("Re-enter your password:");
		
		if(username.equals(userCheck))
		{
			if(password.equals(passCheck))
			{
				JOptionPane.showMessageDialog(null,"Welcome " + username + "!");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Your password is wrong!");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Your username is wrong!");
		}
	}
}
