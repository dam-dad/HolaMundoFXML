package dad.holamundo.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HolaMundoController implements Initializable {
	
	// model
	
	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty saludo = new SimpleStringProperty();
	
	// view 
	
	@FXML
	private VBox view;
	
	@FXML
	private TextField nombreText;
	
	@FXML
	private Button saludarButton;
	
	@FXML 
	private Label saludoLabel;
	
	public HolaMundoController() {
		try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/HolaMundoView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		nombre.bind(nombreText.textProperty());
		
		saludoLabel.textProperty().bind(saludo);

	}
	
	public VBox getView() {
		return view;
	}
	
	@FXML
	private void onSaludarAction(ActionEvent e) {
		saludo.set("¡Hola " + nombre.get() + "!");
	}

}
