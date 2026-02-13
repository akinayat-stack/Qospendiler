package com.narxoz.rpg.equipment.magic;
import com.narxoz.rpg.equipment.Weapon;
public class MagicWand implements Weapon {
    private final String name = "Magic Wand";
    private final int damage = 15;
    private final int manaBoost = 20;

    @Override
    public String getName() { return name; }

    @Override
    public int getDamage() { return damage; }

    public int getManaBoost() { return manaBoost; }

    @Override
    public String getInfo() {
        return name + " (Damage: " + damage + ", Mana +" + manaBoost + ")";
    }
}