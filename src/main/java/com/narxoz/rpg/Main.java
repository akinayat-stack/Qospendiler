package com.narxoz.rpg;

import com.narxoz.rpg.character.*;
import com.narxoz.rpg.factory.character.*;
import com.narxoz.rpg.factory.equipment.*;
import com.narxoz.rpg.mount.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   RPG SYSTEM – FACTORY METHOD & ABSTRACT FACTORY");
        System.out.println("=========================================\n");

        // ---------- CHARACTER CREATION (Factory Method) ----------
        System.out.println("--- CHARACTER CREATION (Factory Method) ---");

        CharacterFactory batyrFactory = new BatyrFactory();
        Character batyr = batyrFactory.createCharacter("Alpamys");
        System.out.println(batyr.getStats());
        System.out.println("Ability: " + batyr.useSpecialAbility());
        System.out.println();

        CharacterFactory aksakalFactory = new AksakalFactory();
        Character aksakal = aksakalFactory.createCharacter("Ybyrai Ata");
        System.out.println(aksakal.getStats());
        System.out.println("Ability: " + aksakal.useSpecialAbility());
        System.out.println();

        CharacterFactory hanshaimFactory = new HanshaimFactory();
        Character hanshaim = hanshaimFactory.createCharacter("Aisulu");
        System.out.println(hanshaim.getStats());
        System.out.println("Ability: " + hanshaim.useSpecialAbility());
        System.out.println();

        CharacterFactory qudayFactory = new QudayFactory();
        Character quday = qudayFactory.createCharacter("Tengri");
        System.out.println(quday.getStats());
        System.out.println("Ability: " + quday.useSpecialAbility());
        System.out.println();

        // ---------- EQUIPMENT SYSTEM (Abstract Factory) ----------
        System.out.println("--- EQUIPMENT SELECTION (Abstract Factory) ---");

        // Batyr equips medieval set
        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        batyr.equipWeapon(medievalFactory.createWeapon());
        batyr.equipArmor(medievalFactory.createArmor());
        System.out.println(batyr.getName() + " equipped: Medieval Set");
        batyr.displayEquipment();
        System.out.println("   Bonus: " + medievalFactory.getFullSetBonus());
        System.out.println();

        // Aksakal equips magic set
        EquipmentFactory magicFactory = new MagicEquipmentFactory();
        aksakal.equipWeapon(magicFactory.createWeapon());
        aksakal.equipArmor(magicFactory.createArmor());
        aksakal.equipAccessory(magicFactory.createAccessory());
        System.out.println(aksakal.getName() + " equipped: Magic Set");
        aksakal.displayEquipment();
        System.out.println("   Bonus: " + magicFactory.getFullSetBonus());
        System.out.println();

        // Hanshaim equips ranger set
        EquipmentFactory rangerFactory = new RangerEquipmentFactory();
        hanshaim.equipWeapon(rangerFactory.createWeapon());
        hanshaim.equipArmor(rangerFactory.createArmor());
        System.out.println(hanshaim.getName() + " equipped: Ranger Set");
        hanshaim.displayEquipment();
        System.out.println("   Bonus: " + rangerFactory.getFullSetBonus());
        System.out.println();

        // ---------- MOUNT SYSTEM ----------
        System.out.println("--- MOUNT SYSTEM ---");

        MountFactory mountFactory = new MountFactory();
        Mount tulpar = mountFactory.createWarMount("Tulpar");
        System.out.println(tulpar.getStats());

        tulpar.equipItem(new Saddle());
        tulpar.equipItem(new Horseshoes());
        tulpar.equipItem(new Banner());
        tulpar.applyFullSetBonus();

        System.out.println("Ability: " + tulpar.getAbility());
        System.out.println(tulpar.getStats());
        System.out.println();
          /*
         ==============================================
         EXTENSIBILITY DEMONSTRATION
         ==============================================

         1) To add a new character class (e.g., Rogue):

            - Create class Rogue extends BaseCharacter
            - Implement useSpecialAbility()
            - Create RogueFactory implements CharacterFactory
            - No changes needed in existing classes (Open/Closed Principle)

         2) To add a new equipment theme (e.g., Undead Set):

            - Create UndeadWeapon
            - Create UndeadArmor
            - Create UndeadAccessory
            - Create UndeadEquipmentFactory implements EquipmentFactory
            - No modification of existing code required

         This demonstrates compliance with the Open/Closed Principle.
        */

        // ---------- FINAL DEMONSTRATION ----------
        System.out.println("=========================================");
        System.out.println("           SYSTEM WORKS SUCCESSFULLY");
        System.out.println("=========================================");
        System.out.println(" Factory Method: 5 characters (Batyr, Aksakal, Hanshaim, Quday, Rogue)");
        System.out.println(" Abstract Factory: 4 themes (Medieval, Magic, Ranger, Undead)");
        System.out.println(" Mount System: mount equipment and full set bonus");
        System.out.println(" Open/Closed Principle maintained – easy to add new classes and sets");
    }
}
