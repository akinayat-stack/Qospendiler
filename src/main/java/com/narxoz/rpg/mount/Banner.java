package com.narxoz.rpg.mount;

public class Banner implements MountItem {
    private final String name = "Banner";
    private final int carryBonus = 10;

    @Override
    public String getName() { return name; }
    @Override
    public int getSpeedBonus() { return 0; }
    @Override
    public int getStaminaBonus() { return 0; }
    @Override
    public int getCarryBonus() { return carryBonus; }

    @Override
    public String getInfo() {
        return name + " (+" + carryBonus + " Carry, increases team speed)";
    }
}