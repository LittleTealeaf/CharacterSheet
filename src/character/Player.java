package character;

import attributes.*;
import structure.Attribute;
import structure.Bonus;
import structure.Proficiency;

import java.util.*;

public class Player {

    private String name, player, race, subRace;
    private int hitPoints, maxHitPoints;
    private final Inventory inventory;
    private final Set<Bonus> playerBonuses;
    private final Map<PlayerClass,Integer> classes;
    private final Set<Proficiency> proficiencies;
    private final Set<Feature> features;
    private final Personality personality;
    private final transient PlayerBonuses bonuses;

    public Player() {
        bonuses = new PlayerBonuses(this);
        inventory = new Inventory();
        playerBonuses = new HashSet<>();
        classes = new HashMap<>();
        proficiencies = new HashSet<>();
        features = new HashSet<>();
        personality = new Personality();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Set<Bonus> getPlayerBonuses() {
        return playerBonuses;
    }

    public Set<Proficiency> getProficiencies() {
        return proficiencies;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public int getPassivePerception() {
        return 10 + getSkillBonus(Skill.PERCEPTION);
    }

    public int getSkillBonus(Skill skill) {
        return getAbilityModifier(skill.getAbility()) + getProficiencyBonus(skill) + getBonus(skill);
    }

    public int getAbilityModifier(Ability ability) {
        return Ability.getModifier(getAbilityScore(ability));
    }

    public int getProficiencyBonus(Proficiency proficiency) {
        return hasProficiency(proficiency) ? getProficiencyBonus() : 0;
    }

    public int getBonus(Attribute attribute) {
        return bonuses.getBonuses(attribute);
    }

    public int getAbilityScore(Ability ability) {
        return 10 + getBonus(ability);
    }

    public boolean hasProficiency(Proficiency proficiency) {
        return proficiencies.contains(proficiency);
    }

    public int getProficiencyBonus() {
        return ((getTotalLevel() + 3) / 4) + 1;
    }

    public int getTotalLevel() {
        int total = 0;
        for(PlayerClass classOption : classes.keySet()) {
            total += classes.get(classOption);
        }
        return total;
    }

    public void addProficiency(Proficiency proficiency) {
        proficiencies.add(proficiency);
    }

    public void removeProficiency(Proficiency proficiency) {
        proficiencies.remove(proficiency);
    }

    public int getSavingThrowBonus(SavingThrow savingThrow) {
        return getAbilityModifier(savingThrow.getAbility()) + getBonus(savingThrow) + getProficiencyBonus(savingThrow);
    }

    public int getInitiativeBonus() {
        return getAbilityModifier(Ability.DEXTERITY) + getBonus(MiscAttributes.INITIATIVE);
    }

    public int getArmorClass() {
        return 10 + Math.max(getBonus(MiscAttributes.MAX_DEX_BONUS), getAbilityModifier(Ability.DEXTERITY)) + getBonus(MiscAttributes.ARMOR_CLASS);
    }

    public void updateBonuses() {
        bonuses.clear();
        for (Bonus bonus : playerBonuses) {
            bonus.addBonuses(bonuses);
        }
        for (Feature feature : features) {
            feature.addBonuses(bonuses);
        }
        inventory.addBonuses(bonuses);
    }

    public Map<PlayerClass,Integer> getClasses() {
        return classes;
    }

    public String getName() {
        return name;
    }

    public String getPlayer() {
        return player;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void addFeatures(Feature... features) {
        for(Feature feature : features) {
            this.features.add(feature);
        }
    }

    public void addProficiencies(Proficiency... proficiencies) {
        for(Proficiency proficiency : proficiencies) {
            this.proficiencies.add(proficiency);
        }
    }

    public void addProficiencies(Set<Proficiency> proficiencies) {
        this.proficiencies.addAll(proficiencies);
    }
    public void addProficiencies(Weapon.Category category) {
        for(Proficiency proficiency : Weapon.getCategory(category)) {
            proficiencies.add(proficiency);
        }
    }

    public void clearLevels() {
        classes.clear();
    }

    public void setClassLevel(PlayerClass playerClass, int level) {
        classes.put(playerClass,level);
    }

    public void setAbilityScores(int[] scores) {
        Set<Bonus> oldBonuses = new HashSet<>();
        for(Bonus bonus : playerBonuses) {
            if(bonus.getSource() == Bonus.Source.ABILITY_SCORE) {
                oldBonuses.add(bonus);
            }
        }
        for(Bonus bonus : oldBonuses) {
            playerBonuses.remove(bonus);
        }
        for(int i = 0; i < scores.length; i++) {
            playerBonuses.add(new Bonus(Ability.values()[i], scores[i] - 10, Bonus.Source.ABILITY_SCORE));
        }
    }

    public Personality getPersonality() {
        return personality;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public void addPlayerBonuses(Bonus... bonuses) {
        for(Bonus bonus : bonuses) {
            this.playerBonuses.add(bonus);
        }
    }

    public String getRace() {
        return race;
    }

    public String getSubRace() {
        return subRace;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setSubRace(String subRace) {
        this.subRace = subRace;
    }

}
