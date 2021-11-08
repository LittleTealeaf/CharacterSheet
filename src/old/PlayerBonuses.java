package old;

import character.Attribute;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PlayerBonuses {
    private Map<Attribute,Integer> values;
    private Set<Bonus> bonuses;
    private Player player;


    public PlayerBonuses(Player player) {
        this.player = player;
        values = new HashMap<>();
        bonuses = new HashSet<>();
    }

    public int getBonuses(Attribute attribute) {
        return values.getOrDefault(attribute,0);
    }


    public void addBonus(Bonus bonus) {
        if(bonuses.add(bonus)) {
            values.put(bonus.getAttribute(), bonus.getValue() + getBonuses(bonus.getAttribute()));
        }
    }

    public void removeBonus(Bonus bonus) {
        if(bonuses.remove(bonus)) {
            values.put(bonus.getAttribute(),getBonuses(bonus.getAttribute()) - bonus.getValue());
            if(values.get(bonus.getAttribute()) == 0) {
                values.remove(bonus.getAttribute());
            }
        }
    }

    public void clear() {
        bonuses.clear();
        values.clear();
    }
}
