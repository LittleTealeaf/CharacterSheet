package data;

public enum Ability {
    STRENGTH,DEXTERITY,CONSTITUTION,INTELLIGENCE,WISDOM,CHARISMA;

    String string;

    Ability() {
        this.string = super.toString().charAt(0) + super.toString().substring(1);
    }


    public String toString() {
        return string;
    }

    public String toShort() {
        return string.substring(0,3);
    }
}
