package structure;

import java.util.Map;

public class Bonus implements BonusContainer {
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

    @Override
    public void addBonuses(Map<Attribute, Integer> map) {
        map.put(attribute,map.getOrDefault(attribute,0) + value);
    }
}
