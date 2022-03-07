package spellcasting;

public abstract class Spell {

    protected String castingTime;
    protected String range;
    protected String duration;
    protected String description;
    protected int level;
    private SpellSchool school;
    private boolean prepared;

    public Spell() {
        prepared = false;
        initialize();
    }

    abstract void initialize();
}
