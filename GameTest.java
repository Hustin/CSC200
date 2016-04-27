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
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class GameTest extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Game");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Label player = new Label("-o-");
		grid.add(player,1,2);
		
		Button btnUp = new Button("Up");
		Button btnDown = new Button("Down");
		Button btnLeft = new Button("Left");
		Button btnRight = new Button("Right");
		HBox hbBtn = new HBox(10);
		HBox hbBtnUp = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnUp.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnUp.getChildren().add(btnUp);
		hbBtn.getChildren().addAll(btnDown,btnLeft,btnRight);
		grid.add(hbBtn, 3, 4);
		grid.add(hbBtnUp,4,3);
		
		
		btnUp.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e) 
			{
				player.setLocation(player.getX(),player.getY()+1);
			}
		});
		
		btnDown.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e) 
			{
				player.setLocation(player.getX(),player.getY()-1);
			}
		});
		btnLeft.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e) 
			{
				player.setLocation(player.getX()-1,player.getY());
			}
		});
		btnRight.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e) 
			{
				player.setLocation(player.getX()+1,player.getY());
			}
		});
		Scene scene = new Scene(grid, 1000, 1000);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}