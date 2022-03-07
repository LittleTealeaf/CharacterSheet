package attributes;

import character.Proficiency;
import util.EnumUtil;

public enum Armor implements Proficiency {
    LIGHT_ARMOR,
    MEDIUM_ARMOR,
    HEAVY_ARMOR,
    SHIELD;

    private String string;

    Armor() {
        this.string = EnumUtil.convertString(super.toString());
    }

    public String toString() {
        return string;
    }

    public String getID() {
        return "ARMOR." + super.toString();
    }
}
