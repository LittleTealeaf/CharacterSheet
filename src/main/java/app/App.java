package app;

import attributes.Ability;
import attributes.Skill;
import character.Player;
import export.MarkdownSheet;

import java.io.File;
import java.io.FileWriter;

/**
 * Import data from http://www.dnd5eapi.co/
 */

public class App {

    public static void main(String... args) {
        Player p = Examples.genChristina();
        try {
            File file = new File("testing.md");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            MarkdownSheet.writeMarkdown(fileWriter,p);
            fileWriter.close();
        } catch(Exception e) {}
    }

    public static void printAttributes(Player p) {
        System.out.println("Abilities:");
        for(Ability ability : Ability.values()) {
            System.out.println("\t" + ability.toShort() + " " + p.getAbilityScore(ability) + " (" + p.getAbilityModifier(ability) + ")");
        }
        System.out.println("\nSkills:");
        for(Skill skill : Skill.values()) {
            System.out.println("\t" + skill.toString() + " " + p.getSkillBonus(skill));
        }
    }

//    private static Player getChristina() {
//        Player player = new Player();
//        player.setName("Celeana Ardralan");
//        player.setPlayer("Christina Bellanich");
//        player.setHitPoints(32);
//        player.setMaxHitPoints(32);
//        player.setClassLevel(PlayerClass.ROGUE, 5);
//        player.setAbilityScores(new int[]{12, 19, 17, 15, 12, 18});
//        player.addProficiencies(Skill.ANIMAL_HANDLING, Skill.DECEPTION, Skill.INSIGHT, Skill.PERSUASION, Skill.SLEIGHT_OF_HAND, Skill.STEALTH,
//                                SavingThrow.INTELLIGENCE, SavingThrow.DEXTERITY
//                               );
//        player.addFeatures(new Feature("Darkvision", "Half-Elf",
//                                       "Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in " + "dim " +
//                                               "light within 60 feet as if it were bright light, and in darkness as if it were dim light. You can't" +
//                                               " discern color in darkness," + " only shades of gray."),
//                           new Feature("Fey Ancestry", "Half-Elf",
//                                       "You have advantage on saving throws against being charmed, and " + "magic can't put you to sleep."),
//                           new Feature("Thieves' Cant", "Rogue",
//                                       "During your rogue training you learned thieves' cant, a " + "secret mix of dialect, jargon, and code that " +
//                                               "allows you to hide messages in seemingly normal conversation. Only another creature " + "that knows" +
//                                               " thieves' cant understands such messages. It takes four times longer to convey a message than it " +
//                                               "does to speak the same " + "idea plainly."),
//                           new Feature("Cunning Action", "Rogue",
//                                       "Your quick thinking and agility allow you to move and act quickly. You can " + "take a bonus action on each" +
//                                               " of your turns in combat. This action can only be used to take the Dash, Disengage, or Hide action."),
//                           new Feature("Sneak Attack", "Rogue",
//                                       "Beginning at 1st level, you know how to strike subtly and exploit a foe's " + "distraction. Once per turn, " +
//                                               "you can deal an extra 1d6 damage to one creature you hit with an attack if you have" + " advantage " +
//                                               "on the attack roll. The attack must use a finesse or ranged weapon.\n" + "\n" + "You don't need " + "advantage on the attack roll if another enemy of the target is within 5 feet of it, that enemy isn't " + "incapacitated, and you don't have disadvantage on the attack roll.\n" + "\n" + "The amount of the extra damage " + "increases as you gain levels in this class, yell at Thomas to figure out how much dice you roll for DAMAGEEE"),
//                           new Feature("Assassinate", "Rogue",
//                                       "You have advantage against attack rolls against any creature who hasn't taken their " + "turn in combat yet" +
//                                               ". In addition, any hit you score against a creature that is surprised is a critical hit."),
//                           new Feature("False Identity", "Charlatan",
//                                       "You have created a second identity that includes documentation, established " + "acquaintances, and " +
//                                               "disguises that allow you to assume that persona. Additionally, you can forge documents including " +
//                                               "official papers and personal letters, as long as you have seen an example of the kind of document " +
//                                               "or handwriting you are trying to copy."),
//                           new Feature("Uncanny  Dodge", "Rogue",
//                                       "When the attacker that you can see hits you with an attack, you can use your reaction to halve the attack's damage to you.")
//                          );
//        player.addProficiencies(Weapon.Category.SIMPLE_MELEE);
//        player.addProficiencies(Weapon.CROSSBOW_HAND,Weapon.LONGSWORD,Weapon.RAPIER,Weapon.SHORTSWORD,Armor.LIGHT_ARMOR,Language.COMMON,
//                                Language.ELVISH,Tool.THIEVES_TOOLS,Tool.DISGUISE_KIT,Tool.POISONERS_KIT);
//        player.addPlayerBonuses(new Bonus(MiscAttributes.RUN_SPEED,30));
//        player.getPersonality().setTraits("Flattery is my preferred trick for getting what I want");
//        player.getPersonality().setIdeals("Independence");
//        player.getPersonality().setBonds("A powerful person killed someone I love. Some day soon, I'll have my revenge");
//        player.getPersonality().setFlaws("I'm convinced that no one could ever fool me the way I fool others.");
//        player.updateBonuses();
//        return player;
//    }
}
