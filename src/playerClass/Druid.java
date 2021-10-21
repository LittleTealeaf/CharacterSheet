package playerClass;

import attributes.*;
import structure.Proficiency;
import util.Dice;

public class Druid extends PlayerClass {

    public Druid() {
        this(1);
    }

    public Druid(int level) {
        super();
        this.level = level;
        proficiencies = new Proficiency[] {
                Armor.LIGHT_ARMOR, Armor.MEDIUM_ARMOR, Armor.SHIELD, Tool.HERBALISM_KIT, Weapon.CLUB, Weapon.DAGGER, Weapon.DART, Weapon.JAVELIN,
                Weapon.MACE, Weapon.QUARTERSTAFF, Weapon.SCIMITAR, Weapon.SICKLE, Weapon.SLING, Weapon.SPEAR, SavingThrow.INTELLIGENCE,
                SavingThrow.WISDOM
        };
        skillOptions = new Skill[] {
                Skill.ARCANA,Skill.ANIMAL_HANDLING,Skill.INSIGHT,Skill.MEDICINE,Skill.NATURE,Skill.PERCEPTION,Skill.RELIGION,Skill.SURVIVAL
        };
        hitDice = new Dice(1, 8);
    }
}
