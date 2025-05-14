package javafxexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CrewViewer extends Application {

	@Override
	public void start(Stage primaryStage) {
		Character[] characters = new Character[3];
		characters[0] = new Character("Vargus", "Captain", 3);
		characters[1] = new Character("Conan", "Security", 5);
		characters[2] = new Character("Esmerelda", "Doctor", 2);

		Scene scene = new Scene(new CrewPane(characters), 500, 600);
		primaryStage.setTitle("Starship Viewer");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
