package attributes;

import character.Attribute;
import util.EnumUtil;

public enum Ability implements Attribute {
    STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA;

    private String string;

    Ability() {
        this.string = EnumUtil.convertString(super.toString());
    }

    public static int getModifier(int score) {
        return (score - 10) / 2;
    }

    public String toString() {
        return string;
    }

    public String toShort() {
        return string.substring(0, 3);
    }

    public String getID() {
        return "ABILITY." + super.toString();
    }
}
