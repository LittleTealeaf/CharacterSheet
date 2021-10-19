package character;

import attributeBonus.Bonus;
import attributeBonus.BonusContainer;
import attributes.Ability;
import attributes.Attribute;
import attributes.Misc;
import attributes.Skill;

import java.util.*;

public class Player implements BonusContainer {

    private Inventory inventory;
    private Set<Skill> skillProficiencies;
    private List<Bonus> playerBonuses;

    private transient Map<Attribute,Integer> bonuses;

    public Player() {
        inventory = new Inventory();
        skillProficiencies = new HashSet<>();
        bonuses = new HashMap<>();
        playerBonuses = new ArrayList<>();
    }

    public int getTotalLevel() {
        return 5;
    }

    public int getProficiencyBonus() {
        return ((getTotalLevel() + 3) / 4) + 1;
    }

    public int getAbilityScore(Ability ability) {
        updateBonuses();
        return 10 + getBonus(ability);
    }

    public int getAbilityModifier(Ability ability) {
        return Ability.getModifier(getAbilityScore(ability));
    }

    public int getSkillBonus(Skill skill) {
        return getAbilityModifier(skill.getAbility()) + (skillProficiencies.contains(skill) ? getProficiencyBonus() : 0) + getBonus(skill);
    }

    public int getPassivePerception() {
        return 10 + getSkillBonus(Skill.PERCEPTION);
    }

    public int getBonus(Attribute attribute) {
        return bonuses.getOrDefault(attribute,0);
    }

    public int getInitiativeBonus() {
        return getAbilityModifier(Ability.DEXTERITY) + getBonus(Misc.INITIATIVE);
    }

    public int getArmorClass() {
        return 10 + Math.max(getBonus(Misc.MAX_DEX_BONUS),getAbilityModifier(Ability.DEXTERITY)) + getBonus(Misc.ARMOR_CLASS);
    }

    private void updateBonuses() {
        bonuses.clear();
        inventory.addBonuses(bonuses);
    }

    public void addBonuses(Map<Attribute,Integer> map) {
        for(Bonus bonus : playerBonuses) {
            Attribute attribute = bonus.getAttribute();
            map.put(attribute,map.getOrDefault(attribute,0) + bonus.getValue());
        }
    }

}
