package openapi;

/**
 * There isn't much in terms of class
 */
public class Class {

    public String name;
    public String slug;
    public String desc;
    public String hit_dice;
    public String hp_at_1st_level;
    public String hp_at_higher_levels;
    public String prof_armor;
    public String prof_weapons;
    public String prof_tools;
    public String prof_saving_throws;
    public String prof_skills;
    public String equipment;
    public String table;
    public String spellcasting_ability;
    public String subtypes_name;
    public String document__slug;
    public String document__title;
    public String document__license_url;
    public Archetype[] archetypes;

    public class Archetype {

        public String name, slug, desc, document__slug, document__title, document__license_url;
    }
}
