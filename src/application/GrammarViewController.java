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

/**
 * 
 * @author Abhinav Tirath
 *
 */
public class GrammarViewController {

	//Set up the Buttons that choose which FlashcardSet is being displayed
	@FXML
	private Button nounGender;
	@FXML
	private Button negation1;
	@FXML
	private Button prepositions1;
	@FXML
	private Button possessiveNouns1;
	@FXML
	private Button reflexiveVerbs1;
	@FXML
	private Button adjectives1;
	@FXML
	private Button candPRules;
	@FXML
	private Button subject1;
	@FXML
	private Button spelling1;
	//initializes the button that allows the user to return to the main menu
	@FXML
	private Button exit;
	//initialize the Stage to return to the main menu
	Stage prevStage;
	
	//method to handle all events
	/**
	 * Helps decide what to do based on the button selected. Could exit the Stage or open a new Stage
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
		
		if(event.getSource()==exit){
			exitAction();
		}
		
		/*Change an integer to a certain value depending on the ActionEvent’s source 
		 * by using a series of if statements (as we cannot switch on an event source)
		 */
		if(event.getSource()==nounGender){
			count=1;			
		}
		if(event.getSource()==negation1){
			count=2;
		}
		if(event.getSource()==prepositions1){
			count=3;
		}
		if(event.getSource()==possessiveNouns1){
			count=4;
		}
		if(event.getSource()==reflexiveVerbs1){
			count=5;
		}
		if(event.getSource()==adjectives1){
			count=6;
		}
		if(event.getSource()==candPRules){
			count=7;
		}
		if(event.getSource()==subject1){
			count=8;
		}
		if(event.getSource()==spelling1){
			count=9;
		}
		
		//decides the content that will be displays in the new view
		GrammarTestController.picSelect=count;
		
		//switch on the integer value
		switch(count){
		//These nine cases branch to the same scene based on the button clicked. However, they each have different titles
		case 1:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Noun Gender!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(nounGender.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 2:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Negation!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(negation1.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 3:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Prepositions!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(prepositions1.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 4:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Possessive Nouns!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(possessiveNouns1.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 5:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Reflexive Verbs!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(reflexiveVerbs1.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 6:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Adjectives!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(adjectives1.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 7:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Capitalization and Punctuation Rules!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(candPRules.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 8:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Subject!");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(subject1.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		case 9:
			stagenext= new Stage();
		    root = FXMLLoader.load(getClass().getResource("/application/grammarTest.fxml"));
			stagenext.setScene(new Scene(root));
			stagenext.setTitle("Spelling");
			stagenext.initModality(Modality.APPLICATION_MODAL);//initializing the modality
			stagenext.initOwner(spelling1.getScene().getWindow());
			stagenext.centerOnScreen();
			stagenext.showAndWait();
			break;
		//default does not need to be do anything necessarily
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
