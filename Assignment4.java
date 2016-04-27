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

public class JavaFX extends Application
{
	public enum Account {Administrator, Faculty, Staff, Student, Guest};
	Account[] choices = {Account.Administrator, Account.Faculty, Account.Staff, Account.Student, Account.Guest};
    Account input = null;
	Account initInput = null;
	
	public static void main(String[] args)
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage)
	{
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Label username = new Label("User Name:");
		Label pw = new Label("Password:");
		
		TextField emailText = new TextField();
		TextField nameText = new TextField();
		TextField lastNameText = new TextField();
		TextField userTextField = new TextField();
		PasswordField pwBox = new PasswordField();
		PasswordField pwConfirmBox = new PasswordField();
		
		Button btnCl = new Button("Cancel");
		Button btnCreateAct = new Button("Create Account");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().addAll(btnCl,btnCreateAct);
	}
}