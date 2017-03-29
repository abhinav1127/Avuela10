package application;

import java.io.IOException;
import java.time.Duration;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GrammarTestController {

	//this variable will help decide which content is displayed
	static int picSelect;
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
		
		//switches on the picSelect integer to display the different content
		switch(picSelect){
			// displays the content for Noun Gender
			case 1:
				title.setText("Noun Gender");
				image.setImage(new Image ("file:resources/nounGender1.png"));
				info.setText("In the Spanish language, every noun is considered to be either masculine or feminine, and the "
						+ "articles “the,” el (masculine) or la (feminine), will often accompany the noun to demonstrate "
						+ "which gender the noun is. \nIt sounds easy enough, but mastering gender gets much more complicated "
						+ "since it’s something that affects various parts of the sentence.  \nOne difficulty of learning gender is simply remembering and "
						+ "recognizing what the gender of a word is. Usually words that end with the letter o are masculine, "
						+ "and words that end in the letter a are feminine, which is simple enough to remember. But of "
						+ "course, there are many words that have different endings and those that are irregular and "
						+ "unintuitive.");
				break;
			// displays the content for Negation
			case 2:
				title.setText("Negation");
				image.setImage(new Image ("file:resources/negation1.png"));
				info.setText("In Spanish, negation is much simpler. In a sentence, usually just putting no before the verb will negate it, and there are less prefixes to confuse \nyou. When making Spanish sentences, double negatives are supposed to be used, rather than avoided. English requires that we mix negative and affirmative words, which may create confusion for non-native English speakers. In Spanish, it is far easier to determine what is being said since the words agree with each other. \nFor example, to say “I do not want anything” in Spanish, you would say “No quiero nada,” which translates literally to “I don’t want nothing.” It keeps the two negative words together (no, nada) rather than mixing a negative with a positive.");
				break;
			// displays the content for Prepositions
			case 3:
				title.setText("Prepositions");
				image.setFitHeight(image.getFitHeight()+100);
				image.setFitWidth(image.getFitWidth()+50);
				image.setImage(new Image ("file:resources/prepositions2.png"));
				info.setText("In English, we use dozens of prepositions to determine the exact location in time and space of an object. Prepositions definitely play a much smaller role in Spanish, with many less words, which may seem to leave ambiguity to an English speaker. Reder to the chart on the right for translations. \n La manzana está en el refrigerador. (The apple is in the refrigerator.) \nSoy de Tejas. (I am from Texas.) \nDistinguishing which preposition to use and when may confuse some Spanish learners, but with the smaller pool of words to choose from, it shouldn’t take too long to master.");
				break;
				// displays the content for Possessive Nouns
			case 4:
				title.setText("Possessive Nouns");
				image.setImage(new Image ("file:resources/possessivenouns1.png"));
				info.setText("In English, all you have to do is slap an apostrophe “s” to the end of a noun and presto, you’ve made it possessive: “Adam‘s jacket.” \nThis isn’t the case in Spanish; to specify belonging in Spanish, most often de is used to connect the possession to its owner. To say “Adam’s jacket,” for example, we would say la chaqueta de Adam, which translates literally to “the jacket of Adam.” \nLuckily, learning the rest of the possessive words isn’t difficult either. Possessive adjectives and pronouns are also used in Spanish, and follow a very similar format to English.");

				break;
				// displays the content for Reflexive Verbs
			case 5:
				title.setText("Reflexive Verbs");
				image.setImage(new Image ("file:resources/reflexiveverbs1.png"));
				info.setText("If the subject in a sentence performs an action on itself, then the verb is considered to be reflexive, and the pronoun used to receive the action is reflexive. \n The singular reflexive pronouns are: me (myself), te (yourself), and se (yourself (formal), himself, herself). The plural reflexive pronouns are: nos (ourselves), os (yourselves - informal Spain), and se (yourselves, themselves). \n For example, consider the sentence, \"Yo me baño,\" (I bathe myself, or I take a bath). The verb is reflexive, and \"me\" is the reflexive pronoun. Of course the verb bañar is not always used as a reflexive verb, but in this case it is. \n There are some verbs that are always used reflexively, such as arrepentirse (to repent, or regret), and that is how they are found in the dictionary, with the reflexive pronoun \"se\" attached to the end.");
				break;
				// displays the content for Adjectives
			case 6:
				title.setText("Adjectives");
				image.setImage(new Image ("file:resources/adjectives1.png"));
				info.setText("in Spanish the adjective generally comes after the noun instead of before. For example, if you wanted to say “the black suit,” in Spanish, you’d say el traje negro (literally: the suit black). \nBut, there are a few exceptions to this rule. With select types of adjectives—such as quantifiers, for example—they come before the noun. \n Remembering how to correctly modify adjectives is tricky. In Spanish, if the subject is plural and feminine (for example), the article and adjective accompanying the subject must also be plural and feminine. \nLet’s look at an actual example: To say “the red flowers,” in Spanish, we say las flores rojas. See how the article, noun and adjective all end in –s since it’s plural, and las and rojas end in –as since flor is feminine. If we only had “the red flower,” singular, it would be la flor roja.");

				break;
				// displays the content for C & P Rules
			case 7:
				title.setText("C & P Rules");
				image.setImage(new Image ("file:resources/candp1.png.gif"));
				info.setText("While much of the punctuation stays the same for these two languages, there are a few slight differences to note. \nIn English, there is only punctuation at the end of a sentence, whereas in Spanish when asking a question or expressing excitement, punctuation is placed at both the beginning and the end of the sentence. An upside-down question mark or upside-down exclamation point will start the sentence, and a right-side up mark will end it. \nSecondly, in the Spanish language when writing out numbers, a period will separate numbers by the thousands instead of a comma, and a comma will separate whole numbers from decimals. \nLastly, there are just a few simple differences in capitalization between the two languages. Days of the week, months of the year and languages aren’t capitalized in Spanish.");
				break;
				// displays the content for Subject
			case 8:
				title.setText("Subject");
				image.setImage(new Image ("file:resources/subject1.png"));
				info.setText("Undoubtedly, all the conjugations of Spanish can seem stressful and overwhelming at first, but once you start forming sentences, you’ll see how much the rest of the sentence becomes simplified after. \nBy using the proper conjugation in Spanish, you already know the tense and the subject without explicitly stating it. Because of this, it is more acceptable to leave out some parts of a sentence that we would normally state in English, such as the subject. \nFor example, to say “I sleep” in Spanish, it’s okay to just say duermo, rather than both the subject and verb, yo duermo.");
				break;
				// displays the content for Spelling
			case 9:
				title.setText("Spelling");
				image.setImage(new Image ("file:resources/spelling1.gif"));
				info.setText("In the English language, we can have spelling bees because of how irregular, difficult and unintuitive spelling can be. In Spanish, usually spelling a word is so simple that it can almost always be accomplished just by sounding it out. \nWhile in English, letters can sound long, short or even silent—creating over a dozen different vowel sounds—in Spanish, there are only five. Simply enough, each vowel in the Spanish language only has one unique sound. \nThe most trouble with spelling in Spanish for English speakers comes from the false cognitive sound of letters. For instance, in Spanish, the letter “v” is often pronounced like English “b,” and what sounds like an English “y” is actually a Spanish “ll.”");
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
	
	//makes the necessary getters and setters
	public static int getPicSelect() {
		return picSelect;
	}
	public static void setPicSelect(int picSelect) {
		GrammarTestController.picSelect = picSelect;
	}
}
