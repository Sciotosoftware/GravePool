package com.sciotosoft.gravepool;

public class TestCreature {
    public static Creature instantiateCreature(){
        Creature creature = new Creature();
        System.out.println("TestCreature.instantiateCreature"
                + "\n" + creature.getCreatureName
                + "\n" + creature.getCreatureID
                + "\n" + creature.getCreatureType
                + "\n" + creature.getAttributes
        );
        return creature;
    }
}
