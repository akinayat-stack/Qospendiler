package com.narxoz.rpg.mount;

public class Horseshoes implements MountItem {
    private final String name = "Horseshoes";
    private final int staminaBonus = 30;

    @Override
    public String getName() { return name; }
    @Override
    public int getSpeedBonus() { return 0; }
    @Override
    public int getStaminaBonus() { return staminaBonus; }
    @Override
    public int getCarryBonus() { return 0; }

    @Override
    public String getInfo() {
        return name + " (+" + staminaBonus + " Stamina, -10% stamina consumption)";
    }
}