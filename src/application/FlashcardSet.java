package application;

public class FlashcardSet {

	//initializes the name 
	String name;
	// initializes an array of flashcards
	Flashcard[] fcArray;
	
	//default constructor
	FlashcardSet(){
		name= "No name given";
		fcArray= new Flashcard[20];
	}
	
	//overloaded constructor and set name and fcArray equal to the inputs
	FlashcardSet(String nameTemp, int arrayLength){
		name= nameTemp;
		fcArray= new Flashcard[arrayLength];
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Flashcard[] getFcArray() {
		return fcArray;
	}
	public void setFcArray(Flashcard[] fcArray) {
		this.fcArray = fcArray;
	}
	
	
}
