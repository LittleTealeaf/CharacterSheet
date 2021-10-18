package spell;

import playerclass.PlayerClass;

import java.util.HashMap;
import java.util.Map;

public abstract class Spell {
    protected String name, description, castingTime, duration, range, higherLevel;
    protected SpellSchool school;
    protected boolean concentration;
    protected boolean isRitual;
    protected Components components;
    /**
     * 0 = cantrip
     */
    protected Map<PlayerClass,Integer> levels;

    public Spell() {
        levels = new HashMap<>();
        initialize();
    }

    protected abstract void initialize();

    public int getSpellLevel(PlayerClass playerClass) {
        return levels.getOrDefault(playerClass,-1);
    }

    protected void putLevels(int level, PlayerClass... classes) {
        for(PlayerClass cl : classes) {
            levels.put(cl,level);
        }
    }
}
