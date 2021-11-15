package export;

import attributes.Ability;
import attributes.Skill;
import character.Player;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Converts a player to markdown
 *
 *
 * DEPRECATE THIS
 */
@Deprecated
public class MarkdownSheet {

    public static String toMarkdown(Player player) {
        StringWriter writer = new StringWriter();
        try {
            writeMarkdown(writer,player);
        } catch(IOException e) {

        }
        return writer.toString();
    }

    public static void writeMarkdown(Writer writer, Player player) throws IOException {
        writer.write("# ABILITIES\n");
        appendAbilities(writer,player);
        writer.write("# SKILLS\n");
        appendSkills(writer,player);
    }

    private static void appendAbilities(Writer writer, Player player) throws IOException {
        Ability[] abilities = Ability.values();
        for(Ability ability : abilities) {
            writer.write("|");
            writer.write(ability.toString());
        }
        writer.write("|\n");
        for(int i = 0; i < abilities.length; i++) {
            writer.write("|:----:");
        }
        writer.write("|\n");
        for(Ability ability : abilities) {
            writer.write("|");
            writer.write(Integer.toString(player.getAbilityScore(ability)));
            int mod = player.getAbilityModifier(ability);
            writer.write(mod >= 0 ? " (+" : " (-");
            writer.write(mod + ")");
        }
        writer.write("|\n");
    }

    private static void appendSkills(Writer writer, Player player) throws IOException {
        Skill[] skills = Skill.values();
        writer.write("|Prof|Bonus|Skill|Ability|\n|:----:|:----:|:----|:----:|\n");
        for(Skill skill : skills) {
            writer.write(player.hasProficiency(skill) ? "|x|" : "|\t|");
            writer.write(Integer.toString(player.getSkillBonus(skill)));
            writer.write("|" + skill.toString() + "|" + skill.getAbility().toShort() + "|\n");
        }
    }

}
