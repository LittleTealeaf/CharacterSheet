package bonuses;

import character.Attribute;

public class AttributeQuery {

    private final Attribute attribute;
    private int value;

    public AttributeQuery(Attribute attribute) {
        this.attribute = attribute;
        value = 0;
    }

    public void registerAttributeBonus(AttributeBonus attributeBonus) {
        if (attributeBonus.getAttribute() == attribute) {
            value += attributeBonus.getValue();
        }
    }

    public int getValue() {
        return value;
    }
}
