package attributes;

import org.junit.Test;
import structure.Attribute;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MiscAttributesTest {

    @Test
    public void testToString() {
        for (MiscAttributes miscAttributes : MiscAttributes.values()) {
            assertNotNull(miscAttributes.toString());
            assertNotEquals("", miscAttributes.toString());
        }
    }

    @Test
    public void testGetID() {
        for (MiscAttributes miscAttributes : MiscAttributes.values()) {
            assertNotNull(miscAttributes.getID());
            assertNotEquals("", miscAttributes.getID());
        }
    }

    @Test
    public void testAttributeCasting() {
        for (Attribute attribute : MiscAttributes.values()) {
            assertNotNull(attribute);
        }
    }
}