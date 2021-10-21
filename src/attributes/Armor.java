package attributes;

import structure.Proficiency;

public enum Armor implements Proficiency {
    LIGHT_ARMOR,MEDIUM_ARMOR,HEAVY_ARMOR,SHIELD;


    private String string;

    Armor()  {
        this.string = (super.toString().charAt(0) + super.toString().substring(1)).replace("_"," ");
    }


    public String toString() {
        return string;
    }

    public String getID() {
        return "ARMOR." + super.toString();
    }
}
