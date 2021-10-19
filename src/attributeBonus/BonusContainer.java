package attributeBonus;

import attributes.Attribute;

import java.util.Map;

public interface BonusContainer {
    void addBonuses(Map<Attribute,Integer> map);
}
