package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Accessory;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
    default Accessory createAccessory() {
        return null; 
    }

    default String getFullSetBonus() {
        return "No full set bonus for this equipment.";
    }
}