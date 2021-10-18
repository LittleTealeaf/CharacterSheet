package api;

/**
 * Conforms to the api as specified at https://api.open5e.com/spells/
 */
public class Spell {

    private String slug, name, desc, higher_level, page, range, material, ritual, duration, concentration, casting_time, level, school, dnd_class,
            archetype, circles, document__slug, docuemnt__title, docuemnt__liscense__url, components;
    private int level_int;

    public Spell() {
    }

    public String getSlug() {
        return slug;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getHigher_level() {
        return higher_level;
    }

    public String getPage() {
        return page;
    }

    public String getRange() {
        return range;
    }

    public String getMaterial() {
        return material;
    }

    public String getRitual() {
        return ritual;
    }

    public String getDuration() {
        return duration;
    }

    public String getConcentration() {
        return concentration;
    }

    public String getCasting_time() {
        return casting_time;
    }

    public String getLevel() {
        return level;
    }

    public String getSchool() {
        return school;
    }

    public String getDnd_class() {
        return dnd_class;
    }

    public String getArchetype() {
        return archetype;
    }

    public String getCircles() {
        return circles;
    }

    public String getDocument__slug() {
        return document__slug;
    }

    public String getDocuemnt__title() {
        return docuemnt__title;
    }

    public String getDocuemnt__liscense__url() {
        return docuemnt__liscense__url;
    }

    public String getComponents() {
        return components;
    }

    public int getLevel_int() {
        return level_int;
    }
}
