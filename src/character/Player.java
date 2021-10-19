package character;

import attributes.Attributable;

public class Player {

    private Inventory inventory;

    public Player() {
        inventory = new Inventory();
    }


    public int getAttributeBonus(String name) {
        return 0;
    }

    public int getAttributeBonus(Attributable attributable) {
        assert attributable != null;
        return getAttributeBonus(attributable.toID());
    }



}
