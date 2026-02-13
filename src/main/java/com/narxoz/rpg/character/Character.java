package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Accessory;
public interface Character{
    String getName();
    String getStats();
    String useSpecialAbility();
    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);
    void equipAccessory(Accessory accessory);
    void displayEquipment();
}