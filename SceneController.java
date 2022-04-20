/**
 * @author Christian
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * Responsible for controlling the main UI elements of the Simulation
 */
public class SceneController implements Initializable{
    
    /**
     * We need to put @FXML before declaring the button
     * The button names are exactly the same within the scene builder. 
     * So the ID we set, must be the same. 
     * 
     * You can see from the GreetingsUI.fxml we generated, those IDs are present.
     * So its important that those names match,
     * likewise with the function that we want the button to call.
     */
    @FXML
    Button helloButton;

    @FXML
    Button hiButton;

    @FXML
    Button howdyButton;

    //This is the container that the application uses
    @FXML
    BorderPane appContainer;
	
	/**
	 * Allows for further rendering after the root element has been proccesed.
     * The root element in this case is our FXML file that we loaded from the tester,
	 */
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //create the only instance that we need (Singleton)
		GreetingsTitle.newInstance();
        //once we get the instance by doing GreetingTitle.getInstance() we have access 
        //to the singleton, and can access it's public methods.
        appContainer.setCenter(GreetingsTitle.getInstance().getGreetingsTitle());
	}

    /**
     * These functions below are called by our buttons. We set this in scenebuilder
     * by setting the onAction to the name of a function. There is no real need for
     * the ActionEvent, the function will be called outright.
     */

    public void sayHello(ActionEvent event) {
        GreetingsTitle.getInstance().setGreeting("Hello");
    }

    public void sayHi(ActionEvent event) {
        GreetingsTitle.getInstance().setGreeting("Hi");
    }

    public void sayHowdy() {
        GreetingsTitle.getInstance().setGreeting("Howdy");
    }
    
}
