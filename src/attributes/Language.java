package attributes;

import structure.Proficiency;
import util.EnumUtil;

public enum Language implements Proficiency {
    COMMON,DWARVISH,ELVISH,GIANT,GNOMISH,GOBLIN,HALFLING,ORC,ABYSSAL,CELESTIAL,DRACONIC,DEEP_SPEECH,INFERNAL,PRIMORDIAL,SYLVAN,UNDERCOMMON;

    private String string;

    Language() {
        this.string = EnumUtil.convertString(super.toString());
    }


    public String toString() {
        return string;
    }

    public String getID() {
        return "LANGUAGE." + super.toString();
    }
}
