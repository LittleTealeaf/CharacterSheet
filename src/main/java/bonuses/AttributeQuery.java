package bonuses;

import character.Attribute;
import character.Player;

import java.util.HashSet;
import java.util.Set;

public class AttributeQuery {

    private final Attribute attribute;
    private int value;

    public AttributeQuery(Attribute attribute) {
        this.attribute = attribute;
        value = 0;
    }

    public void registerAttributeBonus(AttributeBonus attributeBonus) {
        if(attributeBonus.getAttribute() == attribute) {
            value += attributeBonus.getValue();
        }
    }

    public int getValue() {
        return value;
    }
}
