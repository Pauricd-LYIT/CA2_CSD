/*
 * GameCharacter
 *
 * Version information
 *
 * Date 30/01/2021
 *
 * Author: <Insert your Name and StudentID
 *
 * Copyright notice
 */

package com.lyit;


enum CharacterState { Idle, Running, Sleeping, Walking, Defending, Dead, Eating, Attacking };

// Note - If the character state is Dead, the character should not be able to do anything.
// Invoking a method when the character is dead should do nothing

//public abstract class GameCharacter {
public class GameCharacter {
    //Attributes
    private String characterName; //Cannot be empty
    private double health; //Must be in range [0..100]. If 0 then character state should be dead. If > 0 the character cannot be dead
    private double weightLimit; //Must be > 0
    private double totalWeightOfItems; //Cannot exceed weightLimit

    // GameCharacter inventory
    // NOTE: The GameCharacter's inventory (items, food, weapons, armour) must be stored within the class.
    // You need to select appropriate collection(s) to allow the character to pickup and drop game items.

    private CharacterState characterState;

    // Getters and setters
    // Setters should be modified to deal with invalid arguments. Throw an IllegalArgumentException if
    // the setter is provided with an invalid argument

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public double getTotalWeightOfItems() {
        return totalWeightOfItems;
    }

    public void setTotalWeightOfItems(double totalWeightOfItems) {
        this.totalWeightOfItems = totalWeightOfItems;
    }

    public CharacterState getCharacterState() {
        return characterState;
    }

    public void setCharacterState(CharacterState characterState) {
        this.characterState = characterState;
    }


    // GameCharacter Constructor
    // If an invalid argument is provided throw an IllegalArgumentException exception
    public GameCharacter(String characterName, int health, double weightLimit, int food, CharacterState characterState) {
        this.characterName = characterName;
        this.health = health;
        this.weightLimit = weightLimit;
        this.characterState = characterState;
        //TODO - Complete this method
    }


    // Logic for the eat method
    // If the item at inventoryItemIndex is of the class Food, the item is consumed and removed from the inventory.
    // Eating the item should increase the characters health. 1 unit of health = 25 calories.
    // The state of the food modifies the calorie content for only food with positive calorie values, as follows:
    // Fresh 100% of calories, stale 60%, Mouldy 40%, rotten 10%
    // Eg. an apple is 52 calories per 100g. 100g of mouldy apple will give only 20.8 (52*.4) calories.
    // Health should not exceed 100 which is full health for the character.
    // Consuming poisonous food (food with a negative calorie value) should reduce the health accordingly.
    // When the eat method is invoked, the character's status should also change to "Eating"
    // Return true if the item was food and consumed, otherwise false
    public boolean eat(int inventoryFoodIndex){
        //TODO - Complete this method
        return false;
    }

    // The attack method should  return a string with the following information:
    // "<this.getName()> is attacking targetCharacter.getName() with a <equippedWeapon.getItemName()>
    // Example output “Lord Percival is attacking Lord Blackadder with a sword"
    // If the attacker is using two weapons:
    // Example output “Lord Percival is attacking Lord Blackadder with a sword and a knife"

    public String attack(GameCharacter targetCharacter) {
        //TODO - Complete this method
        String returnString = "";
        return returnString;
    }

    // The equipWeapon will equip the weapon at inventoryWeaponIndex
    // If the item in the inventory index is a weapon the method should return true, otherwise false
    // If the weapon requires both hands (doubleHanded = true) the character must unequip any weapons or shields
    // they are currently holding.
    public boolean equipWeapon(int inventoryWeaponIndex){
        //TODO - Complete this method
        return false;
    }

    // If the item in the inventory at inventoryWeaponIndex is a weapon, unequip it and return true, otherwise false
    // Weapons that are unequipped remain in the inventory.
    public boolean unEquipWeapon(int inventoryWeaponIndex){
        //TODO - Complete this method
        return false;
    }

    // The equipArmour method should equip the item of armour at armourIndex in the inventory
    // The character can only equip one shield at a time. If a shield is already equipped and the armourIndex
    // argument points to another shield, then the shield at armourIndex is equipped instead. If the armourIndex points
    // to a wearable piece of armour the GameCharacter should put it on. The character may wear multiple pieces of armour
    public boolean equipArmour(int armourIndex) {
        //TODO - Complete this method
        return false;
    }

    // The method should remove the item of armour at armourIndex from the gameCharacter. The character essentially
    // takes off the piece of armour but it remains in their inventory
    public void removeArmour(int armourIndex){
        //TODO - Complete this metho
    }

    // The defend method should set the characters state to defending
    public void defend(){
        //TODO - Complete this method
    }

    // The method should change the characters state to walking
    public void walk(){
        //TODO - Complete this method
    }

    // The method should change the characters state to running
    public void run(){
        //TODO - Complete this method
    }

    // The method should change the characters state to sleeping
    // The character's health should increase by 20 but should not exceed the maximum (100)
    public void sleep(){
        //TODO - Complete this method
    }

    // If the character is sleeping the wakeUp method should change the character's state to Idle
    // If the character is not sleeping, the method should not change the character's state.
    public void wakeUp(){
        //TODO - Complete this method
    }

    // The pickUpItem method should add the item to the game characters inventory if the item does not exceed the
    // current weightLimit for the character. If the character does pick up the item the weight of the item
    // should be added to the total weight of items carried by the character
    // The item object may be an instance of the Item or any subclass (armour, weapon or food)
    public void pickUpItem(Item item){
        //TODO - Complete this method
    }

    // The dropItem method should remove the item from the game character's inventory. The total weight of items
    // should be updated accordingly.
    // The item object may be an instance of the Item or any subclass (armour, weapon or food)
    public void dropItem(Item item){
        //TODO - Complete this method
    }

    // The defence value is determined by totalling the armourDefence values of all armour items currently equipped
    // by the game character
    public double getCharacterDefence() {
        return 0;
    }

    // The attack value is determined by totalling the weaponHitStrength values of all weapons currently equipped
    // by the game character
    public double getCharacterAttackValue() {
        return 0;
    }

    // Note - You can implement additional supporting private methods if you want. Add them below this section
    // Additional methods ------------------------------------------------------------------------------------


}
