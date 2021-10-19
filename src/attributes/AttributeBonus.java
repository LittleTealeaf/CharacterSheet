package attributes;

public class AttributeBonus {
    private String attributeName;
    private int bonusValue;


    public AttributeBonus(String attributeName, int bonusValue) {
        this.attributeName = attributeName;
        this.bonusValue = bonusValue;
    }

    public AttributeBonus(Attributable attributable, int bonusValue) {
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
