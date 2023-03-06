package main;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.sql.*;

public class Main extends Application {
	
	private static Stage stg;
	public static Connection conn;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stg = primaryStage;
			stg.setResizable(false);
			Parent root = FXMLLoader.load(getClass().getResource("/View/LogIn.fxml"));
			stg.setScene(new Scene(root));
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
	
	public static void main(String[] args) throws Exception {
	    conn = DriverManager.getConnection("jdbc:sqlite:database.db");
		launch();
	}
}
 

