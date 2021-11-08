package attributes;

import character.Proficiency;
import util.EnumUtil;

public enum Tool implements Proficiency {
    ALCHEMIST_SUPPLIES, BREWERS_SUPPLIES, CALLIGRAPHERS_SUPPLIES, CARPENTERS_TOOLS, CARTOGRAPHERS_TOOLS, COBBLERS_TOOLS, COOKS_UTENSILS,
    DISGUISE_KIT, FORGERY_KIT, GAMING_SET, GLASSBLOWERS_TOOLS, HERBALISM_KIT, JEWELERS_KIT, LAND_AND_WATER_VEHICLES, LEATHERWORKERS_TOOLS,
    MASONS_TOOLS, MUSICAL_INSTRUMENTS, NAVIGATORS_TOOLS, PAINTERS_SUPPLIES, POISONERS_KIT, POTTERS_TOOLS, SMITHS_TOOLS, THIEVES_TOOLS,
    TINKERS_TOOLS, WEAVERS_TOOLS, WOODCARVERS_TOOLS;

    private String string;

    Tool() {
        this.string = EnumUtil.convertString(super.toString());
    }

    public String toString() {
        return string;
    }

    public String getID() {
        return "TOOL." + super.toString();
    }
}
