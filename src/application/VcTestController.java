package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class VcTestController {
	
	//this variable will help decide which content is displayed
	static int picSelect1;
	//initializes everything that will show up on the page
	@FXML
	private Label title;
	@FXML
	private Label info;
	@FXML
	private ImageView image;
	@FXML
	private Button exit;
	
	//this method runs upon opening and will call contentSelect()
	@FXML
	private void initialize(){
		contentSelect();
	}
	
	
	//Will decide which type of content to display
	private void contentSelect(){
		
		//switches on the picSelect1 integer to display the different content
		switch(picSelect1){
		// displays the content for Present Tense
			case 1:
				title.setText("Present Tense");
				image.setImage(new Image ("file:resources/presentTense.jpeg"));
				info.setText("The present tense is used to describe what you usually do: I speak, you study, he eats. These are things that you aren't necessarily doing at the moment. The present tense has three different types of endings depending on the type of verb.");
				break;
			case 2:
				// displays the content for Preterite Tense
				title.setText("Preterite Tense");
				image.setImage(new Image ("file:resources/preteriteTense.png"));
				info.setText("The Spanish preterite tense (el pretérito) is used to describe actions completed at a point in the past. To conjugate a regular verb in the preterite tense, simply remove the infinitive ending (-ar, -er, or -ir) and add the preterite ending that matches the subject.");
				break;
			case 3:
				// displays the content for Imperfect Tense
				title.setText("Imperfect Tense");
				image.setImage(new Image ("file:resources/imperfectTense.png"));
				info.setText("The Spanish imperfect tense (el imperfecto) is used to describe past habitual actions or to talk about what someone was doing when they were interrupted by something else. There are only two sets of endings for regular imperfect verbs in Spanish, one for -ar verbs and one for both -er and -ir verbs.");
				break;
				// displays the content for Subjunctive Tense
			case 4:
				title.setText("Subjunctive Tense");
				image.setImage(new Image ("file:resources/subjunctiveTense.png"));
				info.setText("The present subjunctive functions much like the present indicative time-wise, except it deals with situations of doubt, desire, emotion, and is generally subjective. On the other hand, the present tense is true, real, and objective. To the end of the stem, add the appropriate ending depending on the subject of the verb.");
				break;
				// displays the content for Present Progressive Tense
			case 5:
				title.setText("Present Progressive Tense");
				image.setImage(new Image ("file:resources/pProgressTense.png"));
				info.setText("The Spanish present progressive tense (el presente progresivo), also called the present continuous tense (el presente continuo), is used to talk about something that is happening now. The present progressive is generally formed using the verb estar (an irregular verb), plus a present participle.");
				break;
				// displays the content for Future Tense
			case 6:
				title.setText("Future Tense");
				image.setImage(new Image ("file:resources/futureTense.png"));
				info.setText("The future tense refers to what will happen at a later time. To form the simple future tense, simply add the correct ending to the infinitive of the verb. All verb conjugations (-ar, -er, and -ir) have the same endings in the simple future tense.");
				break;
		}
	}
	
	//handles the only event that will happen in this stage: closing the view
	public void handle(ActionEvent event) throws IOException{
		if(event.getSource()==exit){
			exitAction();
		}
	}
	
	private void exitAction(){
	    // get a handle to the stage
	    Stage stage = (Stage) exit.getScene().getWindow();
	    // closes the stage
	    stage.close();
	}
	
}
