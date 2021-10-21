package attributes;

import org.junit.Test;
import structure.Proficiency;

import static org.junit.jupiter.api.Assertions.*;

public class ArmorTest {

    private static final String pretext = "ARMOR.";

    @Test
    public void testToString() {
        for(Armor armor : Armor.values()) {
            assertNotNull(armor.toString());
            assertNotEquals("",armor.toString());
        }
    }

    @Test
    public void testGetID() {
        for(Armor armor : Armor.values()) {
            assertNotNull(armor.getID());
            assertNotEquals("",armor.getID());
            assertTrue(armor.getID().contains(pretext));
        }
    }

    @Test
    public void testProficiencyCasting() {
        for(Proficiency proficiency : Armor.values()) {
            assertNotNull(proficiency);
        }
    }
}