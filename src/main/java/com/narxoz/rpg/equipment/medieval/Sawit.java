package com.narxoz.rpg.equipment.medieval;
import com.narxoz.rpg.equipment.Armor;
public class Sawit implements Armor {
    private final String name = "Sawit";
    private final int defense = 30;
    @Override
    public String getName() { return name; }
    @Override
    public int getDefense() { return defense; }
    @Override
    public String getInfo() {
        return name + " (Defense: " + defense + ")";
    }
}