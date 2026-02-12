package com.narxoz.rpg.character;
public class Aksakal extends BaseCharacter {
    private final int health = 100;
    private final int mana = 400;
    private final int strength = 10;
    private final int intelligence = 90;
    public Aksakal(String name) {
        this.name = name;
    }
    @Override
    public String getStats() {
        return String.format("%s (Aksakal)\n   HP: %d/1000 | MP: %d/500 | STR: %d/100 | INT: %d/100",
                name, health, mana, strength, intelligence);
    }
    @Override
    public String useSpecialAbility() {
        return "TarihDanalyq – increases intelligence and mana of all allies by 10%!";
    }
}