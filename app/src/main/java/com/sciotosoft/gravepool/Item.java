package com.sciotosoft.gravepool;
enum ItemType{
    Weapon, Armor, Clothing, Food, Raw_Organic, Raw_Resource, Refined_Resource
}
public class Item {
    private int itemID;
    private int itemWeightOz;
    String itemName;
    String itemDescription;
    Boolean flammable;
    ItemType type;


}
