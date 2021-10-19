package app;

/**
 * Import data from http://www.dnd5eapi.co/
 */

public class App {

    public static void main(String... args) {
        Player character = new Player();
        character.getInventory().addCoins(Coin.GOLD,243);
        System.out.println(character.getInventory().getMoneyWeight());
        character.getInventory().balanceMoney();
        System.out.println(character.getInventory().getMoneyWeight());
    }

}
