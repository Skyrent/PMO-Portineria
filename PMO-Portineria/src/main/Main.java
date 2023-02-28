package main;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	private static Stage stg;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stg = primaryStage;
			stg.setResizable(false);
			BorderPane root = FXMLLoader.load(getClass().getResource("/View/MainScene.fxml"));
			Scene scene = new Scene(root);
			stg.setScene(scene);
			stg.setTitle("Gestore Portineria");
			stg.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeScene(String fxml) throws IOException {
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
	} 
	
	public static void main(String[] args) {
		launch();
	}
}
