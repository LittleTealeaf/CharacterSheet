package attributeBonus;

import attributes.Attribute;

public class Bonus {
    private Attribute attribute;
    private int value;

    public Bonus(Attribute attribute, int value) {
        this.attribute = attribute;
        this.value = value;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public int getValue() {
        return value;
    }
}
