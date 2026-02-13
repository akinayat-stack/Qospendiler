package com.narxoz.rpg.factory.character;

import com.narxoz.rpg.character.Batyr;
import com.narxoz.rpg.character.Character;

public class BatyrFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Batyr(name);
    }
}