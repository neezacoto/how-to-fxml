import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 * This class is responsible for the javafx thats injecting into the main UI, which is GreetingsUI.fxml
 */
public class GreetingsTitle extends BorderPane{

    //The label that changes
    private Label greeting;

    //The one instance that's live in the program (Singleton design pattern)
    private static GreetingsTitle instance;

    //create the new instance
    public static GreetingsTitle newInstance() {
        instance = new GreetingsTitle();
        return instance;
    }

    //retrieve the one instance in the program
    public static GreetingsTitle getInstance() {
        return instance;
    }

    /**
     * Constructor that sets the style
     * Remember that 'this' refers to this class, which is a BorderPane,
     * the one we want to inject.
     */
    public GreetingsTitle() {
        //You can set styles using styling properties
        //You can find all the styling possiblites via: 
        //https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html
        this.setStyle("-fx-background-color: black");

        //create the label that will sit in the center of this BorderPane
        greeting = new Label("Press a Greeting Button");
        this.setCenter(greeting);

        //when setting multiple styles, don't create multiple .setStyle statements. 
        //They will just overwrite, what you need to do is put a ;
        //you can write a whole seperate style sheet, but that's out the scope
        greeting.setStyle("-fx-text-fill: white; -fx-font-size: 30");
        //greeting.setStyle("-fx-font-size: 30"); <-- uncommenting would overwrite the previous style
    }

    /**
     * Changes the text
     * @param str the string that will change the label
     */
    public void setGreeting(String str) {
        greeting.setText(str); ;
    }

    /**
     * This is how we get the BorderPane to be injected to the SceneController
     * @return 'this', which is the BorderPane
     */
    public BorderPane getGreetingsTitle() {
        return this;
    }
    
}
