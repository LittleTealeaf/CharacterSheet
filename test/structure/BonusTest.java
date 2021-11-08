package structure;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BonusTest {


//    @Test
//    public void testConstructor() {
//        Bonus bonus = new Bonus(null, 0);
//        assertNotNull(bonus);
//    }
//
//    @Test
//    public void testGetAttribute() {
//        Attribute attribute = () -> null;
//        Bonus bonus = new Bonus(attribute, 0);
//        assertEquals(attribute, bonus.getAttribute());
//    }
//
//    @Test
//    public void testGetValue() {
//        for (int i = 0; i < 100; i++) {
//            Bonus bonus = new Bonus(null, i);
//            assertEquals(i, bonus.getValue());
//        }
//    }
//
//    @Test
//    public void testAddBonusesReference() {
//        Attribute attribute = () -> null;
//        Map<Attribute, Integer> values = new HashMap<>();
//        for (int i = 0; i < 100; i++) {
//            values.clear();
//            Bonus bonus = new Bonus(attribute, i);
//            bonus.addBonuses(values);
//            assertEquals(i, values.get(attribute));
//        }
//    }
//
//    @Test
//    public void testAddBonusSum() {
//        Attribute attribute = () -> null;
//        Map<Attribute, Integer> values = new HashMap<>();
//        int sum = 0;
//        for (int i = 0; i < 1000; i++) {
//            sum += i;
//            Bonus bonus = new Bonus(attribute, i);
//            bonus.addBonuses(values);
//            assertEquals(sum, values.get(attribute));
//        }
//    }
//
//    @Test
//    public void testBonusContainer() {
//        Attribute attribute = () -> null;
//        Map<Attribute, Integer> values = new HashMap<>();
//        for (int i = 0; i < 100; i++) {
//            values.clear();
//            BonusContainer bonusContainer = new Bonus(attribute, i);
//            bonusContainer.addBonuses(values);
//            assertEquals(i, values.get(attribute));
//        }
//    }
}