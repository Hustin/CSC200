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




public class SumGui 
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
		
		Label outputLbl = new Label("");
		grid.add(outputLbl,2,2);
		
		Text scenetitle = new Text("What is the sum?");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 1, 0, 2, 1);
		
		String sum = "";
		
			
		Label sumLbl = new Label("Sum:");
		grid.add(sumLbl,1,2);
		
		
		TextField num1Txt = new TextField();
		grid.add(num1Txt,0,1);
		TextField num2Txt = new TextField();
		grid.add(num2Txt,4,1);
		
		Button btnCalc = new Button("Calculate");
		Button btnCnl = new Button("Cancel");
		
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().addAll(btnCalc,btnCnl);
		grid.add(hbBtn, 1, 4);
		
		btnCalc.setOnAction(new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent e) 
			{
				String num1S = num1Txt.getText();
				String num2S = num2Txt.getText();
				double num1 = Double.parseDouble(num1S);
				double num2 = Double.parseDouble(num2S);
				double sumD = num1 + num2;
				outputLbl.setText(Double.toString(sumD));
		
			}
		});
			btnCnl.setOnAction(new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}