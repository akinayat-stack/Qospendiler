package com.narxoz.rpg.factory.character;

import com.narxoz.rpg.character.Aksakal;
import com.narxoz.rpg.character.Character;

public class AksakalFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Aksakal(name);
    }
}