package attributes;

import character.Attribute;
import character.Proficiency;
import util.EnumUtil;

import java.util.ArrayList;
import java.util.List;

public enum Weapon implements Proficiency, Attribute {
    CLUB(Category.SIMPLE_MELEE), DAGGER(Category.SIMPLE_MELEE), GREATCLUB(Category.SIMPLE_MELEE), HANDAXE(Category.SIMPLE_MELEE), JAVELIN(
            Category.SIMPLE_MELEE), LIGHT_HAMMER(Category.SIMPLE_MELEE), MACE(Category.SIMPLE_MELEE), QUARTERSTAFF(Category.SIMPLE_MELEE), SICKLE(
            Category.SIMPLE_MELEE), SPEAR(Category.SIMPLE_MELEE), CROSSBOW_LIGHT(Category.SIMPLE_RANGED), DART(Category.SIMPLE_RANGED), SHORTBOW(
            Category.SIMPLE_RANGED), SLING(Category.SIMPLE_RANGED), BATTLEAXE(Category.MARTIAL_MELEE), FLAIL(Category.MARTIAL_MELEE), GLAIVE(
            Category.MARTIAL_MELEE), GREATSWORD(Category.MARTIAL_MELEE), HALBRED(Category.MARTIAL_MELEE), LANCE(Category.MARTIAL_MELEE), LONGSWORD(
            Category.MARTIAL_MELEE), MAUL(Category.MARTIAL_MELEE), MORNINGSTAR(Category.MARTIAL_MELEE), PIKE(Category.MARTIAL_MELEE), RAPIER(
            Category.MARTIAL_MELEE), SCIMITAR(Category.MARTIAL_MELEE), SHORTSWORD(Category.MARTIAL_MELEE), TRIDENT(Category.MARTIAL_MELEE), WAR_PICK(
            Category.MARTIAL_MELEE), WARHAMMER(Category.MARTIAL_MELEE), WHIP(Category.MARTIAL_MELEE), BLOWGUN(Category.MARTIAL_RANGED), CROSSBOW_HAND(
            Category.MARTIAL_RANGED), CROSSBOW_HEAVY(Category.MARTIAL_RANGED), LONGBOW(Category.MARTIAL_RANGED), NET(Category.MARTIAL_RANGED);

    private String string;
    private Category category;

    Weapon(Category category) {
        this.category = category;
        this.string = EnumUtil.convertString(super.toString());
    }

    public static List<Weapon> getCategory(Category category) {
        ArrayList<Weapon> list = new ArrayList<>();
        for (Weapon weapon : values()) {
            if (weapon.category == category) {
                list.add(weapon);
            }
        }
        return list;
    }

    public String toString() {
        return string;
    }

    public String getID() {
        return "WEAPON." + super.toString();
    }


    public enum Category {
        SIMPLE_MELEE, SIMPLE_RANGED, MARTIAL_MELEE, MARTIAL_RANGED;
    }
}
