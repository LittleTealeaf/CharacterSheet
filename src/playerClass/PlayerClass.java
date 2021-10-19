package playerClass;

import attributeBonus.BonusContainer;
import attributes.Attribute;
import util.Dice;

import java.util.Map;

/**
 * HOLD UP NEED TO RETHINK THIS IDEA BECAUSE I GOTTA CHECK IF IT KEEPS SUB-CLASSES AND WHATNOT
 */
public abstract class PlayerClass implements BonusContainer {
    protected Dice hitDice;
    protected int level;

    public PlayerClass() {
        level = 1;
    }

    public void addBonuses(Map<Attribute,Integer> map) {

    }

    public int getLevel() {
        return level;
    }
}
