/*
Student:
U1910060
Alimov Abdullokh
MSC2070-002
*/

import javafx.application.Application;  
import javafx.scene.Scene;    
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;   
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.paint.Color;   
import javafx.scene.text.Font;  
import javafx.scene.text.FontPosture;  
import javafx.scene.text.FontWeight;  
import javafx.scene.text.Text;  
import javafx.scene.transform.Scale;  
import javafx.scene.control.TextArea;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
  
public class PrinterFX_U1910060 extends Application {  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        
		// Create Labels
         Label jlblPrinter = new Label("Printer: My Printer");
		jlblPrinter.setLayoutX(30);  
		jlblPrinter.setLayoutY(10);
		jlblPrinter.setPrefSize(150, 20);		
         Label jlblQuality = new Label("Print Quality:  ");
		jlblQuality.setLayoutX(30);  
		jlblQuality.setLayoutY(100); 
		jlblQuality.setPrefSize(150, 20);
		
		// Create TextAreas
         TextArea jtxtType = new TextArea();
		jtxtType.setLayoutX(25);  
		jtxtType.setLayoutY(35); 
		jtxtType.setPrefSize(50, 60);
		 TextArea jtxtSize = new TextArea();
		jtxtSize.setLayoutX(150);  
		jtxtSize.setLayoutY(35); 
		jtxtSize.setPrefSize(40, 60);
		 TextArea jtxtSpace = new TextArea();
		jtxtSpace.setLayoutX(270);  
		jtxtSpace.setLayoutY(35); 
		jtxtSpace.setPrefSize(50, 60);
		
		// Create CheckBox
         CheckBox jchkImg = new CheckBox("Image");
        jchkImg.setLayoutX(80);  
		jchkImg.setLayoutY(35); 
		jchkImg.setPrefSize(70, 20);
         CheckBox jchkText = new CheckBox("Text");
		jchkText.setLayoutX(80);  
		jchkText.setLayoutY(55); 
		jchkText.setPrefSize(70, 20);
         CheckBox jchkCode = new CheckBox("Code");
		jchkCode.setLayoutX(80);  
		jchkCode.setLayoutY(75); 
		jchkCode.setPrefSize(70, 20);	
         CheckBox jchkPrint = new CheckBox("Print to File");
		jchkPrint.setLayoutX(220);  
		jchkPrint.setLayoutY(100); 
		jchkPrint.setPrefSize(100, 20);
		
		// Create RadioButton
         RadioButton jrbSelect = new RadioButton("Select");
		jrbSelect.setLayoutX(195);  
		jrbSelect.setLayoutY(35); 
		jrbSelect.setPrefSize(70, 20);
         RadioButton jrbAll = new RadioButton("All");
		jrbAll.setLayoutX(195);  
		jrbAll.setLayoutY(55); 
		jrbAll.setPrefSize(70, 20);
         RadioButton jrbApplet = new RadioButton("Applet");
        jrbApplet.setLayoutX(195);  
		jrbApplet.setLayoutY(75); 
		jrbApplet.setPrefSize(70, 20);
		
		// Create ComboBox
         ComboBox jcboQuality = new ComboBox();
		jcboQuality.getItems().add("High");
		jcboQuality.getItems().add("Middle");
		jcboQuality.getItems().add("Low");
        jcboQuality.setLayoutX(130);  
		jcboQuality.setLayoutY(100); 
		jcboQuality.setPrefSize(75, 20);
		
		// Create Buttons
         Button jbtOK = new Button("OK");
		jbtOK.setLayoutX(340);  
		jbtOK.setLayoutY(10); 
		jbtOK.setPrefSize(80, 30);
         Button jbtCancel = new Button("Cancel");
		jbtCancel.setLayoutX(340);  
		jbtCancel.setLayoutY(45); 
		jbtCancel.setPrefSize(80, 30);
         Button jbtSetup = new Button("Setup...");
		jbtSetup.setLayoutX(340);  
		jbtSetup.setLayoutY(80); 
		jbtSetup.setPrefSize(80, 30);
         Button jbtHelp = new Button("Help");
        jbtHelp.setLayoutX(340);  
		jbtHelp.setLayoutY(115); 
		jbtHelp.setPrefSize(80, 30);
        
		
		Group root = new Group();
        // StackPane root = new StackPane();    
        root.getChildren().add(jlblPrinter);
		root.getChildren().add(jlblQuality);	
		root.getChildren().add(jtxtType);
		root.getChildren().add(jtxtSize);
		root.getChildren().add(jtxtSpace);
		root.getChildren().add(jchkImg);
		root.getChildren().add(jchkCode);
		root.getChildren().add(jchkPrint);
		root.getChildren().add(jchkText);
		root.getChildren().add(jrbAll);
		root.getChildren().add(jrbApplet);
		root.getChildren().add(jrbSelect);
		root.getChildren().add(jcboQuality);
		root.getChildren().add(jbtCancel);
		root.getChildren().add(jbtHelp);
		root.getChildren().add(jbtOK);
		root.getChildren().add(jbtSetup);
		
		Scene scene=new Scene(root,450,200); 		
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Printer U1910060");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
}  
