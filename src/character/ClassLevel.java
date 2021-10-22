package character;

import classFactory.PlayerClass;
import structure.Attribute;
import structure.BonusContainer;
import structure.Proficiency;
import structure.ProficiencyContainer;

import java.util.Map;
import java.util.Set;

public class ClassLevel implements ProficiencyContainer, BonusContainer {

    private Classes playerClass;
    private int level;


    public ClassLevel() {
        playerClass = Classes.values()[0];
        level = 1;
    }

    public ClassLevel(Classes playerClass) {
        this.playerClass = playerClass;
        this.level = 1;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PlayerClass getPlayerClass() {
        return playerClass.getPlayerClass();
    }

    @Override
    public void addBonuses(Map<Attribute, Integer> map) {
        playerClass.getPlayerClass().addBonuses(map);
    }

    @Override
    public void addProficiencies(Set<Proficiency> proficiencies) {
        playerClass.getPlayerClass().addProficiencies(proficiencies);
    }
}
