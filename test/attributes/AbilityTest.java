package attributes;

import org.junit.Test;
import structure.Attribute;

import static org.junit.jupiter.api.Assertions.*;

public class AbilityTest {

    private static final String pretext = "ABILITY.";

    @Test
    public void testToString() {
        for (Ability ability : Ability.values()) {
            assertNotNull(ability.toString());
            assertNotEquals("", ability.toString());
        }
    }

    @Test
    public void testGetID() {
        for (Ability ability : Ability.values()) {
            assertNotNull(ability.getID());
            assertNotEquals("", ability.getID());
        }
    }

    @Test
    public void testAttributeCasting() {
        for (Attribute attribute : Ability.values()) {
            assertNotNull(attribute);
        }
    }

    @Test
    public void testToShort() {
        for (Ability ability : Ability.values()) {
            assertNotNull(ability.toShort());
            assertEquals(3, ability.toShort().length());
            assertEquals(0, ability.toString().indexOf(ability.toShort()));
        }
    }

    @Test
    public void testModifierConversion() {
        for (int i = 0; i < 100; i++) {
            int correct_val = (i - 10) / 2;
            assertEquals(correct_val, Ability.getModifier(i));
        }
    }
}