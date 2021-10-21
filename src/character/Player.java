package character;

import structure.Attribute;
import structure.Bonus;
import structure.BonusContainer;
import attributes.*;
import playerClass.PlayerClass;
import structure.Proficiency;

import java.util.*;

public class Player implements BonusContainer {

    private Inventory inventory;
    private List<Bonus> playerBonuses;
    private List<Proficiency> playerProficiencies;
    private List<PlayerClass> classes;
    private Set<Proficiency> proficiencies;

    private transient Map<Attribute,Integer> bonuses;

    public Player() {
        inventory = new Inventory();
        bonuses = new HashMap<>();
        playerBonuses = new ArrayList<>();
        classes = new ArrayList<>();
        proficiencies = new HashSet<>();
        playerProficiencies = new ArrayList<>();
    }

    public int getTotalLevel() {
        int total = 0;
        for(PlayerClass c : classes) {
            total += c.getLevel();
        }
        return total;
    }

    public int getProficiencyBonus() {
        return ((getTotalLevel() + 3) / 4 ) + 1;
    }

    public int getAbilityScore(Ability ability) {
        return 10 + getBonus(ability);
    }

    public int getAbilityModifier(Ability ability) {
        return Ability.getModifier(getAbilityScore(ability));
    }

    public int getSkillBonus(Skill skill) {
        return getAbilityModifier(skill.getAbility()) + getProficiencyBonus(skill) + getBonus(skill);
    }

    public int getProficiencyBonus(Proficiency proficiency) {
        return hasProficiency(proficiency) ? getProficiencyBonus() : 0;
    }

    public int getPassivePerception() {
        return 10 + getSkillBonus(Skill.PERCEPTION);
    }

    public boolean hasProficiency(Proficiency proficiency) {
        return proficiencies.contains(proficiency);
    }

    public void addProficiency(Proficiency proficiency) {
        proficiencies.add(proficiency);
    }

    public void removeProficiency(Proficiency proficiency) {
        proficiencies.remove(proficiency);
    }

    public int getBonus(Attribute attribute) {
        return bonuses.getOrDefault(attribute,0);
    }

    public int getSavingThrowBonus(SavingThrow savingThrow) {
        return getAbilityModifier(savingThrow.getAbility()) + getBonus(savingThrow) + getProficiencyBonus(savingThrow);
    }

    public int getInitiativeBonus() {
        return getAbilityModifier(Ability.DEXTERITY) + getBonus(Misc.INITIATIVE);
    }

    public int getArmorClass() {
        return 10 + Math.max(getBonus(Misc.MAX_DEX_BONUS),getAbilityModifier(Ability.DEXTERITY)) + getBonus(Misc.ARMOR_CLASS);
    }

    private void updateBonuses() {
        bonuses.clear();
        for(Bonus bonus : playerBonuses) {
            bonuses.put(bonus.getAttribute(),getBonus(bonus.getAttribute()) + bonus.getValue());
        }
        inventory.addBonuses(bonuses);
    }

    public void update() {
        updateProficiencies();
        updateBonuses();
    }

    @Override
    public void addBonuses(Map<Attribute,Integer> map) {
        for(Bonus bonus : playerBonuses) {
            Attribute attribute = bonus.getAttribute();
            map.put(attribute,map.getOrDefault(attribute,0) + bonus.getValue());
        }
    }

    private void updateProficiencies() {
        proficiencies.clear();
        proficiencies.addAll(playerProficiencies);
        for(PlayerClass c : classes) {
            c.addProficiencies(proficiencies);
        }
    }
}
