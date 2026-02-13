package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Weapon;

public class Bow implements Weapon {
    private final String name = "Bow";
    private final int damage = 30;
    private final String range = "Long";

    @Override
    public String getName() { return name; }

    @Override
    public int getDamage() { return damage; }

    public String getRange() { return range; }

    @Override
    public String getInfo() {
        return name + " (Damage: " + damage + ", Range: " + range + ")";
    }
}