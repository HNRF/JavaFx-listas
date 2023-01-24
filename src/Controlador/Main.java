package Controlador;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage primaryStage) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Vistas.fxml"));
			// Establecemos el título de la ventana
			primaryStage.setTitle("Login");
			// Establecemos el ancho y el alto
			primaryStage.setScene(new Scene(root));
			// Mostramos la ventana
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// validaciones...
		launch(args);
	}
}