package items;

import attributes.Attribute;
import attributes.Attributes;

public class Item implements Attributes {

    protected Attribute[] attributes;

    /**
     * Returns the item's attributes. Only returns if the item either not an equippable, or is an equippable and equipped
     * @return
     */
    @Override
    public Attribute[] getAttributes() {
        if(attributes != null && !(this instanceof Equippable) || ((Equippable) this).isEquipped()) {
            return attributes;
        } else {
            return new Attribute[0];
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
