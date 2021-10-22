package character;

import classFactory.PlayerClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassLevelTest {

    @Test
    public void testConstructors() {
        assertNotNull(new ClassLevel());
        assertNotNull(new ClassLevel(null));
    }

    @Test
    public void testLevel() {
        //Test that the default level is 1
        assertEquals(1,new ClassLevel().getLevel());

        ClassLevel classLevel = new ClassLevel();

        for(int i = 1; i < 20; i++) {
            classLevel.setLevel(i);
            assertEquals(i,classLevel.getLevel());
        }
    }

    @Test
    public void testGetPlayerClass() {
        for(int i = 0; i < Classes.values().length; i++) {
            ClassLevel classLevel = new ClassLevel(Classes.values()[i]);
            assertEquals(Classes.values()[i].getPlayerClass(),classLevel.getPlayerClass());
        }
    }


}