package character;

import attributes.Ability;
import attributes.MiscAttributes;
import attributes.SavingThrow;
import attributes.Skill;
import structure.Attribute;
import structure.Bonus;
import structure.Proficiency;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Player {

    private final Inventory inventory;
    private final Set<Bonus> playerBonuses;
    private final Set<ClassLevel> classes;
    private final Set<Proficiency> proficiencies;
    private final Set<Feature> features;
    private transient Map<Attribute, Integer> bonuses;

    public Player() {
        inventory = new Inventory();
        bonuses = new HashMap<>();
        playerBonuses = new HashSet<>();
        classes = new HashSet<>();
        proficiencies = new HashSet<>();
        features = new HashSet<>();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Set<Bonus> getPlayerBonuses() {
        return playerBonuses;
    }

    public Set<Proficiency> getProficiencies() {
        return proficiencies;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public int getPassivePerception() {
        return 10 + getSkillBonus(Skill.PERCEPTION);
    }

    public int getSkillBonus(Skill skill) {
        return getAbilityModifier(skill.getAbility()) + getProficiencyBonus(skill) + getBonus(skill);
    }

    public int getAbilityModifier(Ability ability) {
        return Ability.getModifier(getAbilityScore(ability));
    }

    public int getProficiencyBonus(Proficiency proficiency) {
        return hasProficiency(proficiency) ? getProficiencyBonus() : 0;
    }

    public int getBonus(Attribute attribute) {
        return bonuses.getOrDefault(attribute, 0);
    }

    public int getAbilityScore(Ability ability) {
        return 10 + getBonus(ability);
    }

    public boolean hasProficiency(Proficiency proficiency) {
        return proficiencies.contains(proficiency);
    }

    public int getProficiencyBonus() {
        return ((getTotalLevel() + 3) / 4) + 1;
    }

    public int getTotalLevel() {
        int total = 0;
        for (ClassLevel classLevel : classes) {
            total += classLevel.level();
        }
        return total;
    }

    public void addProficiency(Proficiency proficiency) {
        proficiencies.add(proficiency);
    }

    public void removeProficiency(Proficiency proficiency) {
        proficiencies.remove(proficiency);
    }

    public int getSavingThrowBonus(SavingThrow savingThrow) {
        return getAbilityModifier(savingThrow.getAbility()) + getBonus(savingThrow) + getProficiencyBonus(savingThrow);
    }

    public int getInitiativeBonus() {
        return getAbilityModifier(Ability.DEXTERITY) + getBonus(MiscAttributes.INITIATIVE);
    }

    public int getArmorClass() {
        return 10 + Math.max(getBonus(MiscAttributes.MAX_DEX_BONUS), getAbilityModifier(Ability.DEXTERITY)) + getBonus(MiscAttributes.ARMOR_CLASS);
    }

    public void updateBonuses() {
        bonuses.clear();
        for (Bonus bonus : playerBonuses) {
            bonus.addBonuses(bonuses);
        }
        for (Feature feature : features) {
            feature.addBonuses(bonuses);
        }
    }

    public Set<ClassLevel> getClasses() {
        return classes;
    }
}
