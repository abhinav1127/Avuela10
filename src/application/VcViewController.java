package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VcViewController {
	
	//initialize buttons that will link to content
	@FXML
	private Button present;
	@FXML
	private Button preterite;
	@FXML
	private Button imperfect;
	@FXML
	private Button subjunctive;
	@FXML
	private Button pProgress;
	@FXML
	private Button future;
	//initialize the Stage to return to the main menu
	Stage prevStage;
	@FXML
	private Button exit;
	
	
	//method to handle all events
	/**
	 * Helps decide what to do based on the button selected. Could exit the Stage or open a new Stage.
	 * @param event Specifies the characteristics of the event that has happened so that we can identify the source
	 * @throws IOException if stream to aFile cannot be written to or closed.
	 */
	public void handle(ActionEvent event) throws IOException{
		
		
		//set up integer to switch on
		int count=0;
		//set up Stage to open new GUI
		Stage stagenext;
		//initializes root to help set Scene
		Parent root;
		
		/*Change an integer to a certain value depending on the ActionEvent’s source 
		 * by using a series of if statements (as we cannot switch on an event source)
		 */
		
		if(event.getSource()==exit){
			exitAction();
		}
		
		if(event.getSource()==present){
			count=1;			
		}
		if(event.getSource()==preterite){
			count=2;
		}
		if(event.getSource()==imperfect){
			count=3;
		}
		if(event.getSource()==subjunctive){
			count=4;
		}
		if(event.getSource()==pProgress){
			count=5;
		}
		if(event.getSource()==future){
			count=6;
		}
		
		//decides the content that will be displays in the new view
		VcTestController.picSelect1=count;
		
		//switch on the integer value
		switch(count){
		//These nine cases branch to the same scene based on the button clicked. However, they each have different titles
		case 1:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/vcTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Present Tense!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(present.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 2:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/vcTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Preterite Tense!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(preterite.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 3:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/vcTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Imperfect Tense!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(imperfect.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 4:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/vcTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Subjunctive Tense!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(subjunctive.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 5:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/vcTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Present Progressive Tense!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(pProgress.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 6:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/vcTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Future Tense!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(future.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		default:
			break;
		}
		

	}
	
	/**
	 * Closes the stage when called
	 */
	private void exitAction(){
	    // get a handle to the stage
	    Stage stage = (Stage) exit.getScene().getWindow();
	    // closes the stage
	    stage.close();
	}

	
}
