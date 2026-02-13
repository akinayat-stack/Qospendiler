package com.narxoz.rpg.equipment.medieval;
import com.narxoz.rpg.equipment.Weapon;
public class Qylysh implements Weapon {
    private final String name = "Qylysh";
    private final int damage = 25;
    @Override
    public String getName() { return name; }
    @Override
    public int getDamage() { return damage; }
    @Override
    public String getInfo() {
        return name + " (Damage: " + damage + ")";
    }
}