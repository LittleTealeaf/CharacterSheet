package attributes;

public enum Skill implements Attributable {
    ACROBATICS(Ability.DEXTERITY),
    ANIMAL_HANDLING(Ability.WISDOM),
    ARCANA(Ability.INTELLIGENCE),
    ATHLETICS(Ability.STRENGTH),
    DECEPTION(Ability.CHARISMA),
    HISTORY(Ability.INTELLIGENCE),
    INSIGHT(Ability.WISDOM),
    INTIMIDATION(Ability.CHARISMA),
    INVESTIGATION(Ability.INTELLIGENCE),
    MEDICINE(Ability.WISDOM),
    NATURE(Ability.INTELLIGENCE),
    PERCEPTION(Ability.WISDOM),
    PERFORMANCE(Ability.CHARISMA),
    PERSUASION(Ability.CHARISMA),
    RELIGION(Ability.INTELLIGENCE),
    SLEIGHT_OF_HAND(Ability.DEXTERITY),
    STEALTH(Ability.DEXTERITY),
    SURVIVAL(Ability.WISDOM);

    private Ability ability;
    private String string;
    Skill(Ability ability) {
        this.ability = ability;
        this.string = super.toString().charAt(0) + super.toString().substring(1);
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

    public String toID() {
        return super.toString();
    }

}
