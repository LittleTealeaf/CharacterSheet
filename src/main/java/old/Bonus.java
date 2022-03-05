package old;

import character.Attribute;

@Deprecated
public class Bonus implements Bonusable, BonusContainer {

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

    public int getBonuses(Attribute attribute) {
        return attribute == this.attribute ? value : 0;
    }

    public Source getSource() {
        return source;
    }

    public enum Source {
        DEFAULT,ABILITY_SCORE;
    }
}
