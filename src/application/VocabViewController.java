package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VocabViewController {

	//initialize the buttons pertaining to each topic
	@FXML
	Button general;
	@FXML
	Button school;
	@FXML
	Button places;
	@FXML
	Button business1;
	@FXML
	Button business2;
	@FXML
	Button household;
	@FXML
	Button bClothing;
	@FXML
	Button nature;
	@FXML
	Button religion;
	@FXML
	Button transport;
	//initialize the buttons that decide which languages to display
	@FXML
	Button dEnglish;
	@FXML
	Button dSpanish;
	@FXML
	Button dBoth;
	@FXML
	//initialize the TextFields where the terms and definitions will appear
	Label english;
	@FXML
	Label spanish;
	FlashcardSet chosenSet=null;
	//initialize the Stage to return to the main menu
	@FXML
	Stage prevStage;
	//initialize the buttons that will help switch the displayed card
	@FXML
	Button prevCard;
	@FXML
	Button nextCard;
	//initializes the label that shows which card (1-20) is currently being displayed. Initially invisible but becomes visible when a set is chosen
	@FXML
	Label whichCard;
	//this is the variable that will decide which card is being displayed
	int chosenCard=1;
	//initializes the button that allows the user to return to the main menu
	@FXML
	private Button exit;
	
	
	//make the setter for prevStage
	private void setPrevStage(Stage stage){
        this.prevStage = stage;
	}
	
	//This method runs upon the opening of the scene and helps prevent null pointer exceptions by setting the opacity of the Label whichCard to 0
	@FXML
	private void initialize(){
		whichCard.setOpacity(0);
	}
	
	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the General section 
	private FlashcardSet general1Construction(){
		FlashcardSet general1= new FlashcardSet("general", 20);
		general1.fcArray[0]= new Flashcard("Good morning", "Buenos días");
		general1.fcArray[1]= new Flashcard("Good afternoon", "Buenas tardes");
		general1.fcArray[2]= new Flashcard("Good morning", "Buenos días");
		general1.fcArray[3]= new Flashcard("Good evening", "Buenas noches");
		general1.fcArray[4]= new Flashcard("Hello", "Hola");
		general1.fcArray[5]= new Flashcard("My name is", "Me llamo");
		general1.fcArray[6]= new Flashcard("How are you?", "¿Cómo está usted?");
		general1.fcArray[7]= new Flashcard("I am fine", "Estoy bien");
		general1.fcArray[8]= new Flashcard("Nice to meet you", "Mucho gusto");
		general1.fcArray[9]= new Flashcard("Goodbye", "Adiós");
		general1.fcArray[10]= new Flashcard("See you later", "Hasta luego");
		general1.fcArray[11]= new Flashcard("Where is the restroom?", "¿Dónde está el baño?");
		general1.fcArray[12]= new Flashcard("Excuse me", "Perdóname");
		general1.fcArray[13]= new Flashcard("Please", "Por favor");
		general1.fcArray[14]= new Flashcard("Thank you", "Gracias");
		general1.fcArray[15]= new Flashcard("I'm sorry", "Lo siento");
		general1.fcArray[16]= new Flashcard("Bless you", "Salud");
		general1.fcArray[17]= new Flashcard("Yes", "Sí");
		general1.fcArray[18]= new Flashcard("No", "No");
		general1.fcArray[19]= new Flashcard("I do not understand", "Yo no comprendo");

		return general1;
	}
	
	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the School section 
	private FlashcardSet school1Construction(){
		FlashcardSet school1= new FlashcardSet("general", 20);
		school1.fcArray[0]= new Flashcard("to draw", "dibujar");
		school1.fcArray[1]= new Flashcard("computer science", "informática");
		school1.fcArray[2]= new Flashcard("economics", "economía");
		school1.fcArray[3]= new Flashcard("history", "historia");
		school1.fcArray[4]= new Flashcard("math", "matemáticas");
		school1.fcArray[5]= new Flashcard("music", "música");
		school1.fcArray[6]= new Flashcard("book", "el libro");
		school1.fcArray[7]= new Flashcard("high school", "el colegio");
		school1.fcArray[8]= new Flashcard("college", "la universidad");
		school1.fcArray[9]= new Flashcard("computer", "la computadora");
		school1.fcArray[10]= new Flashcard("dictionary", "el diccionário");
		school1.fcArray[11]= new Flashcard("paper", "el papel");
		school1.fcArray[12]= new Flashcard("pencil", "el lapiz");
		school1.fcArray[13]= new Flashcard("professor", "profesor/a");
		school1.fcArray[14]= new Flashcard("school", "la escuela");
		school1.fcArray[15]= new Flashcard("exam", "el examen");
		school1.fcArray[16]= new Flashcard("to study", "estudiar");
		school1.fcArray[17]= new Flashcard("to learn", "aprender");
		school1.fcArray[18]= new Flashcard("to write", "escribir");
		school1.fcArray[19]= new Flashcard("to read", "leer");

		return school1;
	}
	
	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the Places section 
	private FlashcardSet places1Construction(){
		FlashcardSet places1= new FlashcardSet("places1", 20);
		places1.fcArray[0]= new Flashcard("airport", "el aeropuerto");
		places1.fcArray[1]= new Flashcard("bank", "el banco");
		places1.fcArray[2]= new Flashcard("beach", "la playa");
		places1.fcArray[3]= new Flashcard("cafe", "el café");
		places1.fcArray[4]= new Flashcard("church", "la iglesia");
		places1.fcArray[5]= new Flashcard("factory", "la fábrica");
		places1.fcArray[6]= new Flashcard("grocery store", "almacén");
		places1.fcArray[7]= new Flashcard("home", "el hogar");
		places1.fcArray[8]= new Flashcard("hospital", "la hospital");
		places1.fcArray[9]= new Flashcard("library", "la biblioteca");
		places1.fcArray[10]= new Flashcard("market", "el mercado");
		places1.fcArray[11]= new Flashcard("movie theater", "el cine");
		places1.fcArray[12]= new Flashcard("museum", "el museo");
		places1.fcArray[13]= new Flashcard("park", "el parque");
		places1.fcArray[14]= new Flashcard("pool", "la piscina");
		places1.fcArray[15]= new Flashcard("restaurant", "el restaurante");
		places1.fcArray[16]= new Flashcard("store", "la tienda");
		places1.fcArray[17]= new Flashcard("bookstore", "la librería");
		places1.fcArray[18]= new Flashcard("police station", "la estación de la policía");
		places1.fcArray[19]= new Flashcard("pharmacy", "la farmácia");
		return places1;
	}
	
	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the Business1 section 
	private FlashcardSet business11Construction(){
		FlashcardSet business1= new FlashcardSet("business1", 20);
		business1.fcArray[0]= new Flashcard("office", "la officina");
		business1.fcArray[1]= new Flashcard("city", "la ciudad");
		business1.fcArray[2]= new Flashcard("the rent", "la renta");
		business1.fcArray[3]= new Flashcard("tax", "el impuesto");
		business1.fcArray[4]= new Flashcard("the cost", "la cuesta");
		business1.fcArray[5]= new Flashcard("price", "el précio");
		business1.fcArray[6]= new Flashcard("bill", "la cuenta");
		business1.fcArray[7]= new Flashcard("estimate", "la estimación");
		business1.fcArray[8]= new Flashcard("check", "el cheque");
		business1.fcArray[9]= new Flashcard("passport", "el passaporte");
		business1.fcArray[10]= new Flashcard("luggage", "el equipaje");
		business1.fcArray[11]= new Flashcard("currency exchange", "el intercambio de modernidad");
		business1.fcArray[12]= new Flashcard("customs", "las aduanas");
		business1.fcArray[13]= new Flashcard("business", "negocio");
		business1.fcArray[14]= new Flashcard("company", "la empresa");
		business1.fcArray[15]= new Flashcard("information", "la información");
		business1.fcArray[16]= new Flashcard("to pay", "pagar");
		business1.fcArray[17]= new Flashcard("to rent", "alquilar");
		business1.fcArray[18]= new Flashcard("to cost", "costar");
		business1.fcArray[19]= new Flashcard("to sell", "vender");
		return business1;
	}

	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the Business2 section 
	private FlashcardSet business12Construction(){
		FlashcardSet business2= new FlashcardSet("business2", 20);
		business2.fcArray[0]= new Flashcard("to deposit", "depositar");
		business2.fcArray[1]= new Flashcard("boss", "el jefe");
		business2.fcArray[2]= new Flashcard("director", "el director");
		business2.fcArray[3]= new Flashcard("meeting", "reunión");
		business2.fcArray[4]= new Flashcard("business deals", "negocios");
		business2.fcArray[5]= new Flashcard("work contract", "contrato laboral");
		business2.fcArray[6]= new Flashcard("company staff", "personal");
		business2.fcArray[7]= new Flashcard("work agreement", "acuerdo");
		business2.fcArray[8]= new Flashcard("full-time or part-time schedule", "jornada completa o parcial");
		business2.fcArray[9]= new Flashcard("a permanent work contract", "contrato fijo/indefinido");
		business2.fcArray[10]= new Flashcard("a temporary work contract", "contrato temporal");
		business2.fcArray[11]= new Flashcard("internship", "prácticas");
		business2.fcArray[12]= new Flashcard("marketing", "comercialización");
		business2.fcArray[13]= new Flashcard("profit", "beneficio");
		business2.fcArray[14]= new Flashcard("stock exchange", "la bolsa");
		business2.fcArray[15]= new Flashcard("purchase", "compra");
		business2.fcArray[16]= new Flashcard("money", "dinero");
		business2.fcArray[17]= new Flashcard("to demand", "demanda");
		business2.fcArray[18]= new Flashcard("savings", "ahorros");
		business2.fcArray[19]= new Flashcard("share (within a company)", "acción");
		return business2;
	}
	
	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the Household section 
	private FlashcardSet household1Construction(){
		FlashcardSet household1= new FlashcardSet("household", 20);
		household1.fcArray[0]= new Flashcard("house", "la casa");
		household1.fcArray[1]= new Flashcard("apartment", "el apartamento");
		household1.fcArray[2]= new Flashcard("room", "el cuarto");
		household1.fcArray[3]= new Flashcard("living room", "la sala");
		household1.fcArray[4]= new Flashcard("kitchen", "la cocina");
		household1.fcArray[5]= new Flashcard("stairs", "escaleras");
		household1.fcArray[6]= new Flashcard("bathroom", "el baño");
		household1.fcArray[7]= new Flashcard("shower", "la ducha");
		household1.fcArray[8]= new Flashcard("locker", "el armario");
		household1.fcArray[9]= new Flashcard("window", "la ventana");
		household1.fcArray[10]= new Flashcard("wall", "la pared");
		household1.fcArray[11]= new Flashcard("table", "la mesa");
		household1.fcArray[12]= new Flashcard("chair", "la silla");
		household1.fcArray[13]= new Flashcard("desk", "el escritorio");
		household1.fcArray[14]= new Flashcard("door", "el puerto");
		household1.fcArray[15]= new Flashcard("light", "la luz");
		household1.fcArray[16]= new Flashcard("bed", "la cama");
		household1.fcArray[17]= new Flashcard("blanker", "la manta");
		household1.fcArray[18]= new Flashcard("television", "la televisión");
		household1.fcArray[19]= new Flashcard("refrigerator", "la refrijedora");
		return household1;
	}
	
	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the Body and Clothing section 
	private FlashcardSet bClothing1Construction(){
		FlashcardSet bClothing1= new FlashcardSet("bClothing", 20);
		bClothing1.fcArray[0]= new Flashcard("head", "la cabeza");
		bClothing1.fcArray[1]= new Flashcard("brain", "el cerebro");
		bClothing1.fcArray[2]= new Flashcard("ear", "el oreja");
		bClothing1.fcArray[3]= new Flashcard("face", "la cara");
		bClothing1.fcArray[4]= new Flashcard("eye", "el ojo");
		bClothing1.fcArray[5]= new Flashcard("mouth", "la boca");
		bClothing1.fcArray[6]= new Flashcard("nose", "la naríz");
		bClothing1.fcArray[7]= new Flashcard("neck", "el cuello");
		bClothing1.fcArray[8]= new Flashcard("shoulder", "el hombro");
		bClothing1.fcArray[9]= new Flashcard("chest", "el pecho");
		bClothing1.fcArray[10]= new Flashcard("stomach", "el estómigo");
		bClothing1.fcArray[11]= new Flashcard("waist", "la cintura");
		bClothing1.fcArray[12]= new Flashcard("back", "la espalda");
		bClothing1.fcArray[13]= new Flashcard("heart", "el corazón");
		bClothing1.fcArray[14]= new Flashcard("hat", "el sombrero");
		bClothing1.fcArray[15]= new Flashcard("earrings", "los pendientes");
		bClothing1.fcArray[16]= new Flashcard("shirt", "la camisa");
		bClothing1.fcArray[17]= new Flashcard("dress", "el vestido");
		bClothing1.fcArray[18]= new Flashcard("pants", "los pantalones");
		bClothing1.fcArray[19]= new Flashcard("skirt", "la falda");
		return bClothing1;
	}
	
	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the Nature section 
	private FlashcardSet nature1Construction(){
		FlashcardSet nature1= new FlashcardSet("nature", 20);
		nature1.fcArray[0]= new Flashcard("dog", "perro/a");
		nature1.fcArray[1]= new Flashcard("cat", "gato/a");
		nature1.fcArray[2]= new Flashcard("mouse", "ratón");
		nature1.fcArray[3]= new Flashcard("bird", "ave");
		nature1.fcArray[4]= new Flashcard("hen", "gallina");
		nature1.fcArray[5]= new Flashcard("cow", "la vaca");
		nature1.fcArray[6]= new Flashcard("duck", "pato/a");
		nature1.fcArray[7]= new Flashcard("horse", "el caballo");
		nature1.fcArray[8]= new Flashcard("pig", "cerdo/a");
		nature1.fcArray[9]= new Flashcard("sheep", "la oveja");
		nature1.fcArray[10]= new Flashcard("lion", "el lión");
		nature1.fcArray[11]= new Flashcard("tiger", "el tigre");
		nature1.fcArray[12]= new Flashcard("bear", "el oso");
		nature1.fcArray[13]= new Flashcard("forest", "el bosque");
		nature1.fcArray[14]= new Flashcard("tree", "el árbol");
		nature1.fcArray[15]= new Flashcard("plant", "la planta");
		nature1.fcArray[16]= new Flashcard("flower", "la flor");
		nature1.fcArray[17]= new Flashcard("jungle", "la selva");
		nature1.fcArray[18]= new Flashcard("ocean", "el océano");
		nature1.fcArray[19]= new Flashcard("river", "el río");
		return nature1;
	}
	
	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the Religion section 
	private FlashcardSet religion1Construction(){
		FlashcardSet religion1= new FlashcardSet("religion", 20);
		religion1.fcArray[0]= new Flashcard("angel", "el ángel");
		religion1.fcArray[1]= new Flashcard("Baptism", "el bautismo");
		religion1.fcArray[2]= new Flashcard("Bible", "la biblia");
		religion1.fcArray[3]= new Flashcard("bishop", "el obispo");
		religion1.fcArray[4]= new Flashcard("Buddhism", "el buddismo");
		religion1.fcArray[5]= new Flashcard("cathedral", "el catedral");
		religion1.fcArray[6]= new Flashcard("Christianity", "el cristianismo");
		religion1.fcArray[7]= new Flashcard("church", "la iglesia");
		religion1.fcArray[8]= new Flashcard("faith", "la fe");
		religion1.fcArray[9]= new Flashcard("God", "el Diós");
		religion1.fcArray[10]= new Flashcard("Judaism", "el judaismo");
		religion1.fcArray[11]= new Flashcard("Pope", "el Pápa");
		religion1.fcArray[12]= new Flashcard("prophet", "la profeta");
		religion1.fcArray[13]= new Flashcard("religion", "la religión");
		religion1.fcArray[14]= new Flashcard("sermon", "el sermón");
		religion1.fcArray[15]= new Flashcard("temple", "el templo");
		religion1.fcArray[16]= new Flashcard("to sing", "cantar");
		religion1.fcArray[17]= new Flashcard("to worship", "adorar");
		religion1.fcArray[18]= new Flashcard("to pray", "orar");
		religion1.fcArray[19]= new Flashcard("to repent (reflexive)", "arrepentirse");
		return religion1;
	}
	
	//This method returns a set initialized with flashcards with English and Spanish that are relevant to the Transport section 
	private FlashcardSet transport1Construction(){
		FlashcardSet transport1= new FlashcardSet("transport", 20);
		transport1.fcArray[0]= new Flashcard("airplane", "avión");
		transport1.fcArray[1]= new Flashcard("bicycle", "bicicleta");
		transport1.fcArray[2]= new Flashcard("boat", "barco");
		transport1.fcArray[3]= new Flashcard("bus", "autobús");
		transport1.fcArray[4]= new Flashcard("automobile", "automovíl");
		transport1.fcArray[5]= new Flashcard("car", "carro/ coche");
		transport1.fcArray[6]= new Flashcard("motorcycle", "motocicleta");
		transport1.fcArray[7]= new Flashcard("subway", "subterráneo");
		transport1.fcArray[8]= new Flashcard("taxi", "taxi");
		transport1.fcArray[9]= new Flashcard("train", "tren");
		transport1.fcArray[10]= new Flashcard("engine", "motor");
		transport1.fcArray[11]= new Flashcard("map", "el mapa");
		transport1.fcArray[12]= new Flashcard("pencil", "los direcciones");
		transport1.fcArray[13]= new Flashcard("directions", "profesor");
		transport1.fcArray[14]= new Flashcard("to accelerate", "acelerar");
		transport1.fcArray[15]= new Flashcard("to brake", "retardarse");
		transport1.fcArray[16]= new Flashcard("to stop", "parar");
		transport1.fcArray[17]= new Flashcard("to go", "ir");
		transport1.fcArray[18]= new Flashcard("left", "la izqierda");
		transport1.fcArray[19]= new Flashcard("right", "el derecho");
		return transport1;
	}
	
	
	//method to handle the selection of a flashcard set
	public void handleFCSelection(ActionEvent event) throws IOException{
		
		
		int count=0; //this variable will be used for the switch
	
		/*Change an integer to a certain value depending on the ActionEvent’s source 
		 * by using a series of if statements (as we cannot switch on an event source)
		 */
		if(event.getSource()==general){
			count=1;		
		}
		if(event.getSource()==school){
			count=2;
		}
		if(event.getSource()==places){
			count=3;
		}
		if(event.getSource()==business1){
			count=4;
		}
		if(event.getSource()==business2){
			count=5;
		}
		if(event.getSource()==household){
			count=6;
		}
		if(event.getSource()==bClothing){
			count=7;
		}
		if(event.getSource()==nature){
			count=8;
		}
		if(event.getSource()==religion){
			count=9;
		}
		if(event.getSource()==transport){
			count=10;
		}
	
		//sets it so that the first card will always be displayed initially when a topic is selected
		chosenCard=1;
		//Changes the text so that it shows card#1 when a topic is selected
		whichCard.setText("Card#"+ chosenCard);
		//makes the label visible
		whichCard.setOpacity(1);
		
		
		//switch on the integer value
		switch(count){
			//These ten cases choose which set will be displayed
			case 1:
				chosenSet= general1Construction();
				break;
			case 2:
				chosenSet= school1Construction();
				break;
			case 3:
				chosenSet= places1Construction();
				break;
			case 4:
				chosenSet= business11Construction();
				break;
			case 5:
				chosenSet= business12Construction();
				break;
			case 6:
				chosenSet= household1Construction();
				break;
			case 7:
				chosenSet= bClothing1Construction();
				break;
			case 8:
				chosenSet= nature1Construction();
				break;
			case 9:
				chosenSet= religion1Construction();
				break;
			case 10:
				chosenSet= transport1Construction();
				break;	
		}
		
		//Sets the text as the English and Spanish components of the first flashcard of the chosen set
		english.setText(chosenSet.fcArray[0].getEnglish());
		spanish.setText(chosenSet.fcArray[0].getSpanish());
	}
		
	//This method helps choose which words are displayed
	public void handleDisplay(ActionEvent event) throws IOException{
			
		if(event.getSource()== this.dBoth){
			
			//makes both Labels visible
			english.setOpacity(1);
			spanish.setOpacity(1);
		}
			
		if(event.getSource()== this.dEnglish){
					
			//makes English visible and Spanish invisible
			english.setOpacity(1);
			spanish.setOpacity(0);
		}
		
		if(event.getSource()== this.dSpanish){
					
			//makes Spanish visible and English invisible
			english.setOpacity(0);
			spanish.setOpacity(1);
		}
	}
	
	//method to handle the exit event
	public void handle(ActionEvent event) throws IOException{
		
		//calls exitAction to close the current Stage
		if(event.getSource()==exit){
			exitAction();
		}
	}
	
	//Handles the changes in the selection of cards within a set
	public void handleCardSelection(ActionEvent event) throws IOException{
		
		//these parameters ensure that a null pointer exception will not be thrown
		if((event.getSource()==prevCard)&& (chosenCard>1)&&(whichCard.getOpacity()==1)){
			//decrements the chosenCard variable, changes the number displayed in the label, and sets the label to the new flashcard's word
			chosenCard--;
			whichCard.setText("Card#"+ chosenCard);
			this.english.setText(chosenSet.fcArray[chosenCard-1].getEnglish());
			this.spanish.setText(chosenSet.fcArray[chosenCard-1].getSpanish());
		}
		
		//these parameters ensure that a null pointer exception will not be thrown
		if((event.getSource()==nextCard)&& (chosenCard<20)&&(whichCard.getOpacity()==1)){
			//increments the chosenCard variable, changes the number displayed in the label, and sets the label to the new flashcard's word
			chosenCard++;
			whichCard.setText("Card#"+ chosenCard);
			this.english.setText(chosenSet.fcArray[chosenCard-1].getEnglish());
			this.spanish.setText(chosenSet.fcArray[chosenCard-1].getSpanish());
		}
		
	}
	
	private void exitAction(){
	    // get a handle to the stage
	    Stage stage = (Stage) exit.getScene().getWindow();
	    // closes the stage
	    stage.close();
	}
		
	
}
