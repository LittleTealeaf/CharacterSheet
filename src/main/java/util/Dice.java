package util;

public class Dice {

    private int size;
    private int count;

    public Dice(int count, int size) {
        this.count = count;
        this.size = size;
    }

    public int rollDice() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (int) ((Math.random() * size)) + 1;
        }
        return total;
    }

    public int getMaxRoll() {
        return count * size;
    }

    public int getMinRoll() {
        return count;
    }
}
