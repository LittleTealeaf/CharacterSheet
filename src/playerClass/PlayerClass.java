package playerClass;

import attributes.Skill;
import structure.BonusContainer;
import structure.Attribute;
import structure.Proficiency;
import structure.ProficiencyContainer;
import util.Dice;

import java.util.Map;
import java.util.Set;

/**
 * HOLD UP NEED TO RETHINK THIS IDEA BECAUSE I GOTTA CHECK IF IT KEEPS SUB-CLASSES AND WHATNOT
 */
public abstract class PlayerClass implements BonusContainer, ProficiencyContainer {
    protected Dice hitDice;
    protected int level;
    protected Proficiency[] proficiencies;
    protected Skill[] skillOptions;
    private Skill[] skillChoices;

    public PlayerClass() {
        level = 1;
        skillChoices = new Skill[2];
    }

    public void addBonuses(Map<Attribute,Integer> map) {

    }

    public int getLevel() {
        return level;
    }

    public void addProficiencies(Set<Proficiency> proficiencies) {
        for(Proficiency proficiency : this.proficiencies) {
            proficiencies.add(proficiency);
        }
        for(Skill skill : skillChoices) {
            if(skill != null) {
                proficiencies.add(skill);
            }
        }
    }
}
