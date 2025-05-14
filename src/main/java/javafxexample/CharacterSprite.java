package javafxexample;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class CharacterSprite extends VBox{
    private Character character;
    private Label name;
    private Image normal, mutated, skull;
    private ImageView spriteView;

    public CharacterSprite(Character character) {
        this.character = character;
        
        this.normal = new Image(getClass().getResourceAsStream(this.character.getTitle() + ".png"));
        this.mutated = new Image(getClass().getResourceAsStream("alien.png"));
        this.skull = new Image(getClass().getResourceAsStream("skull.png"));
        this.spriteView = new ImageView(normal);
        this.name = new Label(this.character.toString());
        this.name.setFont(new Font("Helvetica", 25));
        this.name.setTextFill(Color.GOLD);
        this.name.setTextAlignment(TextAlignment.CENTER);
        getChildren().addAll(spriteView, name);
        setAlignment(Pos.CENTER);
    }

    public void toggleState() {
        if(this.character.getState() == CharacterState.NORMAL){
            mutateCharacter();
        } else if(this.character.getState() == CharacterState.MUTATED) {
            revertCharacter();
        }
    }

    private void mutateCharacter() {
        this.character.mutate();
        updateSprite();
    }
    
    private void revertCharacter() {
        this.character.revert();
        updateSprite();
    }

    private void updateSprite() {
        switch (this.character.getState()) {
            case NORMAL:
                getChildren().removeAll(this.spriteView, this.name);
                this.spriteView = new ImageView(this.normal);
                this.name = new Label(this.character.toString());
                this.name.setFont(new Font("Helvetica", 25));
                this.name.setTextFill(Color.GOLD);
                this.name.setTextAlignment(TextAlignment.CENTER);
                getChildren().addAll(this.spriteView, this.name);
                break;
            case MUTATED:
                getChildren().removeAll(this.spriteView, this.name);
                this.spriteView = new ImageView(this.mutated);
                this.name = new Label("Blurg Blurg Blurg");
                this.name.setFont(new Font("Helvetica", 25));
                this.name.setTextFill(Color.GOLD);
                this.name.setTextAlignment(TextAlignment.CENTER);
                getChildren().addAll(this.spriteView, this.name);
                break;
            case DEAD:
                getChildren().removeAll(this.spriteView, this.name);
                this.spriteView = new ImageView(this.skull);
                this.name = new Label("RIP: " + this.character.toString());
                this.name.setFont(new Font("Helvetica", 25));
                this.name.setTextFill(Color.GOLD);
                this.name.setTextAlignment(TextAlignment.CENTER);
                getChildren().addAll(this.spriteView, this.name);
                break;
            default:
                break;
        }
    }

}
