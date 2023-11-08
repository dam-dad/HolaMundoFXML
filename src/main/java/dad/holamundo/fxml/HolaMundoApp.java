package dad.holamundo.fxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HolaMundoApp extends Application {

	private HolaMundoController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new HolaMundoController();
		
		Scene scene = new Scene(controller.getView(), 320, 200);
		
		primaryStage.setTitle("HolaMundo con FXML");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
