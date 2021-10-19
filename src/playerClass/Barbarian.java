package playerClass;


import util.Dice;

public class Barbarian extends PlayerClass {

    public Barbarian() {
        super();
        hitDice = new Dice(1, 12);
    }
}
