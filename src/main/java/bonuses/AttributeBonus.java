package bonuses;

import character.Attribute;

public class AttributeBonus implements BonusContainer {

    private Attribute attribute;
    private Source source;
    private int value;

    public AttributeBonus(Attribute attribute, int value) {
        this(attribute, value, Source.DEFAULT);
    }

    public AttributeBonus(Attribute attribute, int value, Source source) {
        this.attribute = attribute;
        this.value = value;
        this.source = source;
    }

    @Override
    public void registerBonuses(AttributeQuery attributeQuery) {
        attributeQuery.registerAttributeBonus(this);
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public enum Source {
        DEFAULT,
        ABILITY_BONUS;
    }
}
