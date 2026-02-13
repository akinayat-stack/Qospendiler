package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.medieval.Qylysh;
import com.narxoz.rpg.equipment.medieval.Sawit;

public class MedievalEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Qylysh();
    }

    @Override
    public Armor createArmor() {
        return new Sawit();
    }

    @Override
    public String getFullSetBonus() {
        return "Full set: +10% to strength, +5% to health";
    }
}