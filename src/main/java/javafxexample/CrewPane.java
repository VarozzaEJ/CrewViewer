package javafxexample;

import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CrewPane extends FlowPane {
    public CrewPane(Character[] crew) {
        setStyle("-fx-background-color: midnightblue");
        setHgap(25);
        setVgap(25);
        setAlignment(Pos.CENTER);
        Label titleLabel = new Label("USS Unreliant - Crew");
        titleLabel.setFont(new Font("Helvetica", 35));
        titleLabel.setTextFill(Color.GOLD);
        getChildren().add(titleLabel);
        for (Character character : crew) {
            CharacterSprite sprite = new CharacterSprite(character);
            sprite.setOnMouseClicked(this::mouseClickSprite);
            getChildren().add(sprite);
        }
    }

    private void mouseClickSprite(MouseEvent event) {
        CharacterSprite source = (CharacterSprite)event.getSource();
        source.toggleState();
        if(Character.getNumberAlive() == 0) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText("The Entire Crew Has Died!");
            alert.setTitle(null);
            alert.setHeaderText(null);
            alert.showAndWait();
        }
    }
}
