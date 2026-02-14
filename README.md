QOSPENDILER — RPG System

Patterns: Factory Method, Abstract Factory

Language: Java 17+ / Maven

UML Diagrams:

Separate diagrams for Factory Method and Abstract Factory

Classes, interfaces, relationships

Key attributes and methods only 

Defence:
First, I will explain the general idea. My project is an RPG system where a player can create different characters with unique stats and abilities, and also equip them with themed sets of weapons and armor. The main goal of my project was to make the system flexible and easy to extend. If we want to add new characters or new equipment sets, we do not need to change existing code.

The project is based on two main design patterns.
Factory Method is used to create characters.
Abstract Factory is used to create families of equipment.

I chose these patterns because they hide the object creation process and follow the Open-Closed Principle. It means classes are open for extension but closed for modification.

Now about the characters.

I have four main character classes:

* **Batyr** — a warrior with high health and strength. His special ability *BoztorgaiShabyl* increases attack by 30%.
* **Aksakal** — a wise mage with high intelligence and mana. His ability *TarihDanalyq* strengthens all allies.
* **Hanshaim** — a support character who focuses on healing. Her ability *ZhurekKushi* restores Batyr’s health.
* **Quday** — a divine class with maximum stats. He can absorb damage instead of allies.

All characters implement a common interface called **Character**.
This interface defines methods like:

* getName()
* getStats()
* useSpecialAbility()
* equipWeapon()
* equipArmor()
* equipAccessory()

Because of this interface, I can work with any character in the same way without knowing its exact class.

To avoid repeating code, I created an abstract class **BaseCharacter**.
It contains common logic for all characters, including fields for weapon, armor, and accessory, and methods for equipping them.

Concrete classes like Batyr or Aksakal extend this base class and add only their unique stats and abilities. This follows the DRY principle — Don’t Repeat Yourself.

Now about character factories.

I use the Factory Method pattern to create characters.
There is an interface called **CharacterFactory** with one method: createCharacter().

For each character type, I created a separate factory:

* BatyrFactory
* AksakalFactory
* HanshaimFactory
* QudayFactory

The client code does not use constructors directly. It calls the factory instead.

If I want to add a new character, for example Rogue, I just create a new class Rogue and a new RogueFactory. I do not change existing code. This follows the Open-Closed Principle.

Now about the equipment system.

Here I use the Abstract Factory pattern because I create full themed sets, not single objects.

I have three themes:

**Medieval Theme**

* Weapon: Qylysh
* Armor: Sawit

**Magic Theme**

* Weapon: MagicWand
* Armor: Shapan
* Accessory: Amulet

**Ranger Theme**

* Weapon: Bow
* Armor: LeatherArmor

Each item implements one of the interfaces: Weapon, Armor, or Accessory.

The EquipmentFactory interface defines methods:

* createWeapon()
* createArmor()
* createAccessory()

Each concrete factory creates only items of one theme:

* MedievalFactory
* MagicFactory
* RangerFactory

This guarantees compatibility. If a character uses one factory, they get a full matching set.

Each factory also provides a description of a full set bonus. This adds more game logic to the system.

How does everything work together?

In the Main class, I first choose a character factory, for example BatyrFactory, and create a character named Alpamys.

Then I choose an equipment factory, for example MedievalFactory, and equip the character with a full set.

After that, I print:

* character stats
* equipped items
* full set bonus

This demonstrates how both design patterns work together.

I also created two UML diagrams.

The first diagram shows the Factory Method structure for characters:

* Character interface
* BaseCharacter abstract class
* Concrete characters
* CharacterFactory interface
* Concrete factories

The second diagram shows the Abstract Factory structure for equipment:

* Weapon, Armor, Accessory interfaces
* Concrete implementations
* EquipmentFactory interface
* Concrete factories

The diagrams clearly show inheritance and implementation relationships.

Advantages of my design:

1. Open-Closed Principle — easy to add new characters or equipment themes.
2. Encapsulation of object creation — constructors are hidden inside factories.
3. Compatibility guarantee — Abstract Factory creates matching sets.
4. Low coupling — classes depend on interfaces, not concrete classes.
5. Code reuse — common logic is in BaseCharacter.

In conclusion, my project fully meets the assignment requirements.
Factory Method is correctly used for characters.
Abstract Factory is used for equipment families.

There are four unique character classes and three equipment themes.

The system is easy to extend: to add a new character or new theme, I only need to create a few new classes without modifying old code.

Thank you for your attention.
