import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class GreetingsTitle extends BorderPane{

    private Label greeting;

    private static GreetingsTitle instance;

    public static GreetingsTitle newInstance() {
        instance = new GreetingsTitle();
        return instance;
    }

    public static GreetingsTitle getInstance() {
        return instance;
    }

    public GreetingsTitle() {
        this.setStyle("-fx-background-color: black");

        greeting = new Label("Press a Greeting Button");
        
        
        
        greeting.setStyle("-fx-text-fill: white; -fx-font-size: 30");
        //greeting.setStyle("-fx-font-size: 30");
        this.setCenter(greeting);

    }

    public void setGreeting(String str) {
        greeting.setText(str); ;
    }

    public BorderPane getGreetingsTitle() {
        return this;
    }
    
}
