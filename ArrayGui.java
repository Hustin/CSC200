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



public class ArrayGui extends Application
{
	Array test = new Array();

	
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
		
		//10 text boxs for input the 10 nums in array
		TextField num1Txt = new TextField();
		grid.add(num1Txt,1,1);
		TextField num2Txt = new TextField();
		grid.add(num2Txt,1,2);
		TextField num3Txt = new TextField();
		grid.add(num3Txt,1,3);
		TextField num4Txt = new TextField();
		grid.add(num4Txt,1,4);
		TextField num5Txt = new TextField();
		grid.add(num5Txt,1,5);
		TextField num6Txt = new TextField();
		grid.add(num6Txt,1,6);
		TextField num7Txt = new TextField();
		grid.add(num7Txt,1,7);
		TextField num8Txt = new TextField();
		grid.add(num8Txt,1,8);
		TextField num9Txt = new TextField();
		grid.add(num9Txt,1,9);
		TextField num10Txt = new TextField();
		grid.add(num10Txt,1,10);
		
		//10 labels
		Label in1 = new Label("Number 1:");
		grid.add(in1,0,1);
		Label in2 = new Label("Number 2:");
		grid.add(in2,0,2);
		Label in3 = new Label("Number 3:");
		grid.add(in3,0,3);
		Label in4 = new Label("Number 4:");
		grid.add(in4,0,4);
		Label in5 = new Label("Number 5:");
		grid.add(in5,0,5);
		Label in6 = new Label("Number 6:");
		grid.add(in6,0,6);
		Label in7 = new Label("Number 7:");
		grid.add(in7,0,7);
		Label in8 = new Label("Number 8:");
		grid.add(in8,0,8);
		Label in9 = new Label("Number 9:");
		grid.add(in9,0,9);
		Label in10 = new Label("Number 10:");
		grid.add(in10,0,10);
		
		//non organized array
		Label output1 = new Label(" ");
		grid.add(output1,3,2);
		Label output2 = new Label(" ");
		grid.add(output2,4,2);
		Label output3 = new Label(" ");
		grid.add(output3,5,2);
		Label output4 = new Label(" ");
		grid.add(output4,6,2);
		Label output5 = new Label(" ");
		grid.add(output5,7,2);
		Label output6 = new Label(" ");
		grid.add(output6,8,2);
		Label output7 = new Label(" ");
		grid.add(output7,9,2);
		Label output8 = new Label(" ");
		grid.add(output8,10,2);
		Label output9 = new Label(" ");
		grid.add(output9,11,2);
		Label output10 = new Label(" ");
		grid.add(output10,12,2);
		
		Label outputOrg1 = new Label(" ");
		grid.add(outputOrg1,3,4);
		Label outputOrg2 = new Label(" ");
		grid.add(outputOrg2,4,4);
		Label outputOrg3 = new Label(" ");
		grid.add(outputOrg3,5,4);
		Label outputOrg4 = new Label(" ");
		grid.add(outputOrg4,6,4);
		Label outputOrg5 = new Label(" ");
		grid.add(outputOrg5,7,4);
		Label outputOrg6 = new Label(" ");
		grid.add(outputOrg6,8,4);
		Label outputOrg7 = new Label(" ");
		grid.add(outputOrg7,9,4);
		Label outputOrg8 = new Label(" ");
		grid.add(outputOrg8,10,4);
		Label outputOrg9 = new Label(" ");
		grid.add(outputOrg9,11,4);
		Label outputOrg10 = new Label(" ");
		grid.add(outputOrg10,12,4);
		
		Button btnAddToArray = new Button("Create Array");
		Button btnOrganize = new Button("Organize");
		
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().addAll(btnAddToArray,btnOrganize);
		grid.add(hbBtn, 1, 11);
		
		btnAddToArray.setOnAction(new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent e) 
			{
				
				double [] num = new double [10];
				String num1S = num1Txt.getText();
				String num2S = num2Txt.getText();
				String num3S = num3Txt.getText();
				String num4S = num4Txt.getText();
				String num5S = num5Txt.getText();
				String num6S = num6Txt.getText();
				String num7S = num7Txt.getText();
				String num8S = num8Txt.getText();
				String num9S = num9Txt.getText();
				String num10S = num10Txt.getText();
				
				 num[0] = Double.parseDouble(num1S);
				 num[1] = Double.parseDouble(num2S);
				 num[2] = Double.parseDouble(num3S);
				 num[3] = Double.parseDouble(num4S);
				 num[4] = Double.parseDouble(num5S);
				 num[5] = Double.parseDouble(num6S);
				 num[6] = Double.parseDouble(num7S);
				 num[7] = Double.parseDouble(num8S);
				 num[8] = Double.parseDouble(num9S);
				 num[9] = Double.parseDouble(num10S);
				
				String answer = Double.toString(num[0]);
				
				output1.setText(answer);
				output2.setText(Double.toString(num[1]));
				output3.setText(Double.toString(num[2]));
				output4.setText(Double.toString(num[3]));
				output5.setText(Double.toString(num[4]));
				output6.setText(Double.toString(num[5]));
				output7.setText(Double.toString(num[6]));
				output8.setText(Double.toString(num[7]));
				output9.setText(Double.toString(num[8]));
				output10.setText(Double.toString(num[9]));
				
				
			}
		});
		btnOrganize.setOnAction(new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent e) 
			{
					
				double [] num = new double [10];
				String num1S = num1Txt.getText();
				String num2S = num2Txt.getText();
				String num3S = num3Txt.getText();
				String num4S = num4Txt.getText();
				String num5S = num5Txt.getText();
				String num6S = num6Txt.getText();
				String num7S = num7Txt.getText();
				String num8S = num8Txt.getText();
				String num9S = num9Txt.getText();
				String num10S = num10Txt.getText();
				
				 num[0] = Double.parseDouble(num1S);
				 num[1] = Double.parseDouble(num2S);
				 num[2] = Double.parseDouble(num3S);
				 num[3] = Double.parseDouble(num4S);
				 num[4] = Double.parseDouble(num5S);
				 num[5] = Double.parseDouble(num6S);
				 num[6] = Double.parseDouble(num7S);
				 num[7] = Double.parseDouble(num8S);
				 num[8] = Double.parseDouble(num9S);
				 num[9] = Double.parseDouble(num10S);
				
				double [] numOrg = test.organize(num);
				outputOrg1.setText(Double.toString(numOrg[0]));
				outputOrg2.setText(Double.toString(numOrg[1]));
				outputOrg3.setText(Double.toString(numOrg[2]));
				outputOrg4.setText(Double.toString(numOrg[3]));
				outputOrg5.setText(Double.toString(numOrg[4]));
				outputOrg6.setText(Double.toString(numOrg[5]));
				outputOrg7.setText(Double.toString(numOrg[6]));
				outputOrg8.setText(Double.toString(numOrg[7]));
				outputOrg9.setText(Double.toString(numOrg[8]));
				outputOrg10.setText(Double.toString(numOrg[9]));
			}
			});
		
		
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
