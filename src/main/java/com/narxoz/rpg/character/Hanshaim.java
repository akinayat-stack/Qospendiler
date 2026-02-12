package com.narxoz.rpg.character;
public class Hanshaim extends BaseCharacter {
    private final int health = 300;
    private final int mana = 50;
    private final int strength = 20;
    private final int intelligence = 40;
    public Hanshaim(String name) {
        this.name = name;
    }
    @Override
    public String getStats() {
        return String.format("%s (Hanshaim)\n   HP: %d/1000 | MP: %d/500 | STR: %d/100 | INT: %d/100",
                name, health, mana, strength, intelligence);
    }
    @Override
    public String useSpecialAbility() {
        return "ZhurekKushi – restores Batyr's health to maximum!";
    }
}