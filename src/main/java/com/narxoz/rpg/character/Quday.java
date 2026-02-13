package com.narxoz.rpg.character;
public class Quday extends BaseCharacter {
    private final int health = 1000;
    private final int mana = 500;
    private final int strength = 100;
    private final int intelligence = 100;
    public Quday(String name) {
        super(name);
    }
    @Override
    public String getStats() {
        return String.format("👑 %s (Quday)\n   HP: %d/1000 | MP: %d/500 | STR: %d/100 | INT: %d/100",
                name, health, mana, strength, intelligence);
    }
    @Override
    public String useSpecialAbility() {
        return "🌀 Qudiret – absorbs all incoming damage for allies per level!";
    }
}