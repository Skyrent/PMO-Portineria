package controller;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import model.*;
import java.io.IOException;
import main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LogInController {
	
	public LogInModel loginModel = new LogInModel();
 
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Text wrongLogIn;
 
     
     @FXML
     void userLogIn(ActionEvent event) throws IOException, SQLException {
    	if (loginModel.canLogIn(username.getText(), password.getText()))
    		System.out.println("OOOOOK");
    	else
     		wrongLogIn.setText("Credenziali non valide!");
 	}
 	
 /*	private void changeScene() throws IOException {
 		Main m = new Main();
 			m.changeScene("/View/AfterLogIn.fxml");
 	} */


  
}