package old;

import structure.Bonus;
import structure.BonusContainer;

public class Feature implements BonusContainer {

    private String name, description, source;

    private Bonus[] bonuses;

    public Feature(String name, String source, String description) {
        this(name, description, source, null);
    }

    public Feature(String name, String source,String description, Bonus[] bonuses) {
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
    public void addBonuses(PlayerBonuses playerBonuses) {
        if (bonuses != null) {
            for (Bonus bonus : bonuses) {
                bonus.addBonuses(playerBonuses);
            }
        }
    }
}
