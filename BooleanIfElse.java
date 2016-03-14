import javax.swing.JOptionPane;
public class BooleanIfElse
{
	public static void main(String[] args)
	{
		String numPeople,  numPlayers, errorMssgPeople = "";
		int numIPeople, numIPlayers, groupSize=0, teamSize=0;

		numPeople = JOptionPane.showInputDialog("Enter how many people there are");
		numPlayers = JOptionPane.showInputDialog("Enter how many players there are");
		numIPeople = Integer.parseInt(numPeople);
		numIPlayers= Integer.parseInt(numPlayers);
		
		if(numIPeople>10)
		{
			groupSize=numIPeople/2;
		}
		else if(numIPeople>=3&&numIPeople<=10)
		{
			groupSize=numIPeople/3;
		}
		else if(numIPeople<3)
		{
			errorMssgPeople = "You must have at least 3 people for a group.";
		}
		if(numIPlayers>=11&&numIPlayers<=55)
		{
			teamSize=numIPlayers/11;
		}
		else
		{
			teamSize = 1;
		}

		JOptionPane.showMessageDialog(null, "The amount of people are: " + numIPeople + "       The amount of players are: " + numIPlayers + "\nThe group size is: " + groupSize + errorMssgPeople  + "                       The team size is: " + teamSize);
			

	}
	
}
