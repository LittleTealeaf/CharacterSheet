package app;

import attributes.SavingThrow;
import attributes.Skill;
import character.Player;

public class Examples {

//    public static Player getEmily() {
//        Player p = new Player();
//        p.setAbilityScores(new int[] {15,16,15,15,18,12});
//        p.addProficiencies(SavingThrow.INTELLIGENCE, SavingThrow.WISDOM, Skill.INSIGHT, Skill.PERCEPTION, Skill.STEALTH);
//        p.setClassLevel(PlayerClass.DRUID,5);
//        p.setMaxHitPoints(38);
//        p.setHitPoints(38);
//        p.setRace("Shifter");
//        p.setSubRace("Moon");
//        p.setName("Magolna");
//        p.addFeatures(new Feature("Darkvision","Shifter","Thanks to your elf blood, you have superior vision in dark and dim conditions. You can " +
//                "see in dim light within 60 feet as if it were bright light, and in darkness as if it were dim light. You can\\u0027t discern color" +
//                " in darkness, only shades of gray."));
//
//        return p;
//    }

    public static Player genChristina() {
        Player p = new Player();
        p.setName("Celeana");
        p.setPlayerName("Christina Bellanich");
        p.setAbilityScores(new int[]{12, 19, 17, 15, 12, 18});
        p.addProficiencies(Skill.ANIMAL_HANDLING, Skill.DECEPTION, Skill.INSIGHT, Skill.PERSUASION,
                Skill.SLEIGHT_OF_HAND, Skill.STEALTH, SavingThrow.INTELLIGENCE, SavingThrow.DEXTERITY);
        return p;
    }
}
