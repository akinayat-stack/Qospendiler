package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;

public class LeatherArmor implements Armor {
    private final String name = "Тері сауыт";
    private final int defense = 20;
    private final int agilityBonus = 10;

    @Override
    public String getName() { return name; }

    @Override
    public int getDefense() { return defense; }

    public int getAgilityBonus() { return agilityBonus; }

    @Override
    public String getInfo() {
        return name + " (Defense: " + defense + ", Agility +" + agilityBonus + ")";
    }
}