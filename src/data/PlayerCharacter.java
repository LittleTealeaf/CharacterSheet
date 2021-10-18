package data;

import java.util.*;

public class PlayerCharacter {

    private int proficiencyBonus;
    private Set<Skill> skillProficiencies;
    private Set<Ability> savingThrowProficiencies;
    private Map<String,Integer> additionalBonuses;
    private Map<Ability,Integer> abilityScores;
    private final Inventory inventory;


    public PlayerCharacter() {
        skillProficiencies = new HashSet<>();
        savingThrowProficiencies = new HashSet<>();
        additionalBonuses = new HashMap<>();
        abilityScores = new HashMap<>();
        inventory = new Inventory();

        proficiencyBonus = 2;
        for(Ability ability : Ability.values()) {
            abilityScores.put(ability,10);
        }
    }

    public int getTotalLevel() {
        return 1;
    }

    public int getProficiencyBonus() {
        return (getTotalLevel() << 2) + 2;
    }

    public void setAbilityScore(Ability ability, int score) {
        abilityScores.put(ability,score);
    }

    public int getAbilityScore(Ability ability) {
        return abilityScores.get(ability);
    }

    public int getAbilityModifier(Ability ability) {
        return (getAbilityScore(ability) - 10) >> 1;
    }

    public void setAbilityArray(int[] abilityScores) {
        for(int i = 0; i < 6; i++) {
            setAbilityScore(Ability.values()[i],abilityScores[i]);
        }
    }

    public void addAdditionalBonuses(String key, int val) {
        additionalBonuses.put(key,(additionalBonuses.getOrDefault(key, 0)) + val);
    }

    public void addAdditionalBonuses(Ability ability, int val) {
        addAdditionalBonuses(ability.toString(),val);
    }

    public void addAdditionalBonuses(Skill skill, int val) {
        addAdditionalBonuses(skill.toString(),val);
    }

    public void clearAdditionalBonuses(String key) {
        additionalBonuses.remove(key);
    }

    public int getAdditionalBonuses(String key) {
        return additionalBonuses.getOrDefault(key,0);
    }

    public int getAdditionalBonuses(Ability ability) {
        return getAdditionalBonuses(ability.toString());
    }

    public int getAdditionalBonuses(Skill skill) {
        return getAdditionalBonuses(skill.toString());
    }

    public int getSkillBonus(Skill skill) {
        return getAbilityModifier(skill.getAbility()) + (hasSkillProficiency(skill) ? getProficiencyBonus() : 0);
    }

    public int getPassivePerception() {
        return 10 + getSkillBonus(Skill.PERCEPTION);
    }

    public boolean hasSkillProficiency(Skill skill) {
        return skillProficiencies.contains(skill);
    }

    public void addSkillProficiency(Skill skill) {
        skillProficiencies.add(skill);
    }

    public void removeSkillProficiency(Skill skill) {
        skillProficiencies.remove(skill);
    }

    public boolean hasSavingThrow(Ability ability) {
        return savingThrowProficiencies.contains(ability);
    }

    public void addSavingThrow(Ability ability) {
        savingThrowProficiencies.add(ability);
    }

    public void removeSavingThrow(Ability ability){
        savingThrowProficiencies.remove(ability);
    }

    public Inventory getInventory() {
        return inventory;
    }
}
