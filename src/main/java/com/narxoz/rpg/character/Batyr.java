package com.narxoz.rpg.character;
public class Batyr extends BaseCharacter {
    private final int health = 500;
    private final int mana = 30;
    private final int strength = 80;
    private final int intelligence = 20;
    public Batyr(String name) {
        this.name = name;
    }
    @Override
    public String getStats() {
        return String.format("%s (Batyr)\n   HP: %d/1000 | MP: %d/500 | STR: %d/100 | INT: %d/100",
                name, health, mana, strength, intelligence);
    }
    @Override
    public String useSpecialAbility() {
        return "BoztorgaiShabyl – increases impact power by 30% for 10 seconds!";
    }
}