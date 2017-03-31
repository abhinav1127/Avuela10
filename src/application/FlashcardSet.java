package application;
/**
 * 
 * @author Abhinav Tirath
 *
 */
public class FlashcardSet {

	//initializes the name 
	String name;
	// initializes an array of flashcards
	Flashcard[] fcArray;
	
	//default constructor
	/**
	 * This constructs a set of flashcards
	 */
	public FlashcardSet(){
		name= "No name given";
		fcArray= new Flashcard[20];
	}
	
	//overloaded constructor and set name and fcArray equal to the inputs
	/**
	 * This constructs a set of flashcards with a name and a certain length
	 * @param nameTemp Specifies the name of the set of flashcards. Example: Nature.
	 * @param arrayLength Specifies the length of the array of the set that will be constructed.
	 */
	public FlashcardSet(String nameTemp, int arrayLength){
		name= nameTemp;
		fcArray= new Flashcard[arrayLength];
	}
	
	//getters and setters
	/**
	 * This is a getter for Name
	 * @return it returns the Name
	 */
	public String getName() {
		return name;
	}
	/**
	 * This is a setter for Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This is a getter for the FcArray
	 * @return it returns the FcArray
	 */
	public Flashcard[] getFcArray() {
		return fcArray;
	}
	/**
	 * This is a setter for Name
	 */
	public void setFcArray(Flashcard[] fcArray) {
		this.fcArray = fcArray;
	}
	
	
}
