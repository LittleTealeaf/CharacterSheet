package items;

import structure.Attribute;
import structure.Bonus;
import structure.BonusContainer;
import structure.Proficiency;

import java.util.Map;

public class Item implements BonusContainer {

    private Bonus[] bonuses;
    private int count;
    private String name, description;
    private Proficiency proficiency;
    private WeaponAttributes weaponAttributes;
    private Armor armor;
    private float weight;

    public Item() {
        count = 1;
    }

    public Item(String name) {
        this.name = name;
    }

    @Override
    public void addBonuses(Map<Attribute, Integer> map) {
        if(bonuses != null) {
            for(Bonus bonus : bonuses) {
                bonus.addBonuses(map);
            }
        }
    }
}
