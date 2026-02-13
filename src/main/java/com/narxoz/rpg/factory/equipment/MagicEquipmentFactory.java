package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Accessory;
import com.narxoz.rpg.equipment.magic.MagicWand;
import com.narxoz.rpg.equipment.magic.Shapan;
import com.narxoz.rpg.equipment.magic.Amulet;

public class MagicEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new MagicWand();
    }

    @Override
    public Armor createArmor() {
        return new Shapan();
    }

    @Override
    public Accessory createAccessory() {
        return new Amulet();
    }

    @Override
    public String getFullSetBonus() {
        return "Full set: +50 mana, +10% intelligence to all allies";
    }
}