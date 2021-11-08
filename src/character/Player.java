package character;

import structure.Bonus;
import structure.Proficiency;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Player {
    private String name, playerName;
    private Map<PlayerClass,Integer> classLevels;
    private Set<Proficiency> proficiencies;
    private Set<Bonus> playerBonuses;


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

    public void addProficiency(Proficiency proficiency) {
        proficiencies.add(proficiency);
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
}
