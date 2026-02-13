package com.narxoz.rpg.factory.character;

import com.narxoz.rpg.character.Hanshaim;
import com.narxoz.rpg.character.Character;

public class HanshaimFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Hanshaim(name);
    }
}