package attributes;

import org.junit.Test;
import structure.Attribute;
import structure.Proficiency;

import static org.junit.jupiter.api.Assertions.*;

public class SavingThrowTest {

    private static final String id = "SAVING_THROW";

    @Test
    public void testToString() {
        for(SavingThrow savingThrow : SavingThrow.values()) {
            assertNotNull(savingThrow.toString());
            assertNotEquals("", savingThrow.toString());
        }
    }

    @Test
    public void testGetID() {
        for(SavingThrow savingThrow : SavingThrow.values()) {
            assertNotNull(savingThrow.getID());
            assertNotEquals("", savingThrow.getID());
        }
    }

    @Test
    public void testAttributeCasting() {
        for(Attribute attribute : SavingThrow.values()) {
            assertNotNull(attribute);
        }
    }

    @Test
    public void testProficiencyCasting() {
        for(Proficiency proficiency : SavingThrow.values()) {
            assertNotNull(proficiency);
        }
    }

    @Test
    public void testToShort() {
        for(SavingThrow savingThrow: SavingThrow.values()) {
            assertNotNull(savingThrow.toShort());
            assertEquals(3,savingThrow.toShort().length());
            assertEquals(0,savingThrow.toString().indexOf(savingThrow.toShort()));
        }
    }

    @Test
    public void testGetId() {
        for(SavingThrow savingThrow : SavingThrow.values()) {
            assertNotNull(savingThrow.getID());
            assertNotEquals("",savingThrow.getID());
            assertTrue(savingThrow.getID().contains(id));
        }
    }

    @Test
    public void testGetAbility() {
        for(SavingThrow savingThrow : SavingThrow.values()) {
            assertNotNull(savingThrow.getAbility());

        }
    }
}