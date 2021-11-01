package app;

import attributes.Ability;
import attributes.SavingThrow;
import attributes.Skill;
import character.Feature;
import character.Player;
import character.PlayerClass;

public class Examples {

    public static Player getCustomPlayer() {
        Player p = new Player();
        p.setAbilityScores(new int[] {15,16,15,15,18,12});
        p.addProficiencies(SavingThrow.INTELLIGENCE, SavingThrow.WISDOM, Skill.INSIGHT, Skill.PERCEPTION, Skill.STEALTH);
        p.setClassLevel(PlayerClass.DRUID,5);
        p.setMaxHitPoints(38);
        p.setHitPoints(38); //TODO make this within setmaxHP
        p.setRace("Shifter");
        p.setSubRace("Moon");
        p.setName("Magolna");
        p.addFeatures(new Feature("Darkvision","Shifter","Thanks to your elf blood, you have superior vision in dark and dim conditions. You can " +
                "see in dim light within 60 feet as if it were bright light, and in darkness as if it were dim light. You can\\u0027t discern color" +
                " in darkness, only shades of gray."));


        return p;
    }
}
