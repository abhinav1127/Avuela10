package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainViewController {

	//sets up the buttons for options to access the program's curriculum
	@FXML
	private Button grammar;
	@FXML
	private Button vocab;
	@FXML
	private Button vc;
	//sets up the button to exit the program
	@FXML
	private Button exit;
	//initialize button that will display resources
	@FXML
	private Button sources;
	//initialize the Stage to help change scenes
	@FXML
	Stage prevStage;
	@FXML
	private ImageView pic;
	@FXML
	private Label resources;
	int showResources=0;

	
	@FXML
	/**
	 * This method is called upon the opening of the program and moves pic to the front of the displayed scene
	 */
	private void initialize(){
		pic.toFront();
	}
	
	//makes the setter for prevStage
	/**
	 * makes the setter for prevStage
	 * @param stage this is the stage to which the local prevStage will be set.
	 */
	public void setPrevStage(Stage stage){
         this.prevStage = stage;
    }

	//method to handle all events
	/**
	 * Helps decide what to do based on the button selected. Could exit the Stage, open a new Stage, or show/ hide resources
	 * @param event Specifies the characteristics of the event that has happened so that we can identify the source
	 * @throws IOException if stream to aFile cannot be written to or closed.
	 */
	public void handle(ActionEvent event) throws IOException{
		
		/*Change an integer to a certain value depending on the ActionEvent’s source 
		 * by using a series of if statements (as we cannot switch on an event source)
		 */
		int option=0;
		if(event.getSource()==grammar){
			option=1;
		}
		if(event.getSource()==vocab){
			option=2;
		}
		if(event.getSource()==vc){
			option=3;
		}
		if(event.getSource()==exit){
			option=4;
			System.out.println("You have closed Avuela! Have a nice day!");
		}
		if(event.getSource()==sources){
			//this variable helps decide which action to take in (fade in or fade out)
			showResources++;
			if((showResources%2)==1){
				//animation: fades pic out to show resources
				FadeTransition ft = new FadeTransition(Duration.millis(1500), pic);
				ft.setFromValue(1.0);
				ft.setToValue(0.0);
				ft.play();
			}
			else{
				//animation: fades pic in to hide resources
				FadeTransition ft = new FadeTransition(Duration.millis(1500), pic);
				ft.setFromValue(0.0);
				ft.setToValue(1.0);
				ft.play();
			}
		}
			
		
		//set up Stage to open new GUI
		Stage stagenext;
		//initializes root to help set Scene
		Parent root;
		
		//switch on the integer value
		switch(option){
		
		//The next three cases branch to a new scene based on the button clicked. Each gets their own title but has a different view
		case 1:
		    stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarView.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Grammar!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(grammar.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 2:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/vocabView.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Vocab!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(vocab.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 3:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/vcView.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Verb Conjugation!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(vc.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		//shuts down the program
		case 4:
			Runtime.getRuntime().exec("java -jar myApp.jar");
			System.exit(0);
			break;
		//default does not need to have anything
		default:
			break;
		}
		
		
	}



}
