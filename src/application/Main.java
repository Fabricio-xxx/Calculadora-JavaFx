package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			
			  FXMLLoader loader = new FXMLLoader();
			  loader.setLocation(getClass().getResource("Calculadora.fxml"));
			 
			
			/*
			 * Parent root = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));
			 * Scene scene = new Scene(root);
			 */
			   
			
			Scene scene = new Scene(loader.load());
			
			
			//BorderPane root = new BorderPane();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
