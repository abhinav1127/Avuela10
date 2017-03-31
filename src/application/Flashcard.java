package application;

/**
 * 
 * @author Abhinav Tirath
 *
 */
public class Flashcard{

	//Initialize the term and definition for the Flashcard
	private String english;
	private String spanish;
	
	//make the default constructor
	/**
	 * This constructs a flashcard 
	 */
	public Flashcard(){
		english= "Error: No input";
		spanish= "Error: No input";
	}
	
	//make the overloaded constructor
	/**
	 * This method creates a flashcard with a specified English and Spanish words
	 * @param englishTemp the English word in the card
	 * @param spanishTemp the Spanish word in the card
	 */
	public Flashcard(String englishTemp, String spanishTemp){
		english= englishTemp;
		spanish= spanishTemp;
	}

	//getters and setters
	/**
	 * This is a getter for english
	 * @return it returns english
	 */
	public String getEnglish() {
		return english;
	}
	/**
	 * This is a setter for english
	 */
	public void setEnglish(String english) {
		this.english = english;
	}
	/**
	 * This is a getter for spanish
	 * @return it returns spanish
	 */
	public String getSpanish() {
		return spanish;
	}
	/**
	 * This is a setter for spanish
	 */
	public void setSpanish(String spanish) {
		this.spanish = spanish;
	}
	
}
