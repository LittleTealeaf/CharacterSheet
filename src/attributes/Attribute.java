package attributes;

public class Attribute {
    private String attributeName;
    private int bonusValue;


    public Attribute(String attributeName, int bonusValue) {
        this.attributeName = attributeName;
        this.bonusValue = bonusValue;
    }

    public Attribute(Attributable attributable, int bonusValue) {
        this.attributeName = attributable.toID();
        this.bonusValue = bonusValue;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public int getBonusValue() {
        return bonusValue;
    }
}
