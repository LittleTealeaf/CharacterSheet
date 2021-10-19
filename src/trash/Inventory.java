package trash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {

    private final HashMap<Coin,Integer> money;
    private final List<Item> items;

    public Inventory() {
        money = new HashMap<>();
        items = new ArrayList<>();
    }

    public int getCoins(Coin coin) {
        return money.getOrDefault(coin,0);
    }

    public void addCoins(Coin coin, int count) {
        money.put(coin,money.getOrDefault(coin,0) + count);
    }

    public int getMoneyWorth() {
        int total = 0;
        for(Coin c : Coin.values()) {
            total += getCoins(c) * c.getCopperValue();
        }
        return total;
    }

    public double getMoneyWorth(Coin coin) {
        return (double) (getMoneyWorth()) / coin.getCopperValue();
    }

    public void balanceMoney() {
        int copper =  getMoneyWorth();
        for(int i = Coin.values().length - 1; i >= 0; i--) {
            Coin c = Coin.values()[i];
            int count = copper / c.getCopperValue();
            copper -= count * c.getCopperValue();
            money.put(c,count);
        }
    }

    public double getMoneyWeight() {
        double count = 0;
        for(Coin c : Coin.values()) {
            count += getCoins(c);
        }
        return  count / 50;
    }

    public double getTotalWeight() {
        double weight = getMoneyWeight();
        for(Weighable weighable : items) {
            weight += weighable.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }
}
