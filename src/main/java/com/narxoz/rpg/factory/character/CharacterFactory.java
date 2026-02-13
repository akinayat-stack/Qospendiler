package com.narxoz.rpg.factory.character;

import com.narxoz.rpg.character.Character;

public interface CharacterFactory {
    Character createCharacter(String name);
}