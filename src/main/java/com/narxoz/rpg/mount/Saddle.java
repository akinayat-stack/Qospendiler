package com.narxoz.rpg.mount;

public class Saddle implements MountItem {
    private final String name = "Saddle";
    private final int speedBonus = 10;

    @Override
    public String getName() { return name; }
    @Override
    public int getSpeedBonus() { return speedBonus; }
    @Override
    public int getStaminaBonus() { return 0; }
    @Override
    public int getCarryBonus() { return 0; }

    @Override
    public String getInfo() {
        return name + " (+" + speedBonus + " Speed)";
    }
}