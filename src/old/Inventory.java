package old;

import java.util.HashSet;
import java.util.Set;

public class Inventory implements BonusContainer {

    private final Set<Item> items;

    public Inventory() {
        items = new HashSet<>();
    }

    @Override
    public void addBonuses(PlayerBonuses playerBonuses) {
        for(Item item : items) {
            item.addBonuses(playerBonuses);
        }
    }
}
