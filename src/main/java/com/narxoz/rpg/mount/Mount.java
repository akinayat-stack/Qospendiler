package com.narxoz.rpg.mount;

import java.util.ArrayList;
import java.util.List;

public class Mount {
    private String name;
    private int speed;
    private int stamina;
    private int health;
    private int carryCapacity;
    private List<MountItem> items = new ArrayList<>();

    public Mount(String name, int speed, int stamina, int health, int carryCapacity) {
        this.name = name;
        this.speed = speed;
        this.stamina = stamina;
        this.health = health;
        this.carryCapacity = carryCapacity;
    }

    public void equipItem(MountItem item) {
        items.add(item);
        applyBonus(item);
    }

    private void applyBonus(MountItem item) {
        speed += item.getSpeedBonus();
        stamina += item.getStaminaBonus();
        carryCapacity += item.getCarryBonus();
        
    }

    public void applyFullSetBonus() {
        if (items.size() >= 3) {
            speed += 50;
            stamina += 50;
            carryCapacity += 20;
            System.out.println("Full mount set activated: +50 speed, +50 stamina, +20 carry capacity, ability ZhelQanaty!");
        }
    }

    public String getAbility() {
        return "ZhelQanaty – increases the movement speed of the entire team!";
    }

    public String getStats() {
        return String.format("%s | Speed: %d/100 | Stamina: %d/100 | Health: %d/100 | Carry: %d/100",
                name, speed, stamina, health, carryCapacity);
    }
}