package old;

import character.Proficiency;

@Deprecated
public class Item implements BonusContainer {

    private Bonus[] bonuses;
    private int count;
    private String name;
    private String description;
    private Proficiency proficiency;
    private WeaponAttributes weaponAttributes;
    private Armor armor;
    private float weight;

    public Item() {
        count = 1;
        initialize();
    }

    public Item(String name) {
        this.name = name;
        count = 1;
        initialize();
    }

    private void initialize() {

    }

    @Override
    public void addBonuses(PlayerBonuses playerBonuses) {
        if(bonuses != null) {
            for(Bonus bonus : bonuses) {
                bonus.addBonuses(playerBonuses);
            }
        }
    }

}
