package openapi;

/**
 * There isn't much in terms of class
 */
public class Class {

    public String name, slug, desc, hit_dice, hp_at_1st_level, hp_at_higher_levels, prof_armor, prof_weapons, prof_tools, prof_saving_throws,
            prof_skills, equipment, table, spellcasting_ability, subtypes_name, document__slug, document__title, document__license_url;
    public Archetype[] archetypes;

    public class Archetype {

        public String name, slug, desc, document__slug, document__title, document__license_url;
    }
}
