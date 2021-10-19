package attributes;

public enum Attributes implements Attributable{
    AC,
    STRENGTH_SAVING_THROW,
    DEXTERITY_SAVING_THROW,
    CONSTITUTION_SAVING_THROW,
    WISDOM_SAVING_THROW,
    INTELLIGENCE_SAVING_THROW,
    CHARISMA_SAVING_THROW,
    INTIMIDATE;


    private String string;

    Attributes() {
        this.string = (super.toString().charAt(0) + super.toString().substring(1)).replace("_"," ");
    }

    public String toString() {
        return string;
    }

    @Override
    public String toID() {
        return super.toString();
    }
}
