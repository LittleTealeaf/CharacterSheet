package character;

import attributes.Ability;
import attributes.Skill;
import bonuses.AttributeBonus;
import bonuses.AttributeQuery;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Player {
    private String name;
    private String playerName;
    private Map<PlayerClass,Integer> classLevels;
    private Set<Proficiency> proficiencies;
    private Set<AttributeBonus> playerBonuses;


    public Player() {
        classLevels = new HashMap<>();
        proficiencies = new HashSet<>();
        playerBonuses = new HashSet<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void clearClassLevels() {
        classLevels.clear();
    }

    public void setClassLevel(PlayerClass playerClass, int level) {
        classLevels.put(playerClass,level);
    }

    public void addClassLevel(PlayerClass playerClass) {
        addClassLevels(playerClass,1);
    }

    public void addClassLevels(PlayerClass playerClass, int level) {
        classLevels.put(playerClass,getClassLevel(playerClass) + level);
    }

    public int getClassLevel(PlayerClass playerClass) {
        return classLevels.getOrDefault(playerClass,0);
    }

    public Map<PlayerClass,Integer> getClassLevels() {
        return classLevels;
    }

    public int getTotalLevel() {
        int level = 0;
        for(Integer l : classLevels.values()) {
            level += l;
        }
        return level;
    }

    public void addProficiencies(Proficiency... proficiencies) {
        for(Proficiency proficiency : proficiencies) {
            this.proficiencies.add(proficiency);
        }
    }

    public void removeProficiency(Proficiency proficiency) {
        proficiencies.remove(proficiency);
    }

    public boolean hasProficiency(Proficiency proficiency) {
        return proficiencies.contains(proficiency);
    }

    public int getProficiencyBonus() {
        return ((getTotalLevel() + 3) / 4) + 1;
    }

    public int getProficiencyBonus(Proficiency proficiency) {
        return hasProficiency(proficiency) ? getProficiencyBonus() : 0;
    }

    public int getBonus(Attribute attribute) {
        AttributeQuery attributeQuery = new AttributeQuery(attribute);
        for(AttributeBonus bonus : playerBonuses) {
            bonus.registerBonuses(attributeQuery);
        }
//        add anything else
        return attributeQuery.getValue();
    }

    public int getAbilityScore(Ability ability) {
        return 10 + getBonus(ability);
    }

    public int getAbilityModifier(Ability ability) {
        return (getAbilityScore(ability) - 10) / 2;
    }

    public int getSkillBonus(Skill skill) {
        return getProficiencyBonus(skill) + getAbilityModifier(skill.getAbility()) + getBonus(skill);
    }


    public void setAbilityScores(int[] abilityScores) {
        Set<AttributeBonus> removeBonuses = new HashSet<>();
        for(AttributeBonus bonus : playerBonuses) {
            if(bonus.getSource() == AttributeBonus.Source.ABILITY_BONUS) {
                removeBonuses.add(bonus);
            }
        }
        for(AttributeBonus bonus : removeBonuses) {
            playerBonuses.remove(bonus);
        }
        for(int i = 0; i < 6; i++) {
            playerBonuses.add(new AttributeBonus(Ability.values()[i],abilityScores[i]-10, AttributeBonus.Source.ABILITY_BONUS));
        }
    }

    public void setAbilityScores(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        setAbilityScores(new int[] {strength, dexterity, constitution, intelligence, wisdom, charisma});
    }
}
