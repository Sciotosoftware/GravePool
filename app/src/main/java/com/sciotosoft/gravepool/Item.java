package com.sciotosoft.gravepool;
enum ItemType{
    Weapon, Armor, Clothing, Food, Raw_Organic, Raw_Resource, Refined_Resource
}
public class Item {
    private int itemID;
    private int itemWeightlbs;
    private int itemWidthCM;
    private int itemLengthCM;
    private int itemHeightCM;
    String itemName;
    String itemDescription;
    Boolean flammable;
    ItemType type;


}
