package items;

import character.PlayerBonuses;
import structure.Attribute;
import structure.Equippable;

import java.util.Map;

public class Armor extends Item implements Equippable {
    private boolean equipped;

    public Armor() {
        super();
    }


    @Override
    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    @Override
    public boolean isEquipped() {
        return equipped;
    }

    @Override
    public void addBonuses(PlayerBonuses playerBonuses) {
        if(isEquipped()) {
            super.addBonuses(playerBonuses);
        }
    }
}
