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

public class ScoreGui extends Application
{
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
		
		Text scenetitle = new Text("Grade Calculator");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 1, 0, 2, 1);
		
		//add labels
		Label name = new Label("Name:");
		grid.add(name,0,1);
		
		Label score1 = new Label("Test 1 score:");
		grid.add(score1,0,2);
		Label score2 = new Label("Test 2 score:");
		grid.add(score2,0,3);
		Label score3 = new Label("Test 3 score:");
		grid.add(score3,0,4);
		Label score4 = new Label("Test 4 score:");
		grid.add(score4,0,5);
		
		Label weight1 = new Label("Test weight:");
		grid.add(weight1,2,2);
		Label weight2 = new Label("Test weight:");
		grid.add(weight2,2,3);
		Label weight3 = new Label("Test weight:");
		grid.add(weight3,2,4);
		Label weight4 = new Label("Test weight:");
		grid.add(weight4,2,5);
		//add textfields
		TextField nameText = new TextField();
		grid.add(nameText,1,1);
		
		TextField score1Text = new TextField();
		grid.add(score1Text,1,2);
		TextField score2Text = new TextField();
		grid.add(score2Text,1,3);
		TextField score1Text = new TextField();
		grid.add(score3Text,1,4);
		TextField score1Text = new TextField();
		grid.add(score4Text,1,5);
		
		TextField weight1Text = new TextField();
		grid.add(weight1Text,3,2);
		TextField weight2Text = new TextField();
		grid.add(weight2Text,3,3);
		TextField weight3Text = new TextField();
		grid.add(weight3Text,3,4);
		TextField weight4Text = new TextField();
		grid.add(weight4Text,3,5);
		
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
}
