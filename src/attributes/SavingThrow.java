package attributes;

import structure.Attribute;
import structure.Proficiency;

public enum SavingThrow implements Attribute, Proficiency {


    STRENGTH(Ability.STRENGTH),
    DEXTERITY(Ability.DEXTERITY),
    CONSTITUTION(Ability.CONSTITUTION),
    WISDOM(Ability.WISDOM),
    CHARISMA(Ability.CHARISMA),
    INTELLIGENCE(Ability.INTELLIGENCE);

    private static final String id = "SAVING_THROW";

    private Ability ability;
    private String string;

    SavingThrow(Ability ability) {
        this.ability = ability;
        this.string = (super.toString().charAt(0) + super.toString().substring(1)).replace("_"," ");
    }

    public Ability getAbility() {
        return this.ability;
    }

    public String toString() {
        return string;
    }

    public String toShort() {
        return string.substring(0,3);
    }

    public String getID() {
        return id + "." + super.toString();
    }
}
