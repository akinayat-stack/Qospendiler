package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Armor;

public class Shapan implements Armor {
    private final String name = "Shapan";
    private final int defense = 10;
    private final int manaBoost = 25;

    @Override
    public String getName() { return name; }

    @Override
    public int getDefense() { return defense; }

    public int getManaBoost() { return manaBoost; }

    @Override
    public String getInfo() {
        return name + " (Defense: " + defense + ", Mana +" + manaBoost + ")";
    }
}