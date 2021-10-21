package classFactory;

import attributes.Skill;
import structure.BonusContainer;
import structure.Attribute;
import structure.Proficiency;
import structure.ProficiencyContainer;
import util.Dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * HOLD UP NEED TO RETHINK THIS IDEA BECAUSE I GOTTA CHECK IF IT KEEPS SUB-CLASSES AND WHATNOT
 */
public abstract class PlayerClass implements BonusContainer, ProficiencyContainer {
    protected Dice hitDice;
    protected List<Proficiency> proficiencies;
    protected Skill[] skillOptions;
    private Skill[] skillChoices;
    protected ClassFeature[] classFeatures;

    public PlayerClass() {
        skillChoices = new Skill[2];
        proficiencies = new ArrayList<>();
    }

    public void addBonuses(Map<Attribute,Integer> map) {

    }

    private List<ClassFeature> getFeatures(int level) {
        List<ClassFeature> features = new ArrayList<>();
        for(ClassFeature classFeature : classFeatures) {
            if(classFeature.getClassLevel() <= level) {
                features.add(classFeature);
            }
        }
        return features;
    }

    public void addProficiencies(Set<Proficiency> proficiencies) {
        proficiencies.addAll(this.proficiencies);
        for(Skill skill : skillChoices) {
            if(skill != null) {
                proficiencies.add(skill);
            }
        }
    }
}
