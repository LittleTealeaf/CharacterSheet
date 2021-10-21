package attributes;

import structure.Attribute;

public enum MiscAttributes implements Attribute {
    ARMOR_CLASS,INITIATIVE,MAX_DEX_BONUS;
    private String string;

    MiscAttributes() {
        this.string = (super.toString().charAt(0) + super.toString().substring(1)).replace("_"," ");
    }


    public String toString() {
        return string;
    }

    public String toShort() {
        return string.substring(0,3);
    }

    public static int getModifier(int score) {
        return (score - 10) / 2;
    }

    public String getID() {
        return "MISC." + super.toString();
    }
}
