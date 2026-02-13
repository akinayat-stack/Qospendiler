package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Accessory;

public class Amulet implements Accessory {
    private final String name = "Amulet";
    private final int intBoost = 15;

    @Override
    public String getName() { return name; }

    public int getIntBoost() { return intBoost; }

    @Override
    public String getInfo() {
        return name + " (Intelligence +" + intBoost + ")";
    }
}