package spellcasting;

public abstract class Spell {
    protected String castingTime, range, duration, description;
    protected int level;
    private SpellSchool school;
    private boolean prepared;

    public Spell() {
        prepared = false;
        initialize();
    }

    abstract void initialize();
}
