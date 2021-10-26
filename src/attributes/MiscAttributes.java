package attributes;

import structure.Attribute;
import util.EnumUtil;

public enum MiscAttributes implements Attribute {
    ARMOR_CLASS, INITIATIVE, MAX_DEX_BONUS, RUN_SPEED;
    private String string;

    MiscAttributes() {
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
        return "MISC." + super.toString();
    }
}
