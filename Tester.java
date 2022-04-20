/**
 * @author Christian
 */
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.WindowEvent;

public class Tester extends Application {

 	@Override
	public void start(Stage stage) {
		try {
		Parent root = FXMLLoader.load(getClass().getResource("GreetingsUI.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
        //close program when x is hit
        stage.setOnCloseRequest(new EventHandler<WindowEvent>(){
            @Override
            public void handle(WindowEvent e) {
            Platform.exit();
            System.exit(0);
            }
        });
                
		} catch(Exception e) {
		 e.printStackTrace();
		}
	}
 
	public static void main(String[] args) {
		launch(args);
		
	}
}