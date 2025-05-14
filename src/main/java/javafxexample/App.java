// package javafxexample;

// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Group;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.scene.paint.Color;
// import javafx.scene.text.Text;
// import javafx.stage.Stage;

// import java.io.IOException;

// /**
//  * JavaFX App
//  */
// public class App extends Application {

//     private static Scene scene;

//     @Override
//     public void start(Stage primaryStage) {
//         Text hello = new Text(50, 50, "Hello, JavaFX!");
//         Text question = new Text(120, 80, "How's it going?");

//         Group root = new Group(hello, question);
//         Scene scene = new Scene(root, 300, 120, Color.LIGHTGREEN);

//         primaryStage.setTitle("A JavaFX Program");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     // static void setRoot(String fxml) throws IOException {
//     //     scene.setRoot(loadFXML(fxml));
//     // }

//     // private static Parent loadFXML(String fxml) throws IOException {
//     //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
//     //     return fxmlLoader.load();
//     // }

//     public static void main(String[] args) {
//         launch();
//     }

// }