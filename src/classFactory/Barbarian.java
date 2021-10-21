package classFactory;

import attributes.*;
import openAPI.Class;
import structure.Attribute;
import structure.Bonus;
import util.Dice;

import java.util.Arrays;

public class Barbarian extends PlayerClass {


    public Barbarian(){
        super();
        proficiencies.addAll(Arrays.asList(Armor.LIGHT_ARMOR, Armor.MEDIUM_ARMOR, Armor.SHIELD, SavingThrow.STRENGTH,SavingThrow.CONSTITUTION));
        proficiencies.addAll(Weapon.getCategory(Weapon.Category.MARTIAL_RANGED));
        proficiencies.addAll(Weapon.getCategory(Weapon.Category.SIMPLE_MELEE));
        proficiencies.addAll(Weapon.getCategory(Weapon.Category.MARTIAL_RANGED));
        proficiencies.addAll(Weapon.getCategory(Weapon.Category.MARTIAL_MELEE));
        skillOptions = new Skill[] {
                Skill.ANIMAL_HANDLING,Skill.ATHLETICS,Skill.INTIMIDATION,Skill.NATURE,Skill.PERCEPTION,Skill.SURVIVAL
        };
        hitDice = new Dice(1, 12);
        classFeatures = new ClassFeature[] {
                new ClassFeature() {
                    @Override
                    void initialize() {
                        bonuses = new Bonus[] {
                                new Bonus(BarbarianAttributes.RAGE_MAX,2),
                                new Bonus(BarbarianAttributes.RAGE_DAMAGE,2)
                        };
                        description =
                                "In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action.\n" + "\n" + "While raging, you gain the following benefits if you aren't wearing heavy armor:\n" + "\n" + "You have advantage on Strength checks and Strength saving throws.\n" + "When you make a melee weapon attack using Strength, you gain a +2 bonus to the damage roll. This bonus increases as you level.\n" + "You have resistance to bludgeoning, piercing, and slashing damage.\n" + "If you are able to cast spells, you can't cast them or concentrate on them while raging.\n" + "\n" + "Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven't attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action.";
                        name = "Rage";
                        classLevel = 1;
                    }
                },
                new ClassFeature() {
            @Override
            void initialize() {
                name = "unarmored defense";
                description = "While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution " +
                        "modifier. You can use a shield and still gain this benefit.";
                classLevel = 1;
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Danger Sense";
                classLevel = 2;
                description = "At 2nd level, you gain an uncanny sense of when things nearby aren't as they should be, giving you an edge when you " +
                        "dodge away from danger. You have advantage on Dexterity saving throws against effects that you can see, such as traps and " +
                        "spells. To gain this benefit, you can't be blinded, deafened, or incapacitated.";
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Reckless Attack";
                classLevel = 2;
                description = "Starting at 2nd level, you can throw aside all concern for defense to attack with fierce desperation. When you make " +
                        "your first attack on your turn, you can decide to attack recklessly. Doing so gives you advantage on melee weapon attack " +
                        "rolls using Strength during this turn, but attack rolls against you have advantage until your next turn.";
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Extra Attack";
                description =
                        "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn.";
                classLevel = 5;
            }
        },new ClassFeature() {
            @Override
            void initialize() {
                hidden = true;
                classLevel = 3;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.RAGE_MAX,1)
                };
            }
        },new ClassFeature() {
            @Override
            void initialize() {
                hidden = true;
                classLevel = 6;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.RAGE_MAX,1)
                };
            }
        },new ClassFeature() {
            @Override
            void initialize() {
                hidden = true;
                classLevel = 12;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.RAGE_MAX,1)
                };
            }
        },new ClassFeature() {
            @Override
            void initialize() {
                hidden = true;
                classLevel = 17;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.RAGE_MAX,1)
                };
            }
        },new ClassFeature() {
            @Override
            void initialize() {
                hidden = true;
                classLevel = 20;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.RAGE_MAX,993)
                };
            }
        },new ClassFeature() {
            @Override
            void initialize() {
                hidden = true;
                classLevel = 9;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.RAGE_DAMAGE,1)
                };
            }
        },new ClassFeature() {
            @Override
            void initialize() {
                hidden = true;
                classLevel = 16;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.RAGE_DAMAGE,1)
                };
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Fast Movement";
                description = "Your speed increases by 10 feet when you aren't wearing heavy armor";
                classLevel = 5;
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Feral Instincts";
                classLevel = 7;
                description = "your instincts are so honed that you have advantage on initiative rolls." +
                        "\nAdditionally, if you are surprised at the beginning of combat and aren't incapacitated, you can act normally on your first turn, but only if you enter your rage before doing anything else on that turn.";

            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Brutal Critical";
                description = "You can rol additional weapon damage die while determining the extra damage for a critical hit with a melee attack.";
                classLevel = 9;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.BRUTAL_CRITICAL,1)
                };
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                hidden = true;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.BRUTAL_CRITICAL,1)
                };
                classLevel = 13;
            }
        },new ClassFeature() {
            @Override
            void initialize() {
                hidden = true;
                bonuses = new Bonus[] {
                        new Bonus(BarbarianAttributes.BRUTAL_CRITICAL,1)
                };
                classLevel = 17;
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Relentless Rage";
                description = "Your rage can keep you fighting despite grievous wounds. If you drop to 0 hit points while you're raging and don't " +
                        "die outright, you can make a DC 10 Constitution saving throw. If you succeed, you drop to 1 hit point instead.\n" + "\n" + "Each time you use this feature after the first, the DC increases by 5. When you finish a short or long rest, the DC resets to 10.";
                classLevel = 11;
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Persistent Rage";
                description = "Your rage is so fierce that it ends early only if you fall unconscious or if you choose to end it.";
                classLevel = 15;
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Indomitable Might";
                description = "if your total for a Strength check is less than your Strength score, you can use that score in place of the total.";
                classLevel = 18;
            }
        }, new ClassFeature() {
            @Override
            void initialize() {
                name = "Primal Champion";
                classLevel = 20;
                description = "Your Max Constitution and Strength scores are now 24";
                bonuses = new Bonus[] {
                        new Bonus(Ability.CONSTITUTION,4),
                        new Bonus(Ability.STRENGTH,4)
                };
            }
        }
        };
    }

    private enum BarbarianAttributes implements Attribute {
        RAGE_MAX,RAGE_DAMAGE,BRUTAL_CRITICAL;
        private String string;

        BarbarianAttributes() {
            this.string = (super.toString().charAt(0) + super.toString().substring(1)).replace("_"," ");
        }


        public String toString() {
            return string;
        }

        public String toShort() {
            return string.substring(0,3);
        }

        public static int getModifier(int score) {
            return (score - 10) / 2;
        }

        public String getID() {
            return "MISC." + super.toString();
        }
    }
}
