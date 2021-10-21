package classFactory;

import structure.*;

import java.util.Map;
import java.util.Set;

public abstract class ClassFeature implements BonusContainer, ProficiencyContainer{
    protected String name;
    protected String description;
    protected int classLevel;
    protected boolean hidden;

    protected Proficiency[] proficiencies;
    protected Bonus[] bonuses;

    public ClassFeature() {
        initialize();
    }

    abstract void initialize();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addBonuses(Map<Attribute,Integer> attributes) {
        if(bonuses != null) {
            for(Bonus bonus : bonuses) {
                bonus.addBonuses(attributes);
            }
        }
    }

    public void addProficiencies(Set<Proficiency> profs) {
        if(proficiencies != null) {
            for(Proficiency proficiency : proficiencies) {
                profs.add(proficiency);
            }
        }
    }

    public int getClassLevel() {
        return classLevel;
    }

    public boolean isHidden() {
        return hidden;
    }
}
