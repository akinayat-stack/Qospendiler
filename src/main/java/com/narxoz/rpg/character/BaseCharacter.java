package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Accessory;
public abstract class BaseCharacter implements Character {
    protected String name;
    protected Weapon weapon;
    protected Armor armor;
    protected Accessory accessory;
        public BaseCharacter(String name) {
            this.name = name;
        }
    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
    }
    @Override
    public void equipAccessory(Accessory accessory) {
        this.accessory = accessory;
    }
        @Override
        public String getName() {
            return name;
        }
    @Override
    public void displayEquipment() {
        System.out.println("  Equipment " + name + ":");
        if (weapon != null) System.out.println("    Weapon: " + weapon.getInfo());
        if (armor != null) System.out.println("    Armor: " + armor.getInfo());
        if (accessory != null) System.out.println("    Accessory: " + accessory.getInfo());
    }
    protected void checkFullSetBonus() {      
    }
}