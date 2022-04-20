/**
 * @author Christian
 */

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * Responsible for controlling the main UI elements of the Simulation
 */
public class SceneController implements Initializable{
    
    @FXML
    Button helloButton;

    @FXML
    Button hiButton;

    @FXML
    Button howdyButton;

    @FXML
    BorderPane appContainer;
	
	/**
	 * Allows for further rendering after the root element has been proccesed
	 */
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
		GreetingsTitle.newInstance();
        appContainer.setCenter(GreetingsTitle.getInstance().getGreetingsTitle());
	}

    public void sayHello(ActionEvent event) {
        GreetingsTitle.getInstance().setGreeting("Hello");
    }

    public void sayHi(ActionEvent event) {
        GreetingsTitle.getInstance().setGreeting("Hi");
    }

    public void sayHowdy(ActionEvent event) {
        GreetingsTitle.getInstance().setGreeting("Howdy");
    }
    
}
