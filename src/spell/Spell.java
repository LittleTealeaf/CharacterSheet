package spell;

public abstract class Spell {
    protected String name, description, castingTime, duration, range, higherLevel;
    protected SpellSchool school;
    protected Components[] components;
    protected String materialComponents;
    protected boolean concentration;

    public Spell() {
        initialize();
    }

    protected abstract void initialize();


}
