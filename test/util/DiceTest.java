package util;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testConstructor() {
        for(int i = 1; i < 100; i++) {
            for(int j = 1; j < 100; j++) {
                assertNotNull(new Dice(i,j));
            }
        }
    }

    @Test
    public void testMaxRoll() {
        for(int i = 1; i < 100; i++) {
            for(int j = 1; j < 100; j++) {
                assertEquals(i * j,new Dice(i,j).getMaxRoll());
            }
        }
    }

    @Test
    public void testMinRoll() {
        for(int i = 1; i < 100; i++) {
            for(int j = 1; j < 100; j++) {
                assertEquals(i,new Dice(i,j).getMinRoll());
            }
        }
    }

    @Test
    public void testRoll() {
        for(int i = 1; i < 50; i++) {
            for(int j = 1; j < 20; j++) {
                Dice dice = new Dice(i,j);
                int low = dice.getMinRoll(), high = dice.getMaxRoll();
                for(int k = 0; k < 100; k++) {
                    int roll = dice.rollDice();
                    assertTrue(roll >= low && roll <= high);
                }
            }
        }
    }

}