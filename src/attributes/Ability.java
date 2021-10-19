package attributes;

public enum Ability implements Attributable {
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

    public String toID() {
        return super.toString();
    }

    public static int getModifier(int score) {
        return (score - 10) / 2;
    }
}
