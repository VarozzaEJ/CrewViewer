package javafxexample;

public class Character {
    private String name, title;
    private int mutationResistance;
    private CharacterState state;
    private static int numberAlive;

    public Character(String name, String title, int mutationResistance) {
        this.name = name;
        this.title = title;
        this.mutationResistance = mutationResistance;
        this.state = CharacterState.NORMAL;
        numberAlive++;
    }

    public String getName() {
        return this.name;
    }
    
    public int getMutationResistance() {
        return this.mutationResistance;
    }

    public String getTitle() {
        return this.title;
    }

    public CharacterState getState() {
        return this.state;
    }

    public void mutate() {
        if(this.mutationResistance > 0) {
            this.state = CharacterState.MUTATED;
            this.mutationResistance--;
        } else {
            this.state = CharacterState.DEAD;
            numberAlive--;
        }
    }

    public void revert() {
        if(this.state == CharacterState.MUTATED) {
            this.state = CharacterState.NORMAL;
        }
    }

    public static int getNumberAlive() {
        return numberAlive;
    }

    public String toString() {
        if(this.state != CharacterState.DEAD) {
            return (this.name + "\n" + "(" + this.mutationResistance + " left)");
        }else {
            return this.name;
        }
    }
}
