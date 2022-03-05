package spellcasting;

import character.Attribute;
import util.EnumUtil;

public enum SpellSchool implements Attribute {
    CONJURATION,NECROMANCY,EVOCATION,ABJURATION,TRANSMUTATION,DIVINATION,ENCHANTMENT,ILLUSION;

    private String string;
    SpellSchool() {
        this.string = EnumUtil.convertString(super.toString());
    }

    public static int getModifier(int score) {
        return (score - 10) / 2;
    }

    public String toString() {
        return string;
    }

    public String getID() {
        return "SPELL_SCHOOL." + super.toString();
    }
}
