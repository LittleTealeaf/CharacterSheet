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
}