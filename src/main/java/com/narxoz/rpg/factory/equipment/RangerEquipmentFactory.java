package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.ranger.Bow;
import com.narxoz.rpg.equipment.ranger.LeatherArmor;

public class RangerEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }

    @Override
    public String getFullSetBonus() {
        return "Full set: +15% agility, +10% ranged attack damage";
    }
}