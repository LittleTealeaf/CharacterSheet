package character;

import classFactory.Barbarian;
import classFactory.PlayerClass;

public enum Classes {
    //List of all classes and their relative

    BARBARIAN(new Barbarian());

    private PlayerClass loadedClass;


    Classes(PlayerClass loadedClass) {
        this.loadedClass = loadedClass;
    }

    public PlayerClass getPlayerClass() {
        return loadedClass;
    }
}
