package items;

import attributes.Ability;
import util.Dice;

public class WeaponAttributes {
    private int bonus;
    private Dice damageDice;
    private String[] damageTypes;
    private Ability abilityModifier;
    private String range;

    public WeaponAttributes(int bonus, Dice damageDice) {
        this.bonus = bonus;
        this.damageDice = damageDice;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Dice getDamageDice() {
        return damageDice;
    }

    public void setDamageDice(Dice damageDice) {
        this.damageDice = damageDice;
    }

    public String[] getDamageTypes() {
        return damageTypes;
    }

    public void setDamageTypes(String[] damageTypes) {
        this.damageTypes = damageTypes;
    }

    public Ability getAbilityModifier() {
        return abilityModifier;
    }

    public void setAbilityModifier(Ability ability) {
        this.abilityModifier = ability;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
