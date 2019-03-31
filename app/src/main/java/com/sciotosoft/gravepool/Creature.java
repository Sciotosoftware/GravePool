package com.sciotosoft.gravepool;

import java.util.ArrayList;
import java.util.List;
enum creatureAttribute{
    Intangible,
    Invisible,
    Hulking,
    Swimming,
    Flying,
    Burrowing,
}
public class Creature {
    private int creatureID;
    private int creatureName;
    private String creatureType;
    List<String> attributes = new ArrayList<>();

    //-Note: Both Wraiths and Wights, or any creature possessing "Phantom" attribute, may only be damaged by fighters with high Willpower.

}
