package items;

import attributes.AttributeBonus;
import attributes.AttributeBonuses;

public class Item implements AttributeBonuses {

    protected AttributeBonus[] attributeBonuses;

    /**
     * Returns the item's attributes. Only returns if the item either not an equippable, or is an equippable and equipped
     * @return
     */
    @Override
    public AttributeBonus[] getAttributes() {
        if(attributeBonuses != null && !(this instanceof Equippable) || ((Equippable) this).isEquipped()) {
            return attributeBonuses;
        } else {
            return new AttributeBonus[0];
        }
    }


    /*
    EQUIPPABLE | EQUIPPED | RESULT
    T T T
    T F F
    F T T
    F F T
     */
}
