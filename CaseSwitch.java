import javax.swing.JOptionPane;

public class CaseSwitch
{
	public static void main(String[] args)
	{
		String role = "", message = "", roleLow = "";

		role = JOptionPane.showInputDialog("What are you?(Administrator, Faculty, Staff, Student, or Guest)");
		roleLow = role.toLowerCase();
		message = ("Welcome " + role + "!");
		
		switch(roleLow)
		{
		case "administrator":
			JOptionPane.showMessageDialog(null,message);
			break;
		case "faculty":
			JOptionPane.showMessageDialog(null,message);
			break;
		case "staff":
			JOptionPane.showMessageDialog(null,message);
			break;
		case "student":
			JOptionPane.showMessageDialog(null,message);
			break;
		case "guest":
			JOptionPane.showMessageDialog(null,message);
			break;

		}
	}
}
