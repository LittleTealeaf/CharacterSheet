package structure;

import character.PlayerBonuses;

import java.util.Map;

public class Bonus implements BonusContainer {

    private Attribute attribute;
    private int value;
    private Source source;

    public Bonus(Attribute attribute, int value) {
        this(attribute,value,Source.DEFAULT);
    }

    public Bonus(Attribute attribute, int value, Source source) {
        this.attribute = attribute;
        this.value = value;
        this.source = source;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void addBonuses(PlayerBonuses playerBonuses) {
        playerBonuses.addBonus(this);
    }

    public Source getSource() {
        return source;
    }

    public enum Source {
        DEFAULT,ABILITY_SCORE;
    }
}
