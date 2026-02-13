package com.narxoz.rpg.factory.character;

import com.narxoz.rpg.character.Quday;
import com.narxoz.rpg.character.Character;

public class QudayFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Quday(name);
    }
}