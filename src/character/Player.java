package character;

import attributes.Skill;

import java.util.HashSet;
import java.util.Set;

public class Player {

    private Inventory inventory;
    private Set<Skill> skillProficiencies;

    public Player() {
        inventory = new Inventory();
        skillProficiencies = new HashSet<>();
    }

}
