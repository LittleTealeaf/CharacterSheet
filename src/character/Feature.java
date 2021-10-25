package character;

import structure.Attribute;
import structure.Bonus;
import structure.BonusContainer;

import java.util.Map;

public class Feature implements BonusContainer {

    private String name, description, source;

    private Bonus[] bonuses;

    public Feature(String name, String description, String source) {
        this(name, description, source, null);
    }

    public Feature(String name, String description, String source, Bonus[] bonuses) {
        this.name = name;
        this.description = description;
        this.source = source;
        this.bonuses = bonuses;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSource() {
        return source;
    }


    @Override
    public void addBonuses(Map<Attribute, Integer> map) {
        if (bonuses != null) {
            for (Bonus bonus : bonuses) {
                bonus.addBonuses(map);
            }
        }
    }
}
