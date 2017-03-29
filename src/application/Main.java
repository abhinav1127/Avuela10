package application;
	
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	//initialize primary Stage and initial layout
	private Stage primaryStage;
	private BorderPane rootLayout;
	

	//Override method and construct the Stage from the Pane, Loader, and Scene and display it
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage= primaryStage;
			primaryStage.setTitle("Avuela Presents Spanish Language for Business Purposes!");

			FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/application/mainView.fxml"));

			Pane myPane = (Pane)myLoader.load();
			
			Scene myScene = new Scene(myPane);        
			primaryStage.setScene(myScene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//getters and setters
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	//Use the main method to launch the arguments
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
