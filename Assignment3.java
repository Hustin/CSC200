import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Assignment3 extends Application
{
String userNameSt = "";
	String passwordSt = "";
	
	int count = 1;
	public enum Account {Administrator,Staff, Student};
	Account[] choices = {Account.Administrator,Account.Staff, Account.Student};
    Account input = null;
	Account initInput = null;
	String accountType = "";
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage)
	{
		
		
		primaryStage.setTitle("JavaFX login");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Label username = new Label("User Name:");
		grid.add(username, 0, 1);
		
		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		
		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);
		
		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		
		Button btn = new Button("Sign in");
		Button btnCreateAct = new Button("Create Account");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().addAll(btn,btnCreateAct);
		grid.add(hbBtn, 1, 4);
		
		
		
		
		
		
		
		
		btnCreateAct.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e) 
			{
				userNameSt = JOptionPane.showInputDialog(null,"Input your username");
				passwordSt = JOptionPane.showInputDialog(null,"Input your password");
				initInput = (Account)JOptionPane.showInputDialog(null,"Select a account type", "Account", JOptionPane.INFORMATION_MESSAGE ,null, choices, choices[0]);
			}
		});
		
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e) 
			{
				if(count <4)
				{
					String inUserName = userTextField.getText();
					String inPassword = pwBox.getText();
					
					if(userNameSt.equals(inUserName))
					{
						if(passwordSt.equals(inPassword))
						{
							do
							{
								input = (Account)JOptionPane.showInputDialog(null,"Select a account type", "Account", JOptionPane.INFORMATION_MESSAGE ,null, choices, choices[0]);
							}while(input != initInput && input != null);
						
								while(input != null)
								{
							
									switch(input)
									{
										case Administrator:
											accountType = "Welcome Admin! You can update and read files.";
											break;
									
										case Staff:
											accountType = "Welcome Staff! You can update, read, add, delete files.";
											break;
										
										case Student:
											accountType = "Welcome Student! You can only read files.";
											break;
				
									}
							JOptionPane.showMessageDialog(null, accountType);
							System.exit(0);
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null," Invalid Password ");
							count++;
						}							
						
					}
					else
					{
						JOptionPane.showMessageDialog(null," Invalid Username ");
						count++;
					}
				}
				else
				{
				JOptionPane.showMessageDialog(null, "Contact adminstrator ");
				System.exit(0);
				}
			}
		});
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}