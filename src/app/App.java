package app;

import data.Ability;
import data.Coin;
import data.PlayerCharacter;
import data.Skill;

/**
 * Import data from http://www.dnd5eapi.co/
 */

public class App {

    public static void main(String... args) {
        PlayerCharacter character = new PlayerCharacter();
        character.getInventory().addCoins(Coin.GOLD,243);
        System.out.println(character.getInventory().getMoneyWeight());
        character.getInventory().balanceMoney();
        System.out.println(character.getInventory().getMoneyWeight());
    }

}
