package application;

public class Flashcard{

	//Initialize the term and definition for the Flashcard
	private String english;
	private String spanish;
	
	//make the default constructor
	public Flashcard(){
		english= "Error: No input";
		spanish= "Error: No input";
	}
	
	//make the overloaded constructor
	public Flashcard(String englishTemp, String spanishTemp){
		english= englishTemp;
		spanish= spanishTemp;
	}

	//getters and setters
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getSpanish() {
		return spanish;
	}
	public void setSpanish(String spanish) {
		this.spanish = spanish;
	}
	
}
